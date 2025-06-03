package Visitor;

import AST.*;
import SymbolTable.Symbol;
import SymbolTable.SymbolTable;
import SymbolTable.SymbolTablePrinter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SemanticAnalyzerVisitor {

    private final SymbolTable symbolTable = new SymbolTable();
    FileWriter writer;

    public void analyze(AngularFile angularFile) throws IOException {
        writer = new FileWriter("Errors/exception_handler.txt",true);
        writer.write("");
        if (angularFile.getClassDeclaration() == null) return;

        checkDuplicateClassNames(angularFile);

        for (ClassDeclaration classDecl : angularFile.getClassDeclaration()) {
            checkDuplicateVariables(classDecl);

            for (ClassMember member : classDecl.getClassMember()) {
                if (member.getVariableDeclaration() != null) {
                    defineVariable(member.getVariableDeclaration());
                }
            }

            for (ClassMember member : classDecl.getClassMember()) {
                if (member.getVariableDeclaration() != null) {
                    checkVariableDeclarationForErrors(member.getVariableDeclaration());
                    checkUndefinedIdentifiers(member.getVariableDeclaration());
                }
            }
        }
        if (angularFile.getDecorator() != null) {
            checkTemplateExistence(angularFile.getDecorator());
        }
        writer.close();
    }

    private void defineVariable(VariableDeclaration varDecl) {
        String name = varDecl.getID();
        Expression expr = varDecl.getExpression();

        if (expr instanceof ArrayExpr arrayExpr) {
            int size = arrayExpr.getArrayLiteral().getArrayElement().size();
            symbolTable.define(new Symbol(name, "array", size));
        }
    }

    private void checkDuplicateClassNames(AngularFile angularFile) throws IOException {
        Set<String> classNames = new HashSet<>();

        for (ClassDeclaration classDecl : angularFile.getClassDeclaration()) {
            String className = classDecl.getID();

            if (!classNames.add(className)) {
                //System.err.printf("Semantic Error: Duplicate class name '%s' found.%n", className);
                writer.write(String.format("Semantic Error: Duplicate class name '%s' found.%n", className));
                SymbolTablePrinter.print(symbolTable, List.of(className));
                symbolTable.remove(className);
            } else {
                symbolTable.define(new Symbol(className, "class"));
            }
        }
    }

    private void checkDuplicateVariables(ClassDeclaration classDecl) throws IOException {
        for (ClassMember member : classDecl.getClassMember()) {
            VariableDeclaration varDecl = member.getVariableDeclaration();
            if (varDecl != null) {
                String varName = varDecl.getID();

                if (symbolTable.contains(varName)) {
                    String errorMsg = String.format("Semantic Error: Duplicate variable '%s' in class '%s'%n", varName, classDecl.getID());
                    //System.err.print(errorMsg);
                    writer.write(errorMsg);
                    SymbolTablePrinter.print(symbolTable, List.of(varName));
                } else {
                    symbolTable.define(new Symbol(varName, "variable"));
                }
            }
        }
    }

    private void checkTemplateExistence(Decorator decorator) throws IOException {
        boolean hasTemplate = decorator.getObjectLiteral().getObjectField().stream()
                .anyMatch(field -> field instanceof TemplateField);

        if (!hasTemplate) {
            String errorMsg = "Semantic Error: Missing 'template' field in @Component decorator.\n";
            //System.err.print(errorMsg);
            writer.write(errorMsg);

            symbolTable.define(new Symbol("template", "decorator_field"));
            SymbolTablePrinter.print(symbolTable, List.of("template"));
            symbolTable.remove("template");
        }
    }

    private void checkUndefinedIdentifiers(VariableDeclaration varDecl) throws IOException {
        Expression expr = varDecl.getExpression();

        if (expr instanceof IdentifierExpr identifierExpr) {
            List<String> ids = identifierExpr.getId();
            int startIndex = (ids.size() > 0 && (ids.get(0).equals("this") || ids.get(0).equals("super"))) ? 1 : 0;

            for (int i = startIndex; i < ids.size(); i++) {
                String id = ids.get(i);
                if (!symbolTable.contains(id)) {
                    String errorMsg = String.format("Semantic Error: Variable '%s' used but not defined.%n", id);
                    writer.write(errorMsg);
                    symbolTable.define(new Symbol(id, "undefined_variable"));
                    SymbolTablePrinter.print(symbolTable, List.of(id));
                    symbolTable.remove(id);
                }
            }
        }
    }

    private void checkVariableDeclarationForErrors(VariableDeclaration varDecl) throws IOException {
        Expression expr = varDecl.getExpression();

        if (expr instanceof IdentifierExpr identifierExpr) {
            var ids = identifierExpr.getId();
            var literals = identifierExpr.getLiteral();

            if (ids.size() >= 2 && !literals.isEmpty()) {
                String varName = ids.get(1);
                String indexStr = literals.get(0).getNumber();
                Symbol symbol = symbolTable.resolve(varName);

                if (symbol != null && "array".equals(symbol.getType())) {
                    int index = Integer.parseInt(indexStr);
                    if (index >= symbol.getArrayLength()) {
                        String errorMsg = String.format(
                                "Semantic Error: Index %d out of bounds for array '%s' with length %d%n",
                                index, varName, symbol.getArrayLength()
                        );
                        // System.err.print(errorMsg);
                        writer.write(errorMsg);

                        SymbolTablePrinter.print(symbolTable, List.of(symbol.getName()));
                    } else {
                        symbolTable.remove(symbol.getName());
                    }
                }
            }
        }
    }

}

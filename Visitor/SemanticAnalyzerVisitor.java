package Visitor;

import AST.*;
import SymbolTable.Symbol;
import SymbolTable.SymbolTable;
import Visitor.checks.*;

import java.io.FileWriter;
import java.io.IOException;

public class SemanticAnalyzerVisitor {

    private final SymbolTable symbolTable = new SymbolTable();

    public void analyze(AngularFile angularFile) throws IOException {
        try (FileWriter writer = new FileWriter("Errors/exception_handler.txt", true)) {

            if (angularFile.getClassDeclaration() == null) return;


            new ClassNameChecker(writer, symbolTable).check(angularFile);

            for (ClassDeclaration classDecl : angularFile.getClassDeclaration()) {

                new DuplicateVariableChecker(writer, symbolTable).check(classDecl);

                for (ClassMember member : classDecl.getClassMember()) {
                    if (member.getVariableDeclaration() != null) {

                        defineVariable(member.getVariableDeclaration());
                    }
                }

                for (ClassMember member : classDecl.getClassMember()) {
                    if (member.getVariableDeclaration() != null) {
                        VariableDeclaration var = member.getVariableDeclaration();


                        new ArrayIndexChecker(writer, symbolTable).check(var);


                        new UndefinedIdentifierChecker(writer, symbolTable).check(var);


                        Expression expr = var.getExpression();
                        if (expr instanceof CssExpr cssExpr) {
                            new InvalidCssPropertyNameChecker(writer, symbolTable)
                                    .check(cssExpr.getCssLiteral());
                        }
                    }
                }
            }

            // التحقق من وجود template في @Component
            if (angularFile.getDecorator() != null) {
                new TemplateFieldChecker(writer, symbolTable).check(angularFile.getDecorator());

                // ✅ التحقق من أخطاء CSS ضمن styles
                ObjectLiteral objectLiteral = angularFile.getDecorator().getObjectLiteral();
                for (ObjectField field : objectLiteral.getObjectField()) {
                    if (field instanceof StylesField stylesField) {
                        StyleArray styleArray = stylesField.getStyleArray();
                        for (CssLiteral cssLiteral : styleArray.getCssLiteral()) {
                            new InvalidCssPropertyNameChecker(writer, symbolTable).check(cssLiteral);
                        }
                    }
                }
            }

        }
    }


    private void defineVariable(VariableDeclaration varDecl) {
        String name = varDecl.getID();
        Expression expr = varDecl.getExpression();

        if (expr instanceof ArrayExpr arrayExpr) {
            int size = arrayExpr.getArrayLiteral().getArrayElement().size();
            symbolTable.define(new Symbol(name, "array", size));
        } else {
            symbolTable.define(new Symbol(name, "variable"));
        }
    }
}

package Visitor.checks;

import AST.Expression;
import AST.IdentifierExpr;
import AST.Literal;
import AST.VariableDeclaration;
import SymbolTable.Symbol;
import SymbolTable.SymbolTable;
import SymbolTable.SymbolTablePrinter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class UndefinedIdentifierChecker {
    private final FileWriter writer;
    private final SymbolTable symbolTable;

    public UndefinedIdentifierChecker(FileWriter writer, SymbolTable symbolTable) {
        this.writer = writer;
        this.symbolTable = symbolTable;
    }

    public void check(VariableDeclaration varDecl) throws IOException {
        Expression expr = varDecl.getExpression();
        if (expr instanceof IdentifierExpr identifierExpr) {
            List<String> ids = identifierExpr.getId();
            int start = (ids.size() > 0 && (ids.get(0).equals("this") || ids.get(0).equals("super"))) ? 1 : 0;

            for (int i = start; i < ids.size(); i++) {
                String id = ids.get(i);
                if (!symbolTable.contains(id)) {
                    writer.write("Semantic Error: Variable '" + id + "' used but not defined.\n");
                    symbolTable.define(new Symbol(id, "undefined_variable"));
                    SymbolTablePrinter.print(symbolTable, List.of(id));
                    symbolTable.remove(id);
                }
            }
        }
    }
}

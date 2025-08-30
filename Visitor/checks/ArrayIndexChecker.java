package Visitor.checks;

import AST.*;
import SymbolTable.Symbol;
import SymbolTable.SymbolTable;
import SymbolTable.SymbolTablePrinter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ArrayIndexChecker {
    private final FileWriter writer;
    private final SymbolTable symbolTable;

    public ArrayIndexChecker(FileWriter writer, SymbolTable symbolTable) {
        this.writer = writer;
        this.symbolTable = symbolTable;
    }
    public void check(VariableDeclaration varDecl) throws IOException {
        Expression expr = varDecl.getExpression();

        if (expr instanceof AST.ArrayAccessExpr arrayAccessExpr) {

            List<Expression> expressions = arrayAccessExpr.getExpressionList();
            if (expressions.size() == 2) {

                Expression arrayExpr = expressions.get(0);
                Expression indexExpr = expressions.get(1);

                if (arrayExpr instanceof AST.PropertyAccess propertyAccess) {

                    Expression target = propertyAccess.getExpression();
                    String arrayName = propertyAccess.getId();

                    if (target instanceof AST.ThisExpr && indexExpr instanceof AST.LiteralExpr literalExpr) {
                        Literal literal = literalExpr.getLiteral();
                        String indexStr = literal.getNumber();

                        if (indexStr != null) {
                            Symbol symbol = symbolTable.resolve(arrayName);
                            if (symbol != null && "array".equals(symbol.getType())) {
                                try {
                                    int index = Integer.parseInt(indexStr);
                                    if (index < 0 || index >= symbol.getArrayLength()) {
                                        writer.write(String.format(
                            "Semantic Error: Index %d out of bounds for array '%s' with length %d%n",
          index, arrayName, symbol.getArrayLength()));
           SymbolTablePrinter.print(symbolTable, List.of(arrayName));
                                    }
                                } catch (NumberFormatException e) {
                                    writer.write(String.format(
                                            "Semantic Error: Invalid array index '%s' for array '%s'%n",
                                            indexStr, arrayName));
                                }
                            }
                        }
                    }
                }
            }
        }
    }


}

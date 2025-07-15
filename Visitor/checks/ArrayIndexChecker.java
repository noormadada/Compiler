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

public class ArrayIndexChecker {
    private final FileWriter writer;
    private final SymbolTable symbolTable;

    public ArrayIndexChecker(FileWriter writer, SymbolTable symbolTable) {
        this.writer = writer;
        this.symbolTable = symbolTable;
    }

    public void check(VariableDeclaration varDecl) throws IOException {
        Expression expr = varDecl.getExpression();

        if (expr instanceof IdentifierExpr identifierExpr) {
            List<String> ids = identifierExpr.getId();
            List<Literal> literals = identifierExpr.getLiteral();



            if (!ids.isEmpty() && !literals.isEmpty()) {
                String varName = ids.get(ids.size() - 1);
                String indexStr = literals.get(0).getNumber();
                Symbol symbol = symbolTable.resolve(varName);

                if (symbol != null && "array".equals(symbol.getType())) {
                    try {
                        int index = Integer.parseInt(indexStr);
                        if (index < 0 || index >= symbol.getArrayLength()) {
                            writer.write(String.format(
                                    "Semantic Error: Index %d out of bounds for array '%s' with length %d%n",
                                    index, varName, symbol.getArrayLength()));
                            SymbolTablePrinter.print(symbolTable, List.of(varName));
                        }
                    } catch (NumberFormatException e) {
                        writer.write(String.format(
                                "Semantic Error: Invalid array index '%s' for array '%s'%n",
                                indexStr, varName));
                    }
                }
            }

        }
    }

}

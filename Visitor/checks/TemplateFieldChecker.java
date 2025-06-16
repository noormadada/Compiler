package Visitor.checks;

import AST.Decorator;
import AST.ObjectField;
import AST.TemplateField;
import SymbolTable.Symbol;
import SymbolTable.SymbolTable;
import SymbolTable.SymbolTablePrinter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class TemplateFieldChecker {
    private final FileWriter writer;
    private final SymbolTable symbolTable;

    public TemplateFieldChecker(FileWriter writer, SymbolTable symbolTable) {
        this.writer = writer;
        this.symbolTable = symbolTable;
    }

    public void check(Decorator decorator) throws IOException {
        boolean hasTemplate = decorator.getObjectLiteral().getObjectField().stream()
                .anyMatch(field -> field instanceof TemplateField);

        if (!hasTemplate) {
            writer.write("Semantic Error: Missing 'template' field in @Component decorator.\n");
            symbolTable.define(new Symbol("template", "decorator_field"));
            SymbolTablePrinter.print(symbolTable, List.of("template"));
            symbolTable.remove("template");
        }
    }
}

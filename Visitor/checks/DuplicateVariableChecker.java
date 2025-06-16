package Visitor.checks;

import AST.ClassDeclaration;
import AST.ClassMember;
import AST.VariableDeclaration;
import SymbolTable.Symbol;
import SymbolTable.SymbolTable;
import SymbolTable.SymbolTablePrinter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class DuplicateVariableChecker {
    private final FileWriter writer;
    private final SymbolTable symbolTable;

    public DuplicateVariableChecker(FileWriter writer, SymbolTable symbolTable) {
        this.writer = writer;
        this.symbolTable = symbolTable;
    }

    public void check(ClassDeclaration classDecl) throws IOException {
        for (ClassMember member : classDecl.getClassMember()) {
            VariableDeclaration var = member.getVariableDeclaration();
            if (var != null) {
                String name = var.getID();
                if (symbolTable.contains(name)) {
                    writer.write("Semantic Error: Duplicate variable '" + name + "' in class '" + classDecl.getID() + "'\n");
                    SymbolTablePrinter.print(symbolTable, List.of(name));
                } else {
                    symbolTable.define(new Symbol(name, "variable"));
                }
            }
        }
    }
}

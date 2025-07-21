package Visitor.checks;

import AST.AngularFile;
import AST.ClassDeclaration;
import SymbolTable.Symbol;
import SymbolTable.SymbolTable;
import SymbolTable.SymbolTablePrinter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ClassNameChecker {
    private final FileWriter writer;
    private final SymbolTable symbolTable;

    public ClassNameChecker(FileWriter writer, SymbolTable symbolTable) {
        this.writer = writer;
        this.symbolTable = symbolTable;
    }

    public void check(AngularFile angularFile) throws IOException {
        Set<String> classNames = new HashSet<>();

        for (ClassDeclaration classDecl : angularFile.getClassDeclaration()) {
            String name = classDecl.getID();
            if (!classNames.add(name)) {
                writer.write("Semantic Error: Duplicate class name '" + name + "' found.\n");
                SymbolTablePrinter.print(symbolTable, List.of(name));
                symbolTable.remove(name);
            } else {
                symbolTable.define(new Symbol(name, "class"));
            }
        }
    }
}

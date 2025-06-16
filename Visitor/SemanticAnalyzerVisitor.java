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

            // التحقق من أسماء الكلاسات المكررة
            new ClassNameChecker(writer, symbolTable).check(angularFile);

            for (ClassDeclaration classDecl : angularFile.getClassDeclaration()) {
                // التحقق من المتغيرات المكررة داخل الكلاس
                new DuplicateVariableChecker(writer, symbolTable).check(classDecl);

                for (ClassMember member : classDecl.getClassMember()) {
                    if (member.getVariableDeclaration() != null) {
                        // تعريف المتغير في جدول الرموز
                        defineVariable(member.getVariableDeclaration());
                    }
                }

                for (ClassMember member : classDecl.getClassMember()) {
                    if (member.getVariableDeclaration() != null) {
                        VariableDeclaration var = member.getVariableDeclaration();

                        // التحقق من أخطاء المؤشرات في المصفوفات
                        new ArrayIndexChecker(writer, symbolTable).check(var);

                        // التحقق من المعرفات غير المعرفة
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
                new TemplateFieldChecker(writer, symbolTable)
                        .check(angularFile.getDecorator());
            }
        }
    }

    // ✅ هذا التابع مسؤول عن تسجيل المتغيرات في جدول الرموز
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

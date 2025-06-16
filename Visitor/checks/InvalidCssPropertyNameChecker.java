package Visitor.checks;

import AST.CssRule;
import AST.CssStatement;
import AST.CssContent;
import AST.CssLiteral;
import SymbolTable.Symbol;
import SymbolTable.SymbolTable;
import SymbolTable.SymbolTablePrinter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class InvalidCssPropertyNameChecker {

    private final FileWriter writer;
    private final SymbolTable symbolTable;

    private static final Set<String> VALID_CSS_PROPERTIES = Set.of(
            "width", "height", "margin", "padding", "display", "border",
            "box-sizing", "flex", "gap", "align-items", "justify-content",
            "color", "background-color", "font-size", "text-align",
            "border-radius", "position", "top", "bottom", "left", "right"
    );

    public InvalidCssPropertyNameChecker(FileWriter writer, SymbolTable symbolTable) {
        this.writer = writer;
        this.symbolTable = symbolTable;
    }

    public void check(CssLiteral cssLiteral) throws IOException {
        CssContent content = cssLiteral.getCssContent();
        if (content == null) return;

        for (CssStatement statement : content.getCssStatementList()) {
            for (CssRule rule : statement.getCssRuleList()) {
                for (String id : rule.getTemplateId()) {
                    String property = id.trim();
                    if (!VALID_CSS_PROPERTIES.contains(property)) {
                        // سجّل الخطأ باستخدام نفس SymbolTable المُستخدم في SemanticAnalyzerVisitor
                        Symbol errorSymbol = new Symbol(
                                property,
                                "invalid_css_property",
                                List.of("invalid", "css", "property")
                        );
                        writer.write("Semantic Error: Invalid CSS property name '" + property + "'\n");
                        symbolTable.define(errorSymbol);
                        SymbolTablePrinter.print(symbolTable, List.of(property));
                        symbolTable.remove(property); // تنظيف بعد التبليغ
                    }
                }
            }
        }
    }
}

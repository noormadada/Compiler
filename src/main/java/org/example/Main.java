package org.example;

import AST.AngularFile;
import Visitor.BaseVisitor;
import Visitor.SemanticAnalyzerVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args) throws IOException {

        String source = "Errors/errors.txt";
        CharStream cs = fromFileName(source);

        gen.LexerFile lexerFiler = new gen.LexerFile(cs);
        CommonTokenStream token = new CommonTokenStream(lexerFiler);
        gen.ParserFile myLanguageParser = new gen.ParserFile(token);

        ParseTree tree = myLanguageParser.angularFile();
        AngularFile doc = (AngularFile) new BaseVisitor().visit(tree);

        SemanticAnalyzerVisitor semanticAnalyzer = new SemanticAnalyzerVisitor();
        semanticAnalyzer.analyze(doc);




    }
}

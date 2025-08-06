package org.example;

import AST.AngularFile;
import CodeGeneration.Generator;
import Visitor.BaseVisitor;
import Visitor.SemanticAnalyzerVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args) throws IOException {

        String source = "tests/my_app2.txt";
        CharStream cs = fromFileName(source);

        gen.LexerFile lexerFiler = new gen.LexerFile(cs);
        CommonTokenStream token = new CommonTokenStream(lexerFiler);
        gen.ParserFile myLanguageParser = new gen.ParserFile(token);

        ParseTree tree = myLanguageParser.angularFile();
        AngularFile doc = (AngularFile) new BaseVisitor().visit(tree);

        String sourceCode = Files.readString(Paths.get(source));
        // System.out.print(doc);

        //SemanticAnalyzerVisitor semanticAnalyzer = new SemanticAnalyzerVisitor();
        //semanticAnalyzer.analyze(doc);

        Generator generator = new Generator(sourceCode);
        generator.generate(doc);


    }
}

package CodeGeneration;

import AST.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Generator {

    private final String sourceCode;

    public Generator(String sourceCode) {
        this.sourceCode = sourceCode;
    }
    Set<String> generatedVars = new HashSet<>();
    private String arrayVariableName = null;

    public void generate(AngularFile angularFile){
        List<ClassDeclaration> classDeclarationList=angularFile.getClassDeclaration();
        String Space = "\t\t";
        try {
            FileWriter fw = new FileWriter("Result/GeneratedCode.html");
            generate("<!DOCTYPE html>", fw);
            generate("\n<html>", fw);
            generate("\n<head>", fw);
            generate("\n<title>Products App</title>", fw);
            generate("\n<style>", fw);
            generate("\n</style>", fw);
            generate("\n</head>", fw);
            generate("\n<body>\n", fw);
            generate("\n<div id=\"app\"></div>\n\n", fw);
            generate("\n<script>\n", fw);

            for (int i = 0; i <classDeclarationList.size(); i++) {
                if(classDeclarationList.get(i)!=null){
                    generate(classDeclarationList.get(i),Space,fw);
                }
            }

            generate("\n",fw);
            generate("\n</script>", fw);
            generate("\n</body>", fw);
            generate("\n</html>", fw);

            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void generate(String s, FileWriter fw) {
        try {
            System.out.print("\n");
            fw.append(s);
        } catch (IOException e) {
            System.out.println("error" + e.getMessage());
        }
    }

    private void generate(ClassDeclaration classDeclaration, String s, FileWriter fw){
        List<ClassMember> classMemberList=classDeclaration.getClassMember();
        for (int i = 0; i < classMemberList.size(); i++) {
            if(classMemberList.get(i)!=null){
                generate(classMemberList.get(i),s,fw);
            }
        }

    }

    private  void generate(ClassMember classMember,String s, FileWriter fw){

        if(classMember.getVariableDeclaration()!=null){
            generate(classMember.getVariableDeclaration(),s,fw);
        }
        if(classMember.getFunctionDeclaration()!=null){
            generate(classMember.getFunctionDeclaration(),s,fw);
        }

    }

    private void  generate(FunctionDeclaration functionDeclaration,String s , FileWriter fw){

        if(functionDeclaration.getBlock()!=null){
            generate(functionDeclaration.getBlock(),s,fw);
        }

    }
    private void  generate(Block block,String s , FileWriter fw){
        List<Statement> statementList= block.getStatement();
        for (int i = 0; i < statementList.size(); i++) {
            if(statementList.get(i)!=null){
                generate(statementList.get(i),s,fw);
            }
        }


    }
    private void  generate(Statement statement,String s , FileWriter fw){

        if(statement.getReturnStatement()!=null){
            generate(statement.getReturnStatement(),s,fw);
        }
    }
    private void  generate(ReturnStatement returnStatement,String s , FileWriter fw){
        Expression expression = returnStatement.getExpression();
        if (expression instanceof CallExpr callExpr ){
            List<Expression> expression1 = callExpr.getExpressionList();
            for (int i = 0; i < expression1.size(); i++) {
                if(expression1.get(i) instanceof IdentifierExpr2 identifierExpr2){
                    generate( identifierExpr2.getId().get(i) + " => "+ identifierExpr2.getId().get(i) +'.' +  identifierExpr2.getId().get(i+1) + ") + 1",fw);
                }
            }
        }
    }

    private void generate(VariableDeclaration variableDeclaration,String s, FileWriter fw){
        Expression expr = variableDeclaration.getExpression();


        if (expr instanceof ArrayExpr arrayExpr) {
            ArrayLiteral arrayLiteral = arrayExpr.getArrayLiteral();
            if (arrayLiteral != null) {
                String varName = variableDeclaration.getID();
                arrayVariableName = varName;
                if (!generatedVars.contains(varName)) {
                    generate("const storageKey = '" + varName + "';" + "\n", fw);
                    generatedVars.add(varName);
                    generate("let "+ varName + " =  JSON.parse(localStorage.getItem(storageKey)) || ["  + "\n" ,fw);

                }

                generate(arrayLiteral, s, fw);

            }
        }

        if(expr instanceof  LiteralExpr literalExpr   ) {
            if (literalExpr.getLiteral().getNumber() != null) {
                var var1 = variableDeclaration.getID();
                if (!sourceCode.contains(var1 + ":")) {
                    generate( "let " + variableDeclaration.getID() + " =Math.max(0, ..." + arrayVariableName , fw);
                    generate(".map(",fw);
                }
            }
        }

    }



    private void generate(ArrayLiteral arrayLiteral, String s, FileWriter fw) {
        List<ArrayElement> arrayElementList = arrayLiteral.getArrayElement();

        for (int i = 0; i < arrayElementList.size(); i++) {
            if(arrayElementList.get(i) != null){
                generate(arrayElementList.get(i), s, fw);
                generate("\n" ,fw);

            }
        }
    }


    private void generate(ArrayElement arrayElement, String s, FileWriter fw) {
        Expression expression = arrayElement.getExpression();
        if(expression instanceof ObjectExpr objectExpr){
            if(objectExpr.getObjectLiteral()!=null){
                generate(objectExpr.getObjectLiteral(),s,fw);
            }
        }

    }
    private void generate(ObjectLiteral objectLiterial, String s, FileWriter fw){
        generate("{",fw);
        List<ObjectField> objectFieldList = objectLiterial.getObjectField();
        for (int i = 0; i < objectFieldList.size(); i++) {
            ObjectField field = objectFieldList.get(i);
            if (field instanceof GenericField genericField) {
                generate(genericField.getID() + ":", fw);
                Expression expression = genericField.getExpression();
                if (expression instanceof LiteralExpr literalExpr) {
                    if (literalExpr.getLiteral() != null) {
                        generate(literalExpr.getLiteral(), s, fw);
                        generate(",",fw);

                    }
                }
            }
        }
        generate("}",fw);
        generate(",",fw);

    }

    private void generate(Literal literal, String s, FileWriter fw){
        if(literal.getNumber()!=null) {
            generate(literal.getNumber(), fw);
        }
        if(literal.getStringLiteral()!=null) {
            generate(literal.getStringLiteral(), fw);
        }
    }

}

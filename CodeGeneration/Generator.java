package CodeGeneration;

import AST.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Generator {
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
    }
    private void generate(VariableDeclaration variableDeclaration,String s, FileWriter fw){
        System.out.println("ssssss");
        if(variableDeclaration.getExpression().getArrayExpr()!=null){
            System.out.println("gggg");
            generate("const storageKey = 'products';",fw);
            //generate(variableDeclaration.getExpression().getArrayExpr(),s,fw);
        }
    }
    private void generate(ArrayExpr arrayExpr,String s, FileWriter fw){
        if(arrayExpr.getArrayLiteral()!=null){
            //generate(arrayExpr.getArrayLiteral(),s,fw);
        }
    }
    private void generate(ArrayLiteral arrayLiteral,String s, FileWriter fw){

    }

}
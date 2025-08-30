package CodeGeneration;

import AST.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Generator {
    private final String sourceCode;
    private String arrayVariableName = null;
    private String variableName = null;
    private String variableName2 = null;
    List<String> arrayAttr=new ArrayList<>();
    private final List<String> currentFunctionNames = new ArrayList<>();
    private List<Decorator> decoratorListRef;
    private boolean insideConstructor = false;
    String var="";
    String var1 = " ";
    String var2=" ";
    String var3="";
    private int functionIndex = 0;
    boolean isTextarea;


    public Generator(String sourceCode) {
        this.sourceCode = sourceCode;

    }

    public void generate(AngularFile angularFile) {
        this.decoratorListRef = angularFile.getDecorator();
        List<ClassDeclaration> classDeclarationList = angularFile.getClassDeclaration();
        List<String> stylesList = StyleExtractor.extractAllStyles(sourceCode);
        String indent = "\t\t";
        try (FileWriter fw = new FileWriter("Result/GeneratedCode.html")) {
            generate("<!DOCTYPE html>\n", fw);
            generate("<html>\n", fw);
            generate("<head>\n", fw);
            generate("<title>Angular App</title>\n", fw);
            generate("<style>\n",fw);
            for (String cssBlock : stylesList) {
                generate(cssBlock, fw);
            }
            generate("\n</style>\n",fw);
            generate("</head>\n", fw);
            generate("<body>\n", fw);
            generate("\n<div id=\"app\"></div>\n\n", fw);
            generate("\n<script>\n", fw);


            if(classDeclarationList.get(2).getID()!=null){
                var1= classDeclarationList.get(2).getID().getFirst();

            }
            if(classDeclarationList.get(3).getID()!=null){
                var3= classDeclarationList.get(3).getID().getFirst();
            }

            for (ClassDeclaration classDecl : classDeclarationList) {
                if (classDecl != null) {
                    generate(classDecl, indent, fw);
                }
            }
            generate("function getIdFromUrl() {\n" +
                    "      const params = new URLSearchParams(window.location.search);\n" +
                    "      return params.has('id') ? parseInt(params.get('id')) : null;\n" +
                    "    }",fw);

            generate(" const productIdFromURL = getIdFromUrl();\n" +
                    "    if (productIdFromURL) {\n" +
                         classDeclarationList.get(2).getID().getFirst() + "(productIdFromURL);\n" +
                    "    } else {\n" +
                    currentFunctionNames.get(6) + "();\n" +
                    "    }",fw);

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

    private void generate(String line, FileWriter fw) throws IOException {
        fw.write(line );
    }

    private void generate(Decorator decorator, String s, FileWriter fw) throws IOException {
        if(decorator.getObjectLiteral()!=null){
            generate(decorator.getObjectLiteral(),s,fw);}
    }



    private void generate(ClassDeclaration classDeclaration, String s, FileWriter fw) throws IOException {
        for (ClassMember classMember : classDeclaration.getClassMember()) {
            if (classMember != null) {
                generate(classMember, s, fw);
            }
        }
        if(!classDeclaration.getID().isEmpty()){
            if(Objects.equals(classDeclaration.getID().getFirst(), var1)){
                generate("function "+var1+"("+ arrayAttr.getFirst()+"){\n",fw);
                generate("const "+var+" = "+var2+"("+arrayAttr.getFirst()+");\n",fw);
                generate(" if (!"+var+")"+"return "+currentFunctionNames.get(6)+"();\n",fw);
                generate("document.getElementById('app').innerHTML = `\n",fw);
                if (!decoratorListRef.isEmpty()) {
                    if (decoratorListRef.get(2)!= null) {
                        generate(decoratorListRef.get(2), s, fw);
                    }
                }
                generate(" `; \n"+"}\n",fw);
            }
            if(Objects.equals(classDeclaration.getID().getFirst(), var3)){
                generate("function "+var3+"("+var+"= { "+arrayAttr.get(1)+": '',"+arrayAttr.get(2)+": '',"+arrayAttr.get(3)+": ''"+"}){\n",fw);
                generate("const "+variableName2+" = !!"+var+"."+arrayAttr.getFirst()+";\n",fw);
                generate("document.getElementById('app').innerHTML = `\n",fw);
                if (!decoratorListRef.isEmpty()) {
                    if (decoratorListRef.get(3)!= null) {
                        generate(decoratorListRef.get(3), s, fw);
                    }
                }
                generate(" `; \n"+"}\n",fw);
            }
        }

    }

    private void generate(ClassMember classMember, String s, FileWriter fw) throws IOException {
        if (classMember.getVariableDeclaration() != null) {
            generate(classMember.getVariableDeclaration(), s, fw);
        }
        if (classMember.getFunctionDeclaration() != null) {
            generate(classMember.getFunctionDeclaration(), s, fw);
        }
        if(classMember.getConstructor()!=null){
            generate(classMember.getConstructor(),s,fw);
        }
    }
    private void generate(Constructor constructor, String s, FileWriter fw) throws IOException {
        insideConstructor = true;
        if(constructor.getBlock()!=null){
            generate(constructor.getBlock(), s, fw);
        }
        insideConstructor = false;
    }

    private void generate(FunctionDeclaration functionDeclaration, String s, FileWriter fw) throws IOException {
        String functionName = functionDeclaration.getId().getFirst();

        currentFunctionNames.add(functionName);
        functionIndex++;
        if(!Objects.equals(functionName, "deleteProduct1")){
            generate("function " + functionName + "(", fw);
            if (functionDeclaration.getParameterList()!=null){
                generate(functionDeclaration.getParameterList(),s,fw);
            }
            if(functionIndex==12){
                generate(arrayAttr.getFirst(),fw);
            }
            generate(") {\n", fw);
            if (functionDeclaration.getBlock() != null) {
                generate(functionDeclaration.getBlock(), s, fw);
                if (functionIndex == 6 ) {
                    generate("    " + "ngOnInit" + "();\n", fw);
                }
                if(functionIndex==9){
                    generate("const "+var+" = "+currentFunctionNames.get(2)+"("+arrayAttr.getFirst()+");\n",fw);
                    generate(" if (!"+var+")"+"return ;\n",fw);
                    generate(var3 +"("+var+");\n",fw);
                }
                if (functionIndex == 11 ) {

                    generate(var3+"();\n", fw);
                }
                if(functionIndex==12){
                  generate("const form = document.querySelector(\"form\");\n",fw);
                  generate("const newProduct = {\n",fw);
                  generate(arrayAttr.get(1) + ":form."+arrayAttr.get(1)+".value,\n",fw );
                  generate(arrayAttr.get(2) + ":form."+arrayAttr.get(2)+".value,\n",fw );
                  generate(arrayAttr.get(3) + ":form."+arrayAttr.get(3)+".value\n};\n",fw );
                  generate("if(" + arrayAttr.get(0)+"!=null  && !isNaN(" +arrayAttr.getFirst() + ")){\n"  ,fw);
                  generate(currentFunctionNames.get(4)+ "(" + arrayAttr.get(0) + ",newProduct);\n}\nelse{\n",fw);
                  generate(currentFunctionNames.get(3) + "(newProduct);\n}\n",fw);
                  generate(currentFunctionNames.get(6) + "();\n",fw);

                }
            }


            generate("}\n", fw);
        }

    }

    private void generate(ParameterList parameterList,String s, FileWriter fw) throws IOException {
        List<Parameter>parameters =parameterList.getParameterList();
        for (int i = 0; i <parameters.size() ; i++) {
            generate(parameters.get(i),s,fw);
            if(i == parameters.size()-2){
                generate(" ,",fw);
            }
        }
    }

    private  void generate(Parameter parameter,String s,FileWriter fw) throws IOException {
        generate(parameter.getId().getFirst(),fw);

    }

    private void generate(Block block, String s, FileWriter fw) throws IOException {
        List<Statement> statements = block.getStatement();
        for (int i = 0; i < statements.size(); i++) {
            Statement stmt = statements.get(i);
            if (stmt != null) {
                generate(stmt, s, fw);
            }
        }
    }


    private void generate(MethodcallStatment methodcallStatment, String s, FileWriter fw) throws IOException {

        List<Expression> expressions = methodcallStatment.getExpression();

        for (int i = 0; i <expressions.size() ; i++) {
            if (expressions.get(i) instanceof IdentifierExpr identifierExpr){
                if(i==0) {
                    generate(identifierExpr.getId().getFirst() + "." + methodcallStatment.getID() + "(", fw);
                } else {
                    generate(identifierExpr.getId().getFirst()+",", fw);
                }
            }
        }

        for (Expression exp : expressions){
            if (exp instanceof LiteralExpr literalExpr){
                generate(literalExpr.getLiteral(),s,fw);
                generate(");",fw);
            }
        }

        if (expressions.size() == 3){
            if (expressions.get(1) instanceof PropertyAccess propertyAccess && expressions.get(2) instanceof CallExpr callExpr  ) {
                generate(propertyAccess.getId() + "," + "JSON.stringify(" + arrayVariableName + "));\n", fw);
            }
        }

        if (!insideConstructor) {
            for (Expression exp : expressions) {
                if (exp instanceof ThisExpr thisExpr) {
                    generate("  " + methodcallStatment.getID() + "();\n", fw);
                }
            }
        }

    }


    private void generate(Statement statement, String s, FileWriter fw) throws IOException {
        if (statement.getReturnStatement() != null) {
            generate(statement.getReturnStatement(), s, fw);
        }
        if (statement.getExpressionStatement() != null) {
            generate(statement.getExpressionStatement(), s, fw);
        }
        if (statement.getAssignmentStatement() != null) {
            generate(statement.getAssignmentStatement(), s, fw);
        }
        if(statement.getMethodcallStatment()!=null){
            generate(statement.getMethodcallStatment(),s,fw);
        }

        if(statement.getConstDeclaration()!=null){
            generate(statement.getConstDeclaration(),s,fw);

        }

        if(statement.getIfstatement()!=null){
            generate(statement.getIfstatement(),s,fw);
        }
        if(statement.getBlock()!=null){
            generate(statement.getBlock(),s,fw);
            generate("}\n",fw);
        }


    }

    private void generate(Ifstatement ifstatement, String s, FileWriter fw) throws IOException {

        Expression expression = ifstatement.getExpression();
        if(expression instanceof IdentifierExpr3 identifierExpr3){
            generate("if(",fw);
            generate(identifierExpr3.getId() + " > -" + identifierExpr3.getNumber() + ") {\n" ,fw);
            generate(ifstatement.getStatement().getFirst(),s,fw);
        }
    }

    private void generate(ConstDeclaration constDeclaration, String indent, FileWriter fw) throws IOException{

        if(constDeclaration.getCONST()!=null){
            generate("const ",fw);
            generate(constDeclaration.getID() + " = ",fw);
        }

        Expression expression = constDeclaration.getExpression();
        if(expression instanceof CallExpr callExpr){
            List<Expression> expressionList = callExpr.getExpressionList();
            if(expressionList.get(0) instanceof PropertyAccess propertyAccess && expressionList.get(1) instanceof IdentifierExpr2 identifierExpr2){
                Expression expression1 = propertyAccess.getExpression();
                if(expression1 instanceof PropertyAccess propertyAccess1){
                    generate(propertyAccess1.getId() + ".",fw);
                    generate(propertyAccess.getId() + "(",fw);
                    List<String> idList = identifierExpr2.getId();
                    generate(idList.getFirst() + " => " + identifierExpr2.getId().getFirst() + "." ,fw);
                    generate(identifierExpr2.getId().get(2) + " === " + identifierExpr2.getId().get(3) + ");\n",fw);
                }
            }

        }
        if(expression instanceof  BinaryExpr binaryExpr){
            List<Expression> expression1=binaryExpr.getExpressionList();
            if(!expression1.isEmpty()){
                if(expression1.get(1) instanceof IdentifierExpr identifierExpr){
                    generate("`${location.pathname}?",fw);
                    generate(identifierExpr.getId().getFirst() +"=${"+identifierExpr.getId().getFirst()+"}`; \n",fw);
                }
            }
        }
    }


    private void generate(AssignmentStatement assignmentStatement, String indent, FileWriter fw) throws IOException {
        List<String> idList = assignmentStatement.getId();
        if (!idList.isEmpty()) {
            generate("let " + arrayVariableName + " = " + idList.get(0) + "." + idList.get(1) + "(localStorage.getItem(" + variableName + ")) || [\n", fw);

        }
        List<Expression> expressions = assignmentStatement.getExpression();
        for (Expression expr : expressions) {

            if(expr instanceof BinaryExpr binaryExpr){
                List<Expression>expressionList=binaryExpr.getExpressionList();
                if(!expressionList.isEmpty()){
                    if (expressionList.get(1) instanceof UnaryExpr unaryExpr) {
                        Expression expression=unaryExpr.getExpression();
                        if(expression instanceof  CallExpr callExpr){
                            List<Expression> expressionList1=callExpr.getExpressionList();
                            if(!expressionList1.isEmpty()){
                                if(expressionList1.get(1) instanceof IdentifierExpr identifierExpr ){
                                    var=identifierExpr.getId().getFirst();
                                    generate(identifierExpr.getId().getFirst()+"." + arrayAttr.getFirst() +" = ",fw);
                                }
//                                    if(expressionList1.get(0) instanceof PropertyAccess propertyAccess){
//                                    }
                            }
                        }
                    } if (expressionList.get(0) instanceof PropertyAccess propertyAccess) {
                        generate(propertyAccess.getId() + "++; \n",fw);
                        generate(arrayVariableName +".push("+var +"); \n",fw);
                    }


                }
            }

            if (expr instanceof PropertyAccess propertyAccess) {
                String varName = propertyAccess.getId();
                if (!sourceCode.contains(varName + ":")) {
                    generate("let " + varName + " = Math.max(0, ..." + arrayVariableName + ".map("+arrayVariableName+ "=>\n"+ arrayVariableName+ "."+arrayAttr.getFirst()+")) + 1;\n\n", fw);
                }
            }

        }

        if(expressions.getFirst() instanceof ArrayAccessExpr arrayAccessExpr){
            List<Expression> expressionList1 = arrayAccessExpr.getExpressionList();
            if(expressionList1.getFirst() instanceof PropertyAccess propertyAccess && expressionList1.get(1) instanceof IdentifierExpr identifierExpr){

                generate(   "  " +propertyAccess.getId()  + identifierExpr.getId() + " = "  ,fw);
            }
        }

        if(expressions.get(1) instanceof SpreadObjectExpr spreadObjectExpr){
            generate("{ ..."   ,fw);
            List<SpreadField> spreadFieldList = spreadObjectExpr.getSpreadFieldList();
            for (int i = 0; i < spreadFieldList.size(); i++) {
                generate(spreadFieldList.get(i),indent,fw);
                if(i==spreadFieldList.size()-2){
                    generate(",",fw);
                }
            }
            generate(" };\n",fw);

        }

        if(expressions.getFirst() instanceof PropertyAccess propertyAccess && expressions.get(1) instanceof CallExpr callExpr){
            List<Expression> expressionList = callExpr.getExpressionList();
            if(expressionList.size()==1){
                if (expressionList.getFirst() instanceof PropertyAccess propertyAccess1){
                    generate(arrayVariableName + " = " +propertyAccess1.getId() +"();\n",fw);
                    generate("document.getElementById('app').innerHTML = `\n",fw);
                    if (!decoratorListRef.isEmpty()) {
                        if (decoratorListRef.get(1)!= null) {
                            generate(decoratorListRef.get(1), indent, fw);
                            generate("`;\n",fw);
                        }
                    }
                }
            }
            if(expressionList.size()==2){
                if(expressionList.getFirst() instanceof PropertyAccess propertyAccess1 && expressionList.get(1) instanceof IdentifierExpr2 identifierExpr2){
                    generate(propertyAccess.getId() + " = ",fw);
                    generate(propertyAccess.getId()+".",fw);
                    generate(propertyAccess1.getId() + "(",fw);
                    List<String> idList2 = identifierExpr2.getId();
                    generate(idList2.getFirst() + " => " + idList2.getFirst() + "." + idList2.get(3) + " !== " +  idList2.get(3) + ");\n"  ,fw );
                }
                if(expressionList.getFirst() instanceof PropertyAccess propertyAccess1 &&expressionList.get(1) instanceof IdentifierExpr identifierExpr){
                    var2=propertyAccess1.getId();
                }
            }

        }
    }

    private void generate(SpreadField spreadField, String s, FileWriter fw) throws IOException {
        if(spreadField.getId()!=null){
            generate(spreadField.getId(),fw);
        }
        ObjectField objectField = spreadField.getObjectField();
        if(objectField instanceof GenericField genericField){
            generate(genericField.getID(),fw);
        }
    }



    private void generate(ExpressionStatement expressionStatement, String indent, FileWriter fw) throws IOException {
        Expression expr = expressionStatement.getExpression();
        if (expr instanceof ArrayExpr arrayExpr) {
            ArrayLiteral arrayLiteral = arrayExpr.getArrayLiteral();
            if (arrayLiteral != null) {
                generate(arrayLiteral, indent, fw);
            }
        }
    }

    private void generate(ReturnStatement returnStatement, String indent, FileWriter fw) throws IOException {

        generate("return ", fw);
        Expression expression = returnStatement.getExpression();
        if (expression instanceof CallExpr callExpr) {
            List<Expression> expression1 = callExpr.getExpressionList();
            for (int i = 0; i < expression1.size(); i++) {
                if(expression1.get(i) instanceof PropertyAccess propertyAccess){
                    Expression expression2 = propertyAccess.getExpression();
                    if(expression2 instanceof PropertyAccess propertyAccess1){
                        generate(propertyAccess1.getId()  + ".",fw);
                        generate(propertyAccess.getId() + "(" ,fw);
                    }
                }
                if (expression1.get(i) instanceof IdentifierExpr2 identifier) {
                    generate( identifier.getId().get(i) + " => " + identifier.getId().get(i) + "." + identifier.getId().get(i + 1) + " === " + identifier.getId().get(i + 1)+ ");\n", fw);
                }
            }
        }
        if(expression instanceof PropertyAccess ){
            generate(  arrayVariableName + " ;\n" ,fw );
        }

    }

    private void generate(VariableDeclaration varDecl, String s, FileWriter fw) throws IOException {
        if (varDecl.getPrivateWord() != null && varDecl.getExpression() instanceof LiteralExpr literalExpr) {
            variableName = varDecl.getID();
            generate("const " + variableName + " = " , fw);
            generate(literalExpr.getLiteral(),s,fw);
            generate("; \n",fw);
        }
        if(varDecl.getExpression() instanceof LiteralExpr literalExpr){
            if(literalExpr.getLiteral().getFalseId()!=null) {
                variableName2 = varDecl.getID();
            }
        }
        String varId = varDecl.getID();
        if (sourceCode.contains(varId + ":")) {
            arrayVariableName = varId;
        }
    }


    private void generate(ArrayLiteral arrayLiteral, String indent, FileWriter fw) throws IOException {
        for (ArrayElement element : arrayLiteral.getArrayElement()) {
            if (element != null) {
                generate(element, indent, fw);
            }
        }
        generate("]; \n", fw);
    }

    private void generate(ArrayElement element, String indent, FileWriter fw) throws IOException {
        Expression expr = element.getExpression();
        if (expr instanceof ObjectExpr objExpr && objExpr.getObjectLiteral() != null) {
            generate(objExpr.getObjectLiteral(), indent, fw);
        }
    }

    private void generate(ObjectLiteral objectLiteral, String s, FileWriter fw) throws IOException {

        List<ObjectField> fields = objectLiteral.getObjectField();
        for (int i = 0; i < fields.size(); i++) {
            ObjectField field = fields.get(i);
            if (field instanceof GenericField genericField) {

                if(!Objects.equals(genericField.getID(), "standalone")&&!Objects.equals(genericField.getID(), "selector")&&!Objects.equals(genericField.getID(), "providedIn")){
                    String key = genericField.getID();
                    Expression valExpr = genericField.getExpression();
                    if (valExpr instanceof LiteralExpr literalExpr) {
                        if(i==0){
                            generate("{",fw);

                        }
                        generate(key + " :", fw);
                        arrayAttr.add(key);
                        generate(literalExpr.getLiteral(), s, fw);
                        if(i==fields.size()-1){
                            generate("},",fw);
                        }
                        if(i != fields.size()-1){
                            generate(",", fw);}

                    }
                }
            }
            if(field instanceof TemplateField templateField){
                generate(templateField.getTemplateLiteral(),s,fw);
            }
        }

    }

    private void generate(TemplateLiteral templateLiteral,String s ,FileWriter fw) throws IOException {
        if(templateLiteral.getHtmlContent()!=null){
            generate(templateLiteral.getHtmlContent(),s,fw);
        }
    }
    private void generate(HtmlContent htmlContent,String s ,FileWriter fw) throws IOException {
        List<HtmlChunk> htmlChunkList = htmlContent.getHtmlChunkList();
        for (int i = 0; i < htmlChunkList.size(); i++) {
            if(htmlChunkList.get(i) instanceof HtmlElementChunk htmlElementChunk){
                if(htmlElementChunk.getHtmlElement()!=null){
                    generate(htmlElementChunk.getHtmlElement(),s,fw);
                }
            }
        }
    }


    private void generate(HtmlElement htmlElement,String s ,FileWriter fw) throws IOException {
        List<HtmlAttribute> htmlAttributes = htmlElement.getHtmlAttributeList();

        // ngFor (structural directive) handling (فتح map)
        boolean hasNgFor = !htmlAttributes.isEmpty() && htmlAttributes.get(0).getANGULAR_STRUCTURAL_DIRECTIVE()!=null;
        if (hasNgFor) {
            // استخدم arrayVariableName و var (كما في طريقتك)
            String arr = (arrayVariableName != null) ? arrayVariableName : "items";
            String v = (var != null && !var.isEmpty()) ? var : "item";
            generate(" ${" + arr + ".map(" + v + " => `\n", fw);
        }


        generate("<", fw);
        if(htmlElement.getHtmlTag()!=null){
            generate(htmlElement.getHtmlTag(), s, fw);
        }


        if (!htmlAttributes.isEmpty()) {
             isTextarea = htmlElement.getHtmlTag() != null
                    && "textarea".equals(htmlElement.getHtmlTag().getTemplateTagId());
            for (HtmlAttribute attr : htmlAttributes) {
                if (isTextarea && attr.getANGULAR_TWO_WAY_BINDING() != null) {
                    generate(attr, s, fw, true);
                    continue;
                }
                generate(attr, s, fw, false);
            }
        }
        generate(">", fw);


        List<HtmlChunk> htmlChunkList = htmlElement.getHtmlChunkList();
        for (HtmlChunk chunk : htmlChunkList) {
            if(chunk instanceof HtmlElementChunk htmlElementChunk){
                if(htmlElementChunk.getHtmlElement()!=null){
                    generate(htmlElementChunk.getHtmlElement(), s, fw);
                }
            } else if (chunk instanceof Html_Id htmlId){
                if(htmlId.getTEMPLATE_ID()!=null){
                    generate(htmlId.getTEMPLATE_ID(),fw);
                }
            } else if (chunk instanceof InterpolationChunk interpolationChunk){
                if(interpolationChunk.getInterpolation()!=null){
                    generate(interpolationChunk.getInterpolation(), s, fw);
                }
            } else if (chunk instanceof HtmlSelfClosingChunk htmlSelfClosingChunk){
                if(htmlSelfClosingChunk.getSelfClosingTag()!=null){
                    generate(htmlSelfClosingChunk.getSelfClosingTag(), s, fw);
                }
            } else if (chunk!=null) {
                if (chunk.getTEMPLATE_TEXT() != null) {
                    generate(chunk.getTEMPLATE_TEXT(), fw);
                }
            }
        }

        // اغلاق التاغ
        if (htmlElement.getCloseTag() != null) {
            generate(htmlElement.getCloseTag(), s, fw);
        }

        // إغلاق ngFor (إن وُجد)
        if (hasNgFor) {
            generate("`).join('')}\n", fw);
        }
    }

    private void generate(SelfClosingTag selfClosingTag,String s ,FileWriter fw) throws IOException {
        generate("<",fw);
        if(selfClosingTag.getHtmlTag()!=null){
            generate(selfClosingTag.getHtmlTag(),s,fw);
        }
        List<HtmlAttribute> htmlAttributeList = selfClosingTag.getHtmlAttributeList();
        if(!htmlAttributeList.isEmpty()){
            for (int i = 0; i < htmlAttributeList.size(); i++) {
                generate(htmlAttributeList.get(i),s,fw,false);
            }
        }
        generate("/> \n",fw);
    }

    private void generate(Interpolation interpolation,String s ,FileWriter fw) throws IOException {

        generate("${",fw);
        if(interpolation.getInterpolationContent()!=null){
            generate(interpolation.getInterpolationContent(),s,fw);
        }
        generate("}",fw);
    }
    private void generate(InterpolationContent interpolationContent,String s ,FileWriter fw) throws IOException {
        List<InterpolationExpr> interpolationExprList = interpolationContent.getInterpolationExprList();
        for (int i = 0; i < interpolationExprList.size(); i++) {

            generate(interpolationExprList.get(i),s,fw);
            if(interpolationExprList.size()<5){
                if(i==interpolationExprList.size()-2){
                    generate(".",fw);}}

        }
    }

    private void generate(InterpolationExpr interpolationExpr,String s ,FileWriter fw) throws IOException {
        if(interpolationExpr.getInterpolationId()!=null){
            generate(interpolationExpr.getInterpolationId(),fw);
        }
        if(interpolationExpr.getINTERPOLATION_NTERROGATIVE()!=null){
            generate(interpolationExpr.getINTERPOLATION_NTERROGATIVE() + " ",fw);
        }
        if(interpolationExpr.getINTERPOLATION_COLON()!=null){
            generate(interpolationExpr.getINTERPOLATION_COLON() + " ",fw);
        }
    }

    private void generate(CloseTag closeTag,String s ,FileWriter fw) throws IOException {
        generate("</",fw);
        if(closeTag.getHtmlTag()!=null){
            generate(closeTag.getHtmlTag(),s,fw);
            generate(">\n",fw);
        }
    }

    private enum AttrMode { LITERAL, EXPRESSION, EVENT, TEXTAREA ,Finally }

    private void generate(HtmlAttribute htmlAttribute,String s ,FileWriter fw,boolean b) throws IOException {
        if (htmlAttribute.getTEMPLATE_ID() != null) {
            String name = htmlAttribute.getTEMPLATE_ID();
            if (htmlAttribute.getAttributeValue() != null) {
                generate(" " + name + "=", fw);
                generate(htmlAttribute.getAttributeValue(), s, fw, AttrMode.LITERAL);
                if(isTextarea){
                    generate(" required",fw);
                }
            }
        }

        if(htmlAttribute.getANGULAR_EVENT_BINDING()!=null){
            // نفترض (click) => onclick
            generate(" onclick=",fw);
            if (htmlAttribute.getAttributeValue()!=null){
               // System.out.print("1");
                generate(htmlAttribute.getAttributeValue(), s, fw, AttrMode.Finally);
            } else {
                generate("\"\"", fw);
            }
            return;
        }
        if(htmlAttribute.getANGULAR_TWO_WAY_BINDING()!=null){
if(!b){
    generate(" required value="  ,fw);
    if (htmlAttribute.getAttributeValue()!=null){
        generate(htmlAttribute.getAttributeValue(), s, fw, AttrMode.EXPRESSION);
    } else {
        generate("\"\"", fw);
    }
    return;
}
else {
    if (htmlAttribute.getAttributeValue()!=null){
        generate(htmlAttribute.getAttributeValue(), s, fw, AttrMode.TEXTAREA);

    } else {

        generate("\"\"", fw);

    }
    return;
}
}


        if(htmlAttribute.getANGULAR_PROPERTY_BINDING()!=null){
            generate(" src=",fw);
            if (htmlAttribute.getAttributeValue()!=null){
                generate(htmlAttribute.getAttributeValue(), s, fw, AttrMode.EXPRESSION);
            } else {
                generate("\"\"", fw);
            }
        }

    }

   int x=0;
    private void generate(AttributeValue attributeValue, String s, FileWriter fw, AttrMode mode) throws IOException {

        if (attributeValue.getTEMPLATE_STRING() != null) {

            String raw = attributeValue.getTEMPLATE_STRING();
            raw = raw.replace("1", "");
            String inner = raw;
            if (raw.length() >= 2 && ((raw.startsWith("\"") && raw.endsWith("\"")) || (raw.startsWith("'") && raw.endsWith("'")))) {
                inner = raw.substring(1, raw.length() - 1);
            }
            switch (mode) {
                case EXPRESSION:
                    generate("\"${" + inner + "}\"", fw);
                    break;
                case EVENT:
                    generate("\"" + inner + "\"", fw);
                    break;
                case TEXTAREA:
                    generate(" ${" + inner + "}", fw);
                    break;
                case Finally:

                    int start = inner.indexOf('(');
                    int end = inner.indexOf(')');
                    String inside = inner.substring(start + 1, end).trim();
                    if(x==4){
                     inside = variableName2 + "?" + var + "." + arrayAttr.getFirst() + ": 'null'";

                    }
                    if(x!=0) {
                        inner = inner.substring(0, start + 1) + "${" + inside + "}" + inner.substring(end);
                    }

                        generate("\"" + inner + "\"", fw);
                    x++;

                   break;
                    // مهم: لا تسقط للـ default
                default:
                    generate("\"" + inner + "\"", fw);
                    break;
            }
            return;
        }

        generate("\"\"", fw);
    }


    private void generate(HtmlTag htmlTag,String s ,FileWriter fw) throws IOException {

        if(htmlTag.getTemplateTagDiv()!=null){
            generate( htmlTag.getTemplateTagDiv(),fw);
        } else if(htmlTag.getTemplateTagButton()!=null){
            generate( htmlTag.getTemplateTagButton(),fw);
        } else if (htmlTag.getTemplateTagH3()!=null){
            generate(htmlTag.getTemplateTagH3(),fw);
        } else if (htmlTag.getTemplateTagH2()!=null){
            generate(htmlTag.getTemplateTagH2(),fw);
        } else if (htmlTag.getTemplateTagId()!=null){
            generate(htmlTag.getTemplateTagId(),fw);
        } else if (htmlTag.getTemplateTagP()!=null){
            generate(htmlTag.getTemplateTagP(),fw);
        } else if(htmlTag.getTemplateTagImg()!=null){
            generate(htmlTag.getTemplateTagImg(),fw);
        } else if(htmlTag.getTemplateTagInput()!=null){
            generate(htmlTag.getTemplateTagInput(),fw);
        } else if(htmlTag.getTEMPLATE_TAG_FORM()!=null){
            generate(htmlTag.getTEMPLATE_TAG_FORM(),fw);
        } else if (htmlTag.getTemplateTagSpan()!=null){
            generate(htmlTag.getTemplateTagSpan(), fw);
        } else if (htmlTag.getTemplateTagUl()!=null){
            generate(htmlTag.getTemplateTagUl(), fw);
        } else if (htmlTag.getTemplateTagLi()!=null){
            generate(htmlTag.getTemplateTagLi(), fw);
        } else if (htmlTag.getTemplateTagSection()!=null){
            generate(htmlTag.getTemplateTagSection(), fw);
        } else if (htmlTag.getTemplateTagH1()!=null){
            generate(htmlTag.getTemplateTagH1(), fw);
        }

    }

    private void generate(Literal literal,String s ,FileWriter fw) throws IOException {
        if(literal.getStringLiteral()!=null){
            generate(literal.getStringLiteral() ,fw);
        }
        if(literal.getNumber()!=null){
            generate(literal.getNumber(),fw);
        }
    }
}





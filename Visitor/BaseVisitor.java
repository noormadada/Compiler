package Visitor;
import AST.*;
import gen.ParserFile;
import gen.ParserFileBaseVisitor;



public class BaseVisitor extends ParserFileBaseVisitor {
    @Override
    public AngularFile visitAngularFile(ParserFile.AngularFileContext ctx) {
        AngularFile angularFile = new AngularFile();
        if(!ctx.importStatement().isEmpty()){
            for (int i = 0; i <ctx.importStatement().size() ; i++) {
                angularFile.getImportstatement().add(visitImportStatement(ctx.importStatement(i)));
            }
        }
        if(!ctx.decorator().isEmpty()){
            for (int i = 0; i <ctx.decorator().size(); i++) {
                angularFile.getDecorator().add(visitDecorator(ctx.decorator(i)));
            }
        }
        if(!ctx.classDeclaration().isEmpty()){
            for (int i = 0; i <ctx.classDeclaration().size(); i++) {
                angularFile.getClassDeclaration().add(visitClassDeclaration(ctx.classDeclaration(i)));
            }
        }
        if(!ctx.constExportStatement().isEmpty()){
            for (int i = 0; i <ctx.constExportStatement().size(); i++) {
                angularFile.getConstExportStatement().add(visitConstExportStatement(ctx.constExportStatement(i)));
            }
        }
        if(!ctx.expressionStatement().isEmpty()){
            for (int i = 0; i <ctx.expressionStatement().size(); i++) {
                angularFile.getExpressionStatement().add(visitExpressionStatement(ctx.expressionStatement(i)));
            }
        }

        return angularFile;
    }

    @Override
    public ImportStatement visitImportStatement(ParserFile.ImportStatementContext ctx) {
        ImportStatement importStatement = new ImportStatement();
        if(ctx.idList()!=null){
            importStatement.setIdList(visitIdList(ctx.idList()));
        }
        importStatement.setIMPORT(ctx.IMPORT().getText());
        importStatement.setFROM(ctx.FROM().getText());
        importStatement.setSTRING_LITERAL(ctx.STRING_LITERAL().getText());

        return  importStatement;

    }

    @Override
    public IdList visitIdList(ParserFile.IdListContext ctx) {
        IdList idList = new IdList();
        for (int i = 0; i < ctx.ID().size(); i++) {
            idList.getIdList().add(String.valueOf(ctx.ID().get(i)));
        }

        return idList;
    }

    @Override
    public Decorator visitDecorator(ParserFile.DecoratorContext ctx) {
        Decorator decorator = new Decorator();
        decorator.setAT(ctx.AT().getText());
        decorator.setID(ctx.ID().getText());
        if(ctx.objectLiteral()!=null){
            decorator.setObjectLiteral(visitObjectLiteral(ctx.objectLiteral()));
        }

        return  decorator;

    }

    @Override
    public ObjectLiteral visitObjectLiteral(ParserFile.ObjectLiteralContext ctx) {
        ObjectLiteral objectLiteral = new ObjectLiteral();
        if(!ctx.objectField().isEmpty()){
            for (int i = 0; i < ctx.objectField().size(); i++) {
                objectLiteral.getObjectField().add((ObjectField)visit(ctx.objectField().get(i)));
            }
        }
        return objectLiteral;
    }

    @Override
    public TemplateField visitTemplateField(ParserFile.TemplateFieldContext ctx) {
        TemplateField templateField = new TemplateField();
        if(ctx.templateLiteral()!=null){
            templateField.setTemplateLiteral(visitTemplateLiteral(ctx.templateLiteral()));
        }
        templateField.setTEMPLATEE(ctx.TEMPLATEE().getText());

        return templateField;
    }

    @Override
    public StylesField visitStylesField(ParserFile.StylesFieldContext ctx) {
        StylesField stylesField = new StylesField();
        if(ctx.styleArray()!=null){
            stylesField.setStyleArray(visitStyleArray(ctx.styleArray()));

        }
        stylesField.setSTYLES(ctx.STYLES().getText());

        return stylesField;
    }

    @Override
    public GenericField visitGenericField(ParserFile.GenericFieldContext ctx) {
        GenericField genericField = new GenericField();
        if(ctx.expression()!=null){
            genericField.setExpression((Expression)visit(ctx.expression()) );
        }
        genericField.setID(ctx.ID().getText());
        return  genericField;
    }

    @Override
    public StyleArray visitStyleArray(ParserFile.StyleArrayContext ctx) {
        StyleArray styleArray = new StyleArray();
        if(ctx.cssLiteral()!=null){
            for (int i = 0; i < ctx.cssLiteral().size(); i++) {
                styleArray.getCssLiteral().add(visitCssLiteral(ctx.cssLiteral(i)));
            }
        }
        return styleArray;
    }

    @Override
    public SpreadField visitSpreadField(ParserFile.SpreadFieldContext ctx) {
        SpreadField spreadField = new SpreadField();
        if(ctx.ID()!=null){
            spreadField.setId(ctx.ID().getText());
        }
        if(ctx.objectField()!=null){
            spreadField.setObjectField((ObjectField)visit(ctx.objectField()) );
        }
        return spreadField;
    }

    @Override
    public SpreadObjectExpr visitSpreadObjectExpr(ParserFile.SpreadObjectExprContext ctx) {

        SpreadObjectExpr spreadObjectExpr = new SpreadObjectExpr();

        if(!ctx.objectField().isEmpty()){
            for (int i = 0; i < ctx.objectField().size(); i++) {
                spreadObjectExpr.getObjectFieldList().add((ObjectField)visit(ctx.objectField(i)) );
            }
        }

        if(!ctx.spreadField().isEmpty()){
            for (int i = 0; i < ctx.spreadField().size(); i++) {
                spreadObjectExpr.getSpreadFieldList().add(visitSpreadField(ctx.spreadField(i)) );
            }
        }
        return spreadObjectExpr;

    }

    @Override
    public ArrayAccessExpr visitArrayAccessExpr(ParserFile.ArrayAccessExprContext ctx) {
        ArrayAccessExpr arrayAccessExpr = new ArrayAccessExpr();

        if(!ctx.expression().isEmpty()){
            for (int i = 0; i < ctx.expression().size(); i++) {

                arrayAccessExpr.getExpressionList().add((Expression)visit(ctx.expression(i)));
            }
        }
        return arrayAccessExpr;
    }

    @Override
    public BinaryExpr visitBinaryExpr(ParserFile.BinaryExprContext ctx) {

        BinaryExpr binaryExpr = new BinaryExpr();
        if(!ctx.expression().isEmpty()){
            for (int i = 0; i < ctx.expression().size(); i++) {

                binaryExpr.getExpressionList().add((Expression)visit(ctx.expression(i)));
            }
        }
        return binaryExpr;
    }


    @Override
    public IdentifierExpr3 visitIdentifierExpr3(ParserFile.IdentifierExpr3Context ctx) {
        IdentifierExpr3 identifierExpr3 = new IdentifierExpr3() ;

        identifierExpr3.setId(ctx.ID().getText());
        identifierExpr3.setNumber(ctx.NUMBER().getText());
        return  identifierExpr3;
    }

    @Override
    public IdentifierExpr2 visitIdentifierExpr2(ParserFile.IdentifierExpr2Context ctx) {

        IdentifierExpr2 identifierExpr2 = new IdentifierExpr2();

        for (int i = 0; i < ctx.ID().size(); i++) {
            identifierExpr2.getId().add(String.valueOf(ctx.ID().get(i)));
        }
        return  identifierExpr2;

    }

    @Override
    public CssExpr visitCssExpr(ParserFile.CssExprContext ctx) {
        CssExpr cssExpr = new CssExpr();
        if(ctx.cssLiteral()!=null){
            cssExpr.setCssLiteral(visitCssLiteral(ctx.cssLiteral()));
        }

        return cssExpr;
    }

    @Override
    public UnaryExpr visitUnaryExpr(ParserFile.UnaryExprContext ctx) {
        UnaryExpr unaryExpr = new UnaryExpr();
        if(ctx.expression()!=null){
            unaryExpr.setExpression((Expression)visit(ctx.expression()) );
        }
        return unaryExpr;
    }

    @Override
    public PropertyAccess visitPropertyAccess(ParserFile.PropertyAccessContext ctx) {
        PropertyAccess propertyAccess = new PropertyAccess();

        if(ctx.expression()!=null){
            propertyAccess.setExpression((Expression)visit(ctx.expression()) );
        }
        propertyAccess.setId(ctx.ID().getText());

        return propertyAccess;
    }

    @Override
    public ArrayExpr visitArrayExpr(ParserFile.ArrayExprContext ctx) {
        ArrayExpr arrayExpr = new ArrayExpr();
        if(ctx.arrayLiteral()!=null){
            arrayExpr.setArrayLiteral(visitArrayLiteral(ctx.arrayLiteral()));
        }
        return arrayExpr;
    }

    @Override
    public ObjectExpr visitObjectExpr(ParserFile.ObjectExprContext ctx) {

        ObjectExpr objectExpr = new ObjectExpr();
        if(ctx.objectLiteral()!=null){
            objectExpr.setObjectLiteral(visitObjectLiteral(ctx.objectLiteral()));
        }
        return objectExpr;
    }

    @Override
    public IdentifierExpr visitIdentifierExpr(ParserFile.IdentifierExprContext ctx) {
        IdentifierExpr identifierExpr = new IdentifierExpr();
        for (int i = 0; i < ctx.ID().size(); i++) {
            identifierExpr.getId().add(String.valueOf(ctx.ID().get(i)));
        }
        for (int i = 0; i < ctx.AS().size(); i++) {
            if(ctx.AS()!=null){

                identifierExpr.getAs().add(String.valueOf(ctx.AS().get(i)));
            }
        }

        if(!ctx.expression().isEmpty()){
            for (int i = 0; i < ctx.expression().size(); i++) {
                identifierExpr.getExpressionList().add((Expression)visit(ctx.expression(i)));

            }

        }
        return  identifierExpr;


    }

    @Override
    public TemplateExpr visitTemplateExpr(ParserFile.TemplateExprContext ctx) {
        TemplateExpr templateExpr = new TemplateExpr();

        if(ctx.templateLiteral()!=null){
            templateExpr.setTemplateLiteral(visitTemplateLiteral(ctx.templateLiteral()));
        }
        return templateExpr;
    }



    @Override
    public LiteralExpr visitLiteralExpr(ParserFile.LiteralExprContext ctx) {
        LiteralExpr literalExpr = new LiteralExpr();

        if(ctx.literal()!=null){
            literalExpr.setLiteral(visitLiteral(ctx.literal()));
        }
        return  literalExpr;
    }

    @Override
    public ParenthesizedExpr visitParenthesizedExpr(ParserFile.ParenthesizedExprContext ctx) {

        ParenthesizedExpr parenthesizedExpr = new ParenthesizedExpr();
        if(ctx.expression()!=null){
            parenthesizedExpr.setExpression((Expression)visit(ctx.expression()) );
        }

        return parenthesizedExpr;
    }

    @Override
    public CallExpr visitCallExpr(ParserFile.CallExprContext ctx) {

        CallExpr callExpr = new CallExpr();

        if(!ctx.expression().isEmpty()){
            for (int i = 0; i < ctx.expression().size(); i++) {

                callExpr.getExpressionList().add((Expression)visit(ctx.expression(i)));
            }
        }
        if(!ctx.ID().isEmpty()){
            for (int i = 0; i <ctx.ID().size() ; i++) {
                callExpr.getId().add(String.valueOf(ctx.ID().get(i)));
            }
        }
        return callExpr;
    }

    @Override
    public VariableDeclaration visitVariableDeclaration(ParserFile.VariableDeclarationContext ctx) {
        VariableDeclaration variableDeclaration=new VariableDeclaration();
        if(ctx.PRIVATE()!=null){
            variableDeclaration.setPrivateWord(ctx.PRIVATE().getText());
        }
        variableDeclaration.setID(ctx.ID().getText());
        if(ctx.type()!=null){
            variableDeclaration.setType(visitType(ctx.type()));
        }
        if(ctx.expression()!=null){
            variableDeclaration.setExpression((Expression) visit(ctx.expression()));
        }
        return variableDeclaration;
    }

    @Override
    public Type visitType(ParserFile.TypeContext ctx) {
        Type type=new Type();
        if(ctx.ID()!=null){
            type.setId(ctx.ID().getText());
        }
        if(ctx.ANY()!=null){
            type.setAny(ctx.ANY().getText());
        }
        if(ctx.VOID()!=null){
            type.setVoidWord(ctx.VOID().getText());
        }
        return  type;
    }

    @Override
    public ThisPropertyExpr visitThisPropertyExpr(ParserFile.ThisPropertyExprContext ctx) {
        ThisPropertyExpr thisPropertyExpr=new ThisPropertyExpr();
        if(ctx.ID()!=null){
            thisPropertyExpr.setId(ctx.ID().getText());
        }
        if(ctx.THIS()!=null){
            thisPropertyExpr.setThis(ctx.THIS().getText());
        }
        return thisPropertyExpr;
    }

    @Override
    public ThisExpr visitThisExpr(ParserFile.ThisExprContext ctx) {
        ThisExpr thisExpr=new ThisExpr();
        thisExpr.setThis(ctx.THIS().getText());
        return  thisExpr;
    }

    @Override
    public ThisCallExpr visitThisCallExpr(ParserFile.ThisCallExprContext ctx) {
        ThisCallExpr thisCallExpr=new ThisCallExpr();
        thisCallExpr.setThis(ctx.THIS().getText());
        thisCallExpr.setId(ctx.ID().getText());
        if(!ctx.expression().isEmpty()){
            for (int i = 0; i < ctx.expression().size(); i++) {
                thisCallExpr.getExpressionList().add((Expression) visit(ctx.expression().get(i)));
            }
        }
        return thisCallExpr;
    }

    @Override
    public ConstExportStatement visitConstExportStatement(ParserFile.ConstExportStatementContext ctx) {
        ConstExportStatement constExportStatement=new ConstExportStatement();
        constExportStatement.setEXPORT(ctx.EXPORT().getText());
        constExportStatement.setCONST(ctx.CONST().getText());
        constExportStatement.setID(ctx.ID().getText());
        constExportStatement.setType(visitType(ctx.type()));
        constExportStatement.setExpression((Expression) visit(ctx.expression()));

        return  constExportStatement;
    }

    @Override
    public ConstDeclaration visitConstDeclaration(ParserFile.ConstDeclarationContext ctx) {
        ConstDeclaration constDeclaration=new ConstDeclaration();
        if(ctx.CONST()!=null){
            constDeclaration.setCONST(ctx.CONST().getText());}
        if(ctx.LET()!=null){
            constDeclaration.setLET(ctx.LET().getText());}

        constDeclaration.setID(ctx.ID().getText());
        constDeclaration.setExpression((Expression) visit(ctx.expression()));

        return  constDeclaration;
    }

    @Override
    public Ifstatement visitIfStatement(ParserFile.IfStatementContext ctx) {
        Ifstatement ifstatement=new Ifstatement();
        ifstatement.setIF(ctx.IF().getText());
        ifstatement.setExpression((Expression) visit(ctx.expression()));
        for (int i = 0; i < ctx.statement().size(); i++) {
            ifstatement.getStatement().add(visitStatement(ctx.statement(i)));
        }
        return ifstatement;
    }

    @Override
    public ReturnStatement visitReturnStatement(ParserFile.ReturnStatementContext ctx) {
        ReturnStatement returnStatement=new ReturnStatement();
        returnStatement.setReturn(ctx.RETURN().getText());
        if(ctx.expression()!=null){
            returnStatement.setExpression((Expression) visit(ctx.expression()));
        }
        return  returnStatement;
    }

    @Override
    public MethodcallStatment visitMethodCallStatement(ParserFile.MethodCallStatementContext ctx) {
        MethodcallStatment methodcallStatment=new MethodcallStatment();
        methodcallStatment.setID(ctx.ID().getText());
        for (int i = 0; i < ctx.expression().size(); i++) {
            methodcallStatment.getExpression().add((Expression) visit(ctx.expression().get(i)));
        }
        return methodcallStatment;
    }

    @Override
    public AssignmentStatement visitAssignmentStatement(ParserFile.AssignmentStatementContext ctx) {
        AssignmentStatement assignmentStatement=new AssignmentStatement();
        for (int i = 0; i < ctx.expression().size(); i++) {
            assignmentStatement.getExpression().add((Expression) visit(ctx.expression(i)));
        }
        if(!ctx.ID().isEmpty()){
            for (int i = 0; i <ctx.ID().size() ; i++) {
                assignmentStatement.getId().add(String.valueOf(ctx.ID().get(i)));
            }
        }
        return  assignmentStatement;
    }

    @Override
    public ExpressionStatement visitExpressionStatement(ParserFile.ExpressionStatementContext ctx) {
        ExpressionStatement expressionStatement =new ExpressionStatement();
        expressionStatement.setExpression((Expression) visit(ctx.expression()));

        return  expressionStatement;
    }

    @Override
    public Statement visitStatement(ParserFile.StatementContext ctx) {
        Statement statement =new Statement();
        if(ctx.block()!=null){
            statement.setBlock(visitBlock(ctx.block()));
        }if(ctx.assignmentStatement()!=null){
            statement.setAssignmentStatement(visitAssignmentStatement(ctx.assignmentStatement()));
        }if(ctx.methodCallStatement()!=null){
            statement.setMethodcallStatment(visitMethodCallStatement(ctx.methodCallStatement()));
        }if(ctx.returnStatement()!=null){
            statement.setReturnStatement(visitReturnStatement(ctx.returnStatement()));
        }if(ctx.ifStatement()!=null){
            statement.setIfstatement(visitIfStatement(ctx.ifStatement()));
        }if(ctx.constDeclaration()!=null){
            statement.setConstDeclaration(visitConstDeclaration(ctx.constDeclaration()));
        }if(ctx.expressionStatement()!=null){
            statement.setExpressionStatement(visitExpressionStatement(ctx.expressionStatement()));
        }if(ctx.variableDeclaration()!=null){
            statement.setVariableDeclaration(visitVariableDeclaration(ctx.variableDeclaration()));
        }if(ctx.functionDeclaration()!=null){
            statement.setFunctionDeclaration(visitFunctionDeclaration(ctx.functionDeclaration()));
        }
        return  statement;
    }

    @Override
    public Block visitBlock(ParserFile.BlockContext ctx) {
        Block block= new Block();
        if(!ctx.statement().isEmpty()){
            for (int i = 0; i < ctx.statement().size(); i++) {
                block.getStatement().add(visitStatement(ctx.statement(i)));
            }
        }
        return block;
    }

    @Override
    public Parameter visitParameter(ParserFile.ParameterContext ctx) {
        Parameter parameter=new Parameter();
        if(ctx.PRIVATE()!=null){
            parameter.setPRIVATE(ctx.PRIVATE().getText());
        }
        for (int i = 0; i < ctx.ID().size(); i++) {
            parameter.getId().add(String.valueOf(ctx.ID().get(i)));
        }
        if(ctx.ANY()!=null){
            parameter.setANY(ctx.ANY().getText());
        }
        return  parameter;
    }

    @Override
    public ParameterList visitParameterList(ParserFile.ParameterListContext ctx) {
        ParameterList parameterList=new ParameterList();
        for (int i = 0; i < ctx.parameter().size(); i++) {
            parameterList.getParameterList().add(visitParameter(ctx.parameter(i)));
        }
        return parameterList;
    }

    @Override
    public FunctionDeclaration visitFunctionDeclaration(ParserFile.FunctionDeclarationContext ctx) {
        FunctionDeclaration functionDeclaration=new FunctionDeclaration();

        for (int i = 0; i < ctx.ID().size(); i++) {
            functionDeclaration.getId().add(String.valueOf(ctx.ID().get(i)));
        }
        if(ctx.parameterList()!=null){
            functionDeclaration.setParameterList(visitParameterList(ctx.parameterList()));
        }
        if(ctx.ANY()!=null){
            functionDeclaration.setANY(ctx.ANY().getText());
        }
        if(ctx.VOID()!=null){
            functionDeclaration.setVOID(ctx.VOID().getText());
        }
        functionDeclaration.setBlock(visitBlock(ctx.block()));

        return functionDeclaration;
    }

    @Override
    public ObjectFieldInArray visitObjectFieldInArray(ParserFile.ObjectFieldInArrayContext ctx) {
        ObjectFieldInArray objectFieldInArray=new ObjectFieldInArray();
        if(ctx.literal()!=null){
            objectFieldInArray.setLiteral(visitLiteral(ctx.literal()));
        }
        objectFieldInArray.setId(ctx.ID().getText());

        return objectFieldInArray;
    }

    @Override
    public ArrayElement visitArrayElement(ParserFile.ArrayElementContext ctx) {
        ArrayElement arrayElement=new ArrayElement();
        arrayElement.setExpression((Expression) visit(ctx.expression()));

        return  arrayElement;
    }

    @Override
    public ArrayLiteral visitArrayLiteral(ParserFile.ArrayLiteralContext ctx) {
        ArrayLiteral arrayLiteral=new ArrayLiteral();

        if(!ctx.arrayElement().isEmpty()){
            for (int i = 0; i < ctx.arrayElement().size(); i++) {
                arrayLiteral.getArrayElement().add(visitArrayElement(ctx.arrayElement(i)));
            }
        }
        return arrayLiteral;
    }

    @Override
    public ClassMember visitClassMember(ParserFile.ClassMemberContext ctx) {
        ClassMember classMember=new ClassMember();

        if(ctx.variableDeclaration()!=null){
            classMember.setVariableDeclaration(visitVariableDeclaration(ctx.variableDeclaration()));
        }if(ctx.functionDeclaration()!=null){
            classMember.setFunctionDeclaration(visitFunctionDeclaration(ctx.functionDeclaration()));
        }
        if(ctx.consrtuctor()!=null){
            classMember.setConstructor(visitConsrtuctor(ctx.consrtuctor()));
        }
        return  classMember;
    }

    @Override
    public ClassDeclaration visitClassDeclaration(ParserFile.ClassDeclarationContext ctx) {
        ClassDeclaration classDeclaration=new ClassDeclaration();

        classDeclaration.setEXPORT(ctx.EXPORT().getText());
        classDeclaration.setCLASS(ctx.CLASS().getText());

        for (int i = 0; i < ctx.ID().size(); i++) {
            classDeclaration.getID().add(String.valueOf(ctx.ID().get(i)));
        }
        if(ctx.IMPLEMENTS()!=null){
            classDeclaration.setImplementsWord(ctx.IMPLEMENTS().getText());
        }
        if(!ctx.classMember().isEmpty()){
            for (int i = 0; i < ctx.classMember().size(); i++) {
                classDeclaration.getClassMember().add(visitClassMember(ctx.classMember(i)));
            }
        }
        return classDeclaration;
    }

    @Override
    public AttributeValue visitAttributeValue(ParserFile.AttributeValueContext ctx) {
        AttributeValue attributeValue=new AttributeValue();
        if(ctx.TEMPLATE_STRING()!=null){
            attributeValue.setTEMPLATE_STRING(ctx.TEMPLATE_STRING().getText());
        }if(ctx.TEMPLATE_ID()!=null){
            attributeValue.setTEMPLATE_ID(ctx.TEMPLATE_ID().getText());
        }if(ctx.interpolation()!=null){
            attributeValue.setInterpolation(visitInterpolation(ctx.interpolation()));
        }
        return attributeValue;
    }

    @Override
    public HtmlAttribute visitHtmlAttribute(ParserFile.HtmlAttributeContext ctx) {
        HtmlAttribute htmlAttribute = new HtmlAttribute();
        if(ctx.TEMPLATE_ID()!=null){
            htmlAttribute.setTEMPLATE_ID(ctx.TEMPLATE_ID().getText());
        }
        if(ctx.ANGULAR_PROPERTY_BINDING()!=null){
            htmlAttribute.setANGULAR_PROPERTY_BINDING(ctx.ANGULAR_PROPERTY_BINDING().getText());
        }
        if(ctx.ANGULAR_EVENT_BINDING()!=null){
            htmlAttribute.setANGULAR_EVENT_BINDING(ctx.ANGULAR_EVENT_BINDING().getText());
        }
        if(ctx.ANGULAR_TWO_WAY_BINDING()!=null){
            htmlAttribute.setANGULAR_TWO_WAY_BINDING(ctx.ANGULAR_TWO_WAY_BINDING().getText());
        }
        if(ctx.ANGULAR_STRUCTURAL_DIRECTIVE()!=null) {
            htmlAttribute.setANGULAR_STRUCTURAL_DIRECTIVE(ctx.ANGULAR_STRUCTURAL_DIRECTIVE().getText());
        }
        if(ctx.attributeValue()!=null){
            htmlAttribute.setAttributeValue(visitAttributeValue(ctx.attributeValue()));
        }
        return htmlAttribute;
    }

    @Override
    public HtmlTag visitHtmlTag(ParserFile.HtmlTagContext ctx) {
        HtmlTag htmlTag = new HtmlTag();

        if (ctx.TEMPLATE_TAG_DIV() != null) {
            htmlTag.setTemplateTagDiv(ctx.TEMPLATE_TAG_DIV().getText());
        }
        if (ctx.TEMPLATE_TAG_SPAN() != null) {
            htmlTag.setTemplateTagSpan(ctx.TEMPLATE_TAG_SPAN().getText());
        }
        if (ctx.TEMPLATE_TAG_SECTION() != null) {
            htmlTag.setTemplateTagSection(ctx.TEMPLATE_TAG_SECTION().getText());
        }
        if (ctx.TEMPLATE_TAG_P() != null) {
            htmlTag.setTemplateTagP(ctx.TEMPLATE_TAG_P().getText());
        }
        if (ctx.TEMPLATE_TAG_H1() != null) {
            htmlTag.setTemplateTagH1(ctx.TEMPLATE_TAG_H1().getText());
        }
        if (ctx.TEMPLATE_TAG_H2() != null) {
            htmlTag.setTemplateTagH2(ctx.TEMPLATE_TAG_H2().getText());
        }
        if (ctx.TEMPLATE_TAG_H3() != null) {
            htmlTag.setTemplateTagH3(ctx.TEMPLATE_TAG_H3().getText());
        }
        if (ctx.TEMPLATE_TAG_IMG() != null) {
            htmlTag.setTemplateTagImg(ctx.TEMPLATE_TAG_IMG().getText());
        }
        if (ctx.TEMPLATE_TAG_UL() != null) {
            htmlTag.setTemplateTagUl(ctx.TEMPLATE_TAG_UL().getText());
        }
        if (ctx.TEMPLATE_TAG_LI() != null) {
            htmlTag.setTemplateTagLi(ctx.TEMPLATE_TAG_LI().getText());
        }
        if (ctx.TEMPLATE_TAG_BUTTON() != null) {
            htmlTag.setTemplateTagButton(ctx.TEMPLATE_TAG_BUTTON().getText());
        }
        if (ctx.TEMPLATE_TAG_INPUT() != null) {
            htmlTag.setTemplateTagInput(ctx.TEMPLATE_TAG_INPUT().getText());
        }
        if (ctx.TEMPLATE_ID() != null) {
            htmlTag.setTemplateTagId(ctx.TEMPLATE_ID().getText());
        }
        if(ctx.TEMPLATE_TAG_FORM() !=null){
            htmlTag.setTEMPLATE_TAG_FORM(ctx.TEMPLATE_TAG_FORM().getText());
        }
        return htmlTag;
    }

    @Override
    public CloseTag visitCloseTag(ParserFile.CloseTagContext ctx) {
        CloseTag closeTag = new CloseTag();
        closeTag.setHtmlTag(visitHtmlTag(ctx.htmlTag()));
        return closeTag;
    }

    @Override
    public SelfClosingTag visitSelfClosingTag(ParserFile.SelfClosingTagContext ctx) {
        SelfClosingTag selfClosingTag=new SelfClosingTag();
        selfClosingTag.setHtmlTag(visitHtmlTag(ctx.htmlTag()));
        if(!ctx.htmlAttribute().isEmpty())
        {
            for (int i = 0; i <ctx.htmlAttribute().size() ; i++) {
                selfClosingTag.getHtmlAttributeList().add(visitHtmlAttribute(ctx.htmlAttribute(i)));
            }
        }
        return selfClosingTag;
    }

    @Override
    public HtmlElement visitHtmlElement(ParserFile.HtmlElementContext ctx) {
        HtmlElement htmlElement = new HtmlElement();

        if(!ctx.htmlAttribute().isEmpty()){
            for (int i = 0; i < ctx.htmlAttribute().size(); i++) {
                htmlElement.getHtmlAttributeList().add(visitHtmlAttribute(ctx.htmlAttribute(i)));
            }
        }
        if(!ctx.htmlChunk().isEmpty()){
            for (int i = 0; i < ctx.htmlChunk().size(); i++) {
                htmlElement.getHtmlChunkList().add((HtmlChunk)visit (ctx.htmlChunk(i)));
            }
        }
        htmlElement.setHtmlTag(visitHtmlTag(ctx.htmlTag()));
        htmlElement.setCloseTag(visitCloseTag(ctx.closeTag()));

        return htmlElement;
    }

    @Override
    public InterpolationFullExpr visitInterpolationFullExpr(ParserFile.InterpolationFullExprContext ctx) {
        InterpolationFullExpr interpolationFullExpr=new InterpolationFullExpr();

        for (int i = 0; i < ctx.INTERPOLATION_ID().size(); i++) {
            interpolationFullExpr.getInterpolationId().add(String.valueOf(ctx.INTERPOLATION_ID().get(i)));
        }
        return  interpolationFullExpr;
    }

    @Override
    public InterpolationExpr visitInterpolationExpr(ParserFile.InterpolationExprContext ctx) {
        InterpolationExpr interpolationExpr = new InterpolationExpr();

        if (ctx.INTERPOLATION_ID() != null) {
            interpolationExpr.setInterpolationId(ctx.INTERPOLATION_ID().getText());
        }

        if (ctx.INTERPOLATION_NUMBER() != null) {
            interpolationExpr.setInterpolationId(ctx.INTERPOLATION_NUMBER().getText());
        }

        if (ctx.INTERPOLATION_STRING() != null) {
            interpolationExpr.setInterpolationId(ctx.INTERPOLATION_STRING().getText());
        }
        if (ctx.INTERPOLATION_NTERROGATIVE() != null) {
            interpolationExpr.setINTERPOLATION_NTERROGATIVE(ctx.INTERPOLATION_NTERROGATIVE().getText());
        }
        if (ctx.INTERPOLATION_COLON() != null) {
            interpolationExpr.setINTERPOLATION_COLON(ctx.INTERPOLATION_COLON().getText());
        }
        if(ctx.interpolationFullExpr()!=null){
            interpolationExpr.setInterpolationFullExpr(visitInterpolationFullExpr(ctx.interpolationFullExpr()));
        }
        return interpolationExpr;
    }

    @Override
    public InterpolationContent visitInterpolationContent(ParserFile.InterpolationContentContext ctx) {
        InterpolationContent interpolationContent = new InterpolationContent();
        for (int i = 0; i < ctx.interpolationExpr().size(); i++) {
            interpolationContent.getInterpolationExprList().add(visitInterpolationExpr(ctx.interpolationExpr(i)));
        }
        return  interpolationContent;
    }

    @Override
    public Interpolation visitInterpolation(ParserFile.InterpolationContext ctx) {
        Interpolation interpolation=new Interpolation();

        if(ctx.interpolationContent()!=null)
        {
            interpolation.setInterpolationContent(visitInterpolationContent(ctx.interpolationContent()));
        }
        return interpolation;
    }

    @Override
    public HtmlElementChunk visitHtmlElementChunk(ParserFile.HtmlElementChunkContext ctx) {
        HtmlElementChunk htmlElementChunk = new HtmlElementChunk();
        htmlElementChunk.setHtmlElement(visitHtmlElement(ctx.htmlElement()));
        return htmlElementChunk;
    }

    @Override
    public HtmlSelfClosingChunk visitHtmlSelfClosingChunk(ParserFile.HtmlSelfClosingChunkContext ctx) {
        HtmlSelfClosingChunk htmlSelfClosingChunk = new HtmlSelfClosingChunk();
        htmlSelfClosingChunk.setSelfClosingTag(visitSelfClosingTag(ctx.selfClosingTag()));
        return htmlSelfClosingChunk;
    }

    @Override
    public InterpolationChunk visitInterpolationChunk(ParserFile.InterpolationChunkContext ctx) {
        InterpolationChunk interpolationChunk=new InterpolationChunk();
        interpolationChunk.setInterpolation(visitInterpolation(ctx.interpolation()));
        return  interpolationChunk;
    }

    @Override
    public HtmlCloseTagChunk visitHtmlCloseTagChunk(ParserFile.HtmlCloseTagChunkContext ctx) {
        HtmlCloseTagChunk htmlCloseTagChunk = new HtmlCloseTagChunk();
        htmlCloseTagChunk.setCloseTag(visitCloseTag(ctx.closeTag()));
        return  htmlCloseTagChunk;
    }

    @Override
    public Html_Id visitHtml_Id(ParserFile.Html_IdContext ctx) {
        Html_Id html_id = new Html_Id();
        html_id.setTEMPLATE_ID(ctx.TEMPLATE_ID().getText());
        return html_id;
    }

    @Override
    public Object visitHtmlTextChunk(ParserFile.HtmlTextChunkContext ctx) {
        return super.visitHtmlTextChunk(ctx);
    }

    @Override
    public Object visitHtmlNewlineChunk(ParserFile.HtmlNewlineChunkContext ctx) {
        return super.visitHtmlNewlineChunk(ctx);
    }

    @Override
    public HtmlContent visitHtmlContent(ParserFile.HtmlContentContext ctx) {
        HtmlContent htmlContent = new HtmlContent();
        for (int i = 0; i < ctx.htmlChunk().size(); i++) {
            htmlContent.getHtmlChunkList().add((HtmlChunk)visit(ctx.htmlChunk(i)));

        }
        return htmlContent;
    }

    @Override
    public CssRule visitCssRule(ParserFile.CssRuleContext ctx) {
        CssRule cssRule = new CssRule();

        for (int i = 0; i < ctx.TEMPLATE_ID().size(); i++) {
            cssRule.getTemplateId().add(ctx.TEMPLATE_ID(i).getText());
        }

        if (!ctx.CSS_VALUE().isEmpty()) {
            for (int i = 0; i < ctx.CSS_VALUE().size(); i++) {
                cssRule.getCssValue().add(ctx.CSS_VALUE(i).getText());
            }
        }

        return cssRule;
    }

    @Override
    public CssStatement visitCssStatement(ParserFile.CssStatementContext ctx) {
        CssStatement cssStatement=new CssStatement();

        if(ctx.CSS_CLASSNAME()!=null){
            cssStatement.setCssClassName(ctx.CSS_CLASSNAME().getText());
        }
        if(ctx.TEMPLATE_TAG_IMG()!=null)
        {
            cssStatement.setTemplateTagImage(ctx.TEMPLATE_TAG_IMG().getText());
        }
        if(!ctx.cssRule().isEmpty())
        {
            for (int i = 0; i < ctx.cssRule().size(); i++) {
                cssStatement.getCssRuleList().add(visitCssRule(ctx.cssRule(i)));
            }
        }
        if(!ctx.TEMPLATE_ID().isEmpty()){
            for (int i = 0; i < ctx.TEMPLATE_ID().size(); i++) {
                cssStatement.getTemplateId().add(String.valueOf(ctx.TEMPLATE_ID().get(i)));
            }
        }
        if(ctx.TEMPLATE_TAG_BUTTON()!=null)
        {
            cssStatement.setTemplateTagButton(ctx.TEMPLATE_TAG_BUTTON().getText());
        }

        return cssStatement;
    }

    @Override
    public CssContent visitCssContent(ParserFile.CssContentContext ctx) {
        CssContent cssContent = new CssContent();
        if(!ctx.cssStatement().isEmpty()){
            for(int i=0;i< ctx.cssStatement().size();i++){
                cssContent.getCssStatementList().add(visitCssStatement(ctx.cssStatement(i)));
            }

        }
        return cssContent;
    }

    @Override
    public CssLiteral visitCssLiteral(ParserFile.CssLiteralContext ctx) {
        CssLiteral cssLiteral=new CssLiteral();
        cssLiteral.setCssContent(visitCssContent(ctx.cssContent()));
        return  cssLiteral;
    }

    @Override
    public TemplateLiteral visitTemplateLiteral(ParserFile.TemplateLiteralContext ctx) {
        TemplateLiteral templateLiteral=new TemplateLiteral();
        if(ctx.htmlContent()!=null)
        {
            templateLiteral.setHtmlContent(visitHtmlContent(ctx.htmlContent()));
        }
        return templateLiteral;
    }

    @Override
    public Literal visitLiteral(ParserFile.LiteralContext ctx) {
        Literal literal = new Literal();
        if (ctx.STRING_LITERAL() != null) {
            literal.setStringLiteral(ctx.STRING_LITERAL().getText());
        }
        if (ctx.NUMBER() != null) {
            literal.setNumber(ctx.NUMBER().getText());
        }
        if (ctx.TRUE() != null) {
            literal.setTrueId(ctx.TRUE().getText());
        }
        if (ctx.FALSE() != null) {
            literal.setFalseId(ctx.FALSE().getText());
        }
        if(ctx.templateLiteral()!=null){
            literal.setTemplateLiteral(visitTemplateLiteral(ctx.templateLiteral()));
        }
        if(ctx.TEMPLATE_ID()!=null){
            literal.setTemplate_id(ctx.TEMPLATE_ID().getText());
        }
        return literal;
    }


    @Override
    public Constructor visitConsrtuctor(ParserFile.ConsrtuctorContext ctx) {
        Constructor constructor=new Constructor();

         if(ctx.ID()!=null){
             constructor.setId(ctx.ID().getText());}

        if(ctx.parameterList()!=null){
            constructor.setParameterList(visitParameterList(ctx.parameterList()));
        }
        if(ctx.ANY()!=null){
            constructor.setANY(ctx.ANY().getText());
        }
        if(ctx.VOID()!=null){
            constructor.setVOID(ctx.VOID().getText());
        }
        constructor.setBlock(visitBlock(ctx.block()));
        constructor.setConstructor(ctx.CONSTRUCTOR().getText());

        return constructor;

    }
}
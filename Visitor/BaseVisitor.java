package Visitor;
import AST.*;
import gen.ParserFile;
import gen.ParserFileBaseVisitor;



public class BaseVisitor extends ParserFileBaseVisitor {
    String name;
    @Override
    public AngularFile visitAngularFile(ParserFile.AngularFileContext ctx) {
        AngularFile angularFile=new AngularFile();
        if(!ctx.importStatement().isEmpty())
        {
            for (int i = 0; i < ctx.importStatement().size(); i++) {
                angularFile.getImportstatement().add(visitImportStatement(ctx.importStatement(i)));
            }
        }
        for (int i = 0; i < ctx.classDeclaration().size(); i++) {
            angularFile.getClassDeclaration().add(visitClassDeclaration(ctx.classDeclaration(i)));
        }
        angularFile.setDecorator(visitDecorator(ctx.decorator()));

        return angularFile;
    }

    @Override
    public ArrayElement visitArrayElement(ParserFile.ArrayElementContext ctx) {
        ArrayElement arrayElement=new ArrayElement();
        for (int i = 0; i < ctx.objectFieldInArray().size(); i++) {
            arrayElement.getObjectFieldInArrayList().add(visitObjectFieldInArray(ctx.objectFieldInArray(i)));
        }
        return arrayElement;
    }

    @Override
    public ArrayExpr visitArrayExpr(ParserFile.ArrayExprContext ctx) {
        ArrayExpr arrayExpr=new ArrayExpr();
        arrayExpr.setArrayLiteral(visitArrayLiteral(ctx.arrayLiteral()));
        return  arrayExpr;
    }

    @Override
    public ArrayLiteral visitArrayLiteral(ParserFile.ArrayLiteralContext ctx) {
        ArrayLiteral arrayLiteral=new ArrayLiteral();

        for (int i = 0; i < ctx.arrayElement().size(); i++) {
            arrayLiteral.getArrayElement().add(visitArrayElement(ctx.arrayElement(i)));
        }
        return  arrayLiteral;
    }

    @Override
    public AttributeValue visitAttributeValue(ParserFile.AttributeValueContext ctx) {

        AttributeValue attributeValue=new AttributeValue();
        if(ctx.interpolation()!=null)
        {
            attributeValue.setInterpolation(visitInterpolation(ctx.interpolation()));
        }if(ctx.TEMPLATE_ID()!=null)
        {
            attributeValue.setTEMPLATE_ID(ctx.TEMPLATE_ID().getText());

        }if(ctx.TEMPLATE_STRING()!=null){
            attributeValue.setTEMPLATE_STRING(ctx.TEMPLATE_STRING().getText());
        }
        return attributeValue;
    }

    @Override
    public BlockExpr1 visitBlockExpr1(ParserFile.BlockExpr1Context ctx) {
        BlockExpr1 blockExpr1=new BlockExpr1();
        for (int i = 0; i < ctx.ID().size(); i++) {
           blockExpr1.getIdList().add(String.valueOf(ctx.ID().get(i)));
        }
        if(ctx.NUMBER()!=null) {
            blockExpr1.setNumber(ctx.NUMBER().getText());
        }
        return  blockExpr1;
    }

    @Override
    public BlockExpr3 visitBlockExpr3(ParserFile.BlockExpr3Context ctx) {
        BlockExpr3 blockExpr3=new BlockExpr3();
        for (int i = 0; i <ctx.ID().size() ; i++) {
           blockExpr3.getIdList().add(String.valueOf(ctx.ID().get(i)));
        }
        return  blockExpr3;
    }

    @Override
    public BlockExpr2 visitBlockExpr2(ParserFile.BlockExpr2Context ctx) {
        BlockExpr2 blockExpr2=new BlockExpr2();
        for (int i = 0; i < ctx.ID().size(); i++) {
            blockExpr2.getIdList().add(String.valueOf(ctx.ID().get(i)));
        }
        blockExpr2.setStringLiteral(ctx.STRING_LITERAL().getText());
        return  blockExpr2;
    }

    @Override
    public ClassDeclaration visitClassDeclaration(ParserFile.ClassDeclarationContext ctx) {
        ClassDeclaration classDeclaration=new ClassDeclaration();

        if(!ctx.classMember().isEmpty()){
            for (int i = 0; i < ctx.classMember().size(); i++) {
                classDeclaration.getClassMember().add(visitClassMember(ctx.classMember(i)));
            }
        }
        classDeclaration.setID(ctx.ID().getText());
        classDeclaration.setEXPORT(ctx.EXPORT().getText());
        classDeclaration.setCLASS(ctx.CLASS().getText());
        return classDeclaration;
    }

    @Override
    public ClassMember visitClassMember(ParserFile.ClassMemberContext ctx) {
        ClassMember classMember=new ClassMember();
        if(ctx.variableDeclaration()!=null)
        {
            classMember.setVariableDeclaration(visitVariableDeclaration(ctx.variableDeclaration()));
        }
        if(ctx.functionDeclaration()!=null)
        {
            classMember.setFunctionDeclaration(visitFunctionDeclaration(ctx.functionDeclaration()));
        }
        return  classMember;
    }

    @Override
    public Parameter visitParameter(ParserFile.ParameterContext ctx) {
        Parameter parameter=new Parameter();
        for (int i = 0; i < ctx.ID().size(); i++) {
            parameter.getId().add(String.valueOf(ctx.ID().get(i)));
        }
        return  parameter;
    }

    @Override
    public ParameterList visitParameterList(ParserFile.ParameterListContext ctx) {
        ParameterList parameterList= new ParameterList();
        for (int i = 0; i <ctx.parameter().size() ; i++) {
            parameterList.getParameterList().add(visitParameter(ctx.parameter(i)));
        }
        return parameterList;
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
    public StyleArray visitStyleArray(ParserFile.StyleArrayContext ctx) {
        StyleArray styleArray=new StyleArray();
        for (int i = 0; i < ctx.cssLiteral().size(); i++) {
            styleArray.getCssLiteral().add(visitCssLiteral(ctx.cssLiteral(i)));
        }
        return styleArray;
    }

    @Override
    public StylesField visitStylesField(ParserFile.StylesFieldContext ctx) {
        StylesField stylesField=new StylesField();
        stylesField.setSTYLES(ctx.STYLES().getText());
        stylesField.setStyleArray(visitStyleArray(ctx.styleArray()));
        return stylesField;
    }

    @Override
    public TemplateExpr visitTemplateExpr(ParserFile.TemplateExprContext ctx) {
        TemplateExpr templateExpr=new TemplateExpr();
        templateExpr.setTemplateLiteral(visitTemplateLiteral(ctx.templateLiteral()));
        return  templateExpr;
    }

    @Override
    public TemplateField visitTemplateField(ParserFile.TemplateFieldContext ctx) {
        TemplateField templateField=new TemplateField();
        templateField.setTEMPLATEE(ctx.TEMPLATEE().getText());
        templateField.setTemplateLiteral(visitTemplateLiteral(ctx.templateLiteral()));
        return  templateField;
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
    public VariableDeclaration visitVariableDeclaration(ParserFile.VariableDeclarationContext ctx) {
        VariableDeclaration variableDeclaration=new VariableDeclaration();
        variableDeclaration.setID(ctx.ID().getText());

        variableDeclaration.setExpression((Expression) visit(ctx.expression()));
        return  variableDeclaration;
    }

    @Override
    public CssExpr visitCssExpr(ParserFile.CssExprContext ctx) {
        CssExpr cssExpr=new CssExpr();
        cssExpr.setCssLiteral(visitCssLiteral(ctx.cssLiteral()));
        return  cssExpr;
    }

    @Override
    public CssLiteral visitCssLiteral(ParserFile.CssLiteralContext ctx) {
        CssLiteral cssLiteral=new CssLiteral();
        cssLiteral.setCssContent(visitCssContent(ctx.cssContent()));
        return  cssLiteral;
    }

    @Override
    public CssRule visitCssRule(ParserFile.CssRuleContext ctx) {
        CssRule cssRule=new CssRule();
        for (int i = 0; i < ctx.TEMPLATE_ID().size(); i++) {
            cssRule.getTemplateId().add(String.valueOf(ctx.TEMPLATE_ID().get(i)));
        }
        if(!ctx.CSS_VALUE().isEmpty())
        {
            for (int i = 0; i < ctx.CSS_VALUE().size(); i++) {
                cssRule.getCssValue().add(String.valueOf(ctx.CSS_VALUE().get(i)));
            }
        }
        return cssRule;

    }

    @Override
    public CssStatement visitCssStatement(ParserFile.CssStatementContext ctx) {
        CssStatement cssStatement=new CssStatement();
        cssStatement.setCssClassName(ctx.CSS_CLASSNAME().getText());
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
        return cssStatement;
    }

    @Override
    public Decorator visitDecorator(ParserFile.DecoratorContext ctx) {
       Decorator decorator=new Decorator();
       decorator.setID(ctx.ID().getText());
       decorator.setObjectLiteral(visitObjectLiteral(ctx.objectLiteral()));
       return decorator;
    }

    @Override
    public FunctionDeclaration visitFunctionDeclaration(ParserFile.FunctionDeclarationContext ctx) {
        FunctionDeclaration functionDeclaration=new FunctionDeclaration();
        functionDeclaration.setId(ctx.ID().getText());
        if(ctx.parameterList()!=null)
        {
            functionDeclaration.setParameterList(visitParameterList(ctx.parameterList()));
        }
        for (int i = 0; i <ctx.block().size() ; i++) {
            functionDeclaration.getBlock().add((Block) visit(ctx.block(i)));
        }
        return  functionDeclaration;
    }

    @Override
    public GenericField visitGenericField(ParserFile.GenericFieldContext ctx) {
        GenericField genericField=new GenericField();
        genericField.setID(ctx.ID().getText());
        genericField.setExpression((Expression) visit(ctx.expression()));
        return  genericField;
    }

    @Override
    public CloseTag visitCloseTag(ParserFile.CloseTagContext ctx) {
        CloseTag closeTag = new CloseTag();
        closeTag.setHtmlTag(visitHtmlTag(ctx.htmlTag()));
        return closeTag;
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
    public ImportStatement visitImportStatement(ParserFile.ImportStatementContext ctx) {
        ImportStatement importStatement = new ImportStatement();
        importStatement.setIMPORT(ctx.IMPORT().getText());
        importStatement.setID(ctx.ID().getText());
        importStatement.setFROM(ctx.FROM().getText());
        importStatement.setSTRING_LITERAL(ctx.STRING_LITERAL().getText());
        return importStatement;
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
    public InterpolationChunk visitInterpolationChunk(ParserFile.InterpolationChunkContext ctx) {
        InterpolationChunk interpolationChunk=new InterpolationChunk();
        interpolationChunk.setInterpolation(visitInterpolation(ctx.interpolation()));
        return  interpolationChunk;
    }

    @Override
    public ObjectFieldInArray visitObjectFieldInArray(ParserFile.ObjectFieldInArrayContext ctx) {
        ObjectFieldInArray objectFieldInArray = new ObjectFieldInArray();
        objectFieldInArray.setId(ctx.ID().getText());
        if(ctx.literal()!=null){
            objectFieldInArray.setLiteral(visitLiteral(ctx.literal()));

        }
        return  objectFieldInArray;
    }

    @Override
    public ObjectLiteral visitObjectLiteral(ParserFile.ObjectLiteralContext ctx) {
        ObjectLiteral objectLiteral=new ObjectLiteral();

        for (int i = 0; i < ctx.objectField().size(); i++) {
            objectLiteral.getObjectField().add((ObjectField) visit(ctx.objectField(i)));
        }
        return  objectLiteral;
    }

    @Override
    public Html_Id visitHtml_Id(ParserFile.Html_IdContext ctx) {
        Html_Id html_id = new Html_Id();
        html_id.setTEMPLATE_ID(ctx.TEMPLATE_ID().getText());
        return html_id;
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
        htmlAttribute.setAttributeValue(visitAttributeValue(ctx.attributeValue()));
        return htmlAttribute;
    }

    @Override
    public HtmlCloseTagChunk visitHtmlCloseTagChunk(ParserFile.HtmlCloseTagChunkContext ctx) {
        HtmlCloseTagChunk htmlCloseTagChunk = new HtmlCloseTagChunk();
        htmlCloseTagChunk.setCloseTag(visitCloseTag(ctx.closeTag()));
        return  htmlCloseTagChunk;
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
        return htmlTag;
    }

    @Override
    public IdentifierExpr visitIdentifierExpr(ParserFile.IdentifierExprContext ctx) {
        IdentifierExpr identifierExpr = new IdentifierExpr();
        if(!ctx.literal().isEmpty()){
            for (int i = 0; i < ctx.literal().size(); i++) {
                identifierExpr.getLiteral().add(visitLiteral(ctx.literal(i)));
            }
        }
        for (int i = 0; i < ctx.ID().size(); i++) {
            identifierExpr.getId().add(String.valueOf(ctx.ID().get(i)));
        }
        return identifierExpr;
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
    public InterpolationContent visitInterpolationContent(ParserFile.InterpolationContentContext ctx) {
        InterpolationContent interpolationContent = new InterpolationContent();
        for (int i = 0; i < ctx.interpolationExpr().size(); i++) {
            interpolationContent.getInterpolationExprList().add(visitInterpolationExpr(ctx.interpolationExpr(i)));
        }
        return  interpolationContent;
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
        return interpolationExpr;
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
        return literal;
    }

    @Override
    public LiteralExpr  visitLiteralExpr (ParserFile.LiteralExprContext ctx) {
        LiteralExpr  literalExpr  = new LiteralExpr();
        literalExpr.setLiteral(visitLiteral(ctx.literal()));
        return  literalExpr ;
    }
}

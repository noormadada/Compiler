// Generated from C:/Users/Noor/IdeaProjects/compiler/Grammer/ParserFile.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParserFile}.
 */
public interface ParserFileListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParserFile#angularFile}.
	 * @param ctx the parse tree
	 */
	void enterAngularFile(ParserFile.AngularFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#angularFile}.
	 * @param ctx the parse tree
	 */
	void exitAngularFile(ParserFile.AngularFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(ParserFile.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(ParserFile.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecorator(ParserFile.DecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecorator(ParserFile.DecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(ParserFile.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(ParserFile.ObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateField}
	 * labeled alternative in {@link ParserFile#objectField}.
	 * @param ctx the parse tree
	 */
	void enterTemplateField(ParserFile.TemplateFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateField}
	 * labeled alternative in {@link ParserFile#objectField}.
	 * @param ctx the parse tree
	 */
	void exitTemplateField(ParserFile.TemplateFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StylesField}
	 * labeled alternative in {@link ParserFile#objectField}.
	 * @param ctx the parse tree
	 */
	void enterStylesField(ParserFile.StylesFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StylesField}
	 * labeled alternative in {@link ParserFile#objectField}.
	 * @param ctx the parse tree
	 */
	void exitStylesField(ParserFile.StylesFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GenericField}
	 * labeled alternative in {@link ParserFile#objectField}.
	 * @param ctx the parse tree
	 */
	void enterGenericField(ParserFile.GenericFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GenericField}
	 * labeled alternative in {@link ParserFile#objectField}.
	 * @param ctx the parse tree
	 */
	void exitGenericField(ParserFile.GenericFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#styleArray}.
	 * @param ctx the parse tree
	 */
	void enterStyleArray(ParserFile.StyleArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#styleArray}.
	 * @param ctx the parse tree
	 */
	void exitStyleArray(ParserFile.StyleArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierExpr}
	 * labeled alternative in {@link ParserFile#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpr(ParserFile.IdentifierExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierExpr}
	 * labeled alternative in {@link ParserFile#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpr(ParserFile.IdentifierExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpr}
	 * labeled alternative in {@link ParserFile#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpr(ParserFile.LiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpr}
	 * labeled alternative in {@link ParserFile#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpr(ParserFile.LiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateExpr}
	 * labeled alternative in {@link ParserFile#expression}.
	 * @param ctx the parse tree
	 */
	void enterTemplateExpr(ParserFile.TemplateExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateExpr}
	 * labeled alternative in {@link ParserFile#expression}.
	 * @param ctx the parse tree
	 */
	void exitTemplateExpr(ParserFile.TemplateExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssExpr}
	 * labeled alternative in {@link ParserFile#expression}.
	 * @param ctx the parse tree
	 */
	void enterCssExpr(ParserFile.CssExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssExpr}
	 * labeled alternative in {@link ParserFile#expression}.
	 * @param ctx the parse tree
	 */
	void exitCssExpr(ParserFile.CssExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayExpr}
	 * labeled alternative in {@link ParserFile#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpr(ParserFile.ArrayExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayExpr}
	 * labeled alternative in {@link ParserFile#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpr(ParserFile.ArrayExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ParserFile.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ParserFile.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#templateLiteral}.
	 * @param ctx the parse tree
	 */
	void enterTemplateLiteral(ParserFile.TemplateLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#templateLiteral}.
	 * @param ctx the parse tree
	 */
	void exitTemplateLiteral(ParserFile.TemplateLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#cssLiteral}.
	 * @param ctx the parse tree
	 */
	void enterCssLiteral(ParserFile.CssLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#cssLiteral}.
	 * @param ctx the parse tree
	 */
	void exitCssLiteral(ParserFile.CssLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#cssContent}.
	 * @param ctx the parse tree
	 */
	void enterCssContent(ParserFile.CssContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#cssContent}.
	 * @param ctx the parse tree
	 */
	void exitCssContent(ParserFile.CssContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#cssStatement}.
	 * @param ctx the parse tree
	 */
	void enterCssStatement(ParserFile.CssStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#cssStatement}.
	 * @param ctx the parse tree
	 */
	void exitCssStatement(ParserFile.CssStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#cssRule}.
	 * @param ctx the parse tree
	 */
	void enterCssRule(ParserFile.CssRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#cssRule}.
	 * @param ctx the parse tree
	 */
	void exitCssRule(ParserFile.CssRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(ParserFile.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(ParserFile.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlElementChunk}
	 * labeled alternative in {@link ParserFile#htmlChunk}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElementChunk(ParserFile.HtmlElementChunkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlElementChunk}
	 * labeled alternative in {@link ParserFile#htmlChunk}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElementChunk(ParserFile.HtmlElementChunkContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlSelfClosingChunk}
	 * labeled alternative in {@link ParserFile#htmlChunk}.
	 * @param ctx the parse tree
	 */
	void enterHtmlSelfClosingChunk(ParserFile.HtmlSelfClosingChunkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlSelfClosingChunk}
	 * labeled alternative in {@link ParserFile#htmlChunk}.
	 * @param ctx the parse tree
	 */
	void exitHtmlSelfClosingChunk(ParserFile.HtmlSelfClosingChunkContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InterpolationChunk}
	 * labeled alternative in {@link ParserFile#htmlChunk}.
	 * @param ctx the parse tree
	 */
	void enterInterpolationChunk(ParserFile.InterpolationChunkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InterpolationChunk}
	 * labeled alternative in {@link ParserFile#htmlChunk}.
	 * @param ctx the parse tree
	 */
	void exitInterpolationChunk(ParserFile.InterpolationChunkContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlCloseTagChunk}
	 * labeled alternative in {@link ParserFile#htmlChunk}.
	 * @param ctx the parse tree
	 */
	void enterHtmlCloseTagChunk(ParserFile.HtmlCloseTagChunkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlCloseTagChunk}
	 * labeled alternative in {@link ParserFile#htmlChunk}.
	 * @param ctx the parse tree
	 */
	void exitHtmlCloseTagChunk(ParserFile.HtmlCloseTagChunkContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Html_Id}
	 * labeled alternative in {@link ParserFile#htmlChunk}.
	 * @param ctx the parse tree
	 */
	void enterHtml_Id(ParserFile.Html_IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Html_Id}
	 * labeled alternative in {@link ParserFile#htmlChunk}.
	 * @param ctx the parse tree
	 */
	void exitHtml_Id(ParserFile.Html_IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlTextChunk}
	 * labeled alternative in {@link ParserFile#htmlChunk}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTextChunk(ParserFile.HtmlTextChunkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlTextChunk}
	 * labeled alternative in {@link ParserFile#htmlChunk}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTextChunk(ParserFile.HtmlTextChunkContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlNewlineChunk}
	 * labeled alternative in {@link ParserFile#htmlChunk}.
	 * @param ctx the parse tree
	 */
	void enterHtmlNewlineChunk(ParserFile.HtmlNewlineChunkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlNewlineChunk}
	 * labeled alternative in {@link ParserFile#htmlChunk}.
	 * @param ctx the parse tree
	 */
	void exitHtmlNewlineChunk(ParserFile.HtmlNewlineChunkContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#interpolation}.
	 * @param ctx the parse tree
	 */
	void enterInterpolation(ParserFile.InterpolationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#interpolation}.
	 * @param ctx the parse tree
	 */
	void exitInterpolation(ParserFile.InterpolationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#interpolationContent}.
	 * @param ctx the parse tree
	 */
	void enterInterpolationContent(ParserFile.InterpolationContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#interpolationContent}.
	 * @param ctx the parse tree
	 */
	void exitInterpolationContent(ParserFile.InterpolationContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#interpolationExpr}.
	 * @param ctx the parse tree
	 */
	void enterInterpolationExpr(ParserFile.InterpolationExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#interpolationExpr}.
	 * @param ctx the parse tree
	 */
	void exitInterpolationExpr(ParserFile.InterpolationExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(ParserFile.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(ParserFile.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingTag(ParserFile.SelfClosingTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingTag(ParserFile.SelfClosingTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#closeTag}.
	 * @param ctx the parse tree
	 */
	void enterCloseTag(ParserFile.CloseTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#closeTag}.
	 * @param ctx the parse tree
	 */
	void exitCloseTag(ParserFile.CloseTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#htmlTag}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTag(ParserFile.HtmlTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#htmlTag}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTag(ParserFile.HtmlTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute(ParserFile.HtmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute(ParserFile.HtmlAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#attributeValue}.
	 * @param ctx the parse tree
	 */
	void enterAttributeValue(ParserFile.AttributeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#attributeValue}.
	 * @param ctx the parse tree
	 */
	void exitAttributeValue(ParserFile.AttributeValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(ParserFile.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(ParserFile.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#classMember}.
	 * @param ctx the parse tree
	 */
	void enterClassMember(ParserFile.ClassMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#classMember}.
	 * @param ctx the parse tree
	 */
	void exitClassMember(ParserFile.ClassMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(ParserFile.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(ParserFile.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(ParserFile.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(ParserFile.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#arrayElement}.
	 * @param ctx the parse tree
	 */
	void enterArrayElement(ParserFile.ArrayElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#arrayElement}.
	 * @param ctx the parse tree
	 */
	void exitArrayElement(ParserFile.ArrayElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#objectFieldInArray}.
	 * @param ctx the parse tree
	 */
	void enterObjectFieldInArray(ParserFile.ObjectFieldInArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#objectFieldInArray}.
	 * @param ctx the parse tree
	 */
	void exitObjectFieldInArray(ParserFile.ObjectFieldInArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(ParserFile.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(ParserFile.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(ParserFile.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(ParserFile.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(ParserFile.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(ParserFile.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockExpr1}
	 * labeled alternative in {@link ParserFile#block}.
	 * @param ctx the parse tree
	 */
	void enterBlockExpr1(ParserFile.BlockExpr1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockExpr1}
	 * labeled alternative in {@link ParserFile#block}.
	 * @param ctx the parse tree
	 */
	void exitBlockExpr1(ParserFile.BlockExpr1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockExpr2}
	 * labeled alternative in {@link ParserFile#block}.
	 * @param ctx the parse tree
	 */
	void enterBlockExpr2(ParserFile.BlockExpr2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockExpr2}
	 * labeled alternative in {@link ParserFile#block}.
	 * @param ctx the parse tree
	 */
	void exitBlockExpr2(ParserFile.BlockExpr2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockExpr3}
	 * labeled alternative in {@link ParserFile#block}.
	 * @param ctx the parse tree
	 */
	void enterBlockExpr3(ParserFile.BlockExpr3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockExpr3}
	 * labeled alternative in {@link ParserFile#block}.
	 * @param ctx the parse tree
	 */
	void exitBlockExpr3(ParserFile.BlockExpr3Context ctx);
}
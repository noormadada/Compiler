// Generated from C:/Users/Noor/IdeaProjects/compiler8/Grammer/ParserFile.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParserFile}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserFileVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ParserFile#angularFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAngularFile(ParserFile.AngularFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(ParserFile.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#idList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdList(ParserFile.IdListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#decorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorator(ParserFile.DecoratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteral(ParserFile.ObjectLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateField}
	 * labeled alternative in {@link ParserFile#objectField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateField(ParserFile.TemplateFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StylesField}
	 * labeled alternative in {@link ParserFile#objectField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylesField(ParserFile.StylesFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GenericField}
	 * labeled alternative in {@link ParserFile#objectField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericField(ParserFile.GenericFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#styleArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleArray(ParserFile.StyleArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#spreadField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpreadField(ParserFile.SpreadFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SpreadObjectExpr}
	 * labeled alternative in {@link ParserFile#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpreadObjectExpr(ParserFile.SpreadObjectExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayAccessExpr}
	 * labeled alternative in {@link ParserFile#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccessExpr(ParserFile.ArrayAccessExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryExpr}
	 * labeled alternative in {@link ParserFile#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpr(ParserFile.BinaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThisCallExpr}
	 * labeled alternative in {@link ParserFile#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisCallExpr(ParserFile.ThisCallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierExpr3}
	 * labeled alternative in {@link ParserFile#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpr3(ParserFile.IdentifierExpr3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierExpr2}
	 * labeled alternative in {@link ParserFile#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpr2(ParserFile.IdentifierExpr2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code CssExpr}
	 * labeled alternative in {@link ParserFile#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssExpr(ParserFile.CssExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link ParserFile#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(ParserFile.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertyAccess}
	 * labeled alternative in {@link ParserFile#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyAccess(ParserFile.PropertyAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayExpr}
	 * labeled alternative in {@link ParserFile#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpr(ParserFile.ArrayExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectExpr}
	 * labeled alternative in {@link ParserFile#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectExpr(ParserFile.ObjectExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierExpr}
	 * labeled alternative in {@link ParserFile#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpr(ParserFile.IdentifierExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateExpr}
	 * labeled alternative in {@link ParserFile#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateExpr(ParserFile.TemplateExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThisPropertyExpr}
	 * labeled alternative in {@link ParserFile#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisPropertyExpr(ParserFile.ThisPropertyExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralExpr}
	 * labeled alternative in {@link ParserFile#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpr(ParserFile.LiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesizedExpr}
	 * labeled alternative in {@link ParserFile#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpr(ParserFile.ParenthesizedExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallExpr}
	 * labeled alternative in {@link ParserFile#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExpr(ParserFile.CallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThisExpr}
	 * labeled alternative in {@link ParserFile#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisExpr(ParserFile.ThisExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(ParserFile.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#templateLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateLiteral(ParserFile.TemplateLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#cssLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssLiteral(ParserFile.CssLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#cssContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssContent(ParserFile.CssContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#cssStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssStatement(ParserFile.CssStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#cssRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssRule(ParserFile.CssRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(ParserFile.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlElementChunk}
	 * labeled alternative in {@link ParserFile#htmlChunk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElementChunk(ParserFile.HtmlElementChunkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlSelfClosingChunk}
	 * labeled alternative in {@link ParserFile#htmlChunk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlSelfClosingChunk(ParserFile.HtmlSelfClosingChunkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InterpolationChunk}
	 * labeled alternative in {@link ParserFile#htmlChunk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolationChunk(ParserFile.InterpolationChunkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlCloseTagChunk}
	 * labeled alternative in {@link ParserFile#htmlChunk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlCloseTagChunk(ParserFile.HtmlCloseTagChunkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Html_Id}
	 * labeled alternative in {@link ParserFile#htmlChunk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtml_Id(ParserFile.Html_IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlTextChunk}
	 * labeled alternative in {@link ParserFile#htmlChunk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTextChunk(ParserFile.HtmlTextChunkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlNewlineChunk}
	 * labeled alternative in {@link ParserFile#htmlChunk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlNewlineChunk(ParserFile.HtmlNewlineChunkContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#interpolation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolation(ParserFile.InterpolationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#interpolationContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolationContent(ParserFile.InterpolationContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#interpolationExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolationExpr(ParserFile.InterpolationExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#interpolationFullExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolationFullExpr(ParserFile.InterpolationFullExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(ParserFile.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#selfClosingTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingTag(ParserFile.SelfClosingTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#closeTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseTag(ParserFile.CloseTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#htmlTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTag(ParserFile.HtmlTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttribute(ParserFile.HtmlAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#attributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeValue(ParserFile.AttributeValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(ParserFile.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMember(ParserFile.ClassMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(ParserFile.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ParserFile.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(ParserFile.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#arrayElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElement(ParserFile.ArrayElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#objectFieldInArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectFieldInArray(ParserFile.ObjectFieldInArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(ParserFile.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(ParserFile.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(ParserFile.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ParserFile.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ParserFile.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(ParserFile.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(ParserFile.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#methodCallStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallStatement(ParserFile.MethodCallStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(ParserFile.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(ParserFile.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#constDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclaration(ParserFile.ConstDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#constExportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstExportStatement(ParserFile.ConstExportStatementContext ctx);
}
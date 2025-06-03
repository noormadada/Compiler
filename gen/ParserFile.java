// Generated from C:/Users/Noor/IdeaProjects/compiler/Grammer/ParserFile.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ParserFile extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AT=1, IMPORT=2, FROM=3, CLASS=4, EXPORT=5, TRUE=6, TEMPLATEE=7, STYLES=8, 
		FALSE=9, COLON=10, SEMI=11, COMMA=12, DOT=13, ASSIGN=14, LPAREN=15, RPAREN=16, 
		LBRACE=17, RBRACE=18, LSQUARE=19, RSQUARE=20, LT=21, GT=22, SLASH=23, 
		PLUS=24, STRING_LITERAL=25, NUMBER=26, ID=27, WS=28, TEMPLATE_START=29, 
		CSS_COLON=30, CSS_COMMA=31, HASH=32, CSS_CLASSNAME=33, CssLBRACE=34, CssRBRACE=35, 
		CSS_VALUE=36, CSS_WS=37, INTERPOLATION_OPEN=38, TEMPLATE_END=39, TEMPLATE_LT=40, 
		TEMPLATE_GT=41, TEMPLATE_SLASH=42, TEMPLATE_EQUALS=43, TEMPLATE_QUOTE=44, 
		TEMPLATE_STRING=45, TEMPLATE_TAG_DIV=46, TEMPLATE_TAG_SPAN=47, TEMPLATE_TAG_SECTION=48, 
		TEMPLATE_TAG_P=49, TEMPLATE_TAG_H1=50, TEMPLATE_TAG_H2=51, TEMPLATE_TAG_IMG=52, 
		TEMPLATE_TAG_H3=53, TEMPLATE_TAG_UL=54, TEMPLATE_TAG_LI=55, TEMPLATE_TAG_BUTTON=56, 
		TEMPLATE_TAG_INPUT=57, TEMPLATE_ID=58, ANGULAR_PROPERTY_BINDING=59, ANGULAR_EVENT_BINDING=60, 
		ANGULAR_TWO_WAY_BINDING=61, ANGULAR_STRUCTURAL_DIRECTIVE=62, TEMPLATE_TEXT=63, 
		TEMPLATE_NEWLINE=64, TEMPLATE_WS=65, INTERPOLATION_PLUS=66, INTERPOLATION_CLOSE=67, 
		INTERPOLATION_DOT=68, INTERPOLATION_LSQUARE=69, INTERPOLATION_RSQUARE=70, 
		INTERPOLATION_LPAREN=71, INTERPOLATION_RPAREN=72, INTERPOLATION_STRING=73, 
		INTERPOLATION_NUMBER=74, INTERPOLATION_ID=75, INTERPOLATION_WS=76;
	public static final int
		RULE_angularFile = 0, RULE_importStatement = 1, RULE_decorator = 2, RULE_objectLiteral = 3, 
		RULE_objectField = 4, RULE_styleArray = 5, RULE_expression = 6, RULE_literal = 7, 
		RULE_templateLiteral = 8, RULE_cssLiteral = 9, RULE_cssContent = 10, RULE_cssStatement = 11, 
		RULE_cssRule = 12, RULE_htmlContent = 13, RULE_htmlChunk = 14, RULE_interpolation = 15, 
		RULE_interpolationContent = 16, RULE_interpolationExpr = 17, RULE_htmlElement = 18, 
		RULE_selfClosingTag = 19, RULE_closeTag = 20, RULE_htmlTag = 21, RULE_htmlAttribute = 22, 
		RULE_attributeValue = 23, RULE_classDeclaration = 24, RULE_classMember = 25, 
		RULE_variableDeclaration = 26, RULE_arrayLiteral = 27, RULE_arrayElement = 28, 
		RULE_objectFieldInArray = 29, RULE_functionDeclaration = 30, RULE_parameterList = 31, 
		RULE_parameter = 32, RULE_block = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"angularFile", "importStatement", "decorator", "objectLiteral", "objectField", 
			"styleArray", "expression", "literal", "templateLiteral", "cssLiteral", 
			"cssContent", "cssStatement", "cssRule", "htmlContent", "htmlChunk", 
			"interpolation", "interpolationContent", "interpolationExpr", "htmlElement", 
			"selfClosingTag", "closeTag", "htmlTag", "htmlAttribute", "attributeValue", 
			"classDeclaration", "classMember", "variableDeclaration", "arrayLiteral", 
			"arrayElement", "objectFieldInArray", "functionDeclaration", "parameterList", 
			"parameter", "block"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'@'", "'import'", "'from'", "'class'", "'export'", "'true'", "'template'", 
			"'styles'", "'false'", null, null, "','", null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "'{{'", null, null, null, 
			null, null, null, null, "'div'", "'span'", "'section'", "'p'", "'h1'", 
			"'h2'", "'img'", "'h3'", "'ul'", "'li'", "'button'", "'input'", null, 
			null, null, null, null, null, null, null, null, "'}}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AT", "IMPORT", "FROM", "CLASS", "EXPORT", "TRUE", "TEMPLATEE", 
			"STYLES", "FALSE", "COLON", "SEMI", "COMMA", "DOT", "ASSIGN", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "LSQUARE", "RSQUARE", "LT", "GT", "SLASH", 
			"PLUS", "STRING_LITERAL", "NUMBER", "ID", "WS", "TEMPLATE_START", "CSS_COLON", 
			"CSS_COMMA", "HASH", "CSS_CLASSNAME", "CssLBRACE", "CssRBRACE", "CSS_VALUE", 
			"CSS_WS", "INTERPOLATION_OPEN", "TEMPLATE_END", "TEMPLATE_LT", "TEMPLATE_GT", 
			"TEMPLATE_SLASH", "TEMPLATE_EQUALS", "TEMPLATE_QUOTE", "TEMPLATE_STRING", 
			"TEMPLATE_TAG_DIV", "TEMPLATE_TAG_SPAN", "TEMPLATE_TAG_SECTION", "TEMPLATE_TAG_P", 
			"TEMPLATE_TAG_H1", "TEMPLATE_TAG_H2", "TEMPLATE_TAG_IMG", "TEMPLATE_TAG_H3", 
			"TEMPLATE_TAG_UL", "TEMPLATE_TAG_LI", "TEMPLATE_TAG_BUTTON", "TEMPLATE_TAG_INPUT", 
			"TEMPLATE_ID", "ANGULAR_PROPERTY_BINDING", "ANGULAR_EVENT_BINDING", "ANGULAR_TWO_WAY_BINDING", 
			"ANGULAR_STRUCTURAL_DIRECTIVE", "TEMPLATE_TEXT", "TEMPLATE_NEWLINE", 
			"TEMPLATE_WS", "INTERPOLATION_PLUS", "INTERPOLATION_CLOSE", "INTERPOLATION_DOT", 
			"INTERPOLATION_LSQUARE", "INTERPOLATION_RSQUARE", "INTERPOLATION_LPAREN", 
			"INTERPOLATION_RPAREN", "INTERPOLATION_STRING", "INTERPOLATION_NUMBER", 
			"INTERPOLATION_ID", "INTERPOLATION_WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ParserFile.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParserFile(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AngularFileContext extends ParserRuleContext {
		public DecoratorContext decorator() {
			return getRuleContext(DecoratorContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ParserFile.EOF, 0); }
		public List<ImportStatementContext> importStatement() {
			return getRuleContexts(ImportStatementContext.class);
		}
		public ImportStatementContext importStatement(int i) {
			return getRuleContext(ImportStatementContext.class,i);
		}
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public AngularFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_angularFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterAngularFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitAngularFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitAngularFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AngularFileContext angularFile() throws RecognitionException {
		AngularFileContext _localctx = new AngularFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_angularFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(68);
				importStatement();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			decorator();
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EXPORT) {
				{
				{
				setState(75);
				classDeclaration();
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(ParserFile.IMPORT, 0); }
		public TerminalNode LBRACE() { return getToken(ParserFile.LBRACE, 0); }
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public TerminalNode RBRACE() { return getToken(ParserFile.RBRACE, 0); }
		public TerminalNode FROM() { return getToken(ParserFile.FROM, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ParserFile.STRING_LITERAL, 0); }
		public TerminalNode SEMI() { return getToken(ParserFile.SEMI, 0); }
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(IMPORT);
			setState(84);
			match(LBRACE);
			setState(85);
			match(ID);
			setState(86);
			match(RBRACE);
			setState(87);
			match(FROM);
			setState(88);
			match(STRING_LITERAL);
			setState(89);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecoratorContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(ParserFile.AT, 0); }
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public TerminalNode LPAREN() { return getToken(ParserFile.LPAREN, 0); }
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ParserFile.RPAREN, 0); }
		public DecoratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterDecorator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitDecorator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitDecorator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorContext decorator() throws RecognitionException {
		DecoratorContext _localctx = new DecoratorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decorator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(AT);
			setState(92);
			match(ID);
			setState(93);
			match(LPAREN);
			setState(94);
			objectLiteral();
			setState(95);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectLiteralContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ParserFile.LBRACE, 0); }
		public List<ObjectFieldContext> objectField() {
			return getRuleContexts(ObjectFieldContext.class);
		}
		public ObjectFieldContext objectField(int i) {
			return getRuleContext(ObjectFieldContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(ParserFile.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ParserFile.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserFile.COMMA, i);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterObjectLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitObjectLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitObjectLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_objectLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(LBRACE);
			setState(98);
			objectField();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(99);
				match(COMMA);
				setState(100);
				objectField();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectFieldContext extends ParserRuleContext {
		public ObjectFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectField; }
	 
		public ObjectFieldContext() { }
		public void copyFrom(ObjectFieldContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StylesFieldContext extends ObjectFieldContext {
		public TerminalNode STYLES() { return getToken(ParserFile.STYLES, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public StyleArrayContext styleArray() {
			return getRuleContext(StyleArrayContext.class,0);
		}
		public StylesFieldContext(ObjectFieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterStylesField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitStylesField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitStylesField(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateFieldContext extends ObjectFieldContext {
		public TerminalNode TEMPLATEE() { return getToken(ParserFile.TEMPLATEE, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TemplateLiteralContext templateLiteral() {
			return getRuleContext(TemplateLiteralContext.class,0);
		}
		public TemplateFieldContext(ObjectFieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterTemplateField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitTemplateField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitTemplateField(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GenericFieldContext extends ObjectFieldContext {
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GenericFieldContext(ObjectFieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterGenericField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitGenericField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitGenericField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectFieldContext objectField() throws RecognitionException {
		ObjectFieldContext _localctx = new ObjectFieldContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_objectField);
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEMPLATEE:
				_localctx = new TemplateFieldContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(TEMPLATEE);
				setState(109);
				match(COLON);
				setState(110);
				templateLiteral();
				}
				break;
			case STYLES:
				_localctx = new StylesFieldContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(STYLES);
				setState(112);
				match(COLON);
				setState(113);
				styleArray();
				}
				break;
			case ID:
				_localctx = new GenericFieldContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				match(ID);
				setState(115);
				match(COLON);
				setState(116);
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StyleArrayContext extends ParserRuleContext {
		public TerminalNode LSQUARE() { return getToken(ParserFile.LSQUARE, 0); }
		public List<CssLiteralContext> cssLiteral() {
			return getRuleContexts(CssLiteralContext.class);
		}
		public CssLiteralContext cssLiteral(int i) {
			return getRuleContext(CssLiteralContext.class,i);
		}
		public TerminalNode RSQUARE() { return getToken(ParserFile.RSQUARE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ParserFile.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserFile.COMMA, i);
		}
		public StyleArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterStyleArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitStyleArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitStyleArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleArrayContext styleArray() throws RecognitionException {
		StyleArrayContext _localctx = new StyleArrayContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_styleArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(LSQUARE);
			setState(120);
			cssLiteral();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(121);
				match(COMMA);
				setState(122);
				cssLiteral();
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
			match(RSQUARE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayExprContext extends ExpressionContext {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ArrayExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterArrayExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitArrayExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitArrayExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierExprContext extends ExpressionContext {
		public List<TerminalNode> ID() { return getTokens(ParserFile.ID); }
		public TerminalNode ID(int i) {
			return getToken(ParserFile.ID, i);
		}
		public List<TerminalNode> DOT() { return getTokens(ParserFile.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ParserFile.DOT, i);
		}
		public List<TerminalNode> LSQUARE() { return getTokens(ParserFile.LSQUARE); }
		public TerminalNode LSQUARE(int i) {
			return getToken(ParserFile.LSQUARE, i);
		}
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public List<TerminalNode> RSQUARE() { return getTokens(ParserFile.RSQUARE); }
		public TerminalNode RSQUARE(int i) {
			return getToken(ParserFile.RSQUARE, i);
		}
		public IdentifierExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterIdentifierExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitIdentifierExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitIdentifierExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateExprContext extends ExpressionContext {
		public TemplateLiteralContext templateLiteral() {
			return getRuleContext(TemplateLiteralContext.class,0);
		}
		public TemplateExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterTemplateExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitTemplateExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitTemplateExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralExprContext extends ExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitLiteralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitLiteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssExprContext extends ExpressionContext {
		public CssLiteralContext cssLiteral() {
			return getRuleContext(CssLiteralContext.class,0);
		}
		public CssExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterCssExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitCssExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitCssExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		int _la;
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new IdentifierExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(ID);
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT || _la==LSQUARE) {
					{
					setState(137);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DOT:
						{
						{
						setState(131);
						match(DOT);
						setState(132);
						match(ID);
						}
						}
						break;
					case LSQUARE:
						{
						{
						setState(133);
						match(LSQUARE);
						setState(134);
						literal();
						setState(135);
						match(RSQUARE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(141);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new LiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				literal();
				}
				break;
			case 3:
				_localctx = new TemplateExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				templateLiteral();
				}
				break;
			case 4:
				_localctx = new CssExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
				cssLiteral();
				}
				break;
			case 5:
				_localctx = new ArrayExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(145);
				arrayLiteral();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(ParserFile.STRING_LITERAL, 0); }
		public TerminalNode NUMBER() { return getToken(ParserFile.NUMBER, 0); }
		public TerminalNode TRUE() { return getToken(ParserFile.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ParserFile.FALSE, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 100663872L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateLiteralContext extends ParserRuleContext {
		public TerminalNode TEMPLATE_START() { return getToken(ParserFile.TEMPLATE_START, 0); }
		public TerminalNode TEMPLATE_END() { return getToken(ParserFile.TEMPLATE_END, 0); }
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public TemplateLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterTemplateLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitTemplateLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitTemplateLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateLiteralContext templateLiteral() throws RecognitionException {
		TemplateLiteralContext _localctx = new TemplateLiteralContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_templateLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(TEMPLATE_START);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & 101711877L) != 0)) {
				{
				setState(151);
				htmlContent();
				}
			}

			setState(154);
			match(TEMPLATE_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssLiteralContext extends ParserRuleContext {
		public TerminalNode TEMPLATE_START() { return getToken(ParserFile.TEMPLATE_START, 0); }
		public CssContentContext cssContent() {
			return getRuleContext(CssContentContext.class,0);
		}
		public TerminalNode TEMPLATE_END() { return getToken(ParserFile.TEMPLATE_END, 0); }
		public CssLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterCssLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitCssLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitCssLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssLiteralContext cssLiteral() throws RecognitionException {
		CssLiteralContext _localctx = new CssLiteralContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cssLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(TEMPLATE_START);
			setState(157);
			cssContent();
			setState(158);
			match(TEMPLATE_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssContentContext extends ParserRuleContext {
		public List<CssStatementContext> cssStatement() {
			return getRuleContexts(CssStatementContext.class);
		}
		public CssStatementContext cssStatement(int i) {
			return getRuleContext(CssStatementContext.class,i);
		}
		public CssContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterCssContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitCssContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitCssContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssContentContext cssContent() throws RecognitionException {
		CssContentContext _localctx = new CssContentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cssContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_CLASSNAME) {
				{
				{
				setState(160);
				cssStatement();
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssStatementContext extends ParserRuleContext {
		public TerminalNode CSS_CLASSNAME() { return getToken(ParserFile.CSS_CLASSNAME, 0); }
		public TerminalNode CssLBRACE() { return getToken(ParserFile.CssLBRACE, 0); }
		public TerminalNode CssRBRACE() { return getToken(ParserFile.CssRBRACE, 0); }
		public TerminalNode TEMPLATE_TAG_IMG() { return getToken(ParserFile.TEMPLATE_TAG_IMG, 0); }
		public List<CssRuleContext> cssRule() {
			return getRuleContexts(CssRuleContext.class);
		}
		public CssRuleContext cssRule(int i) {
			return getRuleContext(CssRuleContext.class,i);
		}
		public CssStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterCssStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitCssStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitCssStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssStatementContext cssStatement() throws RecognitionException {
		CssStatementContext _localctx = new CssStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cssStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(CSS_CLASSNAME);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMPLATE_TAG_IMG) {
				{
				setState(167);
				match(TEMPLATE_TAG_IMG);
				}
			}

			setState(170);
			match(CssLBRACE);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEMPLATE_ID) {
				{
				{
				setState(171);
				cssRule();
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(177);
			match(CssRBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssRuleContext extends ParserRuleContext {
		public List<TerminalNode> TEMPLATE_ID() { return getTokens(ParserFile.TEMPLATE_ID); }
		public TerminalNode TEMPLATE_ID(int i) {
			return getToken(ParserFile.TEMPLATE_ID, i);
		}
		public TerminalNode CSS_COLON() { return getToken(ParserFile.CSS_COLON, 0); }
		public TerminalNode CSS_COMMA() { return getToken(ParserFile.CSS_COMMA, 0); }
		public List<TerminalNode> CSS_VALUE() { return getTokens(ParserFile.CSS_VALUE); }
		public TerminalNode CSS_VALUE(int i) {
			return getToken(ParserFile.CSS_VALUE, i);
		}
		public List<TerminalNode> HASH() { return getTokens(ParserFile.HASH); }
		public TerminalNode HASH(int i) {
			return getToken(ParserFile.HASH, i);
		}
		public CssRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterCssRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitCssRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitCssRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssRuleContext cssRule() throws RecognitionException {
		CssRuleContext _localctx = new CssRuleContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cssRule);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(TEMPLATE_ID);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_COLON) {
				{
				setState(180);
				match(CSS_COLON);
				}
			}

			setState(184); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(183);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 288230449166155776L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(186); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_COMMA) {
				{
				setState(188);
				match(CSS_COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentContext extends ParserRuleContext {
		public List<HtmlChunkContext> htmlChunk() {
			return getRuleContexts(HtmlChunkContext.class);
		}
		public HtmlChunkContext htmlChunk(int i) {
			return getRuleContext(HtmlChunkContext.class,i);
		}
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_htmlContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(191);
				htmlChunk();
				}
				}
				setState(194); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & 101711877L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlChunkContext extends ParserRuleContext {
		public HtmlChunkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlChunk; }
	 
		public HtmlChunkContext() { }
		public void copyFrom(HtmlChunkContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlSelfClosingChunkContext extends HtmlChunkContext {
		public SelfClosingTagContext selfClosingTag() {
			return getRuleContext(SelfClosingTagContext.class,0);
		}
		public HtmlSelfClosingChunkContext(HtmlChunkContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterHtmlSelfClosingChunk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitHtmlSelfClosingChunk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitHtmlSelfClosingChunk(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlCloseTagChunkContext extends HtmlChunkContext {
		public CloseTagContext closeTag() {
			return getRuleContext(CloseTagContext.class,0);
		}
		public HtmlCloseTagChunkContext(HtmlChunkContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterHtmlCloseTagChunk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitHtmlCloseTagChunk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitHtmlCloseTagChunk(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementChunkContext extends HtmlChunkContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public HtmlElementChunkContext(HtmlChunkContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterHtmlElementChunk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitHtmlElementChunk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitHtmlElementChunk(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Html_IdContext extends HtmlChunkContext {
		public TerminalNode TEMPLATE_ID() { return getToken(ParserFile.TEMPLATE_ID, 0); }
		public Html_IdContext(HtmlChunkContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterHtml_Id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitHtml_Id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitHtml_Id(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTextChunkContext extends HtmlChunkContext {
		public TerminalNode TEMPLATE_TEXT() { return getToken(ParserFile.TEMPLATE_TEXT, 0); }
		public HtmlTextChunkContext(HtmlChunkContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterHtmlTextChunk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitHtmlTextChunk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitHtmlTextChunk(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlNewlineChunkContext extends HtmlChunkContext {
		public TerminalNode TEMPLATE_NEWLINE() { return getToken(ParserFile.TEMPLATE_NEWLINE, 0); }
		public HtmlNewlineChunkContext(HtmlChunkContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterHtmlNewlineChunk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitHtmlNewlineChunk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitHtmlNewlineChunk(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InterpolationChunkContext extends HtmlChunkContext {
		public InterpolationContext interpolation() {
			return getRuleContext(InterpolationContext.class,0);
		}
		public InterpolationChunkContext(HtmlChunkContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterInterpolationChunk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitInterpolationChunk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitInterpolationChunk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlChunkContext htmlChunk() throws RecognitionException {
		HtmlChunkContext _localctx = new HtmlChunkContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_htmlChunk);
		try {
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new HtmlElementChunkContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				htmlElement();
				}
				break;
			case 2:
				_localctx = new HtmlSelfClosingChunkContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				selfClosingTag();
				}
				break;
			case 3:
				_localctx = new InterpolationChunkContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				interpolation();
				}
				break;
			case 4:
				_localctx = new HtmlCloseTagChunkContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(199);
				closeTag();
				}
				break;
			case 5:
				_localctx = new Html_IdContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(200);
				match(TEMPLATE_ID);
				}
				break;
			case 6:
				_localctx = new HtmlTextChunkContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(201);
				match(TEMPLATE_TEXT);
				}
				break;
			case 7:
				_localctx = new HtmlNewlineChunkContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(202);
				match(TEMPLATE_NEWLINE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterpolationContext extends ParserRuleContext {
		public TerminalNode INTERPOLATION_OPEN() { return getToken(ParserFile.INTERPOLATION_OPEN, 0); }
		public TerminalNode INTERPOLATION_CLOSE() { return getToken(ParserFile.INTERPOLATION_CLOSE, 0); }
		public InterpolationContentContext interpolationContent() {
			return getRuleContext(InterpolationContentContext.class,0);
		}
		public InterpolationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterInterpolation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitInterpolation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitInterpolation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterpolationContext interpolation() throws RecognitionException {
		InterpolationContext _localctx = new InterpolationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_interpolation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(INTERPOLATION_OPEN);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 255L) != 0)) {
				{
				setState(206);
				interpolationContent();
				}
			}

			setState(209);
			match(INTERPOLATION_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterpolationContentContext extends ParserRuleContext {
		public List<InterpolationExprContext> interpolationExpr() {
			return getRuleContexts(InterpolationExprContext.class);
		}
		public InterpolationExprContext interpolationExpr(int i) {
			return getRuleContext(InterpolationExprContext.class,i);
		}
		public InterpolationContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolationContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterInterpolationContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitInterpolationContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitInterpolationContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterpolationContentContext interpolationContent() throws RecognitionException {
		InterpolationContentContext _localctx = new InterpolationContentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_interpolationContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(211);
				interpolationExpr();
				}
				}
				setState(214); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 255L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterpolationExprContext extends ParserRuleContext {
		public TerminalNode INTERPOLATION_ID() { return getToken(ParserFile.INTERPOLATION_ID, 0); }
		public TerminalNode INTERPOLATION_DOT() { return getToken(ParserFile.INTERPOLATION_DOT, 0); }
		public TerminalNode INTERPOLATION_LSQUARE() { return getToken(ParserFile.INTERPOLATION_LSQUARE, 0); }
		public TerminalNode INTERPOLATION_RSQUARE() { return getToken(ParserFile.INTERPOLATION_RSQUARE, 0); }
		public TerminalNode INTERPOLATION_STRING() { return getToken(ParserFile.INTERPOLATION_STRING, 0); }
		public TerminalNode INTERPOLATION_NUMBER() { return getToken(ParserFile.INTERPOLATION_NUMBER, 0); }
		public TerminalNode INTERPOLATION_LPAREN() { return getToken(ParserFile.INTERPOLATION_LPAREN, 0); }
		public TerminalNode INTERPOLATION_RPAREN() { return getToken(ParserFile.INTERPOLATION_RPAREN, 0); }
		public InterpolationExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolationExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterInterpolationExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitInterpolationExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitInterpolationExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterpolationExprContext interpolationExpr() throws RecognitionException {
		InterpolationExprContext _localctx = new InterpolationExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_interpolationExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_la = _input.LA(1);
			if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 255L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementContext extends ParserRuleContext {
		public TerminalNode TEMPLATE_LT() { return getToken(ParserFile.TEMPLATE_LT, 0); }
		public HtmlTagContext htmlTag() {
			return getRuleContext(HtmlTagContext.class,0);
		}
		public TerminalNode TEMPLATE_GT() { return getToken(ParserFile.TEMPLATE_GT, 0); }
		public CloseTagContext closeTag() {
			return getRuleContext(CloseTagContext.class,0);
		}
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public List<TerminalNode> TEMPLATE_WS() { return getTokens(ParserFile.TEMPLATE_WS); }
		public TerminalNode TEMPLATE_WS(int i) {
			return getToken(ParserFile.TEMPLATE_WS, i);
		}
		public List<TerminalNode> TEMPLATE_NEWLINE() { return getTokens(ParserFile.TEMPLATE_NEWLINE); }
		public TerminalNode TEMPLATE_NEWLINE(int i) {
			return getToken(ParserFile.TEMPLATE_NEWLINE, i);
		}
		public List<HtmlChunkContext> htmlChunk() {
			return getRuleContexts(HtmlChunkContext.class);
		}
		public HtmlChunkContext htmlChunk(int i) {
			return getRuleContext(HtmlChunkContext.class,i);
		}
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_htmlElement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(TEMPLATE_LT);
			setState(219);
			htmlTag();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & 223L) != 0)) {
				{
				setState(223);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TEMPLATE_ID:
				case ANGULAR_PROPERTY_BINDING:
				case ANGULAR_EVENT_BINDING:
				case ANGULAR_TWO_WAY_BINDING:
				case ANGULAR_STRUCTURAL_DIRECTIVE:
					{
					setState(220);
					htmlAttribute();
					}
					break;
				case TEMPLATE_WS:
					{
					setState(221);
					match(TEMPLATE_WS);
					}
					break;
				case TEMPLATE_NEWLINE:
					{
					setState(222);
					match(TEMPLATE_NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(228);
			match(TEMPLATE_GT);
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(229);
					htmlChunk();
					}
					} 
				}
				setState(234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(235);
			closeTag();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelfClosingTagContext extends ParserRuleContext {
		public TerminalNode TEMPLATE_LT() { return getToken(ParserFile.TEMPLATE_LT, 0); }
		public HtmlTagContext htmlTag() {
			return getRuleContext(HtmlTagContext.class,0);
		}
		public TerminalNode TEMPLATE_SLASH() { return getToken(ParserFile.TEMPLATE_SLASH, 0); }
		public TerminalNode TEMPLATE_GT() { return getToken(ParserFile.TEMPLATE_GT, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public List<TerminalNode> TEMPLATE_WS() { return getTokens(ParserFile.TEMPLATE_WS); }
		public TerminalNode TEMPLATE_WS(int i) {
			return getToken(ParserFile.TEMPLATE_WS, i);
		}
		public List<TerminalNode> TEMPLATE_NEWLINE() { return getTokens(ParserFile.TEMPLATE_NEWLINE); }
		public TerminalNode TEMPLATE_NEWLINE(int i) {
			return getToken(ParserFile.TEMPLATE_NEWLINE, i);
		}
		public SelfClosingTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfClosingTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterSelfClosingTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitSelfClosingTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitSelfClosingTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfClosingTagContext selfClosingTag() throws RecognitionException {
		SelfClosingTagContext _localctx = new SelfClosingTagContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_selfClosingTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(TEMPLATE_LT);
			setState(238);
			htmlTag();
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & 223L) != 0)) {
				{
				setState(242);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TEMPLATE_ID:
				case ANGULAR_PROPERTY_BINDING:
				case ANGULAR_EVENT_BINDING:
				case ANGULAR_TWO_WAY_BINDING:
				case ANGULAR_STRUCTURAL_DIRECTIVE:
					{
					setState(239);
					htmlAttribute();
					}
					break;
				case TEMPLATE_WS:
					{
					setState(240);
					match(TEMPLATE_WS);
					}
					break;
				case TEMPLATE_NEWLINE:
					{
					setState(241);
					match(TEMPLATE_NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(247);
			match(TEMPLATE_SLASH);
			setState(248);
			match(TEMPLATE_GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CloseTagContext extends ParserRuleContext {
		public TerminalNode TEMPLATE_LT() { return getToken(ParserFile.TEMPLATE_LT, 0); }
		public TerminalNode TEMPLATE_SLASH() { return getToken(ParserFile.TEMPLATE_SLASH, 0); }
		public HtmlTagContext htmlTag() {
			return getRuleContext(HtmlTagContext.class,0);
		}
		public TerminalNode TEMPLATE_GT() { return getToken(ParserFile.TEMPLATE_GT, 0); }
		public CloseTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterCloseTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitCloseTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitCloseTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloseTagContext closeTag() throws RecognitionException {
		CloseTagContext _localctx = new CloseTagContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_closeTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(TEMPLATE_LT);
			setState(251);
			match(TEMPLATE_SLASH);
			setState(252);
			htmlTag();
			setState(253);
			match(TEMPLATE_GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTagContext extends ParserRuleContext {
		public TerminalNode TEMPLATE_TAG_DIV() { return getToken(ParserFile.TEMPLATE_TAG_DIV, 0); }
		public TerminalNode TEMPLATE_TAG_SPAN() { return getToken(ParserFile.TEMPLATE_TAG_SPAN, 0); }
		public TerminalNode TEMPLATE_TAG_SECTION() { return getToken(ParserFile.TEMPLATE_TAG_SECTION, 0); }
		public TerminalNode TEMPLATE_TAG_P() { return getToken(ParserFile.TEMPLATE_TAG_P, 0); }
		public TerminalNode TEMPLATE_TAG_H1() { return getToken(ParserFile.TEMPLATE_TAG_H1, 0); }
		public TerminalNode TEMPLATE_TAG_H2() { return getToken(ParserFile.TEMPLATE_TAG_H2, 0); }
		public TerminalNode TEMPLATE_TAG_H3() { return getToken(ParserFile.TEMPLATE_TAG_H3, 0); }
		public TerminalNode TEMPLATE_TAG_IMG() { return getToken(ParserFile.TEMPLATE_TAG_IMG, 0); }
		public TerminalNode TEMPLATE_TAG_UL() { return getToken(ParserFile.TEMPLATE_TAG_UL, 0); }
		public TerminalNode TEMPLATE_TAG_LI() { return getToken(ParserFile.TEMPLATE_TAG_LI, 0); }
		public TerminalNode TEMPLATE_TAG_BUTTON() { return getToken(ParserFile.TEMPLATE_TAG_BUTTON, 0); }
		public TerminalNode TEMPLATE_TAG_INPUT() { return getToken(ParserFile.TEMPLATE_TAG_INPUT, 0); }
		public TerminalNode TEMPLATE_ID() { return getToken(ParserFile.TEMPLATE_ID, 0); }
		public HtmlTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterHtmlTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitHtmlTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitHtmlTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlTagContext htmlTag() throws RecognitionException {
		HtmlTagContext _localctx = new HtmlTagContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_htmlTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 576390383559245824L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttributeContext extends ParserRuleContext {
		public TerminalNode TEMPLATE_EQUALS() { return getToken(ParserFile.TEMPLATE_EQUALS, 0); }
		public AttributeValueContext attributeValue() {
			return getRuleContext(AttributeValueContext.class,0);
		}
		public TerminalNode TEMPLATE_ID() { return getToken(ParserFile.TEMPLATE_ID, 0); }
		public TerminalNode ANGULAR_PROPERTY_BINDING() { return getToken(ParserFile.ANGULAR_PROPERTY_BINDING, 0); }
		public TerminalNode ANGULAR_EVENT_BINDING() { return getToken(ParserFile.ANGULAR_EVENT_BINDING, 0); }
		public TerminalNode ANGULAR_TWO_WAY_BINDING() { return getToken(ParserFile.ANGULAR_TWO_WAY_BINDING, 0); }
		public TerminalNode ANGULAR_STRUCTURAL_DIRECTIVE() { return getToken(ParserFile.ANGULAR_STRUCTURAL_DIRECTIVE, 0); }
		public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterHtmlAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitHtmlAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitHtmlAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_htmlAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8935141660703064064L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(258);
			match(TEMPLATE_EQUALS);
			setState(259);
			attributeValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeValueContext extends ParserRuleContext {
		public TerminalNode TEMPLATE_STRING() { return getToken(ParserFile.TEMPLATE_STRING, 0); }
		public TerminalNode TEMPLATE_ID() { return getToken(ParserFile.TEMPLATE_ID, 0); }
		public InterpolationContext interpolation() {
			return getRuleContext(InterpolationContext.class,0);
		}
		public AttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitAttributeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitAttributeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeValueContext attributeValue() throws RecognitionException {
		AttributeValueContext _localctx = new AttributeValueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_attributeValue);
		try {
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEMPLATE_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				match(TEMPLATE_STRING);
				}
				break;
			case TEMPLATE_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				match(TEMPLATE_ID);
				}
				break;
			case INTERPOLATION_OPEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(263);
				interpolation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(ParserFile.EXPORT, 0); }
		public TerminalNode CLASS() { return getToken(ParserFile.CLASS, 0); }
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public TerminalNode LBRACE() { return getToken(ParserFile.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ParserFile.RBRACE, 0); }
		public List<ClassMemberContext> classMember() {
			return getRuleContexts(ClassMemberContext.class);
		}
		public ClassMemberContext classMember(int i) {
			return getRuleContext(ClassMemberContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(EXPORT);
			setState(267);
			match(CLASS);
			setState(268);
			match(ID);
			setState(269);
			match(LBRACE);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(270);
				classMember();
				}
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(276);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassMemberContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ClassMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterClassMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitClassMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitClassMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberContext classMember() throws RecognitionException {
		ClassMemberContext _localctx = new ClassMemberContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_classMember);
		try {
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				functionDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(ParserFile.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ParserFile.SEMI, 0); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(ID);
			setState(283);
			match(ASSIGN);
			setState(284);
			expression();
			setState(285);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayLiteralContext extends ParserRuleContext {
		public TerminalNode LSQUARE() { return getToken(ParserFile.LSQUARE, 0); }
		public List<ArrayElementContext> arrayElement() {
			return getRuleContexts(ArrayElementContext.class);
		}
		public ArrayElementContext arrayElement(int i) {
			return getRuleContext(ArrayElementContext.class,i);
		}
		public TerminalNode RSQUARE() { return getToken(ParserFile.RSQUARE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ParserFile.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserFile.COMMA, i);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitArrayLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(LSQUARE);
			setState(288);
			arrayElement();
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(289);
				match(COMMA);
				setState(290);
				arrayElement();
				}
				}
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(296);
			match(RSQUARE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayElementContext extends ParserRuleContext {
		public List<ObjectFieldInArrayContext> objectFieldInArray() {
			return getRuleContexts(ObjectFieldInArrayContext.class);
		}
		public ObjectFieldInArrayContext objectFieldInArray(int i) {
			return getRuleContext(ObjectFieldInArrayContext.class,i);
		}
		public TerminalNode LBRACE() { return getToken(ParserFile.LBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ParserFile.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserFile.COMMA, i);
		}
		public TerminalNode RBRACE() { return getToken(ParserFile.RBRACE, 0); }
		public ArrayElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterArrayElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitArrayElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitArrayElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayElementContext arrayElement() throws RecognitionException {
		ArrayElementContext _localctx = new ArrayElementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_arrayElement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(298);
				match(LBRACE);
				}
			}

			setState(301);
			objectFieldInArray();
			setState(306);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(302);
					match(COMMA);
					setState(303);
					objectFieldInArray();
					}
					} 
				}
				setState(308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RBRACE) {
				{
				setState(309);
				match(RBRACE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectFieldInArrayContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ObjectFieldInArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectFieldInArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterObjectFieldInArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitObjectFieldInArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitObjectFieldInArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectFieldInArrayContext objectFieldInArray() throws RecognitionException {
		ObjectFieldInArrayContext _localctx = new ObjectFieldInArrayContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_objectFieldInArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(ID);
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(313);
				match(COLON);
				}
			}

			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 100663872L) != 0)) {
				{
				setState(316);
				literal();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public TerminalNode LPAREN() { return getToken(ParserFile.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ParserFile.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(ParserFile.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ParserFile.RBRACE, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(ID);
			setState(320);
			match(LPAREN);
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(321);
				parameterList();
				}
			}

			setState(324);
			match(RPAREN);
			setState(325);
			match(LBRACE);
			setState(327); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(326);
				block();
				}
				}
				setState(329); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(331);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserFile.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserFile.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			parameter();
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(334);
				match(COMMA);
				setState(335);
				parameter();
				}
				}
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ParserFile.ID); }
		public TerminalNode ID(int i) {
			return getToken(ParserFile.ID, i);
		}
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(ID);
			setState(342);
			match(COLON);
			setState(343);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockExpr2Context extends BlockContext {
		public List<TerminalNode> ID() { return getTokens(ParserFile.ID); }
		public TerminalNode ID(int i) {
			return getToken(ParserFile.ID, i);
		}
		public TerminalNode DOT() { return getToken(ParserFile.DOT, 0); }
		public TerminalNode ASSIGN() { return getToken(ParserFile.ASSIGN, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ParserFile.STRING_LITERAL, 0); }
		public TerminalNode SEMI() { return getToken(ParserFile.SEMI, 0); }
		public BlockExpr2Context(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterBlockExpr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitBlockExpr2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitBlockExpr2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockExpr3Context extends BlockContext {
		public TerminalNode ASSIGN() { return getToken(ParserFile.ASSIGN, 0); }
		public List<TerminalNode> ID() { return getTokens(ParserFile.ID); }
		public TerminalNode ID(int i) {
			return getToken(ParserFile.ID, i);
		}
		public TerminalNode DOT() { return getToken(ParserFile.DOT, 0); }
		public TerminalNode SEMI() { return getToken(ParserFile.SEMI, 0); }
		public BlockExpr3Context(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterBlockExpr3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitBlockExpr3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitBlockExpr3(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockExpr1Context extends BlockContext {
		public List<TerminalNode> ID() { return getTokens(ParserFile.ID); }
		public TerminalNode ID(int i) {
			return getToken(ParserFile.ID, i);
		}
		public List<TerminalNode> DOT() { return getTokens(ParserFile.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ParserFile.DOT, i);
		}
		public TerminalNode ASSIGN() { return getToken(ParserFile.ASSIGN, 0); }
		public TerminalNode SEMI() { return getToken(ParserFile.SEMI, 0); }
		public TerminalNode PLUS() { return getToken(ParserFile.PLUS, 0); }
		public TerminalNode NUMBER() { return getToken(ParserFile.NUMBER, 0); }
		public BlockExpr1Context(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterBlockExpr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitBlockExpr1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitBlockExpr1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_block);
		int _la;
		try {
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				_localctx = new BlockExpr1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				match(ID);
				setState(346);
				match(DOT);
				setState(347);
				match(ID);
				setState(348);
				match(ASSIGN);
				setState(349);
				match(ID);
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(350);
					match(DOT);
					setState(351);
					match(ID);
					setState(354);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PLUS) {
						{
						setState(352);
						match(PLUS);
						setState(353);
						match(NUMBER);
						}
					}

					}
				}

				setState(358);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new BlockExpr2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				match(ID);
				setState(360);
				match(DOT);
				setState(361);
				match(ID);
				setState(362);
				match(ASSIGN);
				setState(363);
				match(STRING_LITERAL);
				setState(364);
				match(SEMI);
				}
				break;
			case 3:
				_localctx = new BlockExpr3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(366); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(365);
					match(ID);
					}
					}
					setState(368); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(370);
				match(ASSIGN);
				setState(371);
				match(ID);
				setState(372);
				match(DOT);
				setState(374); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(373);
					match(ID);
					}
					}
					setState(376); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(378);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001L\u017e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0001\u0000\u0005"+
		"\u0000F\b\u0000\n\u0000\f\u0000I\t\u0000\u0001\u0000\u0001\u0000\u0005"+
		"\u0000M\b\u0000\n\u0000\f\u0000P\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003f\b\u0003\n\u0003\f\u0003i\t\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004v\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005|\b\u0005\n\u0005\f\u0005\u007f"+
		"\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u008a\b\u0006\n"+
		"\u0006\f\u0006\u008d\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u0093\b\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0003\b\u0099\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0005\n\u00a2\b\n\n\n\f\n\u00a5\t\n\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u00a9\b\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00ad\b\u000b\n\u000b"+
		"\f\u000b\u00b0\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0003\f"+
		"\u00b6\b\f\u0001\f\u0004\f\u00b9\b\f\u000b\f\f\f\u00ba\u0001\f\u0003\f"+
		"\u00be\b\f\u0001\r\u0004\r\u00c1\b\r\u000b\r\f\r\u00c2\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00cc\b\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u00d0\b\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0004\u0010\u00d5\b\u0010\u000b\u0010"+
		"\f\u0010\u00d6\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u00e0\b\u0012\n\u0012\f\u0012\u00e3"+
		"\t\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00e7\b\u0012\n\u0012\f\u0012"+
		"\u00ea\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0005\u0013\u00f3\b\u0013\n\u0013\f\u0013\u00f6"+
		"\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u0109\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0005\u0018\u0110\b\u0018\n\u0018\f\u0018\u0113\t\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0003\u0019\u0119\b\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0005\u001b\u0124\b\u001b\n\u001b\f\u001b\u0127"+
		"\t\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0003\u001c\u012c\b\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0131\b\u001c\n\u001c"+
		"\f\u001c\u0134\t\u001c\u0001\u001c\u0003\u001c\u0137\b\u001c\u0001\u001d"+
		"\u0001\u001d\u0003\u001d\u013b\b\u001d\u0001\u001d\u0003\u001d\u013e\b"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0143\b\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0004\u001e\u0148\b\u001e\u000b\u001e\f"+
		"\u001e\u0149\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0005\u001f\u0151\b\u001f\n\u001f\f\u001f\u0154\t\u001f\u0001 \u0001"+
		" \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0003!\u0163\b!\u0003!\u0165\b!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0004!\u016f\b!\u000b!\f!\u0170\u0001!\u0001!\u0001"+
		"!\u0001!\u0004!\u0177\b!\u000b!\f!\u0178\u0001!\u0003!\u017c\b!\u0001"+
		"!\u0000\u0000\"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@B\u0000\u0005\u0003\u0000"+
		"\u0006\u0006\t\t\u0019\u001a\u0003\u0000  $$::\u0001\u0000DK\u0001\u0000"+
		".:\u0001\u0000:>\u0191\u0000G\u0001\u0000\u0000\u0000\u0002S\u0001\u0000"+
		"\u0000\u0000\u0004[\u0001\u0000\u0000\u0000\u0006a\u0001\u0000\u0000\u0000"+
		"\bu\u0001\u0000\u0000\u0000\nw\u0001\u0000\u0000\u0000\f\u0092\u0001\u0000"+
		"\u0000\u0000\u000e\u0094\u0001\u0000\u0000\u0000\u0010\u0096\u0001\u0000"+
		"\u0000\u0000\u0012\u009c\u0001\u0000\u0000\u0000\u0014\u00a3\u0001\u0000"+
		"\u0000\u0000\u0016\u00a6\u0001\u0000\u0000\u0000\u0018\u00b3\u0001\u0000"+
		"\u0000\u0000\u001a\u00c0\u0001\u0000\u0000\u0000\u001c\u00cb\u0001\u0000"+
		"\u0000\u0000\u001e\u00cd\u0001\u0000\u0000\u0000 \u00d4\u0001\u0000\u0000"+
		"\u0000\"\u00d8\u0001\u0000\u0000\u0000$\u00da\u0001\u0000\u0000\u0000"+
		"&\u00ed\u0001\u0000\u0000\u0000(\u00fa\u0001\u0000\u0000\u0000*\u00ff"+
		"\u0001\u0000\u0000\u0000,\u0101\u0001\u0000\u0000\u0000.\u0108\u0001\u0000"+
		"\u0000\u00000\u010a\u0001\u0000\u0000\u00002\u0118\u0001\u0000\u0000\u0000"+
		"4\u011a\u0001\u0000\u0000\u00006\u011f\u0001\u0000\u0000\u00008\u012b"+
		"\u0001\u0000\u0000\u0000:\u0138\u0001\u0000\u0000\u0000<\u013f\u0001\u0000"+
		"\u0000\u0000>\u014d\u0001\u0000\u0000\u0000@\u0155\u0001\u0000\u0000\u0000"+
		"B\u017b\u0001\u0000\u0000\u0000DF\u0003\u0002\u0001\u0000ED\u0001\u0000"+
		"\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001"+
		"\u0000\u0000\u0000HJ\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000"+
		"JN\u0003\u0004\u0002\u0000KM\u00030\u0018\u0000LK\u0001\u0000\u0000\u0000"+
		"MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000"+
		"\u0000OQ\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000QR\u0005\u0000"+
		"\u0000\u0001R\u0001\u0001\u0000\u0000\u0000ST\u0005\u0002\u0000\u0000"+
		"TU\u0005\u0011\u0000\u0000UV\u0005\u001b\u0000\u0000VW\u0005\u0012\u0000"+
		"\u0000WX\u0005\u0003\u0000\u0000XY\u0005\u0019\u0000\u0000YZ\u0005\u000b"+
		"\u0000\u0000Z\u0003\u0001\u0000\u0000\u0000[\\\u0005\u0001\u0000\u0000"+
		"\\]\u0005\u001b\u0000\u0000]^\u0005\u000f\u0000\u0000^_\u0003\u0006\u0003"+
		"\u0000_`\u0005\u0010\u0000\u0000`\u0005\u0001\u0000\u0000\u0000ab\u0005"+
		"\u0011\u0000\u0000bg\u0003\b\u0004\u0000cd\u0005\f\u0000\u0000df\u0003"+
		"\b\u0004\u0000ec\u0001\u0000\u0000\u0000fi\u0001\u0000\u0000\u0000ge\u0001"+
		"\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hj\u0001\u0000\u0000\u0000"+
		"ig\u0001\u0000\u0000\u0000jk\u0005\u0012\u0000\u0000k\u0007\u0001\u0000"+
		"\u0000\u0000lm\u0005\u0007\u0000\u0000mn\u0005\n\u0000\u0000nv\u0003\u0010"+
		"\b\u0000op\u0005\b\u0000\u0000pq\u0005\n\u0000\u0000qv\u0003\n\u0005\u0000"+
		"rs\u0005\u001b\u0000\u0000st\u0005\n\u0000\u0000tv\u0003\f\u0006\u0000"+
		"ul\u0001\u0000\u0000\u0000uo\u0001\u0000\u0000\u0000ur\u0001\u0000\u0000"+
		"\u0000v\t\u0001\u0000\u0000\u0000wx\u0005\u0013\u0000\u0000x}\u0003\u0012"+
		"\t\u0000yz\u0005\f\u0000\u0000z|\u0003\u0012\t\u0000{y\u0001\u0000\u0000"+
		"\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001"+
		"\u0000\u0000\u0000~\u0080\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0005\u0014\u0000\u0000\u0081\u000b\u0001\u0000\u0000"+
		"\u0000\u0082\u008b\u0005\u001b\u0000\u0000\u0083\u0084\u0005\r\u0000\u0000"+
		"\u0084\u008a\u0005\u001b\u0000\u0000\u0085\u0086\u0005\u0013\u0000\u0000"+
		"\u0086\u0087\u0003\u000e\u0007\u0000\u0087\u0088\u0005\u0014\u0000\u0000"+
		"\u0088\u008a\u0001\u0000\u0000\u0000\u0089\u0083\u0001\u0000\u0000\u0000"+
		"\u0089\u0085\u0001\u0000\u0000\u0000\u008a\u008d\u0001\u0000\u0000\u0000"+
		"\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000"+
		"\u008c\u0093\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000"+
		"\u008e\u0093\u0003\u000e\u0007\u0000\u008f\u0093\u0003\u0010\b\u0000\u0090"+
		"\u0093\u0003\u0012\t\u0000\u0091\u0093\u00036\u001b\u0000\u0092\u0082"+
		"\u0001\u0000\u0000\u0000\u0092\u008e\u0001\u0000\u0000\u0000\u0092\u008f"+
		"\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0091"+
		"\u0001\u0000\u0000\u0000\u0093\r\u0001\u0000\u0000\u0000\u0094\u0095\u0007"+
		"\u0000\u0000\u0000\u0095\u000f\u0001\u0000\u0000\u0000\u0096\u0098\u0005"+
		"\u001d\u0000\u0000\u0097\u0099\u0003\u001a\r\u0000\u0098\u0097\u0001\u0000"+
		"\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000"+
		"\u0000\u0000\u009a\u009b\u0005\'\u0000\u0000\u009b\u0011\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0005\u001d\u0000\u0000\u009d\u009e\u0003\u0014\n\u0000"+
		"\u009e\u009f\u0005\'\u0000\u0000\u009f\u0013\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a2\u0003\u0016\u000b\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a4\u0015\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a8\u0005!\u0000\u0000\u00a7\u00a9"+
		"\u00054\u0000\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001"+
		"\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ae\u0005"+
		"\"\u0000\u0000\u00ab\u00ad\u0003\u0018\f\u0000\u00ac\u00ab\u0001\u0000"+
		"\u0000\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005#\u0000"+
		"\u0000\u00b2\u0017\u0001\u0000\u0000\u0000\u00b3\u00b5\u0005:\u0000\u0000"+
		"\u00b4\u00b6\u0005\u001e\u0000\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b8\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b9\u0007\u0001\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000"+
		"\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bc\u00be\u0005\u001f\u0000\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000"+
		"\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u0019\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c1\u0003\u001c\u000e\u0000\u00c0\u00bf\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u001b\u0001\u0000\u0000\u0000"+
		"\u00c4\u00cc\u0003$\u0012\u0000\u00c5\u00cc\u0003&\u0013\u0000\u00c6\u00cc"+
		"\u0003\u001e\u000f\u0000\u00c7\u00cc\u0003(\u0014\u0000\u00c8\u00cc\u0005"+
		":\u0000\u0000\u00c9\u00cc\u0005?\u0000\u0000\u00ca\u00cc\u0005@\u0000"+
		"\u0000\u00cb\u00c4\u0001\u0000\u0000\u0000\u00cb\u00c5\u0001\u0000\u0000"+
		"\u0000\u00cb\u00c6\u0001\u0000\u0000\u0000\u00cb\u00c7\u0001\u0000\u0000"+
		"\u0000\u00cb\u00c8\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000"+
		"\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cc\u001d\u0001\u0000\u0000"+
		"\u0000\u00cd\u00cf\u0005&\u0000\u0000\u00ce\u00d0\u0003 \u0010\u0000\u00cf"+
		"\u00ce\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005C\u0000\u0000\u00d2\u001f"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d5\u0003\"\u0011\u0000\u00d4\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7!\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d9\u0007\u0002\u0000\u0000\u00d9#\u0001\u0000\u0000"+
		"\u0000\u00da\u00db\u0005(\u0000\u0000\u00db\u00e1\u0003*\u0015\u0000\u00dc"+
		"\u00e0\u0003,\u0016\u0000\u00dd\u00e0\u0005A\u0000\u0000\u00de\u00e0\u0005"+
		"@\u0000\u0000\u00df\u00dc\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000"+
		"\u0000\u0000\u00df\u00de\u0001\u0000\u0000\u0000\u00e0\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e4\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e8\u0005)\u0000\u0000\u00e5\u00e7\u0003\u001c\u000e"+
		"\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e7\u00ea\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000"+
		"\u0000\u00e9\u00eb\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000"+
		"\u0000\u00eb\u00ec\u0003(\u0014\u0000\u00ec%\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ee\u0005(\u0000\u0000\u00ee\u00f4\u0003*\u0015\u0000\u00ef\u00f3\u0003"+
		",\u0016\u0000\u00f0\u00f3\u0005A\u0000\u0000\u00f1\u00f3\u0005@\u0000"+
		"\u0000\u00f2\u00ef\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f6\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f7\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f8\u0005*\u0000\u0000\u00f8\u00f9\u0005)\u0000\u0000\u00f9"+
		"\'\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005(\u0000\u0000\u00fb\u00fc"+
		"\u0005*\u0000\u0000\u00fc\u00fd\u0003*\u0015\u0000\u00fd\u00fe\u0005)"+
		"\u0000\u0000\u00fe)\u0001\u0000\u0000\u0000\u00ff\u0100\u0007\u0003\u0000"+
		"\u0000\u0100+\u0001\u0000\u0000\u0000\u0101\u0102\u0007\u0004\u0000\u0000"+
		"\u0102\u0103\u0005+\u0000\u0000\u0103\u0104\u0003.\u0017\u0000\u0104-"+
		"\u0001\u0000\u0000\u0000\u0105\u0109\u0005-\u0000\u0000\u0106\u0109\u0005"+
		":\u0000\u0000\u0107\u0109\u0003\u001e\u000f\u0000\u0108\u0105\u0001\u0000"+
		"\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0108\u0107\u0001\u0000"+
		"\u0000\u0000\u0109/\u0001\u0000\u0000\u0000\u010a\u010b\u0005\u0005\u0000"+
		"\u0000\u010b\u010c\u0005\u0004\u0000\u0000\u010c\u010d\u0005\u001b\u0000"+
		"\u0000\u010d\u0111\u0005\u0011\u0000\u0000\u010e\u0110\u00032\u0019\u0000"+
		"\u010f\u010e\u0001\u0000\u0000\u0000\u0110\u0113\u0001\u0000\u0000\u0000"+
		"\u0111\u010f\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000"+
		"\u0112\u0114\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000\u0000"+
		"\u0114\u0115\u0005\u0012\u0000\u0000\u01151\u0001\u0000\u0000\u0000\u0116"+
		"\u0119\u00034\u001a\u0000\u0117\u0119\u0003<\u001e\u0000\u0118\u0116\u0001"+
		"\u0000\u0000\u0000\u0118\u0117\u0001\u0000\u0000\u0000\u01193\u0001\u0000"+
		"\u0000\u0000\u011a\u011b\u0005\u001b\u0000\u0000\u011b\u011c\u0005\u000e"+
		"\u0000\u0000\u011c\u011d\u0003\f\u0006\u0000\u011d\u011e\u0005\u000b\u0000"+
		"\u0000\u011e5\u0001\u0000\u0000\u0000\u011f\u0120\u0005\u0013\u0000\u0000"+
		"\u0120\u0125\u00038\u001c\u0000\u0121\u0122\u0005\f\u0000\u0000\u0122"+
		"\u0124\u00038\u001c\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0124\u0127"+
		"\u0001\u0000\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0125\u0126"+
		"\u0001\u0000\u0000\u0000\u0126\u0128\u0001\u0000\u0000\u0000\u0127\u0125"+
		"\u0001\u0000\u0000\u0000\u0128\u0129\u0005\u0014\u0000\u0000\u01297\u0001"+
		"\u0000\u0000\u0000\u012a\u012c\u0005\u0011\u0000\u0000\u012b\u012a\u0001"+
		"\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u012d\u0001"+
		"\u0000\u0000\u0000\u012d\u0132\u0003:\u001d\u0000\u012e\u012f\u0005\f"+
		"\u0000\u0000\u012f\u0131\u0003:\u001d\u0000\u0130\u012e\u0001\u0000\u0000"+
		"\u0000\u0131\u0134\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000"+
		"\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0136\u0001\u0000\u0000"+
		"\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0135\u0137\u0005\u0012\u0000"+
		"\u0000\u0136\u0135\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000"+
		"\u0000\u01379\u0001\u0000\u0000\u0000\u0138\u013a\u0005\u001b\u0000\u0000"+
		"\u0139\u013b\u0005\n\u0000\u0000\u013a\u0139\u0001\u0000\u0000\u0000\u013a"+
		"\u013b\u0001\u0000\u0000\u0000\u013b\u013d\u0001\u0000\u0000\u0000\u013c"+
		"\u013e\u0003\u000e\u0007\u0000\u013d\u013c\u0001\u0000\u0000\u0000\u013d"+
		"\u013e\u0001\u0000\u0000\u0000\u013e;\u0001\u0000\u0000\u0000\u013f\u0140"+
		"\u0005\u001b\u0000\u0000\u0140\u0142\u0005\u000f\u0000\u0000\u0141\u0143"+
		"\u0003>\u001f\u0000\u0142\u0141\u0001\u0000\u0000\u0000\u0142\u0143\u0001"+
		"\u0000\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u0145\u0005"+
		"\u0010\u0000\u0000\u0145\u0147\u0005\u0011\u0000\u0000\u0146\u0148\u0003"+
		"B!\u0000\u0147\u0146\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000\u0000"+
		"\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000"+
		"\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b\u014c\u0005\u0012\u0000"+
		"\u0000\u014c=\u0001\u0000\u0000\u0000\u014d\u0152\u0003@ \u0000\u014e"+
		"\u014f\u0005\f\u0000\u0000\u014f\u0151\u0003@ \u0000\u0150\u014e\u0001"+
		"\u0000\u0000\u0000\u0151\u0154\u0001\u0000\u0000\u0000\u0152\u0150\u0001"+
		"\u0000\u0000\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0153?\u0001\u0000"+
		"\u0000\u0000\u0154\u0152\u0001\u0000\u0000\u0000\u0155\u0156\u0005\u001b"+
		"\u0000\u0000\u0156\u0157\u0005\n\u0000\u0000\u0157\u0158\u0005\u001b\u0000"+
		"\u0000\u0158A\u0001\u0000\u0000\u0000\u0159\u015a\u0005\u001b\u0000\u0000"+
		"\u015a\u015b\u0005\r\u0000\u0000\u015b\u015c\u0005\u001b\u0000\u0000\u015c"+
		"\u015d\u0005\u000e\u0000\u0000\u015d\u0164\u0005\u001b\u0000\u0000\u015e"+
		"\u015f\u0005\r\u0000\u0000\u015f\u0162\u0005\u001b\u0000\u0000\u0160\u0161"+
		"\u0005\u0018\u0000\u0000\u0161\u0163\u0005\u001a\u0000\u0000\u0162\u0160"+
		"\u0001\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0165"+
		"\u0001\u0000\u0000\u0000\u0164\u015e\u0001\u0000\u0000\u0000\u0164\u0165"+
		"\u0001\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u017c"+
		"\u0005\u000b\u0000\u0000\u0167\u0168\u0005\u001b\u0000\u0000\u0168\u0169"+
		"\u0005\r\u0000\u0000\u0169\u016a\u0005\u001b\u0000\u0000\u016a\u016b\u0005"+
		"\u000e\u0000\u0000\u016b\u016c\u0005\u0019\u0000\u0000\u016c\u017c\u0005"+
		"\u000b\u0000\u0000\u016d\u016f\u0005\u001b\u0000\u0000\u016e\u016d\u0001"+
		"\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000\u0170\u016e\u0001"+
		"\u0000\u0000\u0000\u0170\u0171\u0001\u0000\u0000\u0000\u0171\u0172\u0001"+
		"\u0000\u0000\u0000\u0172\u0173\u0005\u000e\u0000\u0000\u0173\u0174\u0005"+
		"\u001b\u0000\u0000\u0174\u0176\u0005\r\u0000\u0000\u0175\u0177\u0005\u001b"+
		"\u0000\u0000\u0176\u0175\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000"+
		"\u0000\u0000\u0178\u0176\u0001\u0000\u0000\u0000\u0178\u0179\u0001\u0000"+
		"\u0000\u0000\u0179\u017a\u0001\u0000\u0000\u0000\u017a\u017c\u0005\u000b"+
		"\u0000\u0000\u017b\u0159\u0001\u0000\u0000\u0000\u017b\u0167\u0001\u0000"+
		"\u0000\u0000\u017b\u016e\u0001\u0000\u0000\u0000\u017cC\u0001\u0000\u0000"+
		"\u0000)GNgu}\u0089\u008b\u0092\u0098\u00a3\u00a8\u00ae\u00b5\u00ba\u00bd"+
		"\u00c2\u00cb\u00cf\u00d6\u00df\u00e1\u00e8\u00f2\u00f4\u0108\u0111\u0118"+
		"\u0125\u012b\u0132\u0136\u013a\u013d\u0142\u0149\u0152\u0162\u0164\u0170"+
		"\u0178\u017b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
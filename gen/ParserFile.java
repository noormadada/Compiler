// Generated from C:/Users/Noor/IdeaProjects/compiler8/Grammer/ParserFile.g4 by ANTLR 4.13.2
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
		AT=1, AS=2, IMPORT=3, FROM=4, CLASS=5, EXPORT=6, TRUE=7, TEMPLATEE=8, 
		STYLES=9, RETURN=10, IF=11, ELSE=12, CONST=13, FALSE=14, COLON=15, SEMI=16, 
		COMMA=17, DOT=18, ASSIGN=19, LPAREN=20, RPAREN=21, LBRACE=22, RBRACE=23, 
		LSQUARE=24, RSQUARE=25, LT=26, GT=27, SLASH=28, PLUS=29, INTERJECTION=30, 
		MINUS=31, PRIVATE=32, SPREAD=33, THIS=34, IMPLEMENTS=35, VOID=36, ANY=37, 
		STRING_LITERAL=38, NUMBER=39, ID=40, WS=41, TEMPLATE_START=42, CSS_COLON=43, 
		CSS_COMMA=44, HASH=45, CSS_CLASSNAME=46, CssLBRACE=47, CssRBRACE=48, CSS_VALUE=49, 
		CSS_WS=50, INTERPOLATION_OPEN=51, TEMPLATE_END=52, TEMPLATE_LT=53, TEMPLATE_GT=54, 
		TEMPLATE_SLASH=55, TEMPLATE_EQUALS=56, TEMPLATE_QUOTE=57, TEMPLATE_STRING=58, 
		TEMPLATE_TAG_DIV=59, TEMPLATE_TAG_SPAN=60, TEMPLATE_TAG_SECTION=61, TEMPLATE_TAG_P=62, 
		TEMPLATE_TAG_H1=63, TEMPLATE_TAG_H2=64, TEMPLATE_TAG_H3=65, TEMPLATE_TAG_IMG=66, 
		TEMPLATE_TAG_UL=67, TEMPLATE_TAG_LI=68, TEMPLATE_TAG_BUTTON=69, TEMPLATE_TAG_INPUT=70, 
		TEMPLATE_ID=71, ANGULAR_PROPERTY_BINDING=72, ANGULAR_EVENT_BINDING=73, 
		ANGULAR_TWO_WAY_BINDING=74, ANGULAR_STRUCTURAL_DIRECTIVE=75, TEMPLATE_TEXT=76, 
		TEMPLATE_NEWLINE=77, TEMPLATE_WS=78, INTERPOLATION_DOLLAR=79, INTERPOLATION_PLUS=80, 
		INTERPOLATION_CLOSE=81, INTERPOLATION_DOT=82, INTERPOLATION_LSQUARE=83, 
		INTERPOLATION_RSQUARE=84, INTERPOLATION_LPAREN=85, INTERPOLATION_RPAREN=86, 
		INTERPOLATION_COLON=87, INTERPOLATION_NTERROGATIVE=88, INTERPOLATION_STRING=89, 
		INTERPOLATION_NUMBER=90, INTERPOLATION_ID=91, INTERPOLATION_WS=92, INTERPOLATION_LBRACE=93;
	public static final int
		RULE_angularFile = 0, RULE_importStatement = 1, RULE_idList = 2, RULE_decorator = 3, 
		RULE_objectLiteral = 4, RULE_objectField = 5, RULE_styleArray = 6, RULE_spreadField = 7, 
		RULE_expression = 8, RULE_literal = 9, RULE_templateLiteral = 10, RULE_cssLiteral = 11, 
		RULE_cssContent = 12, RULE_cssStatement = 13, RULE_cssRule = 14, RULE_htmlContent = 15, 
		RULE_htmlChunk = 16, RULE_interpolation = 17, RULE_interpolationContent = 18, 
		RULE_interpolationExpr = 19, RULE_interpolationFullExpr = 20, RULE_htmlElement = 21, 
		RULE_selfClosingTag = 22, RULE_closeTag = 23, RULE_htmlTag = 24, RULE_htmlAttribute = 25, 
		RULE_attributeValue = 26, RULE_classDeclaration = 27, RULE_classMember = 28, 
		RULE_variableDeclaration = 29, RULE_type = 30, RULE_arrayLiteral = 31, 
		RULE_arrayElement = 32, RULE_objectFieldInArray = 33, RULE_functionDeclaration = 34, 
		RULE_parameterList = 35, RULE_parameter = 36, RULE_block = 37, RULE_statement = 38, 
		RULE_expressionStatement = 39, RULE_assignmentStatement = 40, RULE_methodCallStatement = 41, 
		RULE_returnStatement = 42, RULE_ifStatement = 43, RULE_constDeclaration = 44, 
		RULE_constExportStatement = 45;
	private static String[] makeRuleNames() {
		return new String[] {
			"angularFile", "importStatement", "idList", "decorator", "objectLiteral", 
			"objectField", "styleArray", "spreadField", "expression", "literal", 
			"templateLiteral", "cssLiteral", "cssContent", "cssStatement", "cssRule", 
			"htmlContent", "htmlChunk", "interpolation", "interpolationContent", 
			"interpolationExpr", "interpolationFullExpr", "htmlElement", "selfClosingTag", 
			"closeTag", "htmlTag", "htmlAttribute", "attributeValue", "classDeclaration", 
			"classMember", "variableDeclaration", "type", "arrayLiteral", "arrayElement", 
			"objectFieldInArray", "functionDeclaration", "parameterList", "parameter", 
			"block", "statement", "expressionStatement", "assignmentStatement", "methodCallStatement", 
			"returnStatement", "ifStatement", "constDeclaration", "constExportStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'@'", "'as'", "'import'", "'from'", "'class'", "'export'", "'true'", 
			"'template'", "'styles'", "'return'", "'if'", "'else'", "'const'", "'false'", 
			null, null, "','", null, null, null, null, null, null, null, null, null, 
			null, null, null, "'!'", "'-'", "'private'", "'...'", "'this'", "'implements'", 
			"'void'", "'any'", null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "'{{'", null, null, null, null, null, null, null, 
			"'div'", "'span'", "'section'", "'p'", "'h1'", "'h2'", "'h3'", "'img'", 
			"'ul'", "'li'", "'button'", "'input'", null, null, null, null, null, 
			null, null, null, "'$'", null, "'}}'", null, null, null, null, null, 
			null, "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AT", "AS", "IMPORT", "FROM", "CLASS", "EXPORT", "TRUE", "TEMPLATEE", 
			"STYLES", "RETURN", "IF", "ELSE", "CONST", "FALSE", "COLON", "SEMI", 
			"COMMA", "DOT", "ASSIGN", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LSQUARE", 
			"RSQUARE", "LT", "GT", "SLASH", "PLUS", "INTERJECTION", "MINUS", "PRIVATE", 
			"SPREAD", "THIS", "IMPLEMENTS", "VOID", "ANY", "STRING_LITERAL", "NUMBER", 
			"ID", "WS", "TEMPLATE_START", "CSS_COLON", "CSS_COMMA", "HASH", "CSS_CLASSNAME", 
			"CssLBRACE", "CssRBRACE", "CSS_VALUE", "CSS_WS", "INTERPOLATION_OPEN", 
			"TEMPLATE_END", "TEMPLATE_LT", "TEMPLATE_GT", "TEMPLATE_SLASH", "TEMPLATE_EQUALS", 
			"TEMPLATE_QUOTE", "TEMPLATE_STRING", "TEMPLATE_TAG_DIV", "TEMPLATE_TAG_SPAN", 
			"TEMPLATE_TAG_SECTION", "TEMPLATE_TAG_P", "TEMPLATE_TAG_H1", "TEMPLATE_TAG_H2", 
			"TEMPLATE_TAG_H3", "TEMPLATE_TAG_IMG", "TEMPLATE_TAG_UL", "TEMPLATE_TAG_LI", 
			"TEMPLATE_TAG_BUTTON", "TEMPLATE_TAG_INPUT", "TEMPLATE_ID", "ANGULAR_PROPERTY_BINDING", 
			"ANGULAR_EVENT_BINDING", "ANGULAR_TWO_WAY_BINDING", "ANGULAR_STRUCTURAL_DIRECTIVE", 
			"TEMPLATE_TEXT", "TEMPLATE_NEWLINE", "TEMPLATE_WS", "INTERPOLATION_DOLLAR", 
			"INTERPOLATION_PLUS", "INTERPOLATION_CLOSE", "INTERPOLATION_DOT", "INTERPOLATION_LSQUARE", 
			"INTERPOLATION_RSQUARE", "INTERPOLATION_LPAREN", "INTERPOLATION_RPAREN", 
			"INTERPOLATION_COLON", "INTERPOLATION_NTERROGATIVE", "INTERPOLATION_STRING", 
			"INTERPOLATION_NUMBER", "INTERPOLATION_ID", "INTERPOLATION_WS", "INTERPOLATION_LBRACE"
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
		public TerminalNode EOF() { return getToken(ParserFile.EOF, 0); }
		public List<ImportStatementContext> importStatement() {
			return getRuleContexts(ImportStatementContext.class);
		}
		public ImportStatementContext importStatement(int i) {
			return getRuleContext(ImportStatementContext.class,i);
		}
		public List<DecoratorContext> decorator() {
			return getRuleContexts(DecoratorContext.class);
		}
		public DecoratorContext decorator(int i) {
			return getRuleContext(DecoratorContext.class,i);
		}
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public List<ConstExportStatementContext> constExportStatement() {
			return getRuleContexts(ConstExportStatementContext.class);
		}
		public ConstExportStatementContext constExportStatement(int i) {
			return getRuleContext(ConstExportStatementContext.class,i);
		}
		public List<ExpressionStatementContext> expressionStatement() {
			return getRuleContexts(ExpressionStatementContext.class);
		}
		public ExpressionStatementContext expressionStatement(int i) {
			return getRuleContext(ExpressionStatementContext.class,i);
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
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(92);
				importStatement();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(98);
				decorator();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6339930702016L) != 0)) {
				{
				setState(107);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(104);
					classDeclaration();
					}
					break;
				case 2:
					{
					setState(105);
					constExportStatement();
					}
					break;
				case 3:
					{
					setState(106);
					expressionStatement();
					}
					break;
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
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
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
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
			setState(114);
			match(IMPORT);
			setState(115);
			match(LBRACE);
			setState(116);
			idList();
			setState(117);
			match(RBRACE);
			setState(118);
			match(FROM);
			setState(119);
			match(STRING_LITERAL);
			setState(120);
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
	public static class IdListContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ParserFile.ID); }
		public TerminalNode ID(int i) {
			return getToken(ParserFile.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserFile.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserFile.COMMA, i);
		}
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterIdList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitIdList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitIdList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(ID);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(123);
				match(COMMA);
				setState(124);
				match(ID);
				}
				}
				setState(129);
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
		enterRule(_localctx, 6, RULE_decorator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(AT);
			setState(131);
			match(ID);
			setState(132);
			match(LPAREN);
			setState(133);
			objectLiteral();
			setState(134);
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
		enterRule(_localctx, 8, RULE_objectLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(LBRACE);
			setState(137);
			objectField();
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(138);
				match(COMMA);
				setState(139);
				objectField();
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
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
		enterRule(_localctx, 10, RULE_objectField);
		int _la;
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEMPLATEE:
				_localctx = new TemplateFieldContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(TEMPLATEE);
				setState(148);
				match(COLON);
				setState(149);
				templateLiteral();
				}
				break;
			case STYLES:
				_localctx = new StylesFieldContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(STYLES);
				setState(151);
				match(COLON);
				setState(152);
				styleArray();
				}
				break;
			case ID:
				_localctx = new GenericFieldContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				match(ID);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(154);
					match(COLON);
					setState(155);
					expression(0);
					}
				}

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
		enterRule(_localctx, 12, RULE_styleArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(LSQUARE);
			setState(161);
			cssLiteral();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(162);
				match(COMMA);
				setState(163);
				cssLiteral();
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169);
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
	public static class SpreadFieldContext extends ParserRuleContext {
		public TerminalNode SPREAD() { return getToken(ParserFile.SPREAD, 0); }
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public ObjectFieldContext objectField() {
			return getRuleContext(ObjectFieldContext.class,0);
		}
		public SpreadFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spreadField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterSpreadField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitSpreadField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitSpreadField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpreadFieldContext spreadField() throws RecognitionException {
		SpreadFieldContext _localctx = new SpreadFieldContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_spreadField);
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SPREAD:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(SPREAD);
				setState(172);
				match(ID);
				}
				break;
			case TEMPLATEE:
			case STYLES:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				objectField();
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
	public static class SpreadObjectExprContext extends ExpressionContext {
		public TerminalNode LBRACE() { return getToken(ParserFile.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ParserFile.RBRACE, 0); }
		public List<ObjectFieldContext> objectField() {
			return getRuleContexts(ObjectFieldContext.class);
		}
		public ObjectFieldContext objectField(int i) {
			return getRuleContext(ObjectFieldContext.class,i);
		}
		public List<SpreadFieldContext> spreadField() {
			return getRuleContexts(SpreadFieldContext.class);
		}
		public SpreadFieldContext spreadField(int i) {
			return getRuleContext(SpreadFieldContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserFile.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserFile.COMMA, i);
		}
		public SpreadObjectExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterSpreadObjectExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitSpreadObjectExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitSpreadObjectExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAccessExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LSQUARE() { return getToken(ParserFile.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(ParserFile.RSQUARE, 0); }
		public ArrayAccessExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterArrayAccessExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitArrayAccessExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitArrayAccessExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(ParserFile.PLUS, 0); }
		public BinaryExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterBinaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitBinaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitBinaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThisCallExprContext extends ExpressionContext {
		public TerminalNode THIS() { return getToken(ParserFile.THIS, 0); }
		public TerminalNode DOT() { return getToken(ParserFile.DOT, 0); }
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public TerminalNode LPAREN() { return getToken(ParserFile.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ParserFile.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserFile.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserFile.COMMA, i);
		}
		public ThisCallExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterThisCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitThisCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitThisCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierExpr3Context extends ExpressionContext {
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public TerminalNode GT() { return getToken(ParserFile.GT, 0); }
		public TerminalNode MINUS() { return getToken(ParserFile.MINUS, 0); }
		public TerminalNode NUMBER() { return getToken(ParserFile.NUMBER, 0); }
		public IdentifierExpr3Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterIdentifierExpr3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitIdentifierExpr3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitIdentifierExpr3(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierExpr2Context extends ExpressionContext {
		public List<TerminalNode> ID() { return getTokens(ParserFile.ID); }
		public TerminalNode ID(int i) {
			return getToken(ParserFile.ID, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(ParserFile.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(ParserFile.ASSIGN, i);
		}
		public TerminalNode GT() { return getToken(ParserFile.GT, 0); }
		public TerminalNode DOT() { return getToken(ParserFile.DOT, 0); }
		public TerminalNode INTERJECTION() { return getToken(ParserFile.INTERJECTION, 0); }
		public IdentifierExpr2Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterIdentifierExpr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitIdentifierExpr2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitIdentifierExpr2(this);
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
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExprContext extends ExpressionContext {
		public TerminalNode PLUS() { return getToken(ParserFile.PLUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitUnaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PropertyAccessContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ParserFile.DOT, 0); }
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public PropertyAccessContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterPropertyAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitPropertyAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitPropertyAccess(this);
			else return visitor.visitChildren(this);
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
	public static class ObjectExprContext extends ExpressionContext {
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ObjectExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterObjectExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitObjectExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitObjectExpr(this);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RSQUARE() { return getTokens(ParserFile.RSQUARE); }
		public TerminalNode RSQUARE(int i) {
			return getToken(ParserFile.RSQUARE, i);
		}
		public List<TerminalNode> AS() { return getTokens(ParserFile.AS); }
		public TerminalNode AS(int i) {
			return getToken(ParserFile.AS, i);
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
	public static class ThisPropertyExprContext extends ExpressionContext {
		public TerminalNode THIS() { return getToken(ParserFile.THIS, 0); }
		public TerminalNode DOT() { return getToken(ParserFile.DOT, 0); }
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public ThisPropertyExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterThisPropertyExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitThisPropertyExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitThisPropertyExpr(this);
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
	public static class ParenthesizedExprContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(ParserFile.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ParserFile.RPAREN, 0); }
		public ParenthesizedExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterParenthesizedExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitParenthesizedExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitParenthesizedExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(ParserFile.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ParserFile.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ParserFile.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserFile.COMMA, i);
		}
		public CallExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThisExprContext extends ExpressionContext {
		public TerminalNode THIS() { return getToken(ParserFile.THIS, 0); }
		public TerminalNode SEMI() { return getToken(ParserFile.SEMI, 0); }
		public ThisExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterThisExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitThisExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitThisExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				_localctx = new ThisExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(177);
					match(SEMI);
					}
				}

				setState(180);
				match(THIS);
				}
				break;
			case 2:
				{
				_localctx = new ThisPropertyExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(181);
				match(THIS);
				setState(182);
				match(DOT);
				setState(183);
				match(ID);
				}
				break;
			case 3:
				{
				_localctx = new ThisCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(184);
				match(THIS);
				setState(185);
				match(DOT);
				setState(186);
				match(ID);
				setState(187);
				match(LPAREN);
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6339930701952L) != 0)) {
					{
					setState(188);
					expression(0);
					setState(193);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(189);
						match(COMMA);
						setState(190);
						expression(0);
						}
						}
						setState(195);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(198);
				match(RPAREN);
				}
				break;
			case 4:
				{
				_localctx = new IdentifierExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199);
				match(ID);
				setState(211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(209);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case DOT:
							{
							{
							setState(200);
							match(DOT);
							setState(201);
							match(ID);
							setState(203);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
							case 1:
								{
								setState(202);
								match(AS);
								}
								break;
							}
							}
							}
							break;
						case LSQUARE:
							{
							{
							setState(205);
							match(LSQUARE);
							setState(206);
							expression(0);
							setState(207);
							match(RSQUARE);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(213);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				}
				break;
			case 5:
				{
				_localctx = new IdentifierExpr2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(214);
				match(ID);
				setState(215);
				match(ASSIGN);
				setState(216);
				match(GT);
				setState(217);
				match(ID);
				setState(218);
				match(DOT);
				setState(219);
				match(ID);
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTERJECTION) {
					{
					setState(220);
					match(INTERJECTION);
					}
				}

				setState(224); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(223);
					match(ASSIGN);
					}
					}
					setState(226); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ASSIGN );
				setState(228);
				match(ID);
				}
				break;
			case 6:
				{
				_localctx = new IdentifierExpr3Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(229);
				match(ID);
				setState(230);
				match(GT);
				setState(231);
				match(MINUS);
				setState(232);
				match(NUMBER);
				}
				break;
			case 7:
				{
				_localctx = new LiteralExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(233);
				literal();
				}
				break;
			case 8:
				{
				_localctx = new TemplateExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(234);
				templateLiteral();
				}
				break;
			case 9:
				{
				_localctx = new CssExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(235);
				cssLiteral();
				}
				break;
			case 10:
				{
				_localctx = new ArrayExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(236);
				arrayLiteral();
				}
				break;
			case 11:
				{
				_localctx = new ObjectExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(237);
				objectLiteral();
				}
				break;
			case 12:
				{
				_localctx = new SpreadObjectExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(238);
				match(LBRACE);
				setState(259);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(239);
					objectField();
					setState(244);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(240);
							match(COMMA);
							setState(241);
							objectField();
							}
							} 
						}
						setState(246);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
					}
					setState(249);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(247);
						match(COMMA);
						setState(248);
						spreadField();
						}
					}

					}
					break;
				case 2:
					{
					setState(251);
					spreadField();
					setState(256);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(252);
						match(COMMA);
						setState(253);
						spreadField();
						}
						}
						setState(258);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(261);
				match(RBRACE);
				}
				break;
			case 13:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(262);
				match(PLUS);
				setState(263);
				expression(3);
				}
				break;
			case 14:
				{
				_localctx = new ParenthesizedExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(264);
				match(LPAREN);
				setState(265);
				expression(0);
				setState(266);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(296);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(294);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(270);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(271);
						match(PLUS);
						setState(272);
						expression(3);
						}
						break;
					case 2:
						{
						_localctx = new PropertyAccessContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(273);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(274);
						match(DOT);
						setState(275);
						match(ID);
						}
						break;
					case 3:
						{
						_localctx = new ArrayAccessExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(276);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(277);
						match(LSQUARE);
						setState(278);
						expression(0);
						setState(279);
						match(RSQUARE);
						}
						break;
					case 4:
						{
						_localctx = new CallExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(281);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(282);
						match(LPAREN);
						setState(291);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6339930701952L) != 0)) {
							{
							setState(283);
							expression(0);
							setState(288);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(284);
								match(COMMA);
								setState(285);
								expression(0);
								}
								}
								setState(290);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(293);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode TEMPLATE_START() { return getToken(ParserFile.TEMPLATE_START, 0); }
		public TerminalNode TEMPLATE_ID() { return getToken(ParserFile.TEMPLATE_ID, 0); }
		public TerminalNode TEMPLATE_SLASH() { return getToken(ParserFile.TEMPLATE_SLASH, 0); }
		public TerminalNode TEMPLATE_END() { return getToken(ParserFile.TEMPLATE_END, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ParserFile.STRING_LITERAL, 0); }
		public TerminalNode NUMBER() { return getToken(ParserFile.NUMBER, 0); }
		public TerminalNode TRUE() { return getToken(ParserFile.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ParserFile.FALSE, 0); }
		public TemplateLiteralContext templateLiteral() {
			return getRuleContext(TemplateLiteralContext.class,0);
		}
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
		enterRule(_localctx, 18, RULE_literal);
		try {
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				match(TEMPLATE_START);
				setState(300);
				match(TEMPLATE_ID);
				setState(301);
				match(TEMPLATE_SLASH);
				setState(302);
				match(TEMPLATE_END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				match(STRING_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(304);
				match(NUMBER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(305);
				match(TRUE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(306);
				match(FALSE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(307);
				templateLiteral();
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
		enterRule(_localctx, 20, RULE_templateLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(TEMPLATE_START);
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & 101711877L) != 0)) {
				{
				setState(311);
				htmlContent();
				}
			}

			setState(314);
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
		enterRule(_localctx, 22, RULE_cssLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(TEMPLATE_START);
			setState(317);
			cssContent();
			setState(318);
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
		enterRule(_localctx, 24, RULE_cssContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & 1116733441L) != 0)) {
				{
				{
				setState(320);
				cssStatement();
				}
				}
				setState(325);
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
		public List<TerminalNode> TEMPLATE_ID() { return getTokens(ParserFile.TEMPLATE_ID); }
		public TerminalNode TEMPLATE_ID(int i) {
			return getToken(ParserFile.TEMPLATE_ID, i);
		}
		public TerminalNode TEMPLATE_TEXT() { return getToken(ParserFile.TEMPLATE_TEXT, 0); }
		public TerminalNode TEMPLATE_TAG_BUTTON() { return getToken(ParserFile.TEMPLATE_TAG_BUTTON, 0); }
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
		enterRule(_localctx, 26, RULE_cssStatement);
		int _la;
		try {
			setState(350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_CLASSNAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				match(CSS_CLASSNAME);
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPLATE_TAG_IMG) {
					{
					setState(327);
					match(TEMPLATE_TAG_IMG);
					}
				}

				setState(330);
				match(CssLBRACE);
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TEMPLATE_ID) {
					{
					{
					setState(331);
					cssRule();
					}
					}
					setState(336);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(337);
				match(CssRBRACE);
				}
				break;
			case TEMPLATE_TAG_IMG:
			case TEMPLATE_TAG_BUTTON:
			case TEMPLATE_ID:
			case TEMPLATE_TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				_la = _input.LA(1);
				if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 1065L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPLATE_ID) {
					{
					setState(339);
					match(TEMPLATE_ID);
					}
				}

				setState(342);
				match(CssLBRACE);
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TEMPLATE_ID) {
					{
					{
					setState(343);
					cssRule();
					}
					}
					setState(348);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(349);
				match(CssRBRACE);
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
		enterRule(_localctx, 28, RULE_cssRule);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(TEMPLATE_ID);
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_COLON) {
				{
				setState(353);
				match(CSS_COLON);
				}
			}

			setState(357); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(356);
					_la = _input.LA(1);
					if ( !(((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & 67108881L) != 0)) ) {
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
				setState(359); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_COMMA) {
				{
				setState(361);
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
		enterRule(_localctx, 30, RULE_htmlContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(364);
				htmlChunk();
				}
				}
				setState(367); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & 101711877L) != 0) );
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
		enterRule(_localctx, 32, RULE_htmlChunk);
		try {
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				_localctx = new HtmlElementChunkContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				htmlElement();
				}
				break;
			case 2:
				_localctx = new HtmlSelfClosingChunkContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				selfClosingTag();
				}
				break;
			case 3:
				_localctx = new InterpolationChunkContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(371);
				interpolation();
				}
				break;
			case 4:
				_localctx = new HtmlCloseTagChunkContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(372);
				closeTag();
				}
				break;
			case 5:
				_localctx = new Html_IdContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(373);
				match(TEMPLATE_ID);
				}
				break;
			case 6:
				_localctx = new HtmlTextChunkContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(374);
				match(TEMPLATE_TEXT);
				}
				break;
			case 7:
				_localctx = new HtmlNewlineChunkContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(375);
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
		enterRule(_localctx, 34, RULE_interpolation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(INTERPOLATION_OPEN);
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 8185L) != 0)) {
				{
				setState(379);
				interpolationContent();
				}
			}

			setState(382);
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
		enterRule(_localctx, 36, RULE_interpolationContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(384);
				interpolationExpr();
				}
				}
				setState(387); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 8185L) != 0) );
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
		public TerminalNode INTERPOLATION_DOLLAR() { return getToken(ParserFile.INTERPOLATION_DOLLAR, 0); }
		public TerminalNode INTERPOLATION_LBRACE() { return getToken(ParserFile.INTERPOLATION_LBRACE, 0); }
		public InterpolationFullExprContext interpolationFullExpr() {
			return getRuleContext(InterpolationFullExprContext.class,0);
		}
		public TerminalNode INTERPOLATION_RPAREN() { return getToken(ParserFile.INTERPOLATION_RPAREN, 0); }
		public TerminalNode INTERPOLATION_ID() { return getToken(ParserFile.INTERPOLATION_ID, 0); }
		public TerminalNode INTERPOLATION_DOT() { return getToken(ParserFile.INTERPOLATION_DOT, 0); }
		public TerminalNode INTERPOLATION_LSQUARE() { return getToken(ParserFile.INTERPOLATION_LSQUARE, 0); }
		public TerminalNode INTERPOLATION_RSQUARE() { return getToken(ParserFile.INTERPOLATION_RSQUARE, 0); }
		public TerminalNode INTERPOLATION_STRING() { return getToken(ParserFile.INTERPOLATION_STRING, 0); }
		public TerminalNode INTERPOLATION_NUMBER() { return getToken(ParserFile.INTERPOLATION_NUMBER, 0); }
		public TerminalNode INTERPOLATION_LPAREN() { return getToken(ParserFile.INTERPOLATION_LPAREN, 0); }
		public TerminalNode INTERPOLATION_NTERROGATIVE() { return getToken(ParserFile.INTERPOLATION_NTERROGATIVE, 0); }
		public TerminalNode INTERPOLATION_COLON() { return getToken(ParserFile.INTERPOLATION_COLON, 0); }
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
		enterRule(_localctx, 38, RULE_interpolationExpr);
		try {
			setState(404);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTERPOLATION_DOLLAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				match(INTERPOLATION_DOLLAR);
				setState(390);
				match(INTERPOLATION_LBRACE);
				setState(391);
				interpolationFullExpr();
				setState(392);
				match(INTERPOLATION_RPAREN);
				}
				break;
			case INTERPOLATION_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
				match(INTERPOLATION_ID);
				}
				break;
			case INTERPOLATION_DOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(395);
				match(INTERPOLATION_DOT);
				}
				break;
			case INTERPOLATION_LSQUARE:
				enterOuterAlt(_localctx, 4);
				{
				setState(396);
				match(INTERPOLATION_LSQUARE);
				}
				break;
			case INTERPOLATION_RSQUARE:
				enterOuterAlt(_localctx, 5);
				{
				setState(397);
				match(INTERPOLATION_RSQUARE);
				}
				break;
			case INTERPOLATION_STRING:
				enterOuterAlt(_localctx, 6);
				{
				setState(398);
				match(INTERPOLATION_STRING);
				}
				break;
			case INTERPOLATION_NUMBER:
				enterOuterAlt(_localctx, 7);
				{
				setState(399);
				match(INTERPOLATION_NUMBER);
				}
				break;
			case INTERPOLATION_LPAREN:
				enterOuterAlt(_localctx, 8);
				{
				setState(400);
				match(INTERPOLATION_LPAREN);
				}
				break;
			case INTERPOLATION_RPAREN:
				enterOuterAlt(_localctx, 9);
				{
				setState(401);
				match(INTERPOLATION_RPAREN);
				}
				break;
			case INTERPOLATION_NTERROGATIVE:
				enterOuterAlt(_localctx, 10);
				{
				setState(402);
				match(INTERPOLATION_NTERROGATIVE);
				}
				break;
			case INTERPOLATION_COLON:
				enterOuterAlt(_localctx, 11);
				{
				setState(403);
				match(INTERPOLATION_COLON);
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
	public static class InterpolationFullExprContext extends ParserRuleContext {
		public List<TerminalNode> INTERPOLATION_ID() { return getTokens(ParserFile.INTERPOLATION_ID); }
		public TerminalNode INTERPOLATION_ID(int i) {
			return getToken(ParserFile.INTERPOLATION_ID, i);
		}
		public List<TerminalNode> INTERPOLATION_DOT() { return getTokens(ParserFile.INTERPOLATION_DOT); }
		public TerminalNode INTERPOLATION_DOT(int i) {
			return getToken(ParserFile.INTERPOLATION_DOT, i);
		}
		public InterpolationFullExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolationFullExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterInterpolationFullExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitInterpolationFullExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitInterpolationFullExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterpolationFullExprContext interpolationFullExpr() throws RecognitionException {
		InterpolationFullExprContext _localctx = new InterpolationFullExprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_interpolationFullExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(INTERPOLATION_ID);
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTERPOLATION_DOT) {
				{
				{
				setState(407);
				match(INTERPOLATION_DOT);
				setState(408);
				match(INTERPOLATION_ID);
				}
				}
				setState(413);
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
		enterRule(_localctx, 42, RULE_htmlElement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(TEMPLATE_LT);
			setState(415);
			htmlTag();
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 223L) != 0)) {
				{
				setState(419);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TEMPLATE_ID:
				case ANGULAR_PROPERTY_BINDING:
				case ANGULAR_EVENT_BINDING:
				case ANGULAR_TWO_WAY_BINDING:
				case ANGULAR_STRUCTURAL_DIRECTIVE:
					{
					setState(416);
					htmlAttribute();
					}
					break;
				case TEMPLATE_WS:
					{
					setState(417);
					match(TEMPLATE_WS);
					}
					break;
				case TEMPLATE_NEWLINE:
					{
					setState(418);
					match(TEMPLATE_NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(424);
			match(TEMPLATE_GT);
			setState(428);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(425);
					htmlChunk();
					}
					} 
				}
				setState(430);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			setState(431);
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
		enterRule(_localctx, 44, RULE_selfClosingTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(TEMPLATE_LT);
			setState(434);
			htmlTag();
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 223L) != 0)) {
				{
				setState(438);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TEMPLATE_ID:
				case ANGULAR_PROPERTY_BINDING:
				case ANGULAR_EVENT_BINDING:
				case ANGULAR_TWO_WAY_BINDING:
				case ANGULAR_STRUCTURAL_DIRECTIVE:
					{
					setState(435);
					htmlAttribute();
					}
					break;
				case TEMPLATE_WS:
					{
					setState(436);
					match(TEMPLATE_WS);
					}
					break;
				case TEMPLATE_NEWLINE:
					{
					setState(437);
					match(TEMPLATE_NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(443);
			match(TEMPLATE_SLASH);
			setState(444);
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
		enterRule(_localctx, 46, RULE_closeTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(TEMPLATE_LT);
			setState(447);
			match(TEMPLATE_SLASH);
			setState(448);
			htmlTag();
			setState(449);
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
		enterRule(_localctx, 48, RULE_htmlTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			_la = _input.LA(1);
			if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & 8191L) != 0)) ) {
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
		public TerminalNode TEMPLATE_ID() { return getToken(ParserFile.TEMPLATE_ID, 0); }
		public TerminalNode ANGULAR_PROPERTY_BINDING() { return getToken(ParserFile.ANGULAR_PROPERTY_BINDING, 0); }
		public TerminalNode ANGULAR_EVENT_BINDING() { return getToken(ParserFile.ANGULAR_EVENT_BINDING, 0); }
		public TerminalNode ANGULAR_TWO_WAY_BINDING() { return getToken(ParserFile.ANGULAR_TWO_WAY_BINDING, 0); }
		public TerminalNode ANGULAR_STRUCTURAL_DIRECTIVE() { return getToken(ParserFile.ANGULAR_STRUCTURAL_DIRECTIVE, 0); }
		public TerminalNode TEMPLATE_EQUALS() { return getToken(ParserFile.TEMPLATE_EQUALS, 0); }
		public AttributeValueContext attributeValue() {
			return getRuleContext(AttributeValueContext.class,0);
		}
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
		enterRule(_localctx, 50, RULE_htmlAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			_la = _input.LA(1);
			if ( !(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 31L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMPLATE_EQUALS) {
				{
				setState(454);
				match(TEMPLATE_EQUALS);
				setState(455);
				attributeValue();
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
		enterRule(_localctx, 52, RULE_attributeValue);
		try {
			setState(461);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEMPLATE_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				match(TEMPLATE_STRING);
				}
				break;
			case TEMPLATE_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(459);
				match(TEMPLATE_ID);
				}
				break;
			case INTERPOLATION_OPEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(460);
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
		public List<TerminalNode> ID() { return getTokens(ParserFile.ID); }
		public TerminalNode ID(int i) {
			return getToken(ParserFile.ID, i);
		}
		public TerminalNode LBRACE() { return getToken(ParserFile.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ParserFile.RBRACE, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(ParserFile.IMPLEMENTS, 0); }
		public List<ClassMemberContext> classMember() {
			return getRuleContexts(ClassMemberContext.class);
		}
		public ClassMemberContext classMember(int i) {
			return getRuleContext(ClassMemberContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserFile.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserFile.COMMA, i);
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
		enterRule(_localctx, 54, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(EXPORT);
			setState(464);
			match(CLASS);
			setState(465);
			match(ID);
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(466);
				match(IMPLEMENTS);
				setState(467);
				match(ID);
				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(468);
					match(COMMA);
					setState(469);
					match(ID);
					}
					}
					setState(474);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(477);
			match(LBRACE);
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PRIVATE || _la==ID) {
				{
				{
				setState(478);
				classMember();
				}
				}
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(484);
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
		enterRule(_localctx, 56, RULE_classMember);
		try {
			setState(488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(486);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(487);
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
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ParserFile.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ParserFile.SEMI, 0); }
		public TerminalNode PRIVATE() { return getToken(ParserFile.PRIVATE, 0); }
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
		enterRule(_localctx, 58, RULE_variableDeclaration);
		int _la;
		try {
			setState(516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PRIVATE) {
					{
					setState(490);
					match(PRIVATE);
					}
				}

				setState(493);
				match(ID);
				setState(494);
				match(COLON);
				setState(495);
				type();
				setState(496);
				match(ASSIGN);
				setState(497);
				expression(0);
				setState(498);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PRIVATE) {
					{
					setState(500);
					match(PRIVATE);
					}
				}

				setState(503);
				match(ID);
				setState(504);
				match(COLON);
				setState(505);
				type();
				setState(506);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PRIVATE) {
					{
					setState(508);
					match(PRIVATE);
					}
				}

				setState(511);
				match(ID);
				setState(512);
				match(ASSIGN);
				setState(513);
				expression(0);
				setState(514);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public TerminalNode ANY() { return getToken(ParserFile.ANY, 0); }
		public TerminalNode VOID() { return getToken(ParserFile.VOID, 0); }
		public List<TerminalNode> LSQUARE() { return getTokens(ParserFile.LSQUARE); }
		public TerminalNode LSQUARE(int i) {
			return getToken(ParserFile.LSQUARE, i);
		}
		public List<TerminalNode> RSQUARE() { return getTokens(ParserFile.RSQUARE); }
		public TerminalNode RSQUARE(int i) {
			return getToken(ParserFile.RSQUARE, i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1305670057984L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LSQUARE) {
				{
				{
				setState(519);
				match(LSQUARE);
				setState(520);
				match(RSQUARE);
				}
				}
				setState(525);
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
	public static class ArrayLiteralContext extends ParserRuleContext {
		public TerminalNode LSQUARE() { return getToken(ParserFile.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(ParserFile.RSQUARE, 0); }
		public List<ArrayElementContext> arrayElement() {
			return getRuleContexts(ArrayElementContext.class);
		}
		public ArrayElementContext arrayElement(int i) {
			return getRuleContext(ArrayElementContext.class,i);
		}
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
		enterRule(_localctx, 62, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(LSQUARE);
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6339930701952L) != 0)) {
				{
				setState(527);
				arrayElement();
				setState(532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(528);
					match(COMMA);
					setState(529);
					arrayElement();
					}
					}
					setState(534);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(537);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 64, RULE_arrayElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			expression(0);
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
		enterRule(_localctx, 66, RULE_objectFieldInArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(ID);
			setState(543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(542);
				match(COLON);
				}
			}

			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5222680248448L) != 0)) {
				{
				setState(545);
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
		public List<TerminalNode> ID() { return getTokens(ParserFile.ID); }
		public TerminalNode ID(int i) {
			return getToken(ParserFile.ID, i);
		}
		public TerminalNode LPAREN() { return getToken(ParserFile.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ParserFile.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode ANY() { return getToken(ParserFile.ANY, 0); }
		public TerminalNode VOID() { return getToken(ParserFile.VOID, 0); }
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
		enterRule(_localctx, 68, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			match(ID);
			setState(549);
			match(LPAREN);
			setState(551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIVATE || _la==ID) {
				{
				setState(550);
				parameterList();
				}
			}

			setState(553);
			match(RPAREN);
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(554);
				match(COLON);
				setState(555);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1305670057984L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(558);
			block();
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
		enterRule(_localctx, 70, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			parameter();
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(561);
				match(COMMA);
				setState(562);
				parameter();
				}
				}
				setState(567);
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
		public TerminalNode ANY() { return getToken(ParserFile.ANY, 0); }
		public TerminalNode PRIVATE() { return getToken(ParserFile.PRIVATE, 0); }
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
		enterRule(_localctx, 72, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIVATE) {
				{
				setState(568);
				match(PRIVATE);
				}
			}

			setState(571);
			match(ID);
			setState(572);
			match(COLON);
			setState(573);
			_la = _input.LA(1);
			if ( !(_la==ANY || _la==ID) ) {
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
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ParserFile.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ParserFile.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			match(LBRACE);
			setState(579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6344225680512L) != 0)) {
				{
				{
				setState(576);
				statement();
				}
				}
				setState(581);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(582);
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
	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public MethodCallStatementContext methodCallStatement() {
			return getRuleContext(MethodCallStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_statement);
		try {
			setState(593);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(584);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(585);
				assignmentStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(586);
				methodCallStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(587);
				returnStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(588);
				ifStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(589);
				constDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(590);
				expressionStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(591);
				variableDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(592);
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
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ParserFile.SEMI, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			expression(0);
			setState(596);
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
	public static class AssignmentStatementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(ParserFile.ASSIGN, 0); }
		public TerminalNode SEMI() { return getToken(ParserFile.SEMI, 0); }
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			expression(0);
			setState(599);
			match(ASSIGN);
			setState(600);
			expression(0);
			setState(601);
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
	public static class MethodCallStatementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DOT() { return getToken(ParserFile.DOT, 0); }
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public TerminalNode LPAREN() { return getToken(ParserFile.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ParserFile.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(ParserFile.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ParserFile.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserFile.COMMA, i);
		}
		public MethodCallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCallStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterMethodCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitMethodCallStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitMethodCallStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallStatementContext methodCallStatement() throws RecognitionException {
		MethodCallStatementContext _localctx = new MethodCallStatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_methodCallStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			expression(0);
			setState(604);
			match(DOT);
			setState(605);
			match(ID);
			setState(606);
			match(LPAREN);
			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6339930701952L) != 0)) {
				{
				setState(607);
				expression(0);
				setState(612);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(608);
					match(COMMA);
					setState(609);
					expression(0);
					}
					}
					setState(614);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(617);
			match(RPAREN);
			setState(618);
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
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(ParserFile.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(ParserFile.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			match(RETURN);
			setState(622);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(621);
				expression(0);
				}
				break;
			}
			setState(624);
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
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ParserFile.IF, 0); }
		public TerminalNode LPAREN() { return getToken(ParserFile.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ParserFile.RPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ParserFile.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			match(IF);
			setState(627);
			match(LPAREN);
			setState(628);
			expression(0);
			setState(629);
			match(RPAREN);
			setState(630);
			statement();
			setState(633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(631);
				match(ELSE);
				setState(632);
				statement();
				}
				break;
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
	public static class ConstDeclarationContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(ParserFile.CONST, 0); }
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(ParserFile.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ParserFile.SEMI, 0); }
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterConstDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitConstDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitConstDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_constDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			match(CONST);
			setState(636);
			match(ID);
			setState(637);
			match(ASSIGN);
			setState(638);
			expression(0);
			setState(640);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(639);
				match(SEMI);
				}
				break;
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
	public static class ConstExportStatementContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(ParserFile.EXPORT, 0); }
		public TerminalNode CONST() { return getToken(ParserFile.CONST, 0); }
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ParserFile.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ParserFile.SEMI, 0); }
		public ConstExportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constExportStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterConstExportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitConstExportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitConstExportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstExportStatementContext constExportStatement() throws RecognitionException {
		ConstExportStatementContext _localctx = new ConstExportStatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_constExportStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			match(EXPORT);
			setState(643);
			match(CONST);
			setState(644);
			match(ID);
			setState(645);
			match(COLON);
			setState(646);
			type();
			setState(647);
			match(ASSIGN);
			setState(648);
			expression(0);
			setState(649);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001]\u028c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0001\u0000\u0005\u0000^\b\u0000\n\u0000\f\u0000a\t\u0000\u0001"+
		"\u0000\u0005\u0000d\b\u0000\n\u0000\f\u0000g\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0005\u0000l\b\u0000\n\u0000\f\u0000o\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002~\b\u0002\n\u0002\f\u0002\u0081\t\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u008d\b\u0004\n\u0004"+
		"\f\u0004\u0090\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u009d\b\u0005\u0003\u0005\u009f\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00a5\b\u0006\n"+
		"\u0006\f\u0006\u00a8\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u00af\b\u0007\u0001\b\u0001\b\u0003\b\u00b3"+
		"\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\b\u00c0\b\b\n\b\f\b\u00c3\t\b\u0003\b\u00c5\b"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00cc\b\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\b\u00d2\b\b\n\b\f\b\u00d5\t\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00de\b\b\u0001\b\u0004"+
		"\b\u00e1\b\b\u000b\b\f\b\u00e2\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0005\b\u00f3\b\b\n\b\f\b\u00f6\t\b\u0001\b\u0001\b\u0003\b\u00fa\b"+
		"\b\u0001\b\u0001\b\u0001\b\u0005\b\u00ff\b\b\n\b\f\b\u0102\t\b\u0003\b"+
		"\u0104\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u010d\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005"+
		"\b\u011f\b\b\n\b\f\b\u0122\t\b\u0003\b\u0124\b\b\u0001\b\u0005\b\u0127"+
		"\b\b\n\b\f\b\u012a\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0003\t\u0135\b\t\u0001\n\u0001\n\u0003\n\u0139"+
		"\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0005\f\u0142\b\f\n\f\f\f\u0145\t\f\u0001\r\u0001\r\u0003\r\u0149\b"+
		"\r\u0001\r\u0001\r\u0005\r\u014d\b\r\n\r\f\r\u0150\t\r\u0001\r\u0001\r"+
		"\u0001\r\u0003\r\u0155\b\r\u0001\r\u0001\r\u0005\r\u0159\b\r\n\r\f\r\u015c"+
		"\t\r\u0001\r\u0003\r\u015f\b\r\u0001\u000e\u0001\u000e\u0003\u000e\u0163"+
		"\b\u000e\u0001\u000e\u0004\u000e\u0166\b\u000e\u000b\u000e\f\u000e\u0167"+
		"\u0001\u000e\u0003\u000e\u016b\b\u000e\u0001\u000f\u0004\u000f\u016e\b"+
		"\u000f\u000b\u000f\f\u000f\u016f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0179\b\u0010\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u017d\b\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0004\u0012\u0182\b\u0012\u000b\u0012\f\u0012\u0183\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u0195\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0005\u0014\u019a\b\u0014\n\u0014\f\u0014\u019d\t\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u01a4"+
		"\b\u0015\n\u0015\f\u0015\u01a7\t\u0015\u0001\u0015\u0001\u0015\u0005\u0015"+
		"\u01ab\b\u0015\n\u0015\f\u0015\u01ae\t\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u01b7"+
		"\b\u0016\n\u0016\f\u0016\u01ba\t\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u01c9\b\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01ce\b\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0005\u001b\u01d7\b\u001b\n\u001b\f\u001b\u01da\t\u001b\u0003\u001b\u01dc"+
		"\b\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u01e0\b\u001b\n\u001b\f\u001b"+
		"\u01e3\t\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u01e9\b\u001c\u0001\u001d\u0003\u001d\u01ec\b\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u01f6\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u01fe\b\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0205\b\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u020a\b\u001e\n\u001e\f\u001e"+
		"\u020d\t\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f"+
		"\u0213\b\u001f\n\u001f\f\u001f\u0216\t\u001f\u0003\u001f\u0218\b\u001f"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0003!\u0220\b!\u0001"+
		"!\u0003!\u0223\b!\u0001\"\u0001\"\u0001\"\u0003\"\u0228\b\"\u0001\"\u0001"+
		"\"\u0001\"\u0003\"\u022d\b\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0005"+
		"#\u0234\b#\n#\f#\u0237\t#\u0001$\u0003$\u023a\b$\u0001$\u0001$\u0001$"+
		"\u0001$\u0001%\u0001%\u0005%\u0242\b%\n%\f%\u0245\t%\u0001%\u0001%\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u0252"+
		"\b&\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001)"+
		"\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0005)\u0263\b)\n)\f)\u0266"+
		"\t)\u0003)\u0268\b)\u0001)\u0001)\u0001)\u0001*\u0001*\u0003*\u026f\b"+
		"*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003"+
		"+\u027a\b+\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u0281\b,\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0000\u0001"+
		"\u0010.\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\u0000\u0006\u0004\u0000"+
		"BBEEGGLL\u0003\u0000--11GG\u0001\u0000;G\u0001\u0000GK\u0002\u0000$%("+
		"(\u0002\u0000%%((\u02d6\u0000_\u0001\u0000\u0000\u0000\u0002r\u0001\u0000"+
		"\u0000\u0000\u0004z\u0001\u0000\u0000\u0000\u0006\u0082\u0001\u0000\u0000"+
		"\u0000\b\u0088\u0001\u0000\u0000\u0000\n\u009e\u0001\u0000\u0000\u0000"+
		"\f\u00a0\u0001\u0000\u0000\u0000\u000e\u00ae\u0001\u0000\u0000\u0000\u0010"+
		"\u010c\u0001\u0000\u0000\u0000\u0012\u0134\u0001\u0000\u0000\u0000\u0014"+
		"\u0136\u0001\u0000\u0000\u0000\u0016\u013c\u0001\u0000\u0000\u0000\u0018"+
		"\u0143\u0001\u0000\u0000\u0000\u001a\u015e\u0001\u0000\u0000\u0000\u001c"+
		"\u0160\u0001\u0000\u0000\u0000\u001e\u016d\u0001\u0000\u0000\u0000 \u0178"+
		"\u0001\u0000\u0000\u0000\"\u017a\u0001\u0000\u0000\u0000$\u0181\u0001"+
		"\u0000\u0000\u0000&\u0194\u0001\u0000\u0000\u0000(\u0196\u0001\u0000\u0000"+
		"\u0000*\u019e\u0001\u0000\u0000\u0000,\u01b1\u0001\u0000\u0000\u0000."+
		"\u01be\u0001\u0000\u0000\u00000\u01c3\u0001\u0000\u0000\u00002\u01c5\u0001"+
		"\u0000\u0000\u00004\u01cd\u0001\u0000\u0000\u00006\u01cf\u0001\u0000\u0000"+
		"\u00008\u01e8\u0001\u0000\u0000\u0000:\u0204\u0001\u0000\u0000\u0000<"+
		"\u0206\u0001\u0000\u0000\u0000>\u020e\u0001\u0000\u0000\u0000@\u021b\u0001"+
		"\u0000\u0000\u0000B\u021d\u0001\u0000\u0000\u0000D\u0224\u0001\u0000\u0000"+
		"\u0000F\u0230\u0001\u0000\u0000\u0000H\u0239\u0001\u0000\u0000\u0000J"+
		"\u023f\u0001\u0000\u0000\u0000L\u0251\u0001\u0000\u0000\u0000N\u0253\u0001"+
		"\u0000\u0000\u0000P\u0256\u0001\u0000\u0000\u0000R\u025b\u0001\u0000\u0000"+
		"\u0000T\u026c\u0001\u0000\u0000\u0000V\u0272\u0001\u0000\u0000\u0000X"+
		"\u027b\u0001\u0000\u0000\u0000Z\u0282\u0001\u0000\u0000\u0000\\^\u0003"+
		"\u0002\u0001\u0000]\\\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000"+
		"_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`e\u0001\u0000\u0000"+
		"\u0000a_\u0001\u0000\u0000\u0000bd\u0003\u0006\u0003\u0000cb\u0001\u0000"+
		"\u0000\u0000dg\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001"+
		"\u0000\u0000\u0000fm\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000"+
		"hl\u00036\u001b\u0000il\u0003Z-\u0000jl\u0003N\'\u0000kh\u0001\u0000\u0000"+
		"\u0000ki\u0001\u0000\u0000\u0000kj\u0001\u0000\u0000\u0000lo\u0001\u0000"+
		"\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000np\u0001"+
		"\u0000\u0000\u0000om\u0001\u0000\u0000\u0000pq\u0005\u0000\u0000\u0001"+
		"q\u0001\u0001\u0000\u0000\u0000rs\u0005\u0003\u0000\u0000st\u0005\u0016"+
		"\u0000\u0000tu\u0003\u0004\u0002\u0000uv\u0005\u0017\u0000\u0000vw\u0005"+
		"\u0004\u0000\u0000wx\u0005&\u0000\u0000xy\u0005\u0010\u0000\u0000y\u0003"+
		"\u0001\u0000\u0000\u0000z\u007f\u0005(\u0000\u0000{|\u0005\u0011\u0000"+
		"\u0000|~\u0005(\u0000\u0000}{\u0001\u0000\u0000\u0000~\u0081\u0001\u0000"+
		"\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000"+
		"\u0000\u0080\u0005\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0005\u0001\u0000\u0000\u0083\u0084\u0005(\u0000\u0000"+
		"\u0084\u0085\u0005\u0014\u0000\u0000\u0085\u0086\u0003\b\u0004\u0000\u0086"+
		"\u0087\u0005\u0015\u0000\u0000\u0087\u0007\u0001\u0000\u0000\u0000\u0088"+
		"\u0089\u0005\u0016\u0000\u0000\u0089\u008e\u0003\n\u0005\u0000\u008a\u008b"+
		"\u0005\u0011\u0000\u0000\u008b\u008d\u0003\n\u0005\u0000\u008c\u008a\u0001"+
		"\u0000\u0000\u0000\u008d\u0090\u0001\u0000\u0000\u0000\u008e\u008c\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0091\u0001"+
		"\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091\u0092\u0005"+
		"\u0017\u0000\u0000\u0092\t\u0001\u0000\u0000\u0000\u0093\u0094\u0005\b"+
		"\u0000\u0000\u0094\u0095\u0005\u000f\u0000\u0000\u0095\u009f\u0003\u0014"+
		"\n\u0000\u0096\u0097\u0005\t\u0000\u0000\u0097\u0098\u0005\u000f\u0000"+
		"\u0000\u0098\u009f\u0003\f\u0006\u0000\u0099\u009c\u0005(\u0000\u0000"+
		"\u009a\u009b\u0005\u000f\u0000\u0000\u009b\u009d\u0003\u0010\b\u0000\u009c"+
		"\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d"+
		"\u009f\u0001\u0000\u0000\u0000\u009e\u0093\u0001\u0000\u0000\u0000\u009e"+
		"\u0096\u0001\u0000\u0000\u0000\u009e\u0099\u0001\u0000\u0000\u0000\u009f"+
		"\u000b\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\u0018\u0000\u0000\u00a1"+
		"\u00a6\u0003\u0016\u000b\u0000\u00a2\u00a3\u0005\u0011\u0000\u0000\u00a3"+
		"\u00a5\u0003\u0016\u000b\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a8\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a9\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005\u0019\u0000\u0000\u00aa"+
		"\r\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005!\u0000\u0000\u00ac\u00af"+
		"\u0005(\u0000\u0000\u00ad\u00af\u0003\n\u0005\u0000\u00ae\u00ab\u0001"+
		"\u0000\u0000\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00af\u000f\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b2\u0006\b\uffff\uffff\u0000\u00b1\u00b3\u0005"+
		"\u0010\u0000\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u010d\u0005"+
		"\"\u0000\u0000\u00b5\u00b6\u0005\"\u0000\u0000\u00b6\u00b7\u0005\u0012"+
		"\u0000\u0000\u00b7\u010d\u0005(\u0000\u0000\u00b8\u00b9\u0005\"\u0000"+
		"\u0000\u00b9\u00ba\u0005\u0012\u0000\u0000\u00ba\u00bb\u0005(\u0000\u0000"+
		"\u00bb\u00c4\u0005\u0014\u0000\u0000\u00bc\u00c1\u0003\u0010\b\u0000\u00bd"+
		"\u00be\u0005\u0011\u0000\u0000\u00be\u00c0\u0003\u0010\b\u0000\u00bf\u00bd"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c3\u0001\u0000\u0000\u0000\u00c1\u00bf"+
		"\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4\u00bc"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c6\u010d\u0005\u0015\u0000\u0000\u00c7\u00d3"+
		"\u0005(\u0000\u0000\u00c8\u00c9\u0005\u0012\u0000\u0000\u00c9\u00cb\u0005"+
		"(\u0000\u0000\u00ca\u00cc\u0005\u0002\u0000\u0000\u00cb\u00ca\u0001\u0000"+
		"\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00d2\u0001\u0000"+
		"\u0000\u0000\u00cd\u00ce\u0005\u0018\u0000\u0000\u00ce\u00cf\u0003\u0010"+
		"\b\u0000\u00cf\u00d0\u0005\u0019\u0000\u0000\u00d0\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d1\u00c8\u0001\u0000\u0000\u0000\u00d1\u00cd\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d5\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u010d\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005(\u0000\u0000"+
		"\u00d7\u00d8\u0005\u0013\u0000\u0000\u00d8\u00d9\u0005\u001b\u0000\u0000"+
		"\u00d9\u00da\u0005(\u0000\u0000\u00da\u00db\u0005\u0012\u0000\u0000\u00db"+
		"\u00dd\u0005(\u0000\u0000\u00dc\u00de\u0005\u001e\u0000\u0000\u00dd\u00dc"+
		"\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00e0"+
		"\u0001\u0000\u0000\u0000\u00df\u00e1\u0005\u0013\u0000\u0000\u00e0\u00df"+
		"\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e0"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e4\u010d\u0005(\u0000\u0000\u00e5\u00e6\u0005"+
		"(\u0000\u0000\u00e6\u00e7\u0005\u001b\u0000\u0000\u00e7\u00e8\u0005\u001f"+
		"\u0000\u0000\u00e8\u010d\u0005\'\u0000\u0000\u00e9\u010d\u0003\u0012\t"+
		"\u0000\u00ea\u010d\u0003\u0014\n\u0000\u00eb\u010d\u0003\u0016\u000b\u0000"+
		"\u00ec\u010d\u0003>\u001f\u0000\u00ed\u010d\u0003\b\u0004\u0000\u00ee"+
		"\u0103\u0005\u0016\u0000\u0000\u00ef\u00f4\u0003\n\u0005\u0000\u00f0\u00f1"+
		"\u0005\u0011\u0000\u0000\u00f1\u00f3\u0003\n\u0005\u0000\u00f2\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f6\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f9\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005"+
		"\u0011\u0000\u0000\u00f8\u00fa\u0003\u000e\u0007\u0000\u00f9\u00f7\u0001"+
		"\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u0104\u0001"+
		"\u0000\u0000\u0000\u00fb\u0100\u0003\u000e\u0007\u0000\u00fc\u00fd\u0005"+
		"\u0011\u0000\u0000\u00fd\u00ff\u0003\u000e\u0007\u0000\u00fe\u00fc\u0001"+
		"\u0000\u0000\u0000\u00ff\u0102\u0001\u0000\u0000\u0000\u0100\u00fe\u0001"+
		"\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0104\u0001"+
		"\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0103\u00ef\u0001"+
		"\u0000\u0000\u0000\u0103\u00fb\u0001\u0000\u0000\u0000\u0103\u0104\u0001"+
		"\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u010d\u0005"+
		"\u0017\u0000\u0000\u0106\u0107\u0005\u001d\u0000\u0000\u0107\u010d\u0003"+
		"\u0010\b\u0003\u0108\u0109\u0005\u0014\u0000\u0000\u0109\u010a\u0003\u0010"+
		"\b\u0000\u010a\u010b\u0005\u0015\u0000\u0000\u010b\u010d\u0001\u0000\u0000"+
		"\u0000\u010c\u00b0\u0001\u0000\u0000\u0000\u010c\u00b5\u0001\u0000\u0000"+
		"\u0000\u010c\u00b8\u0001\u0000\u0000\u0000\u010c\u00c7\u0001\u0000\u0000"+
		"\u0000\u010c\u00d6\u0001\u0000\u0000\u0000\u010c\u00e5\u0001\u0000\u0000"+
		"\u0000\u010c\u00e9\u0001\u0000\u0000\u0000\u010c\u00ea\u0001\u0000\u0000"+
		"\u0000\u010c\u00eb\u0001\u0000\u0000\u0000\u010c\u00ec\u0001\u0000\u0000"+
		"\u0000\u010c\u00ed\u0001\u0000\u0000\u0000\u010c\u00ee\u0001\u0000\u0000"+
		"\u0000\u010c\u0106\u0001\u0000\u0000\u0000\u010c\u0108\u0001\u0000\u0000"+
		"\u0000\u010d\u0128\u0001\u0000\u0000\u0000\u010e\u010f\n\u0002\u0000\u0000"+
		"\u010f\u0110\u0005\u001d\u0000\u0000\u0110\u0127\u0003\u0010\b\u0003\u0111"+
		"\u0112\n\u0006\u0000\u0000\u0112\u0113\u0005\u0012\u0000\u0000\u0113\u0127"+
		"\u0005(\u0000\u0000\u0114\u0115\n\u0005\u0000\u0000\u0115\u0116\u0005"+
		"\u0018\u0000\u0000\u0116\u0117\u0003\u0010\b\u0000\u0117\u0118\u0005\u0019"+
		"\u0000\u0000\u0118\u0127\u0001\u0000\u0000\u0000\u0119\u011a\n\u0004\u0000"+
		"\u0000\u011a\u0123\u0005\u0014\u0000\u0000\u011b\u0120\u0003\u0010\b\u0000"+
		"\u011c\u011d\u0005\u0011\u0000\u0000\u011d\u011f\u0003\u0010\b\u0000\u011e"+
		"\u011c\u0001\u0000\u0000\u0000\u011f\u0122\u0001\u0000\u0000\u0000\u0120"+
		"\u011e\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121"+
		"\u0124\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0123"+
		"\u011b\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124"+
		"\u0125\u0001\u0000\u0000\u0000\u0125\u0127\u0005\u0015\u0000\u0000\u0126"+
		"\u010e\u0001\u0000\u0000\u0000\u0126\u0111\u0001\u0000\u0000\u0000\u0126"+
		"\u0114\u0001\u0000\u0000\u0000\u0126\u0119\u0001\u0000\u0000\u0000\u0127"+
		"\u012a\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000\u0000\u0000\u0128"+
		"\u0129\u0001\u0000\u0000\u0000\u0129\u0011\u0001\u0000\u0000\u0000\u012a"+
		"\u0128\u0001\u0000\u0000\u0000\u012b\u012c\u0005*\u0000\u0000\u012c\u012d"+
		"\u0005G\u0000\u0000\u012d\u012e\u00057\u0000\u0000\u012e\u0135\u00054"+
		"\u0000\u0000\u012f\u0135\u0005&\u0000\u0000\u0130\u0135\u0005\'\u0000"+
		"\u0000\u0131\u0135\u0005\u0007\u0000\u0000\u0132\u0135\u0005\u000e\u0000"+
		"\u0000\u0133\u0135\u0003\u0014\n\u0000\u0134\u012b\u0001\u0000\u0000\u0000"+
		"\u0134\u012f\u0001\u0000\u0000\u0000\u0134\u0130\u0001\u0000\u0000\u0000"+
		"\u0134\u0131\u0001\u0000\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000"+
		"\u0134\u0133\u0001\u0000\u0000\u0000\u0135\u0013\u0001\u0000\u0000\u0000"+
		"\u0136\u0138\u0005*\u0000\u0000\u0137\u0139\u0003\u001e\u000f\u0000\u0138"+
		"\u0137\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139"+
		"\u013a\u0001\u0000\u0000\u0000\u013a\u013b\u00054\u0000\u0000\u013b\u0015"+
		"\u0001\u0000\u0000\u0000\u013c\u013d\u0005*\u0000\u0000\u013d\u013e\u0003"+
		"\u0018\f\u0000\u013e\u013f\u00054\u0000\u0000\u013f\u0017\u0001\u0000"+
		"\u0000\u0000\u0140\u0142\u0003\u001a\r\u0000\u0141\u0140\u0001\u0000\u0000"+
		"\u0000\u0142\u0145\u0001\u0000\u0000\u0000\u0143\u0141\u0001\u0000\u0000"+
		"\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u0019\u0001\u0000\u0000"+
		"\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0146\u0148\u0005.\u0000\u0000"+
		"\u0147\u0149\u0005B\u0000\u0000\u0148\u0147\u0001\u0000\u0000\u0000\u0148"+
		"\u0149\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a"+
		"\u014e\u0005/\u0000\u0000\u014b\u014d\u0003\u001c\u000e\u0000\u014c\u014b"+
		"\u0001\u0000\u0000\u0000\u014d\u0150\u0001\u0000\u0000\u0000\u014e\u014c"+
		"\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u0151"+
		"\u0001\u0000\u0000\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0151\u015f"+
		"\u00050\u0000\u0000\u0152\u0154\u0007\u0000\u0000\u0000\u0153\u0155\u0005"+
		"G\u0000\u0000\u0154\u0153\u0001\u0000\u0000\u0000\u0154\u0155\u0001\u0000"+
		"\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u015a\u0005/\u0000"+
		"\u0000\u0157\u0159\u0003\u001c\u000e\u0000\u0158\u0157\u0001\u0000\u0000"+
		"\u0000\u0159\u015c\u0001\u0000\u0000\u0000\u015a\u0158\u0001\u0000\u0000"+
		"\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b\u015d\u0001\u0000\u0000"+
		"\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015d\u015f\u00050\u0000\u0000"+
		"\u015e\u0146\u0001\u0000\u0000\u0000\u015e\u0152\u0001\u0000\u0000\u0000"+
		"\u015f\u001b\u0001\u0000\u0000\u0000\u0160\u0162\u0005G\u0000\u0000\u0161"+
		"\u0163\u0005+\u0000\u0000\u0162\u0161\u0001\u0000\u0000\u0000\u0162\u0163"+
		"\u0001\u0000\u0000\u0000\u0163\u0165\u0001\u0000\u0000\u0000\u0164\u0166"+
		"\u0007\u0001\u0000\u0000\u0165\u0164\u0001\u0000\u0000\u0000\u0166\u0167"+
		"\u0001\u0000\u0000\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0167\u0168"+
		"\u0001\u0000\u0000\u0000\u0168\u016a\u0001\u0000\u0000\u0000\u0169\u016b"+
		"\u0005,\u0000\u0000\u016a\u0169\u0001\u0000\u0000\u0000\u016a\u016b\u0001"+
		"\u0000\u0000\u0000\u016b\u001d\u0001\u0000\u0000\u0000\u016c\u016e\u0003"+
		" \u0010\u0000\u016d\u016c\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000"+
		"\u0000\u0000\u016f\u016d\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000"+
		"\u0000\u0000\u0170\u001f\u0001\u0000\u0000\u0000\u0171\u0179\u0003*\u0015"+
		"\u0000\u0172\u0179\u0003,\u0016\u0000\u0173\u0179\u0003\"\u0011\u0000"+
		"\u0174\u0179\u0003.\u0017\u0000\u0175\u0179\u0005G\u0000\u0000\u0176\u0179"+
		"\u0005L\u0000\u0000\u0177\u0179\u0005M\u0000\u0000\u0178\u0171\u0001\u0000"+
		"\u0000\u0000\u0178\u0172\u0001\u0000\u0000\u0000\u0178\u0173\u0001\u0000"+
		"\u0000\u0000\u0178\u0174\u0001\u0000\u0000\u0000\u0178\u0175\u0001\u0000"+
		"\u0000\u0000\u0178\u0176\u0001\u0000\u0000\u0000\u0178\u0177\u0001\u0000"+
		"\u0000\u0000\u0179!\u0001\u0000\u0000\u0000\u017a\u017c\u00053\u0000\u0000"+
		"\u017b\u017d\u0003$\u0012\u0000\u017c\u017b\u0001\u0000\u0000\u0000\u017c"+
		"\u017d\u0001\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e"+
		"\u017f\u0005Q\u0000\u0000\u017f#\u0001\u0000\u0000\u0000\u0180\u0182\u0003"+
		"&\u0013\u0000\u0181\u0180\u0001\u0000\u0000\u0000\u0182\u0183\u0001\u0000"+
		"\u0000\u0000\u0183\u0181\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000"+
		"\u0000\u0000\u0184%\u0001\u0000\u0000\u0000\u0185\u0186\u0005O\u0000\u0000"+
		"\u0186\u0187\u0005]\u0000\u0000\u0187\u0188\u0003(\u0014\u0000\u0188\u0189"+
		"\u0005V\u0000\u0000\u0189\u0195\u0001\u0000\u0000\u0000\u018a\u0195\u0005"+
		"[\u0000\u0000\u018b\u0195\u0005R\u0000\u0000\u018c\u0195\u0005S\u0000"+
		"\u0000\u018d\u0195\u0005T\u0000\u0000\u018e\u0195\u0005Y\u0000\u0000\u018f"+
		"\u0195\u0005Z\u0000\u0000\u0190\u0195\u0005U\u0000\u0000\u0191\u0195\u0005"+
		"V\u0000\u0000\u0192\u0195\u0005X\u0000\u0000\u0193\u0195\u0005W\u0000"+
		"\u0000\u0194\u0185\u0001\u0000\u0000\u0000\u0194\u018a\u0001\u0000\u0000"+
		"\u0000\u0194\u018b\u0001\u0000\u0000\u0000\u0194\u018c\u0001\u0000\u0000"+
		"\u0000\u0194\u018d\u0001\u0000\u0000\u0000\u0194\u018e\u0001\u0000\u0000"+
		"\u0000\u0194\u018f\u0001\u0000\u0000\u0000\u0194\u0190\u0001\u0000\u0000"+
		"\u0000\u0194\u0191\u0001\u0000\u0000\u0000\u0194\u0192\u0001\u0000\u0000"+
		"\u0000\u0194\u0193\u0001\u0000\u0000\u0000\u0195\'\u0001\u0000\u0000\u0000"+
		"\u0196\u019b\u0005[\u0000\u0000\u0197\u0198\u0005R\u0000\u0000\u0198\u019a"+
		"\u0005[\u0000\u0000\u0199\u0197\u0001\u0000\u0000\u0000\u019a\u019d\u0001"+
		"\u0000\u0000\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019b\u019c\u0001"+
		"\u0000\u0000\u0000\u019c)\u0001\u0000\u0000\u0000\u019d\u019b\u0001\u0000"+
		"\u0000\u0000\u019e\u019f\u00055\u0000\u0000\u019f\u01a5\u00030\u0018\u0000"+
		"\u01a0\u01a4\u00032\u0019\u0000\u01a1\u01a4\u0005N\u0000\u0000\u01a2\u01a4"+
		"\u0005M\u0000\u0000\u01a3\u01a0\u0001\u0000\u0000\u0000\u01a3\u01a1\u0001"+
		"\u0000\u0000\u0000\u01a3\u01a2\u0001\u0000\u0000\u0000\u01a4\u01a7\u0001"+
		"\u0000\u0000\u0000\u01a5\u01a3\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001"+
		"\u0000\u0000\u0000\u01a6\u01a8\u0001\u0000\u0000\u0000\u01a7\u01a5\u0001"+
		"\u0000\u0000\u0000\u01a8\u01ac\u00056\u0000\u0000\u01a9\u01ab\u0003 \u0010"+
		"\u0000\u01aa\u01a9\u0001\u0000\u0000\u0000\u01ab\u01ae\u0001\u0000\u0000"+
		"\u0000\u01ac\u01aa\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000"+
		"\u0000\u01ad\u01af\u0001\u0000\u0000\u0000\u01ae\u01ac\u0001\u0000\u0000"+
		"\u0000\u01af\u01b0\u0003.\u0017\u0000\u01b0+\u0001\u0000\u0000\u0000\u01b1"+
		"\u01b2\u00055\u0000\u0000\u01b2\u01b8\u00030\u0018\u0000\u01b3\u01b7\u0003"+
		"2\u0019\u0000\u01b4\u01b7\u0005N\u0000\u0000\u01b5\u01b7\u0005M\u0000"+
		"\u0000\u01b6\u01b3\u0001\u0000\u0000\u0000\u01b6\u01b4\u0001\u0000\u0000"+
		"\u0000\u01b6\u01b5\u0001\u0000\u0000\u0000\u01b7\u01ba\u0001\u0000\u0000"+
		"\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001\u0000\u0000"+
		"\u0000\u01b9\u01bb\u0001\u0000\u0000\u0000\u01ba\u01b8\u0001\u0000\u0000"+
		"\u0000\u01bb\u01bc\u00057\u0000\u0000\u01bc\u01bd\u00056\u0000\u0000\u01bd"+
		"-\u0001\u0000\u0000\u0000\u01be\u01bf\u00055\u0000\u0000\u01bf\u01c0\u0005"+
		"7\u0000\u0000\u01c0\u01c1\u00030\u0018\u0000\u01c1\u01c2\u00056\u0000"+
		"\u0000\u01c2/\u0001\u0000\u0000\u0000\u01c3\u01c4\u0007\u0002\u0000\u0000"+
		"\u01c41\u0001\u0000\u0000\u0000\u01c5\u01c8\u0007\u0003\u0000\u0000\u01c6"+
		"\u01c7\u00058\u0000\u0000\u01c7\u01c9\u00034\u001a\u0000\u01c8\u01c6\u0001"+
		"\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c93\u0001\u0000"+
		"\u0000\u0000\u01ca\u01ce\u0005:\u0000\u0000\u01cb\u01ce\u0005G\u0000\u0000"+
		"\u01cc\u01ce\u0003\"\u0011\u0000\u01cd\u01ca\u0001\u0000\u0000\u0000\u01cd"+
		"\u01cb\u0001\u0000\u0000\u0000\u01cd\u01cc\u0001\u0000\u0000\u0000\u01ce"+
		"5\u0001\u0000\u0000\u0000\u01cf\u01d0\u0005\u0006\u0000\u0000\u01d0\u01d1"+
		"\u0005\u0005\u0000\u0000\u01d1\u01db\u0005(\u0000\u0000\u01d2\u01d3\u0005"+
		"#\u0000\u0000\u01d3\u01d8\u0005(\u0000\u0000\u01d4\u01d5\u0005\u0011\u0000"+
		"\u0000\u01d5\u01d7\u0005(\u0000\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000"+
		"\u01d7\u01da\u0001\u0000\u0000\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000"+
		"\u01d8\u01d9\u0001\u0000\u0000\u0000\u01d9\u01dc\u0001\u0000\u0000\u0000"+
		"\u01da\u01d8\u0001\u0000\u0000\u0000\u01db\u01d2\u0001\u0000\u0000\u0000"+
		"\u01db\u01dc\u0001\u0000\u0000\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000"+
		"\u01dd\u01e1\u0005\u0016\u0000\u0000\u01de\u01e0\u00038\u001c\u0000\u01df"+
		"\u01de\u0001\u0000\u0000\u0000\u01e0\u01e3\u0001\u0000\u0000\u0000\u01e1"+
		"\u01df\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000\u0000\u01e2"+
		"\u01e4\u0001\u0000\u0000\u0000\u01e3\u01e1\u0001\u0000\u0000\u0000\u01e4"+
		"\u01e5\u0005\u0017\u0000\u0000\u01e57\u0001\u0000\u0000\u0000\u01e6\u01e9"+
		"\u0003:\u001d\u0000\u01e7\u01e9\u0003D\"\u0000\u01e8\u01e6\u0001\u0000"+
		"\u0000\u0000\u01e8\u01e7\u0001\u0000\u0000\u0000\u01e99\u0001\u0000\u0000"+
		"\u0000\u01ea\u01ec\u0005 \u0000\u0000\u01eb\u01ea\u0001\u0000\u0000\u0000"+
		"\u01eb\u01ec\u0001\u0000\u0000\u0000\u01ec\u01ed\u0001\u0000\u0000\u0000"+
		"\u01ed\u01ee\u0005(\u0000\u0000\u01ee\u01ef\u0005\u000f\u0000\u0000\u01ef"+
		"\u01f0\u0003<\u001e\u0000\u01f0\u01f1\u0005\u0013\u0000\u0000\u01f1\u01f2"+
		"\u0003\u0010\b\u0000\u01f2\u01f3\u0005\u0010\u0000\u0000\u01f3\u0205\u0001"+
		"\u0000\u0000\u0000\u01f4\u01f6\u0005 \u0000\u0000\u01f5\u01f4\u0001\u0000"+
		"\u0000\u0000\u01f5\u01f6\u0001\u0000\u0000\u0000\u01f6\u01f7\u0001\u0000"+
		"\u0000\u0000\u01f7\u01f8\u0005(\u0000\u0000\u01f8\u01f9\u0005\u000f\u0000"+
		"\u0000\u01f9\u01fa\u0003<\u001e\u0000\u01fa\u01fb\u0005\u0010\u0000\u0000"+
		"\u01fb\u0205\u0001\u0000\u0000\u0000\u01fc\u01fe\u0005 \u0000\u0000\u01fd"+
		"\u01fc\u0001\u0000\u0000\u0000\u01fd\u01fe\u0001\u0000\u0000\u0000\u01fe"+
		"\u01ff\u0001\u0000\u0000\u0000\u01ff\u0200\u0005(\u0000\u0000\u0200\u0201"+
		"\u0005\u0013\u0000\u0000\u0201\u0202\u0003\u0010\b\u0000\u0202\u0203\u0005"+
		"\u0010\u0000\u0000\u0203\u0205\u0001\u0000\u0000\u0000\u0204\u01eb\u0001"+
		"\u0000\u0000\u0000\u0204\u01f5\u0001\u0000\u0000\u0000\u0204\u01fd\u0001"+
		"\u0000\u0000\u0000\u0205;\u0001\u0000\u0000\u0000\u0206\u020b\u0007\u0004"+
		"\u0000\u0000\u0207\u0208\u0005\u0018\u0000\u0000\u0208\u020a\u0005\u0019"+
		"\u0000\u0000\u0209\u0207\u0001\u0000\u0000\u0000\u020a\u020d\u0001\u0000"+
		"\u0000\u0000\u020b\u0209\u0001\u0000\u0000\u0000\u020b\u020c\u0001\u0000"+
		"\u0000\u0000\u020c=\u0001\u0000\u0000\u0000\u020d\u020b\u0001\u0000\u0000"+
		"\u0000\u020e\u0217\u0005\u0018\u0000\u0000\u020f\u0214\u0003@ \u0000\u0210"+
		"\u0211\u0005\u0011\u0000\u0000\u0211\u0213\u0003@ \u0000\u0212\u0210\u0001"+
		"\u0000\u0000\u0000\u0213\u0216\u0001\u0000\u0000\u0000\u0214\u0212\u0001"+
		"\u0000\u0000\u0000\u0214\u0215\u0001\u0000\u0000\u0000\u0215\u0218\u0001"+
		"\u0000\u0000\u0000\u0216\u0214\u0001\u0000\u0000\u0000\u0217\u020f\u0001"+
		"\u0000\u0000\u0000\u0217\u0218\u0001\u0000\u0000\u0000\u0218\u0219\u0001"+
		"\u0000\u0000\u0000\u0219\u021a\u0005\u0019\u0000\u0000\u021a?\u0001\u0000"+
		"\u0000\u0000\u021b\u021c\u0003\u0010\b\u0000\u021cA\u0001\u0000\u0000"+
		"\u0000\u021d\u021f\u0005(\u0000\u0000\u021e\u0220\u0005\u000f\u0000\u0000"+
		"\u021f\u021e\u0001\u0000\u0000\u0000\u021f\u0220\u0001\u0000\u0000\u0000"+
		"\u0220\u0222\u0001\u0000\u0000\u0000\u0221\u0223\u0003\u0012\t\u0000\u0222"+
		"\u0221\u0001\u0000\u0000\u0000\u0222\u0223\u0001\u0000\u0000\u0000\u0223"+
		"C\u0001\u0000\u0000\u0000\u0224\u0225\u0005(\u0000\u0000\u0225\u0227\u0005"+
		"\u0014\u0000\u0000\u0226\u0228\u0003F#\u0000\u0227\u0226\u0001\u0000\u0000"+
		"\u0000\u0227\u0228\u0001\u0000\u0000\u0000\u0228\u0229\u0001\u0000\u0000"+
		"\u0000\u0229\u022c\u0005\u0015\u0000\u0000\u022a\u022b\u0005\u000f\u0000"+
		"\u0000\u022b\u022d\u0007\u0004\u0000\u0000\u022c\u022a\u0001\u0000\u0000"+
		"\u0000\u022c\u022d\u0001\u0000\u0000\u0000\u022d\u022e\u0001\u0000\u0000"+
		"\u0000\u022e\u022f\u0003J%\u0000\u022fE\u0001\u0000\u0000\u0000\u0230"+
		"\u0235\u0003H$\u0000\u0231\u0232\u0005\u0011\u0000\u0000\u0232\u0234\u0003"+
		"H$\u0000\u0233\u0231\u0001\u0000\u0000\u0000\u0234\u0237\u0001\u0000\u0000"+
		"\u0000\u0235\u0233\u0001\u0000\u0000\u0000\u0235\u0236\u0001\u0000\u0000"+
		"\u0000\u0236G\u0001\u0000\u0000\u0000\u0237\u0235\u0001\u0000\u0000\u0000"+
		"\u0238\u023a\u0005 \u0000\u0000\u0239\u0238\u0001\u0000\u0000\u0000\u0239"+
		"\u023a\u0001\u0000\u0000\u0000\u023a\u023b\u0001\u0000\u0000\u0000\u023b"+
		"\u023c\u0005(\u0000\u0000\u023c\u023d\u0005\u000f\u0000\u0000\u023d\u023e"+
		"\u0007\u0005\u0000\u0000\u023eI\u0001\u0000\u0000\u0000\u023f\u0243\u0005"+
		"\u0016\u0000\u0000\u0240\u0242\u0003L&\u0000\u0241\u0240\u0001\u0000\u0000"+
		"\u0000\u0242\u0245\u0001\u0000\u0000\u0000\u0243\u0241\u0001\u0000\u0000"+
		"\u0000\u0243\u0244\u0001\u0000\u0000\u0000\u0244\u0246\u0001\u0000\u0000"+
		"\u0000\u0245\u0243\u0001\u0000\u0000\u0000\u0246\u0247\u0005\u0017\u0000"+
		"\u0000\u0247K\u0001\u0000\u0000\u0000\u0248\u0252\u0003J%\u0000\u0249"+
		"\u0252\u0003P(\u0000\u024a\u0252\u0003R)\u0000\u024b\u0252\u0003T*\u0000"+
		"\u024c\u0252\u0003V+\u0000\u024d\u0252\u0003X,\u0000\u024e\u0252\u0003"+
		"N\'\u0000\u024f\u0252\u0003:\u001d\u0000\u0250\u0252\u0003D\"\u0000\u0251"+
		"\u0248\u0001\u0000\u0000\u0000\u0251\u0249\u0001\u0000\u0000\u0000\u0251"+
		"\u024a\u0001\u0000\u0000\u0000\u0251\u024b\u0001\u0000\u0000\u0000\u0251"+
		"\u024c\u0001\u0000\u0000\u0000\u0251\u024d\u0001\u0000\u0000\u0000\u0251"+
		"\u024e\u0001\u0000\u0000\u0000\u0251\u024f\u0001\u0000\u0000\u0000\u0251"+
		"\u0250\u0001\u0000\u0000\u0000\u0252M\u0001\u0000\u0000\u0000\u0253\u0254"+
		"\u0003\u0010\b\u0000\u0254\u0255\u0005\u0010\u0000\u0000\u0255O\u0001"+
		"\u0000\u0000\u0000\u0256\u0257\u0003\u0010\b\u0000\u0257\u0258\u0005\u0013"+
		"\u0000\u0000\u0258\u0259\u0003\u0010\b\u0000\u0259\u025a\u0005\u0010\u0000"+
		"\u0000\u025aQ\u0001\u0000\u0000\u0000\u025b\u025c\u0003\u0010\b\u0000"+
		"\u025c\u025d\u0005\u0012\u0000\u0000\u025d\u025e\u0005(\u0000\u0000\u025e"+
		"\u0267\u0005\u0014\u0000\u0000\u025f\u0264\u0003\u0010\b\u0000\u0260\u0261"+
		"\u0005\u0011\u0000\u0000\u0261\u0263\u0003\u0010\b\u0000\u0262\u0260\u0001"+
		"\u0000\u0000\u0000\u0263\u0266\u0001\u0000\u0000\u0000\u0264\u0262\u0001"+
		"\u0000\u0000\u0000\u0264\u0265\u0001\u0000\u0000\u0000\u0265\u0268\u0001"+
		"\u0000\u0000\u0000\u0266\u0264\u0001\u0000\u0000\u0000\u0267\u025f\u0001"+
		"\u0000\u0000\u0000\u0267\u0268\u0001\u0000\u0000\u0000\u0268\u0269\u0001"+
		"\u0000\u0000\u0000\u0269\u026a\u0005\u0015\u0000\u0000\u026a\u026b\u0005"+
		"\u0010\u0000\u0000\u026bS\u0001\u0000\u0000\u0000\u026c\u026e\u0005\n"+
		"\u0000\u0000\u026d\u026f\u0003\u0010\b\u0000\u026e\u026d\u0001\u0000\u0000"+
		"\u0000\u026e\u026f\u0001\u0000\u0000\u0000\u026f\u0270\u0001\u0000\u0000"+
		"\u0000\u0270\u0271\u0005\u0010\u0000\u0000\u0271U\u0001\u0000\u0000\u0000"+
		"\u0272\u0273\u0005\u000b\u0000\u0000\u0273\u0274\u0005\u0014\u0000\u0000"+
		"\u0274\u0275\u0003\u0010\b\u0000\u0275\u0276\u0005\u0015\u0000\u0000\u0276"+
		"\u0279\u0003L&\u0000\u0277\u0278\u0005\f\u0000\u0000\u0278\u027a\u0003"+
		"L&\u0000\u0279\u0277\u0001\u0000\u0000\u0000\u0279\u027a\u0001\u0000\u0000"+
		"\u0000\u027aW\u0001\u0000\u0000\u0000\u027b\u027c\u0005\r\u0000\u0000"+
		"\u027c\u027d\u0005(\u0000\u0000\u027d\u027e\u0005\u0013\u0000\u0000\u027e"+
		"\u0280\u0003\u0010\b\u0000\u027f\u0281\u0005\u0010\u0000\u0000\u0280\u027f"+
		"\u0001\u0000\u0000\u0000\u0280\u0281\u0001\u0000\u0000\u0000\u0281Y\u0001"+
		"\u0000\u0000\u0000\u0282\u0283\u0005\u0006\u0000\u0000\u0283\u0284\u0005"+
		"\r\u0000\u0000\u0284\u0285\u0005(\u0000\u0000\u0285\u0286\u0005\u000f"+
		"\u0000\u0000\u0286\u0287\u0003<\u001e\u0000\u0287\u0288\u0005\u0013\u0000"+
		"\u0000\u0288\u0289\u0003\u0010\b\u0000\u0289\u028a\u0005\u0010\u0000\u0000"+
		"\u028a[\u0001\u0000\u0000\u0000K_ekm\u007f\u008e\u009c\u009e\u00a6\u00ae"+
		"\u00b2\u00c1\u00c4\u00cb\u00d1\u00d3\u00dd\u00e2\u00f4\u00f9\u0100\u0103"+
		"\u010c\u0120\u0123\u0126\u0128\u0134\u0138\u0143\u0148\u014e\u0154\u015a"+
		"\u015e\u0162\u0167\u016a\u016f\u0178\u017c\u0183\u0194\u019b\u01a3\u01a5"+
		"\u01ac\u01b6\u01b8\u01c8\u01cd\u01d8\u01db\u01e1\u01e8\u01eb\u01f5\u01fd"+
		"\u0204\u020b\u0214\u0217\u021f\u0222\u0227\u022c\u0235\u0239\u0243\u0251"+
		"\u0264\u0267\u026e\u0279\u0280";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
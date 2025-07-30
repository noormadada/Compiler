
// ParserFile.g4
parser grammar ParserFile;

options {
    tokenVocab = LexerFile;
}

angularFile
    : importStatement*
      decorator* (classDeclaration| constExportStatement  | expressionStatement)*  EOF
    ;



importStatement
    : IMPORT LBRACE idList RBRACE FROM STRING_LITERAL SEMI
    ;

idList
    : ID (COMMA ID)*
    ;

decorator
    : AT ID LPAREN objectLiteral RPAREN
    ;

objectLiteral
    : LBRACE objectField (COMMA objectField)* RBRACE
    ;

objectField
    : TEMPLATEE COLON templateLiteral    # TemplateField
    | STYLES COLON styleArray            # StylesField
    | ID (COLON expression)?                # GenericField
    ;

styleArray
    : LSQUARE cssLiteral (COMMA cssLiteral)* RSQUARE
    ;

spreadField
    : SPREAD ID
    | objectField
    ;

expression
    : SEMI? THIS                                             # ThisExpr
    | THIS DOT ID                                            # ThisPropertyExpr
    | THIS DOT ID LPAREN (expression (COMMA expression)*)? RPAREN # ThisCallExpr
    | ID ((DOT ID(AS)?) | (LSQUARE expression RSQUARE))*          # IdentifierExpr
    | ID ASSIGN GT ID DOT ID INTERJECTION? ASSIGN+ ID             # IdentifierExpr2
    | ID GT MINUS NUMBER                                     # IdentifierExpr3
    | literal                                                # LiteralExpr
    | templateLiteral                                        # TemplateExpr
    | cssLiteral                                             # CssExpr
    | arrayLiteral                                           # ArrayExpr
    | objectLiteral                                          # ObjectExpr
    | LBRACE (objectField (COMMA objectField)* (COMMA spreadField)? | spreadField (COMMA spreadField)*)? RBRACE # SpreadObjectExpr
    | expression DOT ID                                      # PropertyAccess
    | expression LSQUARE expression RSQUARE                  # ArrayAccessExpr
    | expression LPAREN (expression (COMMA expression)*)? RPAREN # CallExpr
    | PLUS expression                                        # UnaryExpr
    | expression PLUS expression                             # BinaryExpr
    | LPAREN expression RPAREN                               # ParenthesizedExpr
    ;


literal
    :TEMPLATE_START TEMPLATE_ID TEMPLATE_SLASH TEMPLATE_END
    | STRING_LITERAL
    | NUMBER
    | TRUE
    | FALSE
    | templateLiteral
    ;

templateLiteral
    : TEMPLATE_START htmlContent? TEMPLATE_END
    ;

cssLiteral
    : TEMPLATE_START cssContent TEMPLATE_END
    ;

cssContent
    : cssStatement*
    ;

cssStatement
    : CSS_CLASSNAME (TEMPLATE_TAG_IMG)? CssLBRACE cssRule* CssRBRACE
    | (TEMPLATE_ID | TEMPLATE_TEXT | TEMPLATE_TAG_IMG | TEMPLATE_TAG_BUTTON) (TEMPLATE_ID)? CssLBRACE cssRule* CssRBRACE
    ;

cssRule
    : TEMPLATE_ID (CSS_COLON)? (CSS_VALUE | TEMPLATE_ID | HASH)+ (CSS_COMMA)?
    ;

htmlContent
    : htmlChunk+
    ;
///////////////////////////////////////////////////////
htmlChunk
    : htmlElement      # HtmlElementChunk
    | selfClosingTag   # HtmlSelfClosingChunk
    | interpolation    # InterpolationChunk
    | closeTag         # HtmlCloseTagChunk
    | TEMPLATE_ID      # Html_Id
    | TEMPLATE_TEXT    # HtmlTextChunk
    | TEMPLATE_NEWLINE # HtmlNewlineChunk
    ;

interpolation
    : INTERPOLATION_OPEN interpolationContent? INTERPOLATION_CLOSE
    ;

interpolationContent
    : interpolationExpr+
    ;

interpolationExpr
    : INTERPOLATION_DOLLAR INTERPOLATION_LBRACE interpolationFullExpr INTERPOLATION_RPAREN
    | INTERPOLATION_ID
    | INTERPOLATION_DOT
    | INTERPOLATION_LSQUARE
    | INTERPOLATION_RSQUARE
    | INTERPOLATION_STRING
    | INTERPOLATION_NUMBER
    | INTERPOLATION_LPAREN
    | INTERPOLATION_RPAREN
    | INTERPOLATION_NTERROGATIVE
    | INTERPOLATION_COLON
    ;

interpolationFullExpr
    : INTERPOLATION_ID (INTERPOLATION_DOT INTERPOLATION_ID)*
    ;

htmlElement
    : TEMPLATE_LT htmlTag (htmlAttribute | TEMPLATE_WS | TEMPLATE_NEWLINE)* TEMPLATE_GT htmlChunk* closeTag
    ;

selfClosingTag
    : TEMPLATE_LT htmlTag (htmlAttribute | TEMPLATE_WS | TEMPLATE_NEWLINE)* TEMPLATE_SLASH TEMPLATE_GT
    ;

closeTag
    : TEMPLATE_LT TEMPLATE_SLASH htmlTag TEMPLATE_GT
    ;

htmlTag
    : TEMPLATE_TAG_DIV
    | TEMPLATE_TAG_SPAN
    | TEMPLATE_TAG_SECTION
    | TEMPLATE_TAG_P
    | TEMPLATE_TAG_H1
    | TEMPLATE_TAG_H2
    | TEMPLATE_TAG_H3
    | TEMPLATE_TAG_IMG
    | TEMPLATE_TAG_UL
    | TEMPLATE_TAG_LI
    | TEMPLATE_TAG_BUTTON
    | TEMPLATE_TAG_INPUT
    | TEMPLATE_ID
    ;

htmlAttribute
    : (TEMPLATE_ID
      | ANGULAR_PROPERTY_BINDING
      | ANGULAR_EVENT_BINDING
      | ANGULAR_TWO_WAY_BINDING
      | ANGULAR_STRUCTURAL_DIRECTIVE)
     (TEMPLATE_EQUALS attributeValue)?
    ;

attributeValue
    : TEMPLATE_STRING
    | TEMPLATE_ID
    | interpolation
    ;

classDeclaration
    : EXPORT CLASS ID (IMPLEMENTS ID (COMMA ID)*)? LBRACE classMember* RBRACE
    ;

classMember
    : variableDeclaration
    | functionDeclaration
    ;

variableDeclaration
    : (PRIVATE)? ID COLON type ASSIGN expression SEMI
    | (PRIVATE)? ID COLON type SEMI
    | (PRIVATE)? ID ASSIGN expression SEMI
    ;


type
    : (ID | ANY | VOID) (LSQUARE RSQUARE)*
    ;

arrayLiteral
    : LSQUARE (arrayElement (COMMA arrayElement)*)? RSQUARE
    ;

arrayElement
    : expression
    ;

objectFieldInArray
    : ID COLON? literal?
    ;

functionDeclaration
    : ID LPAREN parameterList? RPAREN (COLON (ID | ANY | VOID))? block
    ;

parameterList
    : parameter (COMMA parameter)*
    ;

parameter
    : (PRIVATE)? ID COLON (ID|ANY)
    ;

block
    : LBRACE statement* RBRACE
    ;

statement
    : block
    | assignmentStatement
    | methodCallStatement
    | returnStatement
    | ifStatement
    | constDeclaration
    | expressionStatement
    | variableDeclaration
    | functionDeclaration
    ;

expressionStatement
    : expression SEMI
    ;

assignmentStatement
    : expression ASSIGN expression SEMI
    ;

methodCallStatement
    : expression DOT ID LPAREN (expression (COMMA expression)*)? RPAREN SEMI
    ;

returnStatement
    : RETURN expression? SEMI
    ;

ifStatement
    : IF LPAREN expression RPAREN statement (ELSE statement)?
    ;

constDeclaration
    : CONST ID ASSIGN expression SEMI?
    ;
constExportStatement
    : EXPORT CONST ID COLON type ASSIGN expression SEMI
    ;

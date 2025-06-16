parser grammar ParserFile;

options {
    tokenVocab = LexerFile;
}

angularFile
    : importStatement* decorator classDeclaration* EOF
    ;

importStatement
    : IMPORT LBRACE ID RBRACE FROM STRING_LITERAL SEMI
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
    | ID COLON expression                # GenericField
    ;

styleArray
    : LSQUARE cssLiteral (COMMA cssLiteral)* RSQUARE
    ;

expression
    : ID ( (DOT ID) | (LSQUARE literal RSQUARE) )*   # IdentifierExpr
    | literal                                        # LiteralExpr
    | templateLiteral                                # TemplateExpr
    | cssLiteral                                     # CssExpr
    | arrayLiteral                                   # ArrayExpr
    ;

literal
    : STRING_LITERAL
    | NUMBER
    | TRUE
    | FALSE
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
    ;

cssRule
    : TEMPLATE_ID (CSS_COLON)? (CSS_VALUE | TEMPLATE_ID | HASH)+ (CSS_COMMA)?
    ;

htmlContent
    : htmlChunk+
    ;

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
    : INTERPOLATION_ID
    | INTERPOLATION_DOT
    | INTERPOLATION_LSQUARE
    | INTERPOLATION_RSQUARE
    | INTERPOLATION_STRING
    | INTERPOLATION_NUMBER
    | INTERPOLATION_LPAREN
    | INTERPOLATION_RPAREN
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
      TEMPLATE_EQUALS attributeValue
    ;

attributeValue
    : TEMPLATE_STRING
    | TEMPLATE_ID
    | interpolation
    ;

classDeclaration
    : EXPORT CLASS ID LBRACE classMember* RBRACE
    ;

classMember
    : variableDeclaration
    | functionDeclaration
    ;

variableDeclaration
    : ID ASSIGN expression SEMI
    ;

arrayLiteral
    : LSQUARE arrayElement (COMMA arrayElement)* RSQUARE
    ;

arrayElement
    : LBRACE? objectFieldInArray (COMMA objectFieldInArray)* RBRACE?
    ;

objectFieldInArray
    : ID COLON? literal?
    ;

functionDeclaration
    : ID LPAREN parameterList? RPAREN LBRACE block+ RBRACE
    ;

parameterList
    : parameter (COMMA parameter)*
    ;

parameter
    : ID COLON ID
    ;

block
    : ID DOT ID ASSIGN ID (DOT ID (PLUS NUMBER)?)? SEMI   #BlockExpr1
    | ID DOT ID ASSIGN STRING_LITERAL SEMI                #BlockExpr2
    | ID+  ASSIGN ID DOT ID+ SEMI                         #BlockExpr3
    ;

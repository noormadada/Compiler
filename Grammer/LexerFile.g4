// LexerFile.g4
lexer grammar LexerFile;

AT: '@';
AS:'as';
IMPORT: 'import';
FROM: 'from';
CLASS: 'class';
EXPORT: 'export';
TRUE: 'true';
TEMPLATEE: 'template';
STYLES: 'styles';
RETURN: 'return';
IF: 'if';
ELSE: 'else';
CONST: 'const';
FALSE: 'false';
COLON: ':';
SEMI: ';';
COMMA: ',';
DOT: '.';
ASSIGN: '=';
LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
LSQUARE: '[';
RSQUARE: ']';
LT: '<';
GT: '>';
SLASH: '/';
PLUS: '+';
INTERJECTION:'!';
MINUS :'-';
PRIVATE: 'private';
SPREAD: '...';
THIS: 'this';
IMPLEMENTS: 'implements';
VOID: 'void';
ANY: 'any';

STRING_LITERAL: '\'' (~['\\] | '\\' .)* '\''
              | '"' (~["\\] | '\\' .)* '"';
NUMBER: [0-9]+ ('.' [0-9]+)?;
ID: [a-zA-Z_][a-zA-Z0-9_]*;
WS: [ \t\r\n]+ -> skip;

TEMPLATE_START: '`' -> pushMode(TEMPLATE);

mode TEMPLATE;
CSS_COLON: ':';
CSS_COMMA: ';';
HASH: '#' [a-fA-F0-9]+ (';')?;
CSS_CLASSNAME: '.' [a-zA-Z_] [a-zA-Z0-9_-]* CSS_COLON? [a-zA-Z_] [a-zA-Z0-9_-]*;
CssLBRACE: '{';
CssRBRACE: '}';
CSS_VALUE: [0-9]+ ('.' [0-9]+)? ('px'|'em'|'rem'|'%')? (';')?;
CSS_WS: [ \t\r\n]+ -> skip;

INTERPOLATION_OPEN: '{{' -> pushMode(INTERPOLATION);
TEMPLATE_END: '`' -> popMode;
TEMPLATE_LT: '<';
TEMPLATE_GT: '>';
TEMPLATE_SLASH: '/';
TEMPLATE_EQUALS: '=';
TEMPLATE_QUOTE: '"' | '\'';
TEMPLATE_STRING: '"' (~["\\] | '\\' .)* '"'
               | '\'' (~['\\] | '\\' .)* '\'';

TEMPLATE_TAG_DIV: 'div';
TEMPLATE_TAG_SPAN: 'span';
TEMPLATE_TAG_SECTION: 'section';
TEMPLATE_TAG_P: 'p';
TEMPLATE_TAG_H1: 'h1';
TEMPLATE_TAG_H2: 'h2';
TEMPLATE_TAG_H3: 'h3';
TEMPLATE_TAG_IMG: 'img';
TEMPLATE_TAG_UL: 'ul';
TEMPLATE_TAG_LI: 'li';
TEMPLATE_TAG_BUTTON: 'button';
TEMPLATE_TAG_INPUT: 'input';

TEMPLATE_ID: [a-zA-Z_][a-zA-Z0-9_-]*
           | [a-zA-Z_][a-zA-Z0-9_-]* ':'
           | [a-zA-Z_][a-zA-Z0-9_-]* ';';

ANGULAR_PROPERTY_BINDING: '[' TEMPLATE_ID ']';
ANGULAR_EVENT_BINDING: '(' TEMPLATE_ID ')';
ANGULAR_TWO_WAY_BINDING: '[(' TEMPLATE_ID ')]';
ANGULAR_STRUCTURAL_DIRECTIVE: '*' TEMPLATE_ID;

TEMPLATE_TEXT: (~[`<>{}=/"' \t\r\n])+;
TEMPLATE_NEWLINE: [\r\n]+;
TEMPLATE_WS: [ \t]+ -> skip;

mode INTERPOLATION;
INTERPOLATION_DOLLAR: '$';
INTERPOLATION_PLUS: '+';
INTERPOLATION_CLOSE: '}}' -> popMode;
INTERPOLATION_DOT: '.';
INTERPOLATION_LSQUARE: '[';
INTERPOLATION_RSQUARE: ']';
INTERPOLATION_LPAREN: '(';
INTERPOLATION_RPAREN: ')';
INTERPOLATION_COLON: ':';
INTERPOLATION_NTERROGATIVE:'?';
INTERPOLATION_STRING: '\'' (~['\\] | '\\' .)* '\''
                    | '"' (~["\\] | '\\' .)* '"';
INTERPOLATION_NUMBER: [0-9]+ ('.' [0-9]+)?;
INTERPOLATION_ID: [a-zA-Z_][a-zA-Z0-9_]*;
INTERPOLATION_WS: [ \t\r\n]+ -> skip;
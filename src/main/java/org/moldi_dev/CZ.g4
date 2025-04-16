grammar CZ;

options {
    caseInsensitive = true;
}

@header {
    import java.util.*;
}

// Parser rules
program
    : define_directive* function_declaration* function* main_function function* EOF
    ;

define_directive
    : DEFINE IDENTIFIER (INTEGER_NUMBER | DOUBLE_NUMBER | STRING_LITERAL | CHARACTER | boolean_literal)
    ;

main_function
    : INT MAIN LEFT_PARANTHESIS RIGHT_PARANTHESIS function_block
    ;

function
    : type_ IDENTIFIER LEFT_PARANTHESIS parameters? RIGHT_PARANTHESIS function_block
    ;

function_block
    : LEFT_BRACE statement* return_statement SEMICOLON RIGHT_BRACE
    ;

function_declaration
    : type_ IDENTIFIER LEFT_PARANTHESIS parameters? RIGHT_PARANTHESIS SEMICOLON
    ;

parameters
    : parameter (COMMA parameter)*
    ;

parameter
    : type_ IDENTIFIER
    ;

statement
    : declaration SEMICOLON
    | assignment SEMICOLON
    | print_statement SEMICOLON
    | read_statement SEMICOLON
    | if_statement
    | while_statement
    | for_statement
    | block
    | break_statement
    | continue_statement
    | expression SEMICOLON
    | return_statement SEMICOLON
    | switch_statement
    ;

switch_statement
    : SWITCH LEFT_PARANTHESIS expression RIGHT_PARANTHESIS LEFT_BRACE switch_block* default_block? RIGHT_BRACE
    ;

switch_block
    : CASE literal COLON statement*
    ;

default_block
    : DEFAULT COLON statement*
    ;

break_statement
    : BREAK SEMICOLON
    ;

continue_statement
    : CONTINUE SEMICOLON
    ;

return_statement
    : RETURN expression
    ;

function_call
    : (IDENTIFIER | standard_function) LEFT_PARANTHESIS arguments? RIGHT_PARANTHESIS
    ;

standard_function
    : SINE
    | COSINE
    | TANGENT
    | COTANGENT
    | ARCSINE
    | ARCCOSINE
    | ARCTANGENT
    | ARCCOTANGENT
    | ARRAY_LENGTH
    | ARRAY_GET_AT
    | ARRAY_SET_AT
    | ARRAY_COPY
    | ARRAY_CONTAINS
    | ARRAY_INDEX_OF
    | ARRAY_COUNT
    | ARRAY_INSERT_FIRST
    | ARRAY_INSERT_AT
    | ARRAY_INSERT_LAST
    | ARRAY_DELETE_FIRST
    | ARRAY_DELETE_AT
    | ARRAY_DELETE_LAST
    ;

arguments
    : expression (COMMA expression)*
    ;

declaration
    : type=type_ IDENTIFIER (ASSIGNMENT expression)?
    ;

assignment
    : IDENTIFIER ASSIGNMENT expression
    ;

print_statement
    : PRINT LEFT_PARANTHESIS arguments? RIGHT_PARANTHESIS
    ;

read_statement
    : READ LEFT_PARANTHESIS IDENTIFIER RIGHT_PARANTHESIS
    ;

if_statement
    : IF LEFT_PARANTHESIS expression RIGHT_PARANTHESIS block
      (ELSE IF LEFT_PARANTHESIS expression RIGHT_PARANTHESIS block)*
      (ELSE block)?
    ;

while_statement
    : WHILE LEFT_PARANTHESIS expression RIGHT_PARANTHESIS block
    ;

for_statement
    : FOR LEFT_PARANTHESIS for_init? SEMICOLON expression? SEMICOLON assignment? RIGHT_PARANTHESIS block
    ;

for_init
    : declaration
    | assignment
    ;

block
    : LEFT_BRACE statement* RIGHT_BRACE
    ;

expression
    : LEFT_PARANTHESIS expression RIGHT_PARANTHESIS                                                                              # parenExpression
    | op=(NOT | BITWISE_NOT) expression                                                                                          # unaryExpression
    | left=expression op=(MULTIPLICATION | DIVISION | MODULUS) right=expression                                                  # multiplicativeExpression
    | <rightassoc> left=expression op=POWER right=expression                                                                     # powerExpression
    | left=expression op=(ADDITION | SUBTRACTION) right=expression                                                               # additiveExpression
    | left=expression op=(SHIFT_LEFT | SHIFT_RIGHT) right=expression                                                             # shiftExpression
    | left=expression op=(LESS_THAN | GREATER_THAN | LESS_THAN_OR_EQUAL | GREATER_THAN_OR_EQUAL) right=expression                # relationalExpression
    | left=expression op=(EQUALS | NOT_EQUALS) right=expression                                                                  # equalityExpression
    | left=expression op=(BITWISE_AND | BITWISE_OR | BITWISE_XOR) right=expression                                               # bitwiseExpression
    | left=expression op=(LOGICAL_AND | LOGICAL_OR) right=expression                                                             # logicalExpression
    | condition=expression QUESTION trueExpr=expression COLON falseExpr=expression                                               # ternaryExpression
    | function_call                                                                                                              # functionCallExpression
    | IDENTIFIER                                                                                                                 # identifierExpression
    | literal                                                                                                                    # literalExpression
    | array_literal                                                                                                              # arrayLiteralExpression
    ;

literal
    : INTEGER_NUMBER
    | DOUBLE_NUMBER
    | CHARACTER
    | STRING_LITERAL
    | boolean_literal
    | array_literal
    ;

array_literal
    : LEFT_BRACKET expression (COMMA expression)* RIGHT_BRACKET
    ;

boolean_literal
    : TRUE
    | FALSE
    ;

type_
    : INT
    | ARRAY_INT
    | DOUBLE
    | BOOLEAN
    | ARRAY_BOOLEAN
    | ARRAY_DOUBLE
    | CHAR
    | STRING
    | ARRAY_STRING
    ;

// Lexer rules
// Keywords (both C and CZ versions)
INT: 'int' | 'rizz';
BOOLEAN: 'bool' | 'cappin';
DOUBLE: 'double' | 'g';
CHAR: 'char' | 'fam';
STRING: 'string' | 'squad';
ARRAY_INT: 'array<int>' | 'squad<rizz>';
ARRAY_DOUBLE: 'array<double>' | 'squad<g>';
ARRAY_STRING: 'array<string>' | 'squad<squad>';
ARRAY_BOOLEAN: 'array<bool>' | 'squad<cappin>';
PRINT: 'print' | 'yeet';
READ: 'read' | 'spill_tea';
IF: 'if' | 'fr';
ELSE: 'else' | 'nahfr';
WHILE: 'while' | 'ong';
FOR: 'for' | 'vibing';
BREAK: 'break' | 'stahp';
CONTINUE: 'continue' | 'f_around';
TRUE: 'true' | 'nocap';
FALSE: 'false' | 'cap';
RETURN: 'return' | 'bounce';
MAIN: 'main' | 'boss';
SWITCH: 'switch' | 'switchy';
CASE: 'case' | 'vibe';
DEFAULT: 'default' | 'deffie';
DEFINE: '#define' | '#vibe_define';

// Operators
QUESTION: '?' | 'fr?';
COLON: ':' | 'bet';
SEMICOLON: ';' | 'pointz';
COMMA: ',' | 'splitz';
LEFT_PARANTHESIS: '(' | 'opentalk';
RIGHT_PARANTHESIS: ')' | 'closetalk';
LEFT_BRACE: '{' | 'openjam';
RIGHT_BRACE: '}' | 'closejam';
LEFT_BRACKET: '[' | 'openvibe';
RIGHT_BRACKET: ']' | 'closevibe';
ASSIGNMENT: '=' | 'vibecheck';
MODULUS: '%' | 'tralalero_tralala';
EQUALS: '==' | 'bruh';
NOT: '!' | 'nope';
NOT_EQUALS: '!=' | 'nah';
LESS_THAN: '<' | 'smol';
GREATER_THAN: '>' | 'big';
LESS_THAN_OR_EQUAL: '<=' | 'smallish';
GREATER_THAN_OR_EQUAL: '>=' | 'biggish';
ADDITION: '+' | 'extra';
SUBTRACTION: '-' | 'mid';
MULTIPLICATION: '*' | 'clapped';
POWER: '**' | 'tung_tung_tung_sahur';
DIVISION: '/' | 'ratioed';
LOGICAL_AND: '&&' | 'facts';
LOGICAL_OR: '||' | 'vibes';
BITWISE_AND: '&' | 'bitfam';
BITWISE_OR: '|' | 'bitlit';
BITWISE_XOR: '^' | 'xorfam';
BITWISE_NOT: '~' | 'unbit';
SHIFT_LEFT: '<<' | 'leftslide';
SHIFT_RIGHT: '>>' | 'rightslide';

// Built-in functions (my own standard library bestie)
SINE: '<MDA>sine' | '<MDA>vibe_sway';
COSINE: '<MDA>cosine' | '<MDA>side_chill';
TANGENT: '<MDA>tangent' | '<MDA>angle_tea';
COTANGENT: '<MDA>cotangent' | '<MDA>cotan_drip';
ARCSINE: '<MDA>arcsine' | '<MDA>vibe_rewind';
ARCCOSINE: '<MDA>arccosine' | '<MDA>side_throwback';
ARCTANGENT: '<MDA>arctangent' | '<MDA>angle_flash';
ARCCOTANGENT: '<MDA>arccotangent' | '<MDA>cotan_flashback';
ARRAY_LENGTH: '<MDA>array_length' | '<MDA>squad_countdown'; // <MDA>array_length :: array<T> => INTEGER
ARRAY_GET_AT: '<MDA>array_get_at' | '<MDA>squad_peep'; // <MDA>array_get_at :: array<T>, INTEGER => INTEGER
ARRAY_SET_AT: '<MDA>array_set_at' | '<MDA>squad_seep'; // <MDA>array_set_at :: array<T>, INTEGER, T => array<T>
ARRAY_COPY: '<MDA>array_copy' | '<MDA>squad_join'; // <MDA>array_copy :: array<T> => array<T>
ARRAY_CONTAINS: '<MDA>array_contains' | '<MDA>squad_vibeswith'; // <MDA>array_set_at :: array<T>, T => BOOLEAN
ARRAY_INDEX_OF: '<MDA>array_index_of' | '<MDA>squad_whereat'; // <MDA>array_index_of :: array<T>, T => INTEGER
ARRAY_COUNT: '<MDA>array_count' | '<MDA>squad_howmany'; // <MDA>array_count :: array<T>, T => INTEGER
ARRAY_INSERT_FIRST: '<MDA>array_insert_first' | '<MDA>squad_pushup'; // <MDA>array_insert_first :: array<T>, T => array<T>
ARRAY_INSERT_AT: '<MDA>array_insert_at' | '<MDA>squad_dropin'; // <MDA>array_insert_at :: array<T>, INTEGER, T => array<T>
ARRAY_INSERT_LAST: '<MDA>array_insert_last' | '<MDA>squad_slidein'; //<MDA>array_insert_last :: array<T>, T => array<T>
ARRAY_DELETE_FIRST: '<MDA>array_delete_first' | '<MDA>squad_chopfirst'; // <MDA>array_delete_first :: array<T> => array<T>
ARRAY_DELETE_AT: '<MDA>array_delete_at' | '<MDA>squad_chopspot'; // <MDA>array_delete_at :: array<T>, INTEGER => array<T>
ARRAY_DELETE_LAST: '<MDA>array_delete_last' | '<MDA>squad_choplast'; //<MDA>array_delete_last :: array<T> => array<T>

// Literals
STRING_LITERAL: '"' (~["\\] | EscapeSequence)* '"';
CHARACTER: '\'' (~['\\] | EscapeSequence) '\'';
INTEGER_NUMBER: '-'? [0-9]+;
DOUBLE_NUMBER: '-'? [0-9]+ '.' [0-9]+;

IDENTIFIER: [a-zA-Z][a-zA-Z0-9_]*;

// Comments and whitespace
COMMENT: '//' ~[\r\n]* -> skip;
WS: [ \t\r\n]+ -> skip;

// Error handling
UNEXPECTED_CHAR: .;

fragment EscapeSequence
    : '\\' [btnfr"'\\]
    | '\\' ([0-3]? [0-7])? [0-7]
    | '\\' 'u'+ HexDigit HexDigit HexDigit HexDigit
    ;

fragment HexDigit
    : [0-9a-fA-F]
    ;
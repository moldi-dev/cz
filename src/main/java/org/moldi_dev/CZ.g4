grammar CZ;

@header {
    import java.util.*;
}

// Parser rules
program
    : STANDARD_INCLUDE_DIRECTIVE constant_define_directive* function_declaration* enum_declaration* function* main_function function* EOF
    ;

constant_define_directive
    : CONSTANT_DEFINE IDENTIFIER (INTEGER_NUMBER | DOUBLE_NUMBER | STRING_LITERAL | CHARACTER | boolean_literal)
    ;

main_function
    : INT MAIN LEFT_PARENTHESIS RIGHT_PARENTHESIS function_block
    ;

function
    : type_ IDENTIFIER LEFT_PARENTHESIS parameters? RIGHT_PARENTHESIS function_block
    ;

enum_declaration
    : ENUM IDENTIFIER ASSIGNMENT LEFT_BRACKET enum_member (COMMA enum_member)* RIGHT_BRACKET SEMICOLON
    ;

enum_member
    : IDENTIFIER
    ;

function_block
    : LEFT_BRACE statement* return_statement SEMICOLON RIGHT_BRACE
    ;

function_declaration
    : type_ IDENTIFIER LEFT_PARENTHESIS parameters? RIGHT_PARENTHESIS SEMICOLON
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
    | do_while_statement
    | for_statement
    | block
    | break_statement
    | continue_statement
    | expression SEMICOLON
    | return_statement SEMICOLON
    | switch_statement
    ;

switch_statement
    : SWITCH LEFT_PARENTHESIS expression RIGHT_PARENTHESIS LEFT_BRACE switch_block* default_block? RIGHT_BRACE
    ;

switch_block
    : CASE expression COLON statement*
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
    : (IDENTIFIER | standard_function) LEFT_PARENTHESIS arguments? RIGHT_PARENTHESIS
    ;

standard_function
    : SINE
    | COSINE
    | HYPERBOLIC_SINE
    | HYPERBOLIC_COSINE
    | DEGREES_TO_RADIANS
    | RADIANS_TO_DEGREES
    | EXPONENTIAL
    | LOGARITHM
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
    | STRING_SLICE
    | STRING_SPLIT
    | STRING_SUBSTRING
    | INT_TO_DOUBLE
    | DOUBLE_TO_INT
    | BOOLEAN_TO_INT
    | STRING_TO_INT
    | STRING_TO_DOUBLE
    | INT_TO_STRING
    | DOUBLE_TO_STRING
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
    : PRINT LEFT_PARENTHESIS arguments? RIGHT_PARENTHESIS
    ;

read_statement
    : READ LEFT_PARENTHESIS IDENTIFIER RIGHT_PARENTHESIS
    ;

if_statement
    : IF LEFT_PARENTHESIS expression RIGHT_PARENTHESIS block
      (ELSE IF LEFT_PARENTHESIS expression RIGHT_PARENTHESIS block)*
      (ELSE block)?
    ;

while_statement
    : WHILE LEFT_PARENTHESIS expression RIGHT_PARENTHESIS block
    ;

do_while_statement
    : DO block WHILE LEFT_PARENTHESIS expression RIGHT_PARENTHESIS SEMICOLON
    ;

for_statement
    : FOR LEFT_PARENTHESIS for_init? SEMICOLON expression? SEMICOLON assignment? RIGHT_PARENTHESIS block
    ;

for_init
    : declaration
    | assignment
    ;

block
    : LEFT_BRACE statement* RIGHT_BRACE
    ;

expression
    : LEFT_PARENTHESIS expression RIGHT_PARENTHESIS                                                                              # parenExpression
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
    | enum_access                                                                                                                # enumAccessExpression
    | literal                                                                                                                    # literalExpression
    | array_literal                                                                                                              # arrayLiteralExpression
    ;

enum_access
    : IDENTIFIER DOT IDENTIFIER
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
    : LEFT_BRACKET (expression (COMMA expression)*)* RIGHT_BRACKET
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
    | ENUM IDENTIFIER
    ;

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
DO: 'do' | 'cook';
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
CONSTANT_DEFINE: '#constant_define' | '#vibe_define';
STANDARD_INCLUDE_DIRECTIVE: '#include <MDA>' | '#vibe_include <MDA>';
ENUM: 'enum' | 'bae';

// Operators
QUESTION: '?' | 'fr?';
COLON: ':' | 'bet';
SEMICOLON: ';' | 'pointz';
COMMA: ',' | 'splitz';
LEFT_PARENTHESIS: '(' | 'opentalk';
RIGHT_PARENTHESIS: ')' | 'closetalk';
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
DOT: '.' | 'bougie';

// Built-in functions (my own standard library bestie)
SINE: '<MDA>sine' | '<MDA>vibe_sway'; // <MDA>sine :: DOUBLE => DOUBLE
COSINE: '<MDA>cosine' | '<MDA>side_chill'; // <MDA>cosine :: DOUBLE => DOUBLE
HYPERBOLIC_SINE: '<MDA>hyperbolic_sine' | '<MDA>vibe_overload'; // <MDA>hyperbolic_sine :: DOUBLE => DOUBLE
HYPERBOLIC_COSINE: '<MDA>hyperbolic_cosine' | '<MDA>side_overload'; // <MDA>hyperbolic_cosine :: DOUBLE => DOUBLE
DEGREES_TO_RADIANS: '<MDA>degrees_to_radians' | '<MDA>degz2radz'; // <MDA>degrees_to_radians :: DOUBLE => DOUBLE
RADIANS_TO_DEGREES: '<MDA>radians_to_degrees' | '<MDA>radz2degz'; // <MDA>radians_to_degrees :: DOUBLE => DOUBLE
EXPONENTIAL: '<MDA>exponential' | '<MDA>brr_brr_patapim'; // <MDA>exponential :: DOUBLE => DOUBLE
LOGARITHM: '<MDA>logarithm' | '<MDA>vibe_log'; // <MDA>logarithm :: DOUBLE, DOUBLE => DOUBLE

ARRAY_LENGTH: '<MDA>array_length' | '<MDA>squad_countdown'; // <MDA>array_length :: array<T> => INTEGER
ARRAY_GET_AT: '<MDA>array_get_at' | '<MDA>squad_peep'; // <MDA>array_get_at :: array<T>, INTEGER => T
ARRAY_SET_AT: '<MDA>array_set_at' | '<MDA>squad_seep'; // <MDA>array_set_at :: array<T>, INTEGER, T => array<T>
ARRAY_COPY: '<MDA>array_copy' | '<MDA>squad_join'; // <MDA>array_copy :: array<T> => array<T>
ARRAY_CONTAINS: '<MDA>array_contains' | '<MDA>squad_vibeswith'; // <MDA>array_set_at :: array<T>, T => BOOLEAN
ARRAY_INDEX_OF: '<MDA>array_index_of' | '<MDA>squad_whereat'; // <MDA>array_index_of :: array<T>, T => INTEGER
ARRAY_COUNT: '<MDA>array_count' | '<MDA>squad_howmany'; // <MDA>array_count :: array<T>, T => INTEGER
ARRAY_INSERT_FIRST: '<MDA>array_insert_first' | '<MDA>squad_pushup'; // <MDA>array_insert_first :: array<T>, T => array<T>
ARRAY_INSERT_AT: '<MDA>array_insert_at' | '<MDA>squad_dropin'; // <MDA>array_insert_at :: array<T>, INTEGER, T => array<T>
ARRAY_INSERT_LAST: '<MDA>array_insert_last' | '<MDA>squad_slidein'; // <MDA>array_insert_last :: array<T>, T => array<T>
ARRAY_DELETE_FIRST: '<MDA>array_delete_first' | '<MDA>squad_chopfirst'; // <MDA>array_delete_first :: array<T> => array<T>
ARRAY_DELETE_AT: '<MDA>array_delete_at' | '<MDA>squad_chopspot'; // <MDA>array_delete_at :: array<T>, INTEGER => array<T>
ARRAY_DELETE_LAST: '<MDA>array_delete_last' | '<MDA>squad_choplast'; // <MDA>array_delete_last :: array<T> => array<T>

STRING_SLICE: '<MDA>string_slice' | '<MDA>squad_cut'; // <MDA>string_slice :: STRING, INTEGER, INTEGER => STRING
STRING_SPLIT: '<MDA>string_split' | '<MDA>squad_slay'; // <MDA>string_split :: STRING, CHARACTER => array<STRING>
STRING_SUBSTRING: '<MDA>string_substring' | '<MDA>squad_subquad'; // <MDA>string_substring :: STRING, STRING => BOOLEAN

INT_TO_DOUBLE: '<MDA>int_to_double' | '<MDA>rizz2g'; // <MDA>int_to_double :: INTEGER => DOUBLE
DOUBLE_TO_INT: '<MDA>double_to_int' | '<MDA>g2rizz'; // <MDA>double_to_int :: DOUBLE => INTEGER
BOOLEAN_TO_INT: '<MDA>boolean_to_int' | '<MDA>cappin2rizz'; // <MDA>boolean_to_int :: BOOLEAN => INTEGER
STRING_TO_INT: '<MDA>string_to_int' | '<MDA>squad2rizz'; // <MDA>string_to_int :: STRING => INTEGER
STRING_TO_DOUBLE: '<MDA>string_to_double' | '<MDA>squad2g'; // <MDA>string_to_double :: STRING => DOUBLE
INT_TO_STRING: '<MDA>int_to_string' | '<MDA>rizz2squad'; // <MDA>int_to_string :: INTEGER => STRING
DOUBLE_TO_STRING: '<MDA>double_to_string' | '<MDA>g2squad'; // <MDA>double_to_string :: DOUBLE => STRING

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
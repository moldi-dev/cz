grammar CZ;

@header {
    import java.util.*;
}

// Parser rules
program
    : function* main_function EOF
    ;

main_function
    : INT MAIN LEFT_PARANTHESIS RIGHT_PARANTHESIS block
    ;

function
    : type_ IDENTIFIER LEFT_PARANTHESIS parameters? RIGHT_PARANTHESIS block
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
    ;

break_statement
    : BREAK SEMICOLON
    ;

continue_statement
    : CONTINUE SEMICOLON
    ;

return_statement
    : RETURN expression?
    ;

function_call
    : IDENTIFIER LEFT_PARANTHESIS arguments? RIGHT_PARANTHESIS
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
    : PRINT LEFT_PARANTHESIS print_arguments? RIGHT_PARANTHESIS
    ;

print_arguments
    : expression (COMMA expression)*
    ;

read_statement
    : READ LEFT_PARANTHESIS IDENTIFIER RIGHT_PARANTHESIS
    ;

if_statement
    : IF LEFT_PARANTHESIS expression RIGHT_PARANTHESIS block (ELSE block)?
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
    : LEFT_PARANTHESIS expression RIGHT_PARANTHESIS                                                                 # parenExpression
    | op=(NOT | BITWISE_NOT) expression                                                                             # unaryExpression
    | left=expression op=(MULTIPLICATION | DIVISION | MODULUS) right=expression                                     # multiplicativeExpression
    | left=expression op=(ADDITION | SUBTRACTION) right=expression                                                  # additiveExpression
    | left=expression op=(SHIFT_LEFT | SHIFT_RIGHT) right=expression                                                # shiftExpression
    | left=expression op=(LESS_THAN | GREATER_THAN | LESS_THAN_OR_EQUAL | GREATER_THAN_OR_EQUAL) right=expression   # relationalExpression
    | left=expression op=(EQUALS | NOT_EQUALS) right=expression                                                     # equalityExpression
    | left=expression op=(BITWISE_AND | BITWISE_OR | BITWISE_XOR) right=expression                                  # bitwiseExpression
    | left=expression op=(LOGICAL_AND | LOGICAL_OR) right=expression                                                # logicalExpression
    | function_call                                                                                                 # functionCallExpression
    | IDENTIFIER                                                                                                    # identifierExpression
    | literal                                                                                                       # literalExpression
    ;

literal
    : INTEGER_NUMBER
    | DOUBLE_NUMBER
    | CHARACTER
    | STRING_LITERAL
    | boolean_literal
    ;

boolean_literal
    : TRUE
    | FALSE
    ;

type_
    : INT
    | DOUBLE
    | CHAR
    | STRING
    ;

// Lexer rules
// Keywords (both C and CZ versions)
INT: 'int' | 'rizz';
DOUBLE: 'double' | 'g';
CHAR: 'char' | 'fam';
STRING: 'string' | 'dope';
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

// Operators
SEMICOLON: ';';
COMMA: ',';
LEFT_PARANTHESIS: '(';
RIGHT_PARANTHESIS: ')';
LEFT_BRACE: '{';
RIGHT_BRACE: '}';
ASSIGNMENT: '=';
MODULUS: '%' | 'tralalero_tralala';
EQUALS: '==' | 'bruh';
NOT: '!';
NOT_EQUALS: '!=' | 'nah';
LESS_THAN: '<' | 'smol';
GREATER_THAN: '>' | 'big';
LESS_THAN_OR_EQUAL: '<=';
GREATER_THAN_OR_EQUAL: '>=';
ADDITION: '+' | 'extra';
SUBTRACTION: '-' | 'mid';
MULTIPLICATION: '*' | 'clapped';
DIVISION: '/' | 'ratioed';
LOGICAL_AND: '&&';
LOGICAL_OR: '||';
BITWISE_AND: '&';
BITWISE_OR: '|';
BITWISE_XOR: '^';
BITWISE_NOT: '~';
SHIFT_LEFT: '<<';
SHIFT_RIGHT: '>>';

// Literals
STRING_LITERAL: '"' (~["\\] | EscapeSequence)* '"';
CHARACTER: '\'' (~['\\] | EscapeSequence) '\'';
INTEGER_NUMBER: [0-9]+;
DOUBLE_NUMBER: [0-9]+ '.' [0-9]+;

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
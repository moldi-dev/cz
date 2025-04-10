%{
    #include <stdio.h>
    #include <stdlib.h>
    #include <string.h>

    extern FILE *yyin;
    extern int yylex();
    void yyerror(const char *s);

    typedef struct {
        char *id;
        int value;
    } variable;

    int get_var_value(char *id);
    void set_var(char *id, int value);

    variable vars[100];
    int var_count = 0;
%}

%union {
    int num;
    char *id;
}

%token BOOL INT PRINT FALSE TRUE IF WHILE FOR
%token EQUALS LESS GREATER ADD SUB MUL DIV RETURN MOD
%token SEMI LPAREN RPAREN LBRACE RBRACE ASSIGN EQ NEQ LT GT PLUS MINUS TIMES DIVIDE LTE GTE

%token <num> NUMBER
%token <id> ID
%type <num> expr boolean condition

%%

program: 
    | program statement SEMI
    ;

statement: 
      declaration
    | assignment
    | print_stmt
    | if_stmt
    | while_loop
    ;

declaration:
      INT ID ASSIGN expr { set_var($2, $4); }
    | BOOL ID ASSIGN boolean { printf("Bool support coming soon, bestie!\n"); }
    ;

assignment:
    ID ASSIGN expr { set_var($1, $3); }
    ;

print_stmt:
    PRINT expr { printf("📢: %d\n", $2); }
    ;

if_stmt:
    IF LPAREN condition RPAREN LBRACE program RBRACE
    ;

while_loop:
    WHILE LPAREN condition RPAREN LBRACE program RBRACE
    ;

condition:
    expr EQ expr { $$ = ($1 == $3); }
    | expr NEQ expr { $$ = ($1 != $3); }
    | expr LT expr { $$ = ($1 < $3); }
    | expr GT expr { $$ = ($1 > $3); }
    | expr LTE expr { $$ = ($1 <= $3); }
    | expr GTE expr { $$ = ($1 >= $3); }
    ;

boolean:
    TRUE { $$ = 1; }
    | FALSE { $$ = 0; }
    ;

expr:
    NUMBER { $$ = $1; }
    | ID { $$ = get_var_value($1); }
    | expr PLUS expr { $$ = $1 + $3; }
    | expr MINUS expr { $$ = $1 - $3; }
    | expr TIMES expr { $$ = $1 * $3; }
    | expr DIVIDE expr { $$ = $1 / $3; }
    | expr MOD expr { $$ = $1 % $3; }  
    | LPAREN expr RPAREN { $$ = $2; }
    ;

%%

int get_var_value(char *id) {
    for (int i = 0; i < var_count; i++) {
        if (strcmp(vars[i].id, id) == 0) {
            return vars[i].value;
        }
    }

    yyerror("🔥 That var is ghosted (not found)");
    return 0;
}

void set_var(char *id, int value) {
    for (int i = 0; i < var_count; i++) {
        if (strcmp(vars[i].id, id) == 0) {
            vars[i].value = value;
            return;
        }
    }

    vars[var_count].id = strdup(id);
    vars[var_count].value = value;
    var_count++;
}

void yyerror(const char *s) {
    fprintf(stderr, "💀 Error: %s\n", s);
}

int main() {
    printf("✨ CZ Interpreter - C with Gen Z Slang | Normalize Gen Z Programming bestie! ✨\n");
    yyparse();
    return 0;
}
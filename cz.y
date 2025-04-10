%{
    #include <stdio.h>
    #include <stdlib.h>
    #include <string.h>
    
    #include "functions.h"
    #include "defines.h"

    extern FILE *yyin;
    extern int yylex();
    void yyerror(const char *s);
%}

%union {
    int num;
    char *id;
    struct Node *node;
    struct Node **stmts;
}

%token BOOL INT PRINT FALSE TRUE IF ELSE WHILE FOR BREAK CONTINUE COMMA LIST
%token ADD SUB MUL DIV MOD
%token SEMI LPAREN RPAREN LBRACE RBRACE LBRACKET RBRACKET ASSIGN EQ NEQ LT GT LTE GTE

%token <num> NUMBER
%token <id> ID
%type <node> expr condition statement print_stmt assignment declaration if_stmt while_loop for_loop compound_stmt
%type <stmts> stmt_list

%left EQ NEQ LT GT LTE GTE
%left ADD SUB
%left MUL DIV MOD

%%

program:
    stmt_list {
        Node *block = make_block($1, -1); // -1 = already counted
        eval_block(block);
    }
    ;

stmt_list:
      /* empty */ { $$ = NULL; }
    | stmt_list statement {
        int count = 0;
        while ($1 && $1[count]) count++;

        $$ = malloc(sizeof(Node*) * (count + 2));
        for (int i = 0; i < count; i++) $$[i] = $1[i];
        $$[count] = $2;
        $$[count + 1] = NULL;
    }
    | statement {
        $$ = malloc(sizeof(Node*) * 2);
        $$[0] = $1;
        $$[1] = NULL;
    }
    ;

statement:
      declaration SEMI      { $$ = $1; }
    | assignment SEMI       { $$ = $1; }
    | print_stmt SEMI       { $$ = $1; }
    | if_stmt               { $$ = $1; }
    | while_loop            { $$ = $1; }
    | for_loop              { $$ = $1; }
    | BREAK SEMI            { $$ = make_break(); }
    | CONTINUE SEMI         { $$ = make_continue(); }
    ;

declaration:
      INT ID ASSIGN expr                         { $$ = make_assign($2, $4); }
    | BOOL ID ASSIGN expr                        { $$ = make_declaration($2); }
    | INT ID                                     { $$ = make_declaration($2); }
    | BOOL ID                                    { $$ = make_declaration($2); }
    | LIST ID                                    { /* */ }
    | LIST ID ASSIGN LBRACKET RBRACKET           { /* */ }
    | LIST ID ASSIGN LBRACKET list_expr RBRACKET { /* */ }
    ;

list_expr:
    NUMBER                        { /* */ }
    | list_expr COMMA NUMBER      { /* */ }
    |
    ;

assignment:
    ID ASSIGN expr           { $$ = make_assign($1, $3); }
    ;

print_stmt:
    PRINT expr               { $$ = make_print($2); }
    ;

if_stmt:
    IF LPAREN condition RPAREN compound_stmt {
        $$ = make_if($3, $5);
    }
    | IF LPAREN condition RPAREN compound_stmt ELSE compound_stmt {
        $$ = make_if_else($3, $5, $7);
    }
    ;

while_loop:
    WHILE LPAREN condition RPAREN compound_stmt {
        $$ = make_while($3, $5);
    }
    ;

for_loop:
    FOR LPAREN declaration SEMI condition SEMI assignment RPAREN compound_stmt {
        $$ = make_for($3, $5, $7, $9);
    }
    | FOR LPAREN assignment SEMI condition SEMI assignment RPAREN compound_stmt {
        $$ = make_for($3, $5, $7, $9);
    }
    ;

compound_stmt:
    LBRACE stmt_list RBRACE {
        $$ = make_block($2, -1);
    }
    ;

condition:
    expr EQ expr  { $$ = make_binary(EQ, $1, $3); }
    | expr NEQ expr { $$ = make_binary(NEQ, $1, $3); }
    | expr LT expr  { $$ = make_binary(LT, $1, $3); }
    | expr GT expr  { $$ = make_binary(GT, $1, $3); }
    | expr LTE expr { $$ = make_binary(LTE, $1, $3); }
    | expr GTE expr { $$ = make_binary(GTE, $1, $3); }
    ;

expr:
      NUMBER           { $$ = make_num($1); }
    | ID               { $$ = make_var($1); }
    | TRUE             { $$ = make_num(1); }
    | FALSE            { $$ = make_num(0); }
    | expr ADD expr    { $$ = make_binary(ADD, $1, $3); }
    | expr SUB expr    { $$ = make_binary(SUB, $1, $3); }
    | expr MUL expr    { $$ = make_binary(MUL, $1, $3); }
    | expr DIV expr    { $$ = make_binary(DIV, $1, $3); }
    | expr MOD expr    { $$ = make_binary(MOD, $1, $3); }
    | LPAREN expr RPAREN { $$ = $2; }
    ;

%%

void yyerror(const char *s) {
    fprintf(stderr, "💀 Error: %s\n", s);
}

int main(int argc, char **argv) {
    printf("\n\n\n");
    printf("✨ CZ Interpreter - C with Gen Z Slang | Normalize Gen Z coding bestie ✨\n");
    
    if (argc > 1) {
        FILE *file = fopen(argv[1], "r");
        
        if (!file) {
            fprintf(stderr, "💀 Error: Could not open file '%s'\n", argv[1]);
            return 1;
        }
        
        printf("📁 Parsing file: %s\n", argv[1]);
        printf("📝 File contents:\n");
        printf("------------------\n");
        
        char line[256];
        
        while (fgets(line, sizeof(line), file)) {
            printf("%s", line);
        }

        printf("\n------------------\n\n");
        
        fseek(file, 0, SEEK_SET);
        yyin = file;
        
        yyparse();
        
        fclose(file);
    } 
    
    else {
        printf("💬 Enter your code then hit Ctrl + D to run it:\n");
        yyin = stdin;
        yyparse();
    }
    
    return 0;
}
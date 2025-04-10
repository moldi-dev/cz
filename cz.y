%{
    #include <stdio.h>
    #include <stdlib.h>
    #include <string.h>

    extern FILE *yyin;
    extern int yylex();
    void yyerror(const char *s);

    // ----------------- AST NODE TYPES -----------------

    typedef enum { 
        NODE_PROGRAM, NODE_ASSIGN, NODE_PRINT, NODE_IF, NODE_WHILE, NODE_FOR, 
        NODE_BLOCK, NODE_EXPR, NODE_COND, NODE_VAR, NODE_NUM, 
        NODE_BINOP
    } NodeType;

    typedef struct Node {
        NodeType type;
        union {
            struct { struct Node *left, *right; int op; } binary;
            struct { char *id; struct Node *expr; } assign;
            struct { struct Node *expr; } print;
            struct { struct Node *cond; struct Node *body; } while_loop;
            struct { struct Node *cond; struct Node *body; } if_stmt;
            struct { struct Node **stmts; int count; } block;
            struct { int value; } num;
            struct { char *id; } var;
        };
    } Node;

    // ----------------- VARIABLE STORE -----------------

    typedef struct {
        char *id;
        int value;
    } variable;

    variable vars[100];
    int var_count = 0;

    int get_var_value(char *id);
    void set_var(char *id, int value);

    // ----------------- EVALUATION -----------------

    int eval(Node *node);
    void eval_block(Node *block);

    // ----------------- HELPERS -----------------

    Node *make_num(int value);
    Node *make_var(char *id);
    Node *make_binary(int op, Node *left, Node *right);
    Node *make_assign(char *id, Node *expr);
    Node *make_print(Node *expr);
    Node *make_while(Node *cond, Node *body);
    Node *make_if(Node *cond, Node *body);
    Node *make_block(Node **stmts, int count);

%}

%union {
    int num;
    char *id;
    struct Node *node;
    struct Node **stmts;
}

%token BOOL INT PRINT FALSE TRUE IF WHILE FOR
%token ADD SUB MUL DIV MOD
%token SEMI LPAREN RPAREN LBRACE RBRACE ASSIGN EQ NEQ LT GT LTE GTE

%token <num> NUMBER
%token <id> ID
%type <node> expr condition statement print_stmt assignment declaration if_stmt while_loop compound_stmt
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
    ;

declaration:
      INT ID ASSIGN expr     { $$ = make_assign($2, $4); }
    | BOOL ID ASSIGN expr    { $$ = make_assign($2, $4); }
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
    ;

while_loop:
    WHILE LPAREN condition RPAREN compound_stmt {
        $$ = make_while($3, $5);
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
    | expr ADD expr    { $$ = make_binary(ADD, $1, $3); }
    | expr SUB expr    { $$ = make_binary(SUB, $1, $3); }
    | expr MUL expr    { $$ = make_binary(MUL, $1, $3); }
    | expr DIV expr    { $$ = make_binary(DIV, $1, $3); }
    | expr MOD expr    { $$ = make_binary(MOD, $1, $3); }
    | LPAREN expr RPAREN { $$ = $2; }
    ;

%%

int get_var_value(char *id) {
    for (int i = 0; i < var_count; i++)
        if (strcmp(vars[i].id, id) == 0)
            return vars[i].value;
    yyerror("🔥 That var is ghosted (not found)");
    return 0;
}

void set_var(char *id, int value) {
    for (int i = 0; i < var_count; i++)
        if (strcmp(vars[i].id, id) == 0) {
            vars[i].value = value;
            return;
        }
    vars[var_count].id = strdup(id);
    vars[var_count].value = value;
    var_count++;
}

int eval(Node *node) {
    if (!node) return 0;

    switch (node->type) {
        case NODE_NUM: return node->num.value;
        case NODE_VAR: return get_var_value(node->var.id);
        case NODE_BINOP: {
            int l = eval(node->binary.left);
            int r = eval(node->binary.right);
            switch (node->binary.op) {
                case ADD: return l + r;
                case SUB: return l - r;
                case MUL: return l * r;
                case DIV: return l / r;
                case MOD: return l % r;
                case EQ:  return l == r;
                case NEQ: return l != r;
                case LT:  return l < r;
                case GT:  return l > r;
                case LTE: return l <= r;
                case GTE: return l >= r;
            }
        }
        case NODE_ASSIGN: {
            int val = eval(node->assign.expr);
            set_var(node->assign.id, val);
            return val;
        }
        case NODE_PRINT: {
            int val = eval(node->print.expr);
            printf("📢: %d\n", val);
            return val;
        }
        case NODE_IF: {
            if (eval(node->if_stmt.cond))
                eval_block(node->if_stmt.body);
            return 0;
        }
        case NODE_WHILE: {
            while (eval(node->while_loop.cond))
                eval_block(node->while_loop.body);
            return 0;
        }
        default: return 0;
    }
}

void eval_block(Node *block) {
    for (int i = 0; block->block.stmts && block->block.stmts[i]; i++)
        eval(block->block.stmts[i]);
}

// ------------------ Constructors ------------------

Node *make_num(int value) {
    Node *n = malloc(sizeof(Node));
    n->type = NODE_NUM;
    n->num.value = value;
    return n;
}

Node *make_var(char *id) {
    Node *n = malloc(sizeof(Node));
    n->type = NODE_VAR;
    n->var.id = strdup(id);
    return n;
}

Node *make_binary(int op, Node *left, Node *right) {
    Node *n = malloc(sizeof(Node));
    n->type = NODE_BINOP;
    n->binary.op = op;
    n->binary.left = left;
    n->binary.right = right;
    return n;
}

Node *make_assign(char *id, Node *expr) {
    Node *n = malloc(sizeof(Node));
    n->type = NODE_ASSIGN;
    n->assign.id = strdup(id);
    n->assign.expr = expr;
    return n;
}

Node *make_print(Node *expr) {
    Node *n = malloc(sizeof(Node));
    n->type = NODE_PRINT;
    n->print.expr = expr;
    return n;
}

Node *make_if(Node *cond, Node *body) {
    Node *n = malloc(sizeof(Node));
    n->type = NODE_IF;
    n->if_stmt.cond = cond;
    n->if_stmt.body = body;
    return n;
}

Node *make_while(Node *cond, Node *body) {
    Node *n = malloc(sizeof(Node));
    n->type = NODE_WHILE;
    n->while_loop.cond = cond;
    n->while_loop.body = body;
    return n;
}

Node *make_block(Node **stmts, int count) {
    Node *n = malloc(sizeof(Node));
    n->type = NODE_BLOCK;
    n->block.stmts = stmts;
    n->block.count = count;
    return n;
}

void yyerror(const char *s) {
    fprintf(stderr, "💀 Error: %s\n", s);
}

int main() {
    printf("✨ CZ Interpreter - C with Gen Z Slang | AST mode activated ✨\n");
    yyparse();
    return 0;
}

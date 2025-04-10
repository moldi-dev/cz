#ifndef DEFINES_H
#define DEFINES_H

#define MAX_VARS 100

typedef enum { 
    NODE_PROGRAM, NODE_ASSIGN, NODE_DECLARE, NODE_PRINT, NODE_IF, NODE_IF_ELSE, NODE_WHILE, NODE_FOR,  
    NODE_BLOCK, NODE_EXPR, NODE_COND, NODE_VAR, NODE_NUM, 
    NODE_BINOP, NODE_BREAK, NODE_CONTINUE, NODE_LIST
} NodeType;

typedef struct Node {
    NodeType type;
    union {
        struct { struct Node *left, *right; int op; } binary;
        struct { char *id; struct Node *expr; } assign;
        struct { struct Node *expr; } print;
        struct { struct Node *cond; struct Node *body; } while_loop;
        struct { struct Node *init, *cond, *incr, *body; } for_loop;
        struct { struct Node *cond; struct Node *body; } if_stmt;
        struct { struct Node *cond, *if_branch, *else_branch; } if_else_stmt;
        struct { struct Node **stmts; int count; } block;
        struct { int value; } num;
        struct { char *id; } var;
    };
} Node;

typedef struct {
    char *id;
    int value;
} variable;

extern variable vars[MAX_VARS];
extern int var_count;

#endif
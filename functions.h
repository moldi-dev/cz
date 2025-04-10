#ifndef FUNCTIONS_H
#define FUNCTIONS_H

#include "functions.h"
#include "defines.h"
#include "y.tab.h"

int get_var_value(char *id);
void set_var(char *id, int value);

int eval(Node *node);
int eval_block(Node *block);

Node *make_num(int value);
Node *make_var(char *id);
Node *make_binary(int op, Node *left, Node *right);
Node *make_assign(char *id, Node *expr);
Node *make_declaration(char *id);
Node *make_print(Node *expr);
Node *make_while(Node *cond, Node *body);
Node *make_for(Node *init, Node *cond, Node *incr, Node *body);
Node *make_if(Node *cond, Node *body);
Node *make_if_else(Node *cond, Node *if_branch, Node *else_branch);
Node *make_block(Node **stmts, int count);
Node *make_break();
Node *make_continue();

#endif
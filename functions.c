#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#include "functions.h"
#include "defines.h"
#include "y.tab.h"

variable vars[100];
int var_count = 0;

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
            if (eval(node->if_stmt.cond)) {
                int result = eval_block(node->if_stmt.body);
                if (result == 1155 || result == 1156) return result;
            }
            return 0;
        }
        case NODE_IF_ELSE: {
            if (eval(node->if_else_stmt.cond)) {
                int result = eval_block(node->if_else_stmt.if_branch);
                if (result == 1155 || result == 1156) return result;
            } 
            else {
                int result = eval_block(node->if_else_stmt.else_branch);
                if (result == 1155 || result == 1156) return result;
            }
            return 0;
        }
        case NODE_WHILE: {
            while (eval(node->while_loop.cond)) {
                int result = eval_block(node->while_loop.body);
                if (result == 1155) break;
                if (result == 1156) continue;
            }
            return 0;
        }
        case NODE_FOR: {
            eval(node->for_loop.init);
            while (eval(node->for_loop.cond)) {
                int result = eval_block(node->for_loop.body);
                if (result == 1155) break;
                if (result == 1156) {
                    eval(node->for_loop.incr);
                    continue;
                }
                eval(node->for_loop.incr);
            }
            return 0;
        }
        case NODE_BREAK: return 1155;
        case NODE_CONTINUE: return 1156;
        default: return 0;
    }
}

int eval_block(Node *block) {
    for (int i = 0; block->block.stmts && block->block.stmts[i]; i++) {
        int result = eval(block->block.stmts[i]);
        if (result == 1155 || result == 1156) {
            return result;
        }
    }
    return 0;
}

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

Node *make_if_else(Node *cond, Node *if_branch, Node *else_branch) {
    Node *n = malloc(sizeof(Node));
    n->type = NODE_IF_ELSE;
    n->if_else_stmt.cond = cond;
    n->if_else_stmt.if_branch = if_branch;
    n->if_else_stmt.else_branch = else_branch;
    return n;
}

Node *make_while(Node *cond, Node *body) {
    Node *n = malloc(sizeof(Node));
    n->type = NODE_WHILE;
    n->while_loop.cond = cond;
    n->while_loop.body = body;
    return n;
}

Node *make_for(Node *init, Node *cond, Node *incr, Node *body) {
    Node *n = malloc(sizeof(Node));
    n->type = NODE_FOR;
    n->for_loop.init = init;
    n->for_loop.cond = cond;
    n->for_loop.incr = incr;
    n->for_loop.body = body;
    return n;
}

Node *make_block(Node **stmts, int count) {
    Node *n = malloc(sizeof(Node));
    n->type = NODE_BLOCK;
    n->block.stmts = stmts;
    n->block.count = count;
    return n;
}

Node *make_break() {
    Node *n = malloc(sizeof(Node));
    n->type = NODE_BREAK;
    return n;
}

Node *make_continue() {
    Node *n = malloc(sizeof(Node));
    n->type = NODE_CONTINUE;
    return n;
}
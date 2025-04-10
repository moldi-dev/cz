/* A Bison parser, made by GNU Bison 3.8.2.  */

/* Bison interface for Yacc-like parsers in C

   Copyright (C) 1984, 1989-1990, 2000-2015, 2018-2021 Free Software Foundation,
   Inc.

   This program is free software: you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation, either version 3 of the License, or
   (at your option) any later version.

   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.

   You should have received a copy of the GNU General Public License
   along with this program.  If not, see <https://www.gnu.org/licenses/>.  */

/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
   special exception, which will cause the skeleton and the resulting
   Bison output files to be licensed under the GNU General Public
   License without this special exception.

   This special exception was added by the Free Software Foundation in
   version 2.2 of Bison.  */

/* DO NOT RELY ON FEATURES THAT ARE NOT DOCUMENTED in the manual,
   especially those whose name start with YY_ or yy_.  They are
   private implementation details that can be changed or removed.  */

#ifndef YY_YY_Y_TAB_H_INCLUDED
# define YY_YY_Y_TAB_H_INCLUDED
/* Debug traces.  */
#ifndef YYDEBUG
# define YYDEBUG 0
#endif
#if YYDEBUG
extern int yydebug;
#endif

/* Token kinds.  */
#ifndef YYTOKENTYPE
# define YYTOKENTYPE
  enum yytokentype
  {
    YYEMPTY = -2,
    YYEOF = 0,                     /* "end of file"  */
    YYerror = 256,                 /* error  */
    YYUNDEF = 257,                 /* "invalid token"  */
    BOOL = 258,                    /* BOOL  */
    INT = 259,                     /* INT  */
    PRINT = 260,                   /* PRINT  */
    FALSE = 261,                   /* FALSE  */
    TRUE = 262,                    /* TRUE  */
    IF = 263,                      /* IF  */
    ELSE = 264,                    /* ELSE  */
    WHILE = 265,                   /* WHILE  */
    FOR = 266,                     /* FOR  */
    BREAK = 267,                   /* BREAK  */
    CONTINUE = 268,                /* CONTINUE  */
    COMMA = 269,                   /* COMMA  */
    ADD = 270,                     /* ADD  */
    SUB = 271,                     /* SUB  */
    MUL = 272,                     /* MUL  */
    DIV = 273,                     /* DIV  */
    MOD = 274,                     /* MOD  */
    SEMI = 275,                    /* SEMI  */
    LPAREN = 276,                  /* LPAREN  */
    RPAREN = 277,                  /* RPAREN  */
    LBRACE = 278,                  /* LBRACE  */
    RBRACE = 279,                  /* RBRACE  */
    ASSIGN = 280,                  /* ASSIGN  */
    EQ = 281,                      /* EQ  */
    NEQ = 282,                     /* NEQ  */
    LT = 283,                      /* LT  */
    GT = 284,                      /* GT  */
    LTE = 285,                     /* LTE  */
    GTE = 286,                     /* GTE  */
    NUMBER = 287,                  /* NUMBER  */
    ID = 288                       /* ID  */
  };
  typedef enum yytokentype yytoken_kind_t;
#endif
/* Token kinds.  */
#define YYEMPTY -2
#define YYEOF 0
#define YYerror 256
#define YYUNDEF 257
#define BOOL 258
#define INT 259
#define PRINT 260
#define FALSE 261
#define TRUE 262
#define IF 263
#define ELSE 264
#define WHILE 265
#define FOR 266
#define BREAK 267
#define CONTINUE 268
#define COMMA 269
#define ADD 270
#define SUB 271
#define MUL 272
#define DIV 273
#define MOD 274
#define SEMI 275
#define LPAREN 276
#define RPAREN 277
#define LBRACE 278
#define RBRACE 279
#define ASSIGN 280
#define EQ 281
#define NEQ 282
#define LT 283
#define GT 284
#define LTE 285
#define GTE 286
#define NUMBER 287
#define ID 288

/* Value type.  */
#if ! defined YYSTYPE && ! defined YYSTYPE_IS_DECLARED
union YYSTYPE
{
#line 14 "cz.y"

    int num;
    char *id;
    struct Node *node;
    struct Node **stmts;

#line 140 "y.tab.h"

};
typedef union YYSTYPE YYSTYPE;
# define YYSTYPE_IS_TRIVIAL 1
# define YYSTYPE_IS_DECLARED 1
#endif


extern YYSTYPE yylval;


int yyparse (void);


#endif /* !YY_YY_Y_TAB_H_INCLUDED  */

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
    WHILE = 264,                   /* WHILE  */
    FOR = 265,                     /* FOR  */
    EQUALS = 266,                  /* EQUALS  */
    LESS = 267,                    /* LESS  */
    GREATER = 268,                 /* GREATER  */
    ADD = 269,                     /* ADD  */
    SUB = 270,                     /* SUB  */
    MUL = 271,                     /* MUL  */
    DIV = 272,                     /* DIV  */
    RETURN = 273,                  /* RETURN  */
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
    PLUS = 285,                    /* PLUS  */
    MINUS = 286,                   /* MINUS  */
    TIMES = 287,                   /* TIMES  */
    DIVIDE = 288,                  /* DIVIDE  */
    LTE = 289,                     /* LTE  */
    GTE = 290,                     /* GTE  */
    NUMBER = 291,                  /* NUMBER  */
    ID = 292                       /* ID  */
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
#define WHILE 264
#define FOR 265
#define EQUALS 266
#define LESS 267
#define GREATER 268
#define ADD 269
#define SUB 270
#define MUL 271
#define DIV 272
#define RETURN 273
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
#define PLUS 285
#define MINUS 286
#define TIMES 287
#define DIVIDE 288
#define LTE 289
#define GTE 290
#define NUMBER 291
#define ID 292

/* Value type.  */
#if ! defined YYSTYPE && ! defined YYSTYPE_IS_DECLARED
union YYSTYPE
{
#line 22 "cz.y"

    int num;
    char *id;

#line 146 "y.tab.h"

};
typedef union YYSTYPE YYSTYPE;
# define YYSTYPE_IS_TRIVIAL 1
# define YYSTYPE_IS_DECLARED 1
#endif


extern YYSTYPE yylval;


int yyparse (void);


#endif /* !YY_YY_Y_TAB_H_INCLUDED  */

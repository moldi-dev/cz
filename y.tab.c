/* A Bison parser, made by GNU Bison 3.8.2.  */

/* Bison implementation for Yacc-like parsers in C

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

/* C LALR(1) parser skeleton written by Richard Stallman, by
   simplifying the original so-called "semantic" parser.  */

/* DO NOT RELY ON FEATURES THAT ARE NOT DOCUMENTED in the manual,
   especially those whose name start with YY_ or yy_.  They are
   private implementation details that can be changed or removed.  */

/* All symbols defined below should begin with yy or YY, to avoid
   infringing on user name space.  This should be done even for local
   variables, as they might otherwise be expanded by user macros.
   There are some unavoidable exceptions within include files to
   define necessary library symbols; they are noted "INFRINGES ON
   USER NAME SPACE" below.  */

/* Identify Bison output, and Bison version.  */
#define YYBISON 30802

/* Bison version string.  */
#define YYBISON_VERSION "3.8.2"

/* Skeleton name.  */
#define YYSKELETON_NAME "yacc.c"

/* Pure parsers.  */
#define YYPURE 0

/* Push parsers.  */
#define YYPUSH 0

/* Pull parsers.  */
#define YYPULL 1




/* First part of user prologue.  */
#line 1 "cz.y"

    #include <stdio.h>
    #include <stdlib.h>
    #include <string.h>
    
    #include "functions.h"
    #include "defines.h"

    extern FILE *yyin;
    extern int yylex();
    void yyerror(const char *s);

#line 84 "y.tab.c"

# ifndef YY_CAST
#  ifdef __cplusplus
#   define YY_CAST(Type, Val) static_cast<Type> (Val)
#   define YY_REINTERPRET_CAST(Type, Val) reinterpret_cast<Type> (Val)
#  else
#   define YY_CAST(Type, Val) ((Type) (Val))
#   define YY_REINTERPRET_CAST(Type, Val) ((Type) (Val))
#  endif
# endif
# ifndef YY_NULLPTR
#  if defined __cplusplus
#   if 201103L <= __cplusplus
#    define YY_NULLPTR nullptr
#   else
#    define YY_NULLPTR 0
#   endif
#  else
#   define YY_NULLPTR ((void*)0)
#  endif
# endif

/* Use api.header.include to #include this header
   instead of duplicating it here.  */
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
    LIST = 270,                    /* LIST  */
    ADD = 271,                     /* ADD  */
    SUB = 272,                     /* SUB  */
    MUL = 273,                     /* MUL  */
    DIV = 274,                     /* DIV  */
    MOD = 275,                     /* MOD  */
    SEMI = 276,                    /* SEMI  */
    LPAREN = 277,                  /* LPAREN  */
    RPAREN = 278,                  /* RPAREN  */
    LBRACE = 279,                  /* LBRACE  */
    RBRACE = 280,                  /* RBRACE  */
    LBRACKET = 281,                /* LBRACKET  */
    RBRACKET = 282,                /* RBRACKET  */
    ASSIGN = 283,                  /* ASSIGN  */
    EQ = 284,                      /* EQ  */
    NEQ = 285,                     /* NEQ  */
    LT = 286,                      /* LT  */
    GT = 287,                      /* GT  */
    LTE = 288,                     /* LTE  */
    GTE = 289,                     /* GTE  */
    NUMBER = 290,                  /* NUMBER  */
    ID = 291                       /* ID  */
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
#define LIST 270
#define ADD 271
#define SUB 272
#define MUL 273
#define DIV 274
#define MOD 275
#define SEMI 276
#define LPAREN 277
#define RPAREN 278
#define LBRACE 279
#define RBRACE 280
#define LBRACKET 281
#define RBRACKET 282
#define ASSIGN 283
#define EQ 284
#define NEQ 285
#define LT 286
#define GT 287
#define LTE 288
#define GTE 289
#define NUMBER 290
#define ID 291

/* Value type.  */
#if ! defined YYSTYPE && ! defined YYSTYPE_IS_DECLARED
union YYSTYPE
{
#line 14 "cz.y"

    int num;
    char *id;
    struct Node *node;
    struct Node **stmts;

#line 216 "y.tab.c"

};
typedef union YYSTYPE YYSTYPE;
# define YYSTYPE_IS_TRIVIAL 1
# define YYSTYPE_IS_DECLARED 1
#endif


extern YYSTYPE yylval;


int yyparse (void);


#endif /* !YY_YY_Y_TAB_H_INCLUDED  */
/* Symbol kind.  */
enum yysymbol_kind_t
{
  YYSYMBOL_YYEMPTY = -2,
  YYSYMBOL_YYEOF = 0,                      /* "end of file"  */
  YYSYMBOL_YYerror = 1,                    /* error  */
  YYSYMBOL_YYUNDEF = 2,                    /* "invalid token"  */
  YYSYMBOL_BOOL = 3,                       /* BOOL  */
  YYSYMBOL_INT = 4,                        /* INT  */
  YYSYMBOL_PRINT = 5,                      /* PRINT  */
  YYSYMBOL_FALSE = 6,                      /* FALSE  */
  YYSYMBOL_TRUE = 7,                       /* TRUE  */
  YYSYMBOL_IF = 8,                         /* IF  */
  YYSYMBOL_ELSE = 9,                       /* ELSE  */
  YYSYMBOL_WHILE = 10,                     /* WHILE  */
  YYSYMBOL_FOR = 11,                       /* FOR  */
  YYSYMBOL_BREAK = 12,                     /* BREAK  */
  YYSYMBOL_CONTINUE = 13,                  /* CONTINUE  */
  YYSYMBOL_COMMA = 14,                     /* COMMA  */
  YYSYMBOL_LIST = 15,                      /* LIST  */
  YYSYMBOL_ADD = 16,                       /* ADD  */
  YYSYMBOL_SUB = 17,                       /* SUB  */
  YYSYMBOL_MUL = 18,                       /* MUL  */
  YYSYMBOL_DIV = 19,                       /* DIV  */
  YYSYMBOL_MOD = 20,                       /* MOD  */
  YYSYMBOL_SEMI = 21,                      /* SEMI  */
  YYSYMBOL_LPAREN = 22,                    /* LPAREN  */
  YYSYMBOL_RPAREN = 23,                    /* RPAREN  */
  YYSYMBOL_LBRACE = 24,                    /* LBRACE  */
  YYSYMBOL_RBRACE = 25,                    /* RBRACE  */
  YYSYMBOL_LBRACKET = 26,                  /* LBRACKET  */
  YYSYMBOL_RBRACKET = 27,                  /* RBRACKET  */
  YYSYMBOL_ASSIGN = 28,                    /* ASSIGN  */
  YYSYMBOL_EQ = 29,                        /* EQ  */
  YYSYMBOL_NEQ = 30,                       /* NEQ  */
  YYSYMBOL_LT = 31,                        /* LT  */
  YYSYMBOL_GT = 32,                        /* GT  */
  YYSYMBOL_LTE = 33,                       /* LTE  */
  YYSYMBOL_GTE = 34,                       /* GTE  */
  YYSYMBOL_NUMBER = 35,                    /* NUMBER  */
  YYSYMBOL_ID = 36,                        /* ID  */
  YYSYMBOL_YYACCEPT = 37,                  /* $accept  */
  YYSYMBOL_program = 38,                   /* program  */
  YYSYMBOL_stmt_list = 39,                 /* stmt_list  */
  YYSYMBOL_statement = 40,                 /* statement  */
  YYSYMBOL_declaration = 41,               /* declaration  */
  YYSYMBOL_list_expr = 42,                 /* list_expr  */
  YYSYMBOL_assignment = 43,                /* assignment  */
  YYSYMBOL_print_stmt = 44,                /* print_stmt  */
  YYSYMBOL_if_stmt = 45,                   /* if_stmt  */
  YYSYMBOL_while_loop = 46,                /* while_loop  */
  YYSYMBOL_for_loop = 47,                  /* for_loop  */
  YYSYMBOL_compound_stmt = 48,             /* compound_stmt  */
  YYSYMBOL_condition = 49,                 /* condition  */
  YYSYMBOL_expr = 50                       /* expr  */
};
typedef enum yysymbol_kind_t yysymbol_kind_t;




#ifdef short
# undef short
#endif

/* On compilers that do not define __PTRDIFF_MAX__ etc., make sure
   <limits.h> and (if available) <stdint.h> are included
   so that the code can choose integer types of a good width.  */

#ifndef __PTRDIFF_MAX__
# include <limits.h> /* INFRINGES ON USER NAME SPACE */
# if defined __STDC_VERSION__ && 199901 <= __STDC_VERSION__
#  include <stdint.h> /* INFRINGES ON USER NAME SPACE */
#  define YY_STDINT_H
# endif
#endif

/* Narrow types that promote to a signed type and that can represent a
   signed or unsigned integer of at least N bits.  In tables they can
   save space and decrease cache pressure.  Promoting to a signed type
   helps avoid bugs in integer arithmetic.  */

#ifdef __INT_LEAST8_MAX__
typedef __INT_LEAST8_TYPE__ yytype_int8;
#elif defined YY_STDINT_H
typedef int_least8_t yytype_int8;
#else
typedef signed char yytype_int8;
#endif

#ifdef __INT_LEAST16_MAX__
typedef __INT_LEAST16_TYPE__ yytype_int16;
#elif defined YY_STDINT_H
typedef int_least16_t yytype_int16;
#else
typedef short yytype_int16;
#endif

/* Work around bug in HP-UX 11.23, which defines these macros
   incorrectly for preprocessor constants.  This workaround can likely
   be removed in 2023, as HPE has promised support for HP-UX 11.23
   (aka HP-UX 11i v2) only through the end of 2022; see Table 2 of
   <https://h20195.www2.hpe.com/V2/getpdf.aspx/4AA4-7673ENW.pdf>.  */
#ifdef __hpux
# undef UINT_LEAST8_MAX
# undef UINT_LEAST16_MAX
# define UINT_LEAST8_MAX 255
# define UINT_LEAST16_MAX 65535
#endif

#if defined __UINT_LEAST8_MAX__ && __UINT_LEAST8_MAX__ <= __INT_MAX__
typedef __UINT_LEAST8_TYPE__ yytype_uint8;
#elif (!defined __UINT_LEAST8_MAX__ && defined YY_STDINT_H \
       && UINT_LEAST8_MAX <= INT_MAX)
typedef uint_least8_t yytype_uint8;
#elif !defined __UINT_LEAST8_MAX__ && UCHAR_MAX <= INT_MAX
typedef unsigned char yytype_uint8;
#else
typedef short yytype_uint8;
#endif

#if defined __UINT_LEAST16_MAX__ && __UINT_LEAST16_MAX__ <= __INT_MAX__
typedef __UINT_LEAST16_TYPE__ yytype_uint16;
#elif (!defined __UINT_LEAST16_MAX__ && defined YY_STDINT_H \
       && UINT_LEAST16_MAX <= INT_MAX)
typedef uint_least16_t yytype_uint16;
#elif !defined __UINT_LEAST16_MAX__ && USHRT_MAX <= INT_MAX
typedef unsigned short yytype_uint16;
#else
typedef int yytype_uint16;
#endif

#ifndef YYPTRDIFF_T
# if defined __PTRDIFF_TYPE__ && defined __PTRDIFF_MAX__
#  define YYPTRDIFF_T __PTRDIFF_TYPE__
#  define YYPTRDIFF_MAXIMUM __PTRDIFF_MAX__
# elif defined PTRDIFF_MAX
#  ifndef ptrdiff_t
#   include <stddef.h> /* INFRINGES ON USER NAME SPACE */
#  endif
#  define YYPTRDIFF_T ptrdiff_t
#  define YYPTRDIFF_MAXIMUM PTRDIFF_MAX
# else
#  define YYPTRDIFF_T long
#  define YYPTRDIFF_MAXIMUM LONG_MAX
# endif
#endif

#ifndef YYSIZE_T
# ifdef __SIZE_TYPE__
#  define YYSIZE_T __SIZE_TYPE__
# elif defined size_t
#  define YYSIZE_T size_t
# elif defined __STDC_VERSION__ && 199901 <= __STDC_VERSION__
#  include <stddef.h> /* INFRINGES ON USER NAME SPACE */
#  define YYSIZE_T size_t
# else
#  define YYSIZE_T unsigned
# endif
#endif

#define YYSIZE_MAXIMUM                                  \
  YY_CAST (YYPTRDIFF_T,                                 \
           (YYPTRDIFF_MAXIMUM < YY_CAST (YYSIZE_T, -1)  \
            ? YYPTRDIFF_MAXIMUM                         \
            : YY_CAST (YYSIZE_T, -1)))

#define YYSIZEOF(X) YY_CAST (YYPTRDIFF_T, sizeof (X))


/* Stored state numbers (used for stacks). */
typedef yytype_int8 yy_state_t;

/* State numbers in computations.  */
typedef int yy_state_fast_t;

#ifndef YY_
# if defined YYENABLE_NLS && YYENABLE_NLS
#  if ENABLE_NLS
#   include <libintl.h> /* INFRINGES ON USER NAME SPACE */
#   define YY_(Msgid) dgettext ("bison-runtime", Msgid)
#  endif
# endif
# ifndef YY_
#  define YY_(Msgid) Msgid
# endif
#endif


#ifndef YY_ATTRIBUTE_PURE
# if defined __GNUC__ && 2 < __GNUC__ + (96 <= __GNUC_MINOR__)
#  define YY_ATTRIBUTE_PURE __attribute__ ((__pure__))
# else
#  define YY_ATTRIBUTE_PURE
# endif
#endif

#ifndef YY_ATTRIBUTE_UNUSED
# if defined __GNUC__ && 2 < __GNUC__ + (7 <= __GNUC_MINOR__)
#  define YY_ATTRIBUTE_UNUSED __attribute__ ((__unused__))
# else
#  define YY_ATTRIBUTE_UNUSED
# endif
#endif

/* Suppress unused-variable warnings by "using" E.  */
#if ! defined lint || defined __GNUC__
# define YY_USE(E) ((void) (E))
#else
# define YY_USE(E) /* empty */
#endif

/* Suppress an incorrect diagnostic about yylval being uninitialized.  */
#if defined __GNUC__ && ! defined __ICC && 406 <= __GNUC__ * 100 + __GNUC_MINOR__
# if __GNUC__ * 100 + __GNUC_MINOR__ < 407
#  define YY_IGNORE_MAYBE_UNINITIALIZED_BEGIN                           \
    _Pragma ("GCC diagnostic push")                                     \
    _Pragma ("GCC diagnostic ignored \"-Wuninitialized\"")
# else
#  define YY_IGNORE_MAYBE_UNINITIALIZED_BEGIN                           \
    _Pragma ("GCC diagnostic push")                                     \
    _Pragma ("GCC diagnostic ignored \"-Wuninitialized\"")              \
    _Pragma ("GCC diagnostic ignored \"-Wmaybe-uninitialized\"")
# endif
# define YY_IGNORE_MAYBE_UNINITIALIZED_END      \
    _Pragma ("GCC diagnostic pop")
#else
# define YY_INITIAL_VALUE(Value) Value
#endif
#ifndef YY_IGNORE_MAYBE_UNINITIALIZED_BEGIN
# define YY_IGNORE_MAYBE_UNINITIALIZED_BEGIN
# define YY_IGNORE_MAYBE_UNINITIALIZED_END
#endif
#ifndef YY_INITIAL_VALUE
# define YY_INITIAL_VALUE(Value) /* Nothing. */
#endif

#if defined __cplusplus && defined __GNUC__ && ! defined __ICC && 6 <= __GNUC__
# define YY_IGNORE_USELESS_CAST_BEGIN                          \
    _Pragma ("GCC diagnostic push")                            \
    _Pragma ("GCC diagnostic ignored \"-Wuseless-cast\"")
# define YY_IGNORE_USELESS_CAST_END            \
    _Pragma ("GCC diagnostic pop")
#endif
#ifndef YY_IGNORE_USELESS_CAST_BEGIN
# define YY_IGNORE_USELESS_CAST_BEGIN
# define YY_IGNORE_USELESS_CAST_END
#endif


#define YY_ASSERT(E) ((void) (0 && (E)))

#if !defined yyoverflow

/* The parser invokes alloca or malloc; define the necessary symbols.  */

# ifdef YYSTACK_USE_ALLOCA
#  if YYSTACK_USE_ALLOCA
#   ifdef __GNUC__
#    define YYSTACK_ALLOC __builtin_alloca
#   elif defined __BUILTIN_VA_ARG_INCR
#    include <alloca.h> /* INFRINGES ON USER NAME SPACE */
#   elif defined _AIX
#    define YYSTACK_ALLOC __alloca
#   elif defined _MSC_VER
#    include <malloc.h> /* INFRINGES ON USER NAME SPACE */
#    define alloca _alloca
#   else
#    define YYSTACK_ALLOC alloca
#    if ! defined _ALLOCA_H && ! defined EXIT_SUCCESS
#     include <stdlib.h> /* INFRINGES ON USER NAME SPACE */
      /* Use EXIT_SUCCESS as a witness for stdlib.h.  */
#     ifndef EXIT_SUCCESS
#      define EXIT_SUCCESS 0
#     endif
#    endif
#   endif
#  endif
# endif

# ifdef YYSTACK_ALLOC
   /* Pacify GCC's 'empty if-body' warning.  */
#  define YYSTACK_FREE(Ptr) do { /* empty */; } while (0)
#  ifndef YYSTACK_ALLOC_MAXIMUM
    /* The OS might guarantee only one guard page at the bottom of the stack,
       and a page size can be as small as 4096 bytes.  So we cannot safely
       invoke alloca (N) if N exceeds 4096.  Use a slightly smaller number
       to allow for a few compiler-allocated temporary stack slots.  */
#   define YYSTACK_ALLOC_MAXIMUM 4032 /* reasonable circa 2006 */
#  endif
# else
#  define YYSTACK_ALLOC YYMALLOC
#  define YYSTACK_FREE YYFREE
#  ifndef YYSTACK_ALLOC_MAXIMUM
#   define YYSTACK_ALLOC_MAXIMUM YYSIZE_MAXIMUM
#  endif
#  if (defined __cplusplus && ! defined EXIT_SUCCESS \
       && ! ((defined YYMALLOC || defined malloc) \
             && (defined YYFREE || defined free)))
#   include <stdlib.h> /* INFRINGES ON USER NAME SPACE */
#   ifndef EXIT_SUCCESS
#    define EXIT_SUCCESS 0
#   endif
#  endif
#  ifndef YYMALLOC
#   define YYMALLOC malloc
#   if ! defined malloc && ! defined EXIT_SUCCESS
void *malloc (YYSIZE_T); /* INFRINGES ON USER NAME SPACE */
#   endif
#  endif
#  ifndef YYFREE
#   define YYFREE free
#   if ! defined free && ! defined EXIT_SUCCESS
void free (void *); /* INFRINGES ON USER NAME SPACE */
#   endif
#  endif
# endif
#endif /* !defined yyoverflow */

#if (! defined yyoverflow \
     && (! defined __cplusplus \
         || (defined YYSTYPE_IS_TRIVIAL && YYSTYPE_IS_TRIVIAL)))

/* A type that is properly aligned for any stack member.  */
union yyalloc
{
  yy_state_t yyss_alloc;
  YYSTYPE yyvs_alloc;
};

/* The size of the maximum gap between one aligned stack and the next.  */
# define YYSTACK_GAP_MAXIMUM (YYSIZEOF (union yyalloc) - 1)

/* The size of an array large to enough to hold all stacks, each with
   N elements.  */
# define YYSTACK_BYTES(N) \
     ((N) * (YYSIZEOF (yy_state_t) + YYSIZEOF (YYSTYPE)) \
      + YYSTACK_GAP_MAXIMUM)

# define YYCOPY_NEEDED 1

/* Relocate STACK from its old location to the new one.  The
   local variables YYSIZE and YYSTACKSIZE give the old and new number of
   elements in the stack, and YYPTR gives the new location of the
   stack.  Advance YYPTR to a properly aligned location for the next
   stack.  */
# define YYSTACK_RELOCATE(Stack_alloc, Stack)                           \
    do                                                                  \
      {                                                                 \
        YYPTRDIFF_T yynewbytes;                                         \
        YYCOPY (&yyptr->Stack_alloc, Stack, yysize);                    \
        Stack = &yyptr->Stack_alloc;                                    \
        yynewbytes = yystacksize * YYSIZEOF (*Stack) + YYSTACK_GAP_MAXIMUM; \
        yyptr += yynewbytes / YYSIZEOF (*yyptr);                        \
      }                                                                 \
    while (0)

#endif

#if defined YYCOPY_NEEDED && YYCOPY_NEEDED
/* Copy COUNT objects from SRC to DST.  The source and destination do
   not overlap.  */
# ifndef YYCOPY
#  if defined __GNUC__ && 1 < __GNUC__
#   define YYCOPY(Dst, Src, Count) \
      __builtin_memcpy (Dst, Src, YY_CAST (YYSIZE_T, (Count)) * sizeof (*(Src)))
#  else
#   define YYCOPY(Dst, Src, Count)              \
      do                                        \
        {                                       \
          YYPTRDIFF_T yyi;                      \
          for (yyi = 0; yyi < (Count); yyi++)   \
            (Dst)[yyi] = (Src)[yyi];            \
        }                                       \
      while (0)
#  endif
# endif
#endif /* !YYCOPY_NEEDED */

/* YYFINAL -- State number of the termination state.  */
#define YYFINAL  35
/* YYLAST -- Last index in YYTABLE.  */
#define YYLAST   117

/* YYNTOKENS -- Number of terminals.  */
#define YYNTOKENS  37
/* YYNNTS -- Number of nonterminals.  */
#define YYNNTS  14
/* YYNRULES -- Number of rules.  */
#define YYNRULES  47
/* YYNSTATES -- Number of states.  */
#define YYNSTATES  103

/* YYMAXUTOK -- Last valid token kind.  */
#define YYMAXUTOK   291


/* YYTRANSLATE(TOKEN-NUM) -- Symbol number corresponding to TOKEN-NUM
   as returned by yylex, with out-of-bounds checking.  */
#define YYTRANSLATE(YYX)                                \
  (0 <= (YYX) && (YYX) <= YYMAXUTOK                     \
   ? YY_CAST (yysymbol_kind_t, yytranslate[YYX])        \
   : YYSYMBOL_YYUNDEF)

/* YYTRANSLATE[TOKEN-NUM] -- Symbol number corresponding to TOKEN-NUM
   as returned by yylex.  */
static const yytype_int8 yytranslate[] =
{
       0,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     1,     2,     3,     4,
       5,     6,     7,     8,     9,    10,    11,    12,    13,    14,
      15,    16,    17,    18,    19,    20,    21,    22,    23,    24,
      25,    26,    27,    28,    29,    30,    31,    32,    33,    34,
      35,    36
};

#if YYDEBUG
/* YYRLINE[YYN] -- Source line where rule number YYN was defined.  */
static const yytype_uint8 yyrline[] =
{
       0,    37,    37,    44,    45,    54,    62,    63,    64,    65,
      66,    67,    68,    69,    73,    74,    75,    76,    77,    78,
      79,    83,    84,    85,    89,    93,    97,   100,   106,   112,
     115,   121,   127,   128,   129,   130,   131,   132,   136,   137,
     138,   139,   140,   141,   142,   143,   144,   145
};
#endif

/** Accessing symbol of state STATE.  */
#define YY_ACCESSING_SYMBOL(State) YY_CAST (yysymbol_kind_t, yystos[State])

#if YYDEBUG || 0
/* The user-facing name of the symbol whose (internal) number is
   YYSYMBOL.  No bounds checking.  */
static const char *yysymbol_name (yysymbol_kind_t yysymbol) YY_ATTRIBUTE_UNUSED;

/* YYTNAME[SYMBOL-NUM] -- String name of the symbol SYMBOL-NUM.
   First, the terminals, then, starting at YYNTOKENS, nonterminals.  */
static const char *const yytname[] =
{
  "\"end of file\"", "error", "\"invalid token\"", "BOOL", "INT", "PRINT",
  "FALSE", "TRUE", "IF", "ELSE", "WHILE", "FOR", "BREAK", "CONTINUE",
  "COMMA", "LIST", "ADD", "SUB", "MUL", "DIV", "MOD", "SEMI", "LPAREN",
  "RPAREN", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "ASSIGN", "EQ",
  "NEQ", "LT", "GT", "LTE", "GTE", "NUMBER", "ID", "$accept", "program",
  "stmt_list", "statement", "declaration", "list_expr", "assignment",
  "print_stmt", "if_stmt", "while_loop", "for_loop", "compound_stmt",
  "condition", "expr", YY_NULLPTR
};

static const char *
yysymbol_name (yysymbol_kind_t yysymbol)
{
  return yytname[yysymbol];
}
#endif

#define YYPACT_NINF (-32)

#define yypact_value_is_default(Yyn) \
  ((Yyn) == YYPACT_NINF)

#define YYTABLE_NINF (-1)

#define yytable_value_is_error(Yyn) \
  0

/* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
   STATE-NUM.  */
static const yytype_int8 yypact[] =
{
      45,   -31,   -30,    64,   -13,   -10,    -9,   -11,    -5,   -19,
      -7,    29,    45,   -32,    10,    12,    13,   -32,   -32,   -32,
       8,     9,   -32,   -32,    64,   -32,   -32,    77,    64,    64,
      -1,   -32,   -32,    24,    64,   -32,   -32,   -32,   -32,   -32,
      64,    64,    91,    64,    64,    64,    64,    64,    36,    72,
      38,    51,    53,    49,    77,    77,    77,   -32,    59,    59,
     -32,   -32,   -32,    56,    64,    64,    64,    64,    64,    64,
      56,    64,    64,   -20,    45,    73,    77,    77,    77,    77,
      77,    77,   -32,    66,    92,   -32,   -32,    -3,    15,    56,
      62,    62,    50,   -32,   -32,   -32,    89,    93,   -32,    56,
      56,   -32,   -32
};

/* YYDEFACT[STATE-NUM] -- Default reduction number in state STATE-NUM.
   Performed when YYTABLE does not specify something else to do.  Zero
   means the default is an error.  */
static const yytype_int8 yydefact[] =
{
       3,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     2,     5,     0,     0,     0,     9,    10,    11,
      17,    16,    41,    40,     0,    38,    39,    25,     0,     0,
       0,    12,    13,    18,     0,     1,     4,     6,     7,     8,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,    24,    15,    14,    47,    42,    43,
      44,    45,    46,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,    23,     3,    26,    32,    33,    34,    35,
      36,    37,    28,     0,     0,    19,    21,     0,     0,     0,
       0,     0,     0,    20,    31,    27,     0,     0,    22,     0,
       0,    29,    30
};

/* YYPGOTO[NTERM-NUM].  */
static const yytype_int8 yypgoto[] =
{
     -32,   -32,    41,   -12,    87,   -32,   -22,   -32,   -32,   -32,
     -32,   -16,   -25,    -2
};

/* YYDEFGOTO[NTERM-NUM].  */
static const yytype_int8 yydefgoto[] =
{
       0,    11,    12,    13,    14,    87,    15,    16,    17,    18,
      19,    75,    48,    49
};

/* YYTABLE[YYPACT[STATE-NUM]] -- What to do in state STATE-NUM.  If
   positive, shift that token.  If negative, reduce the rule whose
   number is the opposite.  If YYTABLE_NINF, syntax error.  */
static const yytype_int8 yytable[] =
{
      36,    27,     1,     2,    50,    20,    21,    85,    52,    28,
      31,    92,    29,    30,     9,    86,    32,    33,     1,     2,
       3,    34,    42,     4,    93,     5,     6,     7,     8,    35,
       9,    37,    54,    38,    39,    10,    40,    41,    55,    56,
      94,    58,    59,    60,    61,    62,    83,    84,     1,     2,
       3,    10,    53,     4,    82,     5,     6,     7,     8,    63,
       9,    70,    76,    77,    78,    79,    80,    81,    96,    97,
      22,    23,    71,    95,    72,    73,    36,    45,    46,    47,
      74,    10,    89,   101,   102,    98,    24,    90,    43,    44,
      45,    46,    47,    43,    44,    45,    46,    47,    10,    25,
      26,    64,    65,    66,    67,    68,    69,    43,    44,    45,
      46,    47,    99,    91,    57,    88,   100,    51
};

static const yytype_int8 yycheck[] =
{
      12,     3,     3,     4,    29,    36,    36,    27,    30,    22,
      21,    14,    22,    22,    15,    35,    21,    36,     3,     4,
       5,    28,    24,     8,    27,    10,    11,    12,    13,     0,
      15,    21,    34,    21,    21,    36,    28,    28,    40,    41,
      25,    43,    44,    45,    46,    47,    71,    72,     3,     4,
       5,    36,    28,     8,    70,    10,    11,    12,    13,    23,
      15,    23,    64,    65,    66,    67,    68,    69,    90,    91,
       6,     7,    21,    89,    21,    26,    88,    18,    19,    20,
      24,    36,     9,    99,   100,    35,    22,    21,    16,    17,
      18,    19,    20,    16,    17,    18,    19,    20,    36,    35,
      36,    29,    30,    31,    32,    33,    34,    16,    17,    18,
      19,    20,    23,    21,    23,    74,    23,    30
};

/* YYSTOS[STATE-NUM] -- The symbol kind of the accessing symbol of
   state STATE-NUM.  */
static const yytype_int8 yystos[] =
{
       0,     3,     4,     5,     8,    10,    11,    12,    13,    15,
      36,    38,    39,    40,    41,    43,    44,    45,    46,    47,
      36,    36,     6,     7,    22,    35,    36,    50,    22,    22,
      22,    21,    21,    36,    28,     0,    40,    21,    21,    21,
      28,    28,    50,    16,    17,    18,    19,    20,    49,    50,
      49,    41,    43,    28,    50,    50,    50,    23,    50,    50,
      50,    50,    50,    23,    29,    30,    31,    32,    33,    34,
      23,    21,    21,    26,    24,    48,    50,    50,    50,    50,
      50,    50,    48,    49,    49,    27,    35,    42,    39,     9,
      21,    21,    14,    27,    25,    48,    43,    43,    35,    23,
      23,    48,    48
};

/* YYR1[RULE-NUM] -- Symbol kind of the left-hand side of rule RULE-NUM.  */
static const yytype_int8 yyr1[] =
{
       0,    37,    38,    39,    39,    39,    40,    40,    40,    40,
      40,    40,    40,    40,    41,    41,    41,    41,    41,    41,
      41,    42,    42,    42,    43,    44,    45,    45,    46,    47,
      47,    48,    49,    49,    49,    49,    49,    49,    50,    50,
      50,    50,    50,    50,    50,    50,    50,    50
};

/* YYR2[RULE-NUM] -- Number of symbols on the right-hand side of rule RULE-NUM.  */
static const yytype_int8 yyr2[] =
{
       0,     2,     1,     0,     2,     1,     2,     2,     2,     1,
       1,     1,     2,     2,     4,     4,     2,     2,     2,     5,
       6,     1,     3,     0,     3,     2,     5,     7,     5,     9,
       9,     3,     3,     3,     3,     3,     3,     3,     1,     1,
       1,     1,     3,     3,     3,     3,     3,     3
};


enum { YYENOMEM = -2 };

#define yyerrok         (yyerrstatus = 0)
#define yyclearin       (yychar = YYEMPTY)

#define YYACCEPT        goto yyacceptlab
#define YYABORT         goto yyabortlab
#define YYERROR         goto yyerrorlab
#define YYNOMEM         goto yyexhaustedlab


#define YYRECOVERING()  (!!yyerrstatus)

#define YYBACKUP(Token, Value)                                    \
  do                                                              \
    if (yychar == YYEMPTY)                                        \
      {                                                           \
        yychar = (Token);                                         \
        yylval = (Value);                                         \
        YYPOPSTACK (yylen);                                       \
        yystate = *yyssp;                                         \
        goto yybackup;                                            \
      }                                                           \
    else                                                          \
      {                                                           \
        yyerror (YY_("syntax error: cannot back up")); \
        YYERROR;                                                  \
      }                                                           \
  while (0)

/* Backward compatibility with an undocumented macro.
   Use YYerror or YYUNDEF. */
#define YYERRCODE YYUNDEF


/* Enable debugging if requested.  */
#if YYDEBUG

# ifndef YYFPRINTF
#  include <stdio.h> /* INFRINGES ON USER NAME SPACE */
#  define YYFPRINTF fprintf
# endif

# define YYDPRINTF(Args)                        \
do {                                            \
  if (yydebug)                                  \
    YYFPRINTF Args;                             \
} while (0)




# define YY_SYMBOL_PRINT(Title, Kind, Value, Location)                    \
do {                                                                      \
  if (yydebug)                                                            \
    {                                                                     \
      YYFPRINTF (stderr, "%s ", Title);                                   \
      yy_symbol_print (stderr,                                            \
                  Kind, Value); \
      YYFPRINTF (stderr, "\n");                                           \
    }                                                                     \
} while (0)


/*-----------------------------------.
| Print this symbol's value on YYO.  |
`-----------------------------------*/

static void
yy_symbol_value_print (FILE *yyo,
                       yysymbol_kind_t yykind, YYSTYPE const * const yyvaluep)
{
  FILE *yyoutput = yyo;
  YY_USE (yyoutput);
  if (!yyvaluep)
    return;
  YY_IGNORE_MAYBE_UNINITIALIZED_BEGIN
  YY_USE (yykind);
  YY_IGNORE_MAYBE_UNINITIALIZED_END
}


/*---------------------------.
| Print this symbol on YYO.  |
`---------------------------*/

static void
yy_symbol_print (FILE *yyo,
                 yysymbol_kind_t yykind, YYSTYPE const * const yyvaluep)
{
  YYFPRINTF (yyo, "%s %s (",
             yykind < YYNTOKENS ? "token" : "nterm", yysymbol_name (yykind));

  yy_symbol_value_print (yyo, yykind, yyvaluep);
  YYFPRINTF (yyo, ")");
}

/*------------------------------------------------------------------.
| yy_stack_print -- Print the state stack from its BOTTOM up to its |
| TOP (included).                                                   |
`------------------------------------------------------------------*/

static void
yy_stack_print (yy_state_t *yybottom, yy_state_t *yytop)
{
  YYFPRINTF (stderr, "Stack now");
  for (; yybottom <= yytop; yybottom++)
    {
      int yybot = *yybottom;
      YYFPRINTF (stderr, " %d", yybot);
    }
  YYFPRINTF (stderr, "\n");
}

# define YY_STACK_PRINT(Bottom, Top)                            \
do {                                                            \
  if (yydebug)                                                  \
    yy_stack_print ((Bottom), (Top));                           \
} while (0)


/*------------------------------------------------.
| Report that the YYRULE is going to be reduced.  |
`------------------------------------------------*/

static void
yy_reduce_print (yy_state_t *yyssp, YYSTYPE *yyvsp,
                 int yyrule)
{
  int yylno = yyrline[yyrule];
  int yynrhs = yyr2[yyrule];
  int yyi;
  YYFPRINTF (stderr, "Reducing stack by rule %d (line %d):\n",
             yyrule - 1, yylno);
  /* The symbols being reduced.  */
  for (yyi = 0; yyi < yynrhs; yyi++)
    {
      YYFPRINTF (stderr, "   $%d = ", yyi + 1);
      yy_symbol_print (stderr,
                       YY_ACCESSING_SYMBOL (+yyssp[yyi + 1 - yynrhs]),
                       &yyvsp[(yyi + 1) - (yynrhs)]);
      YYFPRINTF (stderr, "\n");
    }
}

# define YY_REDUCE_PRINT(Rule)          \
do {                                    \
  if (yydebug)                          \
    yy_reduce_print (yyssp, yyvsp, Rule); \
} while (0)

/* Nonzero means print parse trace.  It is left uninitialized so that
   multiple parsers can coexist.  */
int yydebug;
#else /* !YYDEBUG */
# define YYDPRINTF(Args) ((void) 0)
# define YY_SYMBOL_PRINT(Title, Kind, Value, Location)
# define YY_STACK_PRINT(Bottom, Top)
# define YY_REDUCE_PRINT(Rule)
#endif /* !YYDEBUG */


/* YYINITDEPTH -- initial size of the parser's stacks.  */
#ifndef YYINITDEPTH
# define YYINITDEPTH 200
#endif

/* YYMAXDEPTH -- maximum size the stacks can grow to (effective only
   if the built-in stack extension method is used).

   Do not make this value too large; the results are undefined if
   YYSTACK_ALLOC_MAXIMUM < YYSTACK_BYTES (YYMAXDEPTH)
   evaluated with infinite-precision integer arithmetic.  */

#ifndef YYMAXDEPTH
# define YYMAXDEPTH 10000
#endif






/*-----------------------------------------------.
| Release the memory associated to this symbol.  |
`-----------------------------------------------*/

static void
yydestruct (const char *yymsg,
            yysymbol_kind_t yykind, YYSTYPE *yyvaluep)
{
  YY_USE (yyvaluep);
  if (!yymsg)
    yymsg = "Deleting";
  YY_SYMBOL_PRINT (yymsg, yykind, yyvaluep, yylocationp);

  YY_IGNORE_MAYBE_UNINITIALIZED_BEGIN
  YY_USE (yykind);
  YY_IGNORE_MAYBE_UNINITIALIZED_END
}


/* Lookahead token kind.  */
int yychar;

/* The semantic value of the lookahead symbol.  */
YYSTYPE yylval;
/* Number of syntax errors so far.  */
int yynerrs;




/*----------.
| yyparse.  |
`----------*/

int
yyparse (void)
{
    yy_state_fast_t yystate = 0;
    /* Number of tokens to shift before error messages enabled.  */
    int yyerrstatus = 0;

    /* Refer to the stacks through separate pointers, to allow yyoverflow
       to reallocate them elsewhere.  */

    /* Their size.  */
    YYPTRDIFF_T yystacksize = YYINITDEPTH;

    /* The state stack: array, bottom, top.  */
    yy_state_t yyssa[YYINITDEPTH];
    yy_state_t *yyss = yyssa;
    yy_state_t *yyssp = yyss;

    /* The semantic value stack: array, bottom, top.  */
    YYSTYPE yyvsa[YYINITDEPTH];
    YYSTYPE *yyvs = yyvsa;
    YYSTYPE *yyvsp = yyvs;

  int yyn;
  /* The return value of yyparse.  */
  int yyresult;
  /* Lookahead symbol kind.  */
  yysymbol_kind_t yytoken = YYSYMBOL_YYEMPTY;
  /* The variables used to return semantic value and location from the
     action routines.  */
  YYSTYPE yyval;



#define YYPOPSTACK(N)   (yyvsp -= (N), yyssp -= (N))

  /* The number of symbols on the RHS of the reduced rule.
     Keep to zero when no symbol should be popped.  */
  int yylen = 0;

  YYDPRINTF ((stderr, "Starting parse\n"));

  yychar = YYEMPTY; /* Cause a token to be read.  */

  goto yysetstate;


/*------------------------------------------------------------.
| yynewstate -- push a new state, which is found in yystate.  |
`------------------------------------------------------------*/
yynewstate:
  /* In all cases, when you get here, the value and location stacks
     have just been pushed.  So pushing a state here evens the stacks.  */
  yyssp++;


/*--------------------------------------------------------------------.
| yysetstate -- set current state (the top of the stack) to yystate.  |
`--------------------------------------------------------------------*/
yysetstate:
  YYDPRINTF ((stderr, "Entering state %d\n", yystate));
  YY_ASSERT (0 <= yystate && yystate < YYNSTATES);
  YY_IGNORE_USELESS_CAST_BEGIN
  *yyssp = YY_CAST (yy_state_t, yystate);
  YY_IGNORE_USELESS_CAST_END
  YY_STACK_PRINT (yyss, yyssp);

  if (yyss + yystacksize - 1 <= yyssp)
#if !defined yyoverflow && !defined YYSTACK_RELOCATE
    YYNOMEM;
#else
    {
      /* Get the current used size of the three stacks, in elements.  */
      YYPTRDIFF_T yysize = yyssp - yyss + 1;

# if defined yyoverflow
      {
        /* Give user a chance to reallocate the stack.  Use copies of
           these so that the &'s don't force the real ones into
           memory.  */
        yy_state_t *yyss1 = yyss;
        YYSTYPE *yyvs1 = yyvs;

        /* Each stack pointer address is followed by the size of the
           data in use in that stack, in bytes.  This used to be a
           conditional around just the two extra args, but that might
           be undefined if yyoverflow is a macro.  */
        yyoverflow (YY_("memory exhausted"),
                    &yyss1, yysize * YYSIZEOF (*yyssp),
                    &yyvs1, yysize * YYSIZEOF (*yyvsp),
                    &yystacksize);
        yyss = yyss1;
        yyvs = yyvs1;
      }
# else /* defined YYSTACK_RELOCATE */
      /* Extend the stack our own way.  */
      if (YYMAXDEPTH <= yystacksize)
        YYNOMEM;
      yystacksize *= 2;
      if (YYMAXDEPTH < yystacksize)
        yystacksize = YYMAXDEPTH;

      {
        yy_state_t *yyss1 = yyss;
        union yyalloc *yyptr =
          YY_CAST (union yyalloc *,
                   YYSTACK_ALLOC (YY_CAST (YYSIZE_T, YYSTACK_BYTES (yystacksize))));
        if (! yyptr)
          YYNOMEM;
        YYSTACK_RELOCATE (yyss_alloc, yyss);
        YYSTACK_RELOCATE (yyvs_alloc, yyvs);
#  undef YYSTACK_RELOCATE
        if (yyss1 != yyssa)
          YYSTACK_FREE (yyss1);
      }
# endif

      yyssp = yyss + yysize - 1;
      yyvsp = yyvs + yysize - 1;

      YY_IGNORE_USELESS_CAST_BEGIN
      YYDPRINTF ((stderr, "Stack size increased to %ld\n",
                  YY_CAST (long, yystacksize)));
      YY_IGNORE_USELESS_CAST_END

      if (yyss + yystacksize - 1 <= yyssp)
        YYABORT;
    }
#endif /* !defined yyoverflow && !defined YYSTACK_RELOCATE */


  if (yystate == YYFINAL)
    YYACCEPT;

  goto yybackup;


/*-----------.
| yybackup.  |
`-----------*/
yybackup:
  /* Do appropriate processing given the current state.  Read a
     lookahead token if we need one and don't already have one.  */

  /* First try to decide what to do without reference to lookahead token.  */
  yyn = yypact[yystate];
  if (yypact_value_is_default (yyn))
    goto yydefault;

  /* Not known => get a lookahead token if don't already have one.  */

  /* YYCHAR is either empty, or end-of-input, or a valid lookahead.  */
  if (yychar == YYEMPTY)
    {
      YYDPRINTF ((stderr, "Reading a token\n"));
      yychar = yylex ();
    }

  if (yychar <= YYEOF)
    {
      yychar = YYEOF;
      yytoken = YYSYMBOL_YYEOF;
      YYDPRINTF ((stderr, "Now at end of input.\n"));
    }
  else if (yychar == YYerror)
    {
      /* The scanner already issued an error message, process directly
         to error recovery.  But do not keep the error token as
         lookahead, it is too special and may lead us to an endless
         loop in error recovery. */
      yychar = YYUNDEF;
      yytoken = YYSYMBOL_YYerror;
      goto yyerrlab1;
    }
  else
    {
      yytoken = YYTRANSLATE (yychar);
      YY_SYMBOL_PRINT ("Next token is", yytoken, &yylval, &yylloc);
    }

  /* If the proper action on seeing token YYTOKEN is to reduce or to
     detect an error, take that action.  */
  yyn += yytoken;
  if (yyn < 0 || YYLAST < yyn || yycheck[yyn] != yytoken)
    goto yydefault;
  yyn = yytable[yyn];
  if (yyn <= 0)
    {
      if (yytable_value_is_error (yyn))
        goto yyerrlab;
      yyn = -yyn;
      goto yyreduce;
    }

  /* Count tokens shifted since error; after three, turn off error
     status.  */
  if (yyerrstatus)
    yyerrstatus--;

  /* Shift the lookahead token.  */
  YY_SYMBOL_PRINT ("Shifting", yytoken, &yylval, &yylloc);
  yystate = yyn;
  YY_IGNORE_MAYBE_UNINITIALIZED_BEGIN
  *++yyvsp = yylval;
  YY_IGNORE_MAYBE_UNINITIALIZED_END

  /* Discard the shifted token.  */
  yychar = YYEMPTY;
  goto yynewstate;


/*-----------------------------------------------------------.
| yydefault -- do the default action for the current state.  |
`-----------------------------------------------------------*/
yydefault:
  yyn = yydefact[yystate];
  if (yyn == 0)
    goto yyerrlab;
  goto yyreduce;


/*-----------------------------.
| yyreduce -- do a reduction.  |
`-----------------------------*/
yyreduce:
  /* yyn is the number of a rule to reduce with.  */
  yylen = yyr2[yyn];

  /* If YYLEN is nonzero, implement the default value of the action:
     '$$ = $1'.

     Otherwise, the following line sets YYVAL to garbage.
     This behavior is undocumented and Bison
     users should not rely upon it.  Assigning to YYVAL
     unconditionally makes the parser a bit smaller, and it avoids a
     GCC warning that YYVAL may be used uninitialized.  */
  yyval = yyvsp[1-yylen];


  YY_REDUCE_PRINT (yyn);
  switch (yyn)
    {
  case 2: /* program: stmt_list  */
#line 37 "cz.y"
              {
        Node *block = make_block((yyvsp[0].stmts), -1); // -1 = already counted
        eval_block(block);
    }
#line 1310 "y.tab.c"
    break;

  case 3: /* stmt_list: %empty  */
#line 44 "cz.y"
                  { (yyval.stmts) = NULL; }
#line 1316 "y.tab.c"
    break;

  case 4: /* stmt_list: stmt_list statement  */
#line 45 "cz.y"
                          {
        int count = 0;
        while ((yyvsp[-1].stmts) && (yyvsp[-1].stmts)[count]) count++;

        (yyval.stmts) = malloc(sizeof(Node*) * (count + 2));
        for (int i = 0; i < count; i++) (yyval.stmts)[i] = (yyvsp[-1].stmts)[i];
        (yyval.stmts)[count] = (yyvsp[0].node);
        (yyval.stmts)[count + 1] = NULL;
    }
#line 1330 "y.tab.c"
    break;

  case 5: /* stmt_list: statement  */
#line 54 "cz.y"
                {
        (yyval.stmts) = malloc(sizeof(Node*) * 2);
        (yyval.stmts)[0] = (yyvsp[0].node);
        (yyval.stmts)[1] = NULL;
    }
#line 1340 "y.tab.c"
    break;

  case 6: /* statement: declaration SEMI  */
#line 62 "cz.y"
                            { (yyval.node) = (yyvsp[-1].node); }
#line 1346 "y.tab.c"
    break;

  case 7: /* statement: assignment SEMI  */
#line 63 "cz.y"
                            { (yyval.node) = (yyvsp[-1].node); }
#line 1352 "y.tab.c"
    break;

  case 8: /* statement: print_stmt SEMI  */
#line 64 "cz.y"
                            { (yyval.node) = (yyvsp[-1].node); }
#line 1358 "y.tab.c"
    break;

  case 9: /* statement: if_stmt  */
#line 65 "cz.y"
                            { (yyval.node) = (yyvsp[0].node); }
#line 1364 "y.tab.c"
    break;

  case 10: /* statement: while_loop  */
#line 66 "cz.y"
                            { (yyval.node) = (yyvsp[0].node); }
#line 1370 "y.tab.c"
    break;

  case 11: /* statement: for_loop  */
#line 67 "cz.y"
                            { (yyval.node) = (yyvsp[0].node); }
#line 1376 "y.tab.c"
    break;

  case 12: /* statement: BREAK SEMI  */
#line 68 "cz.y"
                            { (yyval.node) = make_break(); }
#line 1382 "y.tab.c"
    break;

  case 13: /* statement: CONTINUE SEMI  */
#line 69 "cz.y"
                            { (yyval.node) = make_continue(); }
#line 1388 "y.tab.c"
    break;

  case 14: /* declaration: INT ID ASSIGN expr  */
#line 73 "cz.y"
                                                 { (yyval.node) = make_assign((yyvsp[-2].id), (yyvsp[0].node)); }
#line 1394 "y.tab.c"
    break;

  case 15: /* declaration: BOOL ID ASSIGN expr  */
#line 74 "cz.y"
                                                 { (yyval.node) = make_declaration((yyvsp[-2].id)); }
#line 1400 "y.tab.c"
    break;

  case 16: /* declaration: INT ID  */
#line 75 "cz.y"
                                                 { (yyval.node) = make_declaration((yyvsp[0].id)); }
#line 1406 "y.tab.c"
    break;

  case 17: /* declaration: BOOL ID  */
#line 76 "cz.y"
                                                 { (yyval.node) = make_declaration((yyvsp[0].id)); }
#line 1412 "y.tab.c"
    break;

  case 18: /* declaration: LIST ID  */
#line 77 "cz.y"
                                                 { /* */ }
#line 1418 "y.tab.c"
    break;

  case 19: /* declaration: LIST ID ASSIGN LBRACKET RBRACKET  */
#line 78 "cz.y"
                                                 { /* */ }
#line 1424 "y.tab.c"
    break;

  case 20: /* declaration: LIST ID ASSIGN LBRACKET list_expr RBRACKET  */
#line 79 "cz.y"
                                                 { /* */ }
#line 1430 "y.tab.c"
    break;

  case 21: /* list_expr: NUMBER  */
#line 83 "cz.y"
                                  { /* */ }
#line 1436 "y.tab.c"
    break;

  case 22: /* list_expr: list_expr COMMA NUMBER  */
#line 84 "cz.y"
                                  { /* */ }
#line 1442 "y.tab.c"
    break;

  case 24: /* assignment: ID ASSIGN expr  */
#line 89 "cz.y"
                             { (yyval.node) = make_assign((yyvsp[-2].id), (yyvsp[0].node)); }
#line 1448 "y.tab.c"
    break;

  case 25: /* print_stmt: PRINT expr  */
#line 93 "cz.y"
                             { (yyval.node) = make_print((yyvsp[0].node)); }
#line 1454 "y.tab.c"
    break;

  case 26: /* if_stmt: IF LPAREN condition RPAREN compound_stmt  */
#line 97 "cz.y"
                                             {
        (yyval.node) = make_if((yyvsp[-2].node), (yyvsp[0].node));
    }
#line 1462 "y.tab.c"
    break;

  case 27: /* if_stmt: IF LPAREN condition RPAREN compound_stmt ELSE compound_stmt  */
#line 100 "cz.y"
                                                                  {
        (yyval.node) = make_if_else((yyvsp[-4].node), (yyvsp[-2].node), (yyvsp[0].node));
    }
#line 1470 "y.tab.c"
    break;

  case 28: /* while_loop: WHILE LPAREN condition RPAREN compound_stmt  */
#line 106 "cz.y"
                                                {
        (yyval.node) = make_while((yyvsp[-2].node), (yyvsp[0].node));
    }
#line 1478 "y.tab.c"
    break;

  case 29: /* for_loop: FOR LPAREN declaration SEMI condition SEMI assignment RPAREN compound_stmt  */
#line 112 "cz.y"
                                                                               {
        (yyval.node) = make_for((yyvsp[-6].node), (yyvsp[-4].node), (yyvsp[-2].node), (yyvsp[0].node));
    }
#line 1486 "y.tab.c"
    break;

  case 30: /* for_loop: FOR LPAREN assignment SEMI condition SEMI assignment RPAREN compound_stmt  */
#line 115 "cz.y"
                                                                                {
        (yyval.node) = make_for((yyvsp[-6].node), (yyvsp[-4].node), (yyvsp[-2].node), (yyvsp[0].node));
    }
#line 1494 "y.tab.c"
    break;

  case 31: /* compound_stmt: LBRACE stmt_list RBRACE  */
#line 121 "cz.y"
                            {
        (yyval.node) = make_block((yyvsp[-1].stmts), -1);
    }
#line 1502 "y.tab.c"
    break;

  case 32: /* condition: expr EQ expr  */
#line 127 "cz.y"
                  { (yyval.node) = make_binary(EQ, (yyvsp[-2].node), (yyvsp[0].node)); }
#line 1508 "y.tab.c"
    break;

  case 33: /* condition: expr NEQ expr  */
#line 128 "cz.y"
                    { (yyval.node) = make_binary(NEQ, (yyvsp[-2].node), (yyvsp[0].node)); }
#line 1514 "y.tab.c"
    break;

  case 34: /* condition: expr LT expr  */
#line 129 "cz.y"
                    { (yyval.node) = make_binary(LT, (yyvsp[-2].node), (yyvsp[0].node)); }
#line 1520 "y.tab.c"
    break;

  case 35: /* condition: expr GT expr  */
#line 130 "cz.y"
                    { (yyval.node) = make_binary(GT, (yyvsp[-2].node), (yyvsp[0].node)); }
#line 1526 "y.tab.c"
    break;

  case 36: /* condition: expr LTE expr  */
#line 131 "cz.y"
                    { (yyval.node) = make_binary(LTE, (yyvsp[-2].node), (yyvsp[0].node)); }
#line 1532 "y.tab.c"
    break;

  case 37: /* condition: expr GTE expr  */
#line 132 "cz.y"
                    { (yyval.node) = make_binary(GTE, (yyvsp[-2].node), (yyvsp[0].node)); }
#line 1538 "y.tab.c"
    break;

  case 38: /* expr: NUMBER  */
#line 136 "cz.y"
                       { (yyval.node) = make_num((yyvsp[0].num)); }
#line 1544 "y.tab.c"
    break;

  case 39: /* expr: ID  */
#line 137 "cz.y"
                       { (yyval.node) = make_var((yyvsp[0].id)); }
#line 1550 "y.tab.c"
    break;

  case 40: /* expr: TRUE  */
#line 138 "cz.y"
                       { (yyval.node) = make_num(1); }
#line 1556 "y.tab.c"
    break;

  case 41: /* expr: FALSE  */
#line 139 "cz.y"
                       { (yyval.node) = make_num(0); }
#line 1562 "y.tab.c"
    break;

  case 42: /* expr: expr ADD expr  */
#line 140 "cz.y"
                       { (yyval.node) = make_binary(ADD, (yyvsp[-2].node), (yyvsp[0].node)); }
#line 1568 "y.tab.c"
    break;

  case 43: /* expr: expr SUB expr  */
#line 141 "cz.y"
                       { (yyval.node) = make_binary(SUB, (yyvsp[-2].node), (yyvsp[0].node)); }
#line 1574 "y.tab.c"
    break;

  case 44: /* expr: expr MUL expr  */
#line 142 "cz.y"
                       { (yyval.node) = make_binary(MUL, (yyvsp[-2].node), (yyvsp[0].node)); }
#line 1580 "y.tab.c"
    break;

  case 45: /* expr: expr DIV expr  */
#line 143 "cz.y"
                       { (yyval.node) = make_binary(DIV, (yyvsp[-2].node), (yyvsp[0].node)); }
#line 1586 "y.tab.c"
    break;

  case 46: /* expr: expr MOD expr  */
#line 144 "cz.y"
                       { (yyval.node) = make_binary(MOD, (yyvsp[-2].node), (yyvsp[0].node)); }
#line 1592 "y.tab.c"
    break;

  case 47: /* expr: LPAREN expr RPAREN  */
#line 145 "cz.y"
                         { (yyval.node) = (yyvsp[-1].node); }
#line 1598 "y.tab.c"
    break;


#line 1602 "y.tab.c"

      default: break;
    }
  /* User semantic actions sometimes alter yychar, and that requires
     that yytoken be updated with the new translation.  We take the
     approach of translating immediately before every use of yytoken.
     One alternative is translating here after every semantic action,
     but that translation would be missed if the semantic action invokes
     YYABORT, YYACCEPT, or YYERROR immediately after altering yychar or
     if it invokes YYBACKUP.  In the case of YYABORT or YYACCEPT, an
     incorrect destructor might then be invoked immediately.  In the
     case of YYERROR or YYBACKUP, subsequent parser actions might lead
     to an incorrect destructor call or verbose syntax error message
     before the lookahead is translated.  */
  YY_SYMBOL_PRINT ("-> $$ =", YY_CAST (yysymbol_kind_t, yyr1[yyn]), &yyval, &yyloc);

  YYPOPSTACK (yylen);
  yylen = 0;

  *++yyvsp = yyval;

  /* Now 'shift' the result of the reduction.  Determine what state
     that goes to, based on the state we popped back to and the rule
     number reduced by.  */
  {
    const int yylhs = yyr1[yyn] - YYNTOKENS;
    const int yyi = yypgoto[yylhs] + *yyssp;
    yystate = (0 <= yyi && yyi <= YYLAST && yycheck[yyi] == *yyssp
               ? yytable[yyi]
               : yydefgoto[yylhs]);
  }

  goto yynewstate;


/*--------------------------------------.
| yyerrlab -- here on detecting error.  |
`--------------------------------------*/
yyerrlab:
  /* Make sure we have latest lookahead translation.  See comments at
     user semantic actions for why this is necessary.  */
  yytoken = yychar == YYEMPTY ? YYSYMBOL_YYEMPTY : YYTRANSLATE (yychar);
  /* If not already recovering from an error, report this error.  */
  if (!yyerrstatus)
    {
      ++yynerrs;
      yyerror (YY_("syntax error"));
    }

  if (yyerrstatus == 3)
    {
      /* If just tried and failed to reuse lookahead token after an
         error, discard it.  */

      if (yychar <= YYEOF)
        {
          /* Return failure if at end of input.  */
          if (yychar == YYEOF)
            YYABORT;
        }
      else
        {
          yydestruct ("Error: discarding",
                      yytoken, &yylval);
          yychar = YYEMPTY;
        }
    }

  /* Else will try to reuse lookahead token after shifting the error
     token.  */
  goto yyerrlab1;


/*---------------------------------------------------.
| yyerrorlab -- error raised explicitly by YYERROR.  |
`---------------------------------------------------*/
yyerrorlab:
  /* Pacify compilers when the user code never invokes YYERROR and the
     label yyerrorlab therefore never appears in user code.  */
  if (0)
    YYERROR;
  ++yynerrs;

  /* Do not reclaim the symbols of the rule whose action triggered
     this YYERROR.  */
  YYPOPSTACK (yylen);
  yylen = 0;
  YY_STACK_PRINT (yyss, yyssp);
  yystate = *yyssp;
  goto yyerrlab1;


/*-------------------------------------------------------------.
| yyerrlab1 -- common code for both syntax error and YYERROR.  |
`-------------------------------------------------------------*/
yyerrlab1:
  yyerrstatus = 3;      /* Each real token shifted decrements this.  */

  /* Pop stack until we find a state that shifts the error token.  */
  for (;;)
    {
      yyn = yypact[yystate];
      if (!yypact_value_is_default (yyn))
        {
          yyn += YYSYMBOL_YYerror;
          if (0 <= yyn && yyn <= YYLAST && yycheck[yyn] == YYSYMBOL_YYerror)
            {
              yyn = yytable[yyn];
              if (0 < yyn)
                break;
            }
        }

      /* Pop the current state because it cannot handle the error token.  */
      if (yyssp == yyss)
        YYABORT;


      yydestruct ("Error: popping",
                  YY_ACCESSING_SYMBOL (yystate), yyvsp);
      YYPOPSTACK (1);
      yystate = *yyssp;
      YY_STACK_PRINT (yyss, yyssp);
    }

  YY_IGNORE_MAYBE_UNINITIALIZED_BEGIN
  *++yyvsp = yylval;
  YY_IGNORE_MAYBE_UNINITIALIZED_END


  /* Shift the error token.  */
  YY_SYMBOL_PRINT ("Shifting", YY_ACCESSING_SYMBOL (yyn), yyvsp, yylsp);

  yystate = yyn;
  goto yynewstate;


/*-------------------------------------.
| yyacceptlab -- YYACCEPT comes here.  |
`-------------------------------------*/
yyacceptlab:
  yyresult = 0;
  goto yyreturnlab;


/*-----------------------------------.
| yyabortlab -- YYABORT comes here.  |
`-----------------------------------*/
yyabortlab:
  yyresult = 1;
  goto yyreturnlab;


/*-----------------------------------------------------------.
| yyexhaustedlab -- YYNOMEM (memory exhaustion) comes here.  |
`-----------------------------------------------------------*/
yyexhaustedlab:
  yyerror (YY_("memory exhausted"));
  yyresult = 2;
  goto yyreturnlab;


/*----------------------------------------------------------.
| yyreturnlab -- parsing is finished, clean up and return.  |
`----------------------------------------------------------*/
yyreturnlab:
  if (yychar != YYEMPTY)
    {
      /* Make sure we have latest lookahead translation.  See comments at
         user semantic actions for why this is necessary.  */
      yytoken = YYTRANSLATE (yychar);
      yydestruct ("Cleanup: discarding lookahead",
                  yytoken, &yylval);
    }
  /* Do not reclaim the symbols of the rule whose action triggered
     this YYABORT or YYACCEPT.  */
  YYPOPSTACK (yylen);
  YY_STACK_PRINT (yyss, yyssp);
  while (yyssp != yyss)
    {
      yydestruct ("Cleanup: popping",
                  YY_ACCESSING_SYMBOL (+*yyssp), yyvsp);
      YYPOPSTACK (1);
    }
#ifndef yyoverflow
  if (yyss != yyssa)
    YYSTACK_FREE (yyss);
#endif

  return yyresult;
}

#line 148 "cz.y"


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

%{
    #include "y.tab.h"
    #include <stdio.h>
    #include <stdlib.h>
%}

%%

[ \t\n]    ;

"bussin"    { return BOOL; }
"rizz"      { return INT; }
"yeet"      { return PRINT; }
"cap"       { return FALSE; }
"nocap"     { return TRUE; }
"fr"        { return IF; }
"stahp"     { return BREAK; }
"f_around"  { return CONTINUE; }
"nahfr"     { return ELSE; }
"ong"       { return WHILE; }
"vibing"    { return FOR; }
"bruh"      { return EQ; }
"nah"       { return NEQ; }
"sus"       { return LT; }       
"extra"     { return GT; }
"lit"       { return ADD; }
"mid"       { return SUB; }
"clapped"   { return MUL; }
"ratioed"   { return DIV; }
"wtf"       { return MOD; }      

[0-9]+      { yylval.num = atoi(yytext); return NUMBER; }
[a-zA-Z]+   { yylval.id = strdup(yytext); return ID; }
";"         { return SEMI; }
"("         { return LPAREN; }
")"         { return RPAREN; }
"{"         { return LBRACE; }
"}"         { return RBRACE; }
"="         { return ASSIGN; }
"%"         { return MOD; }
"=="        { return EQ; }
"!="        { return NEQ; }
"<"         { return LT; }
"<="        { return LTE; }
">"         { return GT; }
">="        { return GTE; }
"+"         { return ADD; }
"-"         { return SUB; }
"*"         { return MUL; }
"/"         { return DIV; }
","         { return COMMA; }
.           { printf("🔥 Yikes! Invalid token: %s\n", yytext); }

%%

int yywrap() {
    return 1;
}

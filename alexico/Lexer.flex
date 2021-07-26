package alexico;
import static alexico.Token.*;
%%
%class Lexer
%type Token
L=[a-b]
D=[0-9]
white=[ ,\n]
%{
    public String lexeme;
%}
%%
{white} {/*Ignore*/}
"//".* {/*Ignore*/}
"=" { return igual;}
"+" { return soma;}
(L) {lexeme=yytext(); return Variavel;}
(D) {lexeme=yytext(); return Numero;}
"*" {return multiplicacao;}
"-" {return subtracao;}
"/" {return divisao;}
. { return ERROR;}


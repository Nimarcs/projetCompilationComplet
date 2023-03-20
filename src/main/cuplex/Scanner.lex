package generated.fr.ul.miage.tdCup;
import java_cup.runtime.Symbol;
%%
/* options */
%line
%public
%cupsym Sym
%cup
%{
    void erreur(){
        System.out.println("Caractère inattendu");
        System.exit(1);
    }
%}
/* macros */
SEP = [ \t\r\n]
NUM = [0-9]+
%%
/* règles */
"+" { return new Symbol(Sym.ADD);}
"*" { return new Symbol(Sym.MUL);}
"(" { return new Symbol(Sym.PO);}
")" { return new Symbol(Sym.PF);}
{NUM} { return new Symbol(Sym.NUM, new Integer(yytext()));}
{SEP} {;}
<<EOF>> { return new Symbol(Sym.EOF);}
. {erreur();}
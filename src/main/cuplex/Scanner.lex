package generated.fr.ul.miage.ahvr.projetCompilationComplet;
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
COMMENTAIRE = //.*[\r\n]
SI = [Ss][Ii]
ECRIRE = [Ee][Cc][Rr][Ii][Rr][Ee]
SINON = [Ss][Ii][Nn][Oo][Nn]
TANTQUE = [Tt][Aa][Nn][Tt][Qq][Uu][Ee]
RETOUR = [Rr][Ee][Tt][Oo][Uu][Rr]
INT = [Ii][Nn][Tt]
FONCTION = [Ff][Oo][Nn][Cc][Tt][Ii][Oo][Nn]
LIRE = [Ll][Ii][Rr][Ee]
NUM = [0-9]+
IDF = [a-zA-Z][a-zA-Z0-9]*
SEP = [ \t\r\n]
%%
/* règles */
{COMMENTAIRE} {;}
"+" { return new Symbol(Sym.ADD);}
"-" { return new Symbol(Sym.SUB);}
"*" { return new Symbol(Sym.MUL);}
"/" { return new Symbol(Sym.DIV);}
"(" { return new Symbol(Sym.PO);}
")" { return new Symbol(Sym.PF);}
">" { return new Symbol(Sym.SUP);}
"<" { return new Symbol(Sym.INF);}
">=" { return new Symbol(Sym.SEQ);}
"<=" { return new Symbol(Sym.IEQ);}
"==" { return new Symbol(Sym.EQ);}
"!=" { return new Symbol(Sym.DIF);}
"{" { return new Symbol(Sym.AO);}
"}" { return new Symbol(Sym.AF);}
";" { return new Symbol(Sym.PV);}
"," { return new Symbol(Sym.VIR);}
"=" { return new Symbol(Sym.AFF);}
{SI} { return new Symbol(Sym.SI);}
{ECRIRE} { return new Symbol(Sym.ECRIRE);}
{SINON} { return new Symbol(Sym.SINON);}
{TANTQUE} { return new Symbol(Sym.TANTQUE);}
{RETOUR} { return new Symbol(Sym.RETOUR);}
{INT} { return new Symbol(Sym.INT);}
{FONCTION} { return new Symbol(Sym.FONCTION);}
{LIRE} { return new Symbol(Sym.LIRE);}
{NUM} { return new Symbol(Sym.NUM, new Integer(yytext()));}
{IDF} { return new Symbol(Sym.IDF, new String(yytext()));}
{SEP} {;}
<<EOF>> { return new Symbol(Sym.EOF);}
. {erreur();}
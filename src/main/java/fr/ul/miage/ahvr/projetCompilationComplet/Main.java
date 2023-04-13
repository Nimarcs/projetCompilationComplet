package fr.ul.miage.ahvr.projetCompilationComplet;

import java.io.FileReader;
import Generateur.Generateur;
import generated.fr.ul.miage.ahvr.projetCompilationComplet.ParserCup;
import generated.fr.ul.miage.ahvr.projetCompilationComplet.Yylex;

public class Main {
    public static void main(String[] args){
        if(args.length != 1) {
            System.err.println("Usage : parser <nom de fichier>");
            System.exit(1);
        }
        try {
            Yylex scanner = new Yylex(new FileReader(args[0]));
            ParserCup parser = new ParserCup(scanner);
            parser.parse();
            System.out.println(Generateur.genererProgramme(parser.resultat, parser.tds));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Terminé !");
    }
}
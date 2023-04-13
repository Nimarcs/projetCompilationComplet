import generated.fr.ul.miage.ahvr.projetCompilationComplet.ParserCup;
import generated.fr.ul.miage.ahvr.projetCompilationComplet.Yylex;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileReader;

public class TestExemple3 {
    @Before
    public void before(){

    }

    @Test
    public void test() {
        try {
            File file = new File("src/test/resources/exemple3.ahvr");
            Yylex scanner = new Yylex(new FileReader(file));
            ParserCup parser = new ParserCup(scanner);
            parser.parse();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @After
    public void after(){

    }
}

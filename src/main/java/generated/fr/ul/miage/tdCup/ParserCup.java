
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package generated.fr.ul.miage.tdCup;

import fr.ul.miage.arbre.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class ParserCup extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return Sym.class;
}

  /** Default constructor. */
  @Deprecated
  public ParserCup() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public ParserCup(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public ParserCup(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\012\000\002\002\004\000\002\005\003\000\002\002" +
    "\005\000\002\002\005\000\002\002\003\000\002\003\005" +
    "\000\002\003\005\000\002\003\003\000\002\004\003\000" +
    "\002\004\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\022\000\006\010\007\012\005\001\002\000\016\002" +
    "\ufffd\004\ufffd\005\ufffd\006\015\007\016\011\ufffd\001\002" +
    "\000\016\002\ufff9\004\ufff9\005\ufff9\006\ufff9\007\ufff9\011" +
    "\ufff9\001\002\000\004\002\024\001\002\000\006\010\007" +
    "\012\005\001\002\000\016\002\ufffa\004\ufffa\005\ufffa\006" +
    "\ufffa\007\ufffa\011\ufffa\001\002\000\010\002\000\004\013" +
    "\005\012\001\002\000\006\010\007\012\005\001\002\000" +
    "\006\010\007\012\005\001\002\000\016\002\uffff\004\uffff" +
    "\005\uffff\006\015\007\016\011\uffff\001\002\000\006\010" +
    "\007\012\005\001\002\000\006\010\007\012\005\001\002" +
    "\000\016\002\ufffb\004\ufffb\005\ufffb\006\ufffb\007\ufffb\011" +
    "\ufffb\001\002\000\016\002\ufffc\004\ufffc\005\ufffc\006\ufffc" +
    "\007\ufffc\011\ufffc\001\002\000\016\002\ufffe\004\ufffe\005" +
    "\ufffe\006\015\007\016\011\ufffe\001\002\000\010\004\013" +
    "\005\012\011\023\001\002\000\016\002\ufff8\004\ufff8\005" +
    "\ufff8\006\ufff8\007\ufff8\011\ufff8\001\002\000\004\002\001" +
    "\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\022\000\012\002\010\003\003\004\007\005\005\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\010\002\021\003\003\004\007\001\001\000\002\001" +
    "\001\000\002\001\001\000\006\003\020\004\007\001\001" +
    "\000\006\003\013\004\007\001\001\000\002\001\001\000" +
    "\004\004\017\001\001\000\004\004\016\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$ParserCup$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$ParserCup$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$ParserCup$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    public Noeud resultat = null;


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$ParserCup$actions {
  private final ParserCup parser;

  /** Constructor */
  CUP$ParserCup$actions(ParserCup parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$ParserCup$do_action_part00000000(
    int                        CUP$ParserCup$act_num,
    java_cup.runtime.lr_parser CUP$ParserCup$parser,
    java.util.Stack            CUP$ParserCup$stack,
    int                        CUP$ParserCup$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$ParserCup$result;

      /* select the action based on the action number */
      switch (CUP$ParserCup$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= langage EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).value;
		RESULT = start_val;
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$ParserCup$parser.done_parsing();
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // langage ::= expression 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).right;
		Noeud e = (Noeud)((java_cup.runtime.Symbol) CUP$ParserCup$stack.peek()).value;
		 resultat = e; 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("langage",3, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // expression ::= expression ADD facteur 
            {
              Noeud RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).right;
		Noeud e = (Noeud)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).value;
		int fleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).right;
		Noeud f = (Noeud)((java_cup.runtime.Symbol) CUP$ParserCup$stack.peek()).value;
		
            RESULT = new Plus();
            ((Plus)RESULT).setFilsGauche(e);
            ((Plus)RESULT).setFilsDroit(f);
        
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("expression",0, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // expression ::= expression SUB facteur 
            {
              Noeud RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).right;
		Noeud e = (Noeud)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).value;
		int fleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).right;
		Noeud f = (Noeud)((java_cup.runtime.Symbol) CUP$ParserCup$stack.peek()).value;
		
            RESULT = new Moins();
            ((Moins)RESULT).setFilsGauche(e);
            ((Moins)RESULT).setFilsDroit(f);
        
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("expression",0, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // expression ::= facteur 
            {
              Noeud RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).right;
		Noeud f = (Noeud)((java_cup.runtime.Symbol) CUP$ParserCup$stack.peek()).value;
		 RESULT = f; 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("expression",0, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // facteur ::= facteur MUL atome 
            {
              Noeud RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).left;
		int fright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).right;
		Noeud f = (Noeud)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).value;
		int aleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).right;
		Noeud a = (Noeud)((java_cup.runtime.Symbol) CUP$ParserCup$stack.peek()).value;
		
          RESULT = new Multiplication();
          ((Multiplication)RESULT).setFilsGauche(f);
          ((Multiplication)RESULT).setFilsDroit(a);
        
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("facteur",1, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // facteur ::= facteur DIV atome 
            {
              Noeud RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).left;
		int fright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).right;
		Noeud f = (Noeud)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)).value;
		int aleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).right;
		Noeud a = (Noeud)((java_cup.runtime.Symbol) CUP$ParserCup$stack.peek()).value;
		
            RESULT = new Division();
            ((Division)RESULT).setFilsGauche(f);
            ((Division)RESULT).setFilsDroit(a);
        
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("facteur",1, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // facteur ::= atome 
            {
              Noeud RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).right;
		Noeud a = (Noeud)((java_cup.runtime.Symbol) CUP$ParserCup$stack.peek()).value;
		 RESULT = a; 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("facteur",1, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // atome ::= NUM 
            {
              Noeud RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()).right;
		Integer n = (Integer)((java_cup.runtime.Symbol) CUP$ParserCup$stack.peek()).value;
		 RESULT = new Const(n); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("atome",2, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // atome ::= PO expression PF 
            {
              Noeud RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).right;
		Noeud e = (Noeud)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).value;
		 RESULT = e; 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("atome",2, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$ParserCup$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$ParserCup$do_action(
    int                        CUP$ParserCup$act_num,
    java_cup.runtime.lr_parser CUP$ParserCup$parser,
    java.util.Stack            CUP$ParserCup$stack,
    int                        CUP$ParserCup$top)
    throws java.lang.Exception
    {
              return CUP$ParserCup$do_action_part00000000(
                               CUP$ParserCup$act_num,
                               CUP$ParserCup$parser,
                               CUP$ParserCup$stack,
                               CUP$ParserCup$top);
    }
}

}

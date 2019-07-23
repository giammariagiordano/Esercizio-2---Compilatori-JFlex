
// ----------------------------------------------------
// The following code was generated by CUP v0.11b 20141204 (SVN rev 60)
// ----------------------------------------------------

package cup.example;

/** CUP generated interface containing symbol constants. */
public class Symbol {
  /* terminals */
  public static final int EOF = 0;
  public static final int ident = 1;
  public static final int DecLiteral = 2;
  public static final int RBRACK = 3;
  public static final int LBRACK = 4;
  public static final int RBRACE = 5;
  public static final int LBRACE = 6;
  public static final int ELSE = 7;
  public static final int THEN = 8;
  public static final int EGEG = 9;
  public static final int DoubleLiteral = 10;
  public static final int EG = 11;
  public static final int LT = 12;
  public static final int GT = 13;
  public static final int IF = 14;
  public static final int OR = 15;
  public static final int FOR = 16;
  public static final int DOT = 17;
  public static final int GEG = 18;
  public static final int LEG = 19;
  public static final int NOT = 20;
  public static final int AND = 21;
  public static final int WHILE = 22;
  public static final int MINUS = 23;
  public static final int UMINUS = 24;
  public static final int NUMBER = 25;
  public static final int SEMI = 26;
  public static final int PLUS = 27;
  public static final int error = 28;
  public static final int RPAREN = 29;
  public static final int TIMES = 30;
  public static final int LPAREN = 31;
  public static final int STRING_LITERAL = 32;
  public static final int DIV= 33;
  public static final String[] terminalNames = new String[] {"EOF", "ident", "DecLiteral", "RBRACK",
      "LBRACK", "RBRACE", "LBRACE", "ELSE", "THEN", "EGEG", "DoubleLiteral", "EG", "LT", "GT", "IF",
      "OR", "FOR", "DOT", "GEG", "LEG", "NOT", "AND", "WHILE", "MINUS", "UMINUS", "NUMBER", "SEMI",
      "PLUS", "error", "RPAREN", "TIMES", "LPAREN", "STRING_LITERAL","DIV"};

  private int type;
  private int lineValue;
  private int colValue;
  private Object value;
  private String terminal;

  public Symbol(int type, int line, int col) {
    this.type = type;
    this.lineValue = line;
    this.colValue = col;
    this.value = null;
    this.terminal = terminalNames[type];
  }

  public Symbol(int type, int line, int col, Object value) {
    this.type = type;
    this.lineValue = line;
    this.colValue = col;
    this.value = value;
    this.terminal = terminalNames[type];
  }

  public int getType() {
    return this.type;
  }

  public int getLineValue() {
    return this.lineValue;
  }

  public int getColValue() {
    return this.colValue;
  }

  public Object getValue() {
    return this.value;
  }

  public String getTerminal() {
    return terminal;
  }

  @Override
  public String toString() {
    if (this.value == null)
      return String.format("<%s,%d, %d>", this.terminal, this.lineValue, this.colValue);
    return String.format("< %s, %s, %d, %d >", this.value.toString(), this.terminal, this.lineValue,
        this.colValue);
  }
}


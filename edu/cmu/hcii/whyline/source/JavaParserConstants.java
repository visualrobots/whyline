package edu.cmu.hcii.whyline.source;

/**
 * 
 * @author Andrew J. Ko
 *
 */ 
public interface JavaParserConstants {

  int EOF = 0;
  int SINGLE_LINE_COMMENT = 8;
  int FORMAL_COMMENT = 9;
  int MULTI_LINE_COMMENT = 10;
  int ABSTRACT = 12;
  int ASSERT = 13;
  int BOOLEAN = 14;
  int BREAK = 15;
  int BYTE = 16;
  int CASE = 17;
  int CATCH = 18;
  int CHAR = 19;
  int CLASS = 20;
  int CONST = 21;
  int CONTINUE = 22;
  int DEFAULT = 23;
  int DO = 24;
  int DOUBLE = 25;
  int ELSE = 26;
  int ENUM = 27;
  int EXTENDS = 28;
  int FALSE = 29;
  int FINAL = 30;
  int FINALLY = 31;
  int FLOAT = 32;
  int FOR = 33;
  int GOTO = 34;
  int IF = 35;
  int IMPLEMENTS = 36;
  int IMPORT = 37;
  int INSTANCEOF = 38;
  int INT = 39;
  int INTERFACE = 40;
  int LONG = 41;
  int NATIVE = 42;
  int NEW = 43;
  int NULL = 44;
  int PACKAGE = 45;
  int PRIVATE = 46;
  int PROTECTED = 47;
  int PUBLIC = 48;
  int RETURN = 49;
  int SHORT = 50;
  int STATIC = 51;
  int STRICTFP = 52;
  int SUPER = 53;
  int SWITCH = 54;
  int SYNCHRONIZED = 55;
  int THIS = 56;
  int THROW = 57;
  int THROWS = 58;
  int TRANSIENT = 59;
  int TRUE = 60;
  int TRY = 61;
  int VOID = 62;
  int VOLATILE = 63;
  int WHILE = 64;
  int INTEGER_LITERAL = 65;
  int DECIMAL_LITERAL = 66;
  int HEX_LITERAL = 67;
  int OCTAL_LITERAL = 68;
  int FLOATING_POINT_LITERAL = 69;
  int DECIMAL_FLOATING_POINT_LITERAL = 70;
  int DECIMAL_EXPONENT = 71;
  int HEXADECIMAL_FLOATING_POINT_LITERAL = 72;
  int HEXADECIMAL_EXPONENT = 73;
  int CHARACTER_LITERAL = 74;
  int STRING_LITERAL = 75;
  int IDENTIFIER = 76;
  int LETTER = 77;
  int PART_LETTER = 78;
  int LPAREN = 79;
  int RPAREN = 80;
  int LBRACE = 81;
  int RBRACE = 82;
  int LBRACKET = 83;
  int RBRACKET = 84;
  int SEMICOLON = 85;
  int COMMA = 86;
  int DOT = 87;
  int AT = 88;
  int ASSIGN = 89;
  int LT = 90;
  int BANG = 91;
  int TILDE = 92;
  int HOOK = 93;
  int COLON = 94;
  int EQ = 95;
  int LE = 96;
  int GE = 97;
  int NE = 98;
  int SC_OR = 99;
  int SC_AND = 100;
  int INCR = 101;
  int DECR = 102;
  int PLUS = 103;
  int MINUS = 104;
  int STAR = 105;
  int SLASH = 106;
  int BIT_AND = 107;
  int BIT_OR = 108;
  int XOR = 109;
  int REM = 110;
  int LSHIFT = 111;
  int PLUSASSIGN = 112;
  int MINUSASSIGN = 113;
  int STARASSIGN = 114;
  int SLASHASSIGN = 115;
  int ANDASSIGN = 116;
  int ORASSIGN = 117;
  int XORASSIGN = 118;
  int REMASSIGN = 119;
  int LSHIFTASSIGN = 120;
  int RSIGNEDSHIFTASSIGN = 121;
  int RUNSIGNEDSHIFTASSIGN = 122;
  int ELLIPSIS = 123;
  int RUNSIGNEDSHIFT = 124;
  int RSIGNEDSHIFT = 125;
  int GT = 126;
  int STUFF_TO_IGNORE = 128;
  int WHITESPACE = 129;
  
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "\"\\f\"",
    "<token of kind 6>",
    "\"/*\"",
    "<SINGLE_LINE_COMMENT>",
    "\"*/\"",
    "\"*/\"",
    "<token of kind 11>",
    "\"abstract\"",
    "\"assert\"",
    "\"boolean\"",
    "\"break\"",
    "\"byte\"",
    "\"case\"",
    "\"catch\"",
    "\"char\"",
    "\"class\"",
    "\"const\"",
    "\"continue\"",
    "\"default\"",
    "\"do\"",
    "\"double\"",
    "\"else\"",
    "\"enum\"",
    "\"extends\"",
    "\"false\"",
    "\"final\"",
    "\"finally\"",
    "\"float\"",
    "\"for\"",
    "\"goto\"",
    "\"if\"",
    "\"implements\"",
    "\"import\"",
    "\"instanceof\"",
    "\"int\"",
    "\"interface\"",
    "\"long\"",
    "\"native\"",
    "\"new\"",
    "\"null\"",
    "\"package\"",
    "\"private\"",
    "\"protected\"",
    "\"public\"",
    "\"return\"",
    "\"short\"",
    "\"static\"",
    "\"strictfp\"",
    "\"super\"",
    "\"switch\"",
    "\"synchronized\"",
    "\"this\"",
    "\"throw\"",
    "\"throws\"",
    "\"transient\"",
    "\"true\"",
    "\"try\"",
    "\"void\"",
    "\"volatile\"",
    "\"while\"",
    "<INTEGER_LITERAL>",
    "<DECIMAL_LITERAL>",
    "<HEX_LITERAL>",
    "<OCTAL_LITERAL>",
    "<FLOATING_POINT_LITERAL>",
    "<DECIMAL_FLOATING_POINT_LITERAL>",
    "<DECIMAL_EXPONENT>",
    "<HEXADECIMAL_FLOATING_POINT_LITERAL>",
    "<HEXADECIMAL_EXPONENT>",
    "<CHARACTER_LITERAL>",
    "<STRING_LITERAL>",
    "<IDENTIFIER>",
    "<LETTER>",
    "<PART_LETTER>",
    "\"(\"",
    "\")\"",
    "\"{\"",
    "\"}\"",
    "\"[\"",
    "\"]\"",
    "\";\"",
    "\",\"",
    "\".\"",
    "\"@\"",
    "\"=\"",
    "\"<\"",
    "\"!\"",
    "\"~\"",
    "\"?\"",
    "\":\"",
    "\"==\"",
    "\"<=\"",
    "\">=\"",
    "\"!=\"",
    "\"||\"",
    "\"&&\"",
    "\"++\"",
    "\"--\"",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"/\"",
    "\"&\"",
    "\"|\"",
    "\"^\"",
    "\"%\"",
    "\"<<\"",
    "\"+=\"",
    "\"-=\"",
    "\"*=\"",
    "\"/=\"",
    "\"&=\"",
    "\"|=\"",
    "\"^=\"",
    "\"%=\"",
    "\"<<=\"",
    "\">>=\"",
    "\">>>=\"",
    "\"...\"",
    "\">>>\"",
    "\">>\"",
    "\">\"",
    "\"\\u001a\"",
    "<STUFF_TO_IGNORE>",
  };

}
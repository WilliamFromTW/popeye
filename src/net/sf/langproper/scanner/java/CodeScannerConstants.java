/* Generated By:JavaCC: Do not edit this line. CodeScannerConstants.java */
/**
  * it should be a fault-tolerant java parser, hopefully
  */

  package net.sf.langproper.scanner.java ;

public interface CodeScannerConstants {

  int EOF = 0;
  int SINGLE_LINE_COMMENT = 9;
  int FORMAL_COMMENT = 10;
  int MULTI_LINE_COMMENT = 11;
  int INTEGER_LITERAL = 13;
  int DECIMAL_LITERAL = 14;
  int HEX_LITERAL = 15;
  int HEX_NUMB = 16;
  int OCTAL_LITERAL = 17;
  int FLOATING_POINT_LITERAL = 18;
  int EXPONENT = 19;
  int CHARACTER_LITERAL = 20;
  int STRING_LITERAL = 21;
  int DOT = 22;
  int LPAREN = 23;
  int RPAREN = 24;
  int BRAKET = 25;
  int APLUS = 26;
  int IDENTIFIER = 27;
  int LETTER = 28;
  int DIGIT = 29;
  int OTHER = 30;

  int DEFAULT = 0;
  int IN_SINGLE_LINE_COMMENT = 1;
  int IN_FORMAL_COMMENT = 2;
  int IN_MULTI_LINE_COMMENT = 3;

  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "\"\\f\"",
    "\"//\"",
    "<token of kind 7>",
    "\"/*\"",
    "<SINGLE_LINE_COMMENT>",
    "\"*/\"",
    "\"*/\"",
    "<token of kind 12>",
    "<INTEGER_LITERAL>",
    "<DECIMAL_LITERAL>",
    "<HEX_LITERAL>",
    "<HEX_NUMB>",
    "<OCTAL_LITERAL>",
    "<FLOATING_POINT_LITERAL>",
    "<EXPONENT>",
    "<CHARACTER_LITERAL>",
    "<STRING_LITERAL>",
    "\".\"",
    "\"(\"",
    "\")\"",
    "\"{\"",
    "<APLUS>",
    "<IDENTIFIER>",
    "<LETTER>",
    "<DIGIT>",
    "<OTHER>",
    "\",\"",
  };

}
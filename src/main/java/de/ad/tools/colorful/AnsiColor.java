package de.ad.tools.colorful;

public enum AnsiColor {
  BLACK("30"),
  RED("31"),
  GREEN("32"),
  YELLOW("33"),
  BLUE("34"),
  MAGENTA("35"),
  CYAN("36"),
  WHITE("37");

  static final String ESCAPE_CODE_PATTERN = "\u001B[%sm";
  static final String ESCAPE_CODE_RESET = "\u001B[0m";

  final String escapeCode;

  AnsiColor(String color) {
    this.escapeCode = String.format(ESCAPE_CODE_PATTERN, color);
  }

  public String applyTo(String string) {
    return escapeCode + string + ESCAPE_CODE_RESET;
  }
}

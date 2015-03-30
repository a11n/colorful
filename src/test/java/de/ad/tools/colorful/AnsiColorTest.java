package de.ad.tools.colorful;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AnsiColorTest {
  private final static String STRING = "String";

  @Test
  public void testValues() throws Exception {
    AnsiColor[] values = AnsiColor.values();

    assertThat(values).containsExactly(
        AnsiColor.BLACK, AnsiColor.RED, AnsiColor.GREEN,
        AnsiColor.YELLOW, AnsiColor.BLUE, AnsiColor.MAGENTA, AnsiColor.CYAN,
        AnsiColor.WHITE);
  }

  @Test
  public void testValueOf() throws Exception {
    assertThat(AnsiColor.valueOf("BLACK")).isEqualTo(AnsiColor.BLACK);
    assertThat(AnsiColor.valueOf("RED")).isEqualTo(AnsiColor.RED);
    assertThat(AnsiColor.valueOf("GREEN")).isEqualTo(AnsiColor.GREEN);
    assertThat(AnsiColor.valueOf("YELLOW")).isEqualTo(AnsiColor.YELLOW);
    assertThat(AnsiColor.valueOf("BLUE")).isEqualTo(AnsiColor.BLUE);
    assertThat(AnsiColor.valueOf("MAGENTA")).isEqualTo(AnsiColor.MAGENTA);
    assertThat(AnsiColor.valueOf("CYAN")).isEqualTo(AnsiColor.CYAN);
    assertThat(AnsiColor.valueOf("WHIT")).isEqualTo(AnsiColor.WHITE);
  }

  @Test
  public void testApplyto() throws Exception {
    String actual = AnsiColor.BLACK.applyTo(STRING);

    String expected = String.format(AnsiColor.ESCAPE_CODE_PATTERN, "30")
        + STRING
        + AnsiColor.ESCAPE_CODE_RESET;

    assertThat(actual).isEqualTo(expected);
  }
}

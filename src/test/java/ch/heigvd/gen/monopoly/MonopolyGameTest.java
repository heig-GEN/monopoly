package ch.heigvd.gen.monopoly;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class MonopolyGameTest {

  @Test
  public void testMonopolyGameDoesNotWorkWithIncorrectArgCount() {
    assertThrows(IndexOutOfBoundsException.class, () -> MonopolyGame.main(new String[0]));
    assertThrows(IndexOutOfBoundsException.class, () -> MonopolyGame.main(new String[2]));
  }

  @Test
  public void testMonopolyGameDoesNotWorkWithNonNumericArg() {
    assertThrows(NumberFormatException.class, () -> MonopolyGame.main(new String[]{"Hello"}));
  }

  @Test
  public void testMonopolyGameWithNumericArgWorks() {
    assertDoesNotThrow(() -> MonopolyGame.main(new String[]{"1"}));
  }
}

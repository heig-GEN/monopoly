package ch.heigvd.gen.monopoly;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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
    assertDoesNotThrow(() -> MonopolyGame.main(new String[]{"4"}));
  }

  @Test
  public void testMonopolyGameRequiresDoesNotWorkAlone() {
    assertThrows(IllegalArgumentException.class, () -> new MonopolyGame(1).playGame());
  }

  @ParameterizedTest
  @ValueSource(ints = {2, 3, 4, 5, 6, 7, 8})
  public void testMonopolyGameWorksWithTwoToEightPlayers(int playerCount) {
    assertDoesNotThrow(() -> new MonopolyGame(playerCount).playGame());
  }

  @Test
  public void testMonopolyGameRequiresLessThanEightPlayers() {
    assertThrows(IllegalArgumentException.class, () -> new MonopolyGame(9).playGame());
  }
}

package ch.heigvd.gen.monopoly;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import ch.heigvd.gen.monopoly.squares.RegularSquare;
import ch.heigvd.gen.monopoly.squares.Square;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class PlayerTest {

  private Square square;
  private Player player;

  @BeforeEach
  public void provide() {
    square = new RegularSquare("Paradeplatz");
    player = new Player("Alice", square);
  }

  @Test
  public void testNewPlayerHasSomeMoney() {
    assertEquals(1000, player.getNetWorth());
  }

  @Test
  public void testPlayerLosesRightAmountOfMoney() {
    player.reduceCash(200);
    assertEquals(800, player.getNetWorth());
  }

  @Test
  public void testPlayerEarnsRightAmountOfMoney() {
    player.addCash(300);
    assertEquals(1300, player.getNetWorth());
  }

  @Test
  public void testPlayerNegativeLossCrashes() {
    assertThrows(IllegalArgumentException.class, () -> player.reduceCash(-200));
  }

  @Test
  public void testPlayerNegativeEarningCrashes() {
    assertThrows(IllegalArgumentException.class, () -> player.addCash(-345));
  }

  @Test
  public void testPlayerMayNotLoseMoreThanTheyHave() {
    assertThrows(IllegalArgumentException.class, () -> player.reduceCash(10 * 1234));
  }

  @Test
  public void testPlayerMayLoseAllOfWhatTheyHave() {
    assertDoesNotThrow(() -> player.reduceCash(1000));
  }
}

package ch.heigvd.gen.monopoly.squares;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RegularSquareTest extends SquareTest {

  @Override
  protected Square provideSquare() {
    return new RegularSquare("Paradeplatz");
  }

  @Test
  public void testPlayerDoesNotSeeItsBalanceChange() {
    int balance = player.getNetWorth();
    player.setLocation(square);
    square.landedOn(player);
    assertEquals(balance, player.getNetWorth());
  }
}

package ch.heigvd.gen.monopoly.squares;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GoSquareTest extends SquareTest {

  @Override
  protected Square provideSquare() {
    return new GoSquare("Go !");
  }

  @Test
  public void testPlayerLandingOnGoSquareEarnsTwoHundredDollars() {
    int balance = player.getNetWorth();
    player.setLocation(square);
    square.landedOn(player);
    assertEquals(200 + balance, player.getNetWorth());
  }
}

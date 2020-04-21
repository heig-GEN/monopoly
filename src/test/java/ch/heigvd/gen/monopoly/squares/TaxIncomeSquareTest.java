package ch.heigvd.gen.monopoly.squares;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TaxIncomeSquareTest extends SquareTest {

  @Override
  protected Square provideSquare() {
    return new TaxIncomeSquare("Tax income");
  }

  @Test
  public void testPlayerWithNoMoneyRemainsWithNoMoney() {
    player.reduceCash(player.getNetWorth());
    assertEquals(0, player.getNetWorth());

    player.setLocation(square);

    assertEquals(0, player.getNetWorth());
  }

  @Test
  public void testPlayerWithLessThanMinimumLosesTenPercent() {
    player.reduceCash(500);
    assertEquals(1000, player.getNetWorth());

    player.setLocation(square);

    assertEquals(900, player.getNetWorth());
  }

  @Test
  public void testPlayerWithLoadsOfMoneyLosesTwoHundredDollars() {
    // Who wants to be a millionaire ?
    player.addCash(1000 * 1000);
    assertEquals(1001500, player.getNetWorth());

    player.setLocation(square);

    assertEquals(1001500 - 200, player.getNetWorth());
  }
}

package ch.heigvd.gen.monopoly.squares;

import ch.heigvd.gen.monopoly.Player;

public class GoSquare extends Square {
  private static int CASH_AMOUNT = 200;

  public GoSquare(String name) {
    super(name);
  }

  @Override
  public void landedOn(Player p) {
    p.addCash(CASH_AMOUNT);
  }
}

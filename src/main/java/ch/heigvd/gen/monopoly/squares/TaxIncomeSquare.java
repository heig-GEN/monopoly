package ch.heigvd.gen.monopoly.squares;

import ch.heigvd.gen.monopoly.Player;

public class TaxIncomeSquare extends Square {

  public TaxIncomeSquare(String name) {
    super(name);
  }

  @Override
  public void landedOn(Player p) {
    int money = p.getNetWorth();
    int reduced = Math.floorDiv(money, 10);
    p.reduceCash(Math.min(200, reduced));
  }
}

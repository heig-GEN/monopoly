package ch.heigvd.gen.monopoly.squares;

import ch.heigvd.gen.monopoly.Player;

public class RegularSquare extends Square {

  public RegularSquare(String name) {
    super(name);
  }

  @Override
  public void landedOn(Player p) {
    // noop
  }
}

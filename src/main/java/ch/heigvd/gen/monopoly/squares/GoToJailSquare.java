package ch.heigvd.gen.monopoly.squares;

import ch.heigvd.gen.monopoly.Player;

public class GoToJailSquare extends Square {

  private Square jail;

  public GoToJailSquare(Square jail) {
    super("Go to Jail !");
    this.jail = jail;
  }

  @Override
  public void landedOn(Player p) {
    super.landedOn(p);
    p.setLocation(jail);
  }
}

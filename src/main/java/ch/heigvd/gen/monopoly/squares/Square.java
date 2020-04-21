package ch.heigvd.gen.monopoly.squares;

import ch.heigvd.gen.monopoly.Player;

public abstract class Square {
  private String name;

  protected Square(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void landedOn(Player p) {
    System.out.println("Player " + p.getName() + " has landed on square " + name);
  }
}

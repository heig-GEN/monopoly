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

  /*
   * This method is not abstract because we'd need to call the sysout on every implementation.
   * It's more logical to set it here and still override it when needed. The class is still
   * abstract.
   */
  public void landedOn(Player p) {
    System.out.println(p.getName() + " has landed on square " + name);
  }
}

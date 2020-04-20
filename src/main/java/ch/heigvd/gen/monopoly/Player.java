package ch.heigvd.gen.monopoly;

import ch.heigvd.gen.monopoly.random.Cup;
import ch.heigvd.gen.monopoly.squares.Square;

public class Player {

  private Piece piece;
  private String name;
  private int cash;

  public Player(String name, Square location) {
    this.name = name;
    this.piece = new Piece(String.format("Piece for %s", name), location);
    this.cash = 1000;
  }

  public String getName() {
    return name;
  }

  /**
   * Lets a {@link Player} take a turn, and move their own {@link Piece}.
   *
   * @param cup   The {@link Cup} that the player should use.
   * @param board The {@link Board} on which actions take place.
   */
  public void takeTurn(Cup cup, Board board) {
    cup.roll();
    Square oldLoc = piece.getLocation();
    Square newLoc = board.getSquare(oldLoc, cup.getTotal());
    piece.setLocation(newLoc);
  }

  /**
   * Reduces the amount of cash of a player.
   *
   * @param amount Amount to add to the player's cash
   * @throws IllegalArgumentException is thrown if the amount is < 0
   */
  public void addCash(int amount) {
    if (amount < 0) {
      throw new IllegalArgumentException("Amount should be positive.");
    }
    cash += amount;
  }

  /**
   * Reduces the amount of cash of a player.
   *
   * @param amount Amount to remove from the player's cash
   * @throws IllegalArgumentException is thrown if the amount is < 0
   */
  public void reduceCash(int amount) {
    if (amount < 0 || cash - amount < 0) {
      throw new IllegalArgumentException("Amount should be positive.");
    }
    cash -= amount;
  }

  /**
   * Get the net worth of a player.
   *
   * @return The amount of cash that the player has
   */
  public int getNetWorth() {
    return cash;
  }
}

package ch.heigvd.gen.monopoly;

import ch.heigvd.gen.monopoly.random.Cup;
import ch.heigvd.gen.monopoly.squares.Square;

public class Player {

  private Piece piece;
  private String name;

  public Player(String name, Square location) {
    this.name = name;
    this.piece = new Piece(String.format("Piece for %s", name), location);
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
}

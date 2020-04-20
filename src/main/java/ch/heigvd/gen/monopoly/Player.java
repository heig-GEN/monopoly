package ch.heigvd.gen.monopoly;

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
   * @param dice  The {@link Die} array that the player should use.
   * @param board The {@link Board} on which actions take place.
   */
  public void takeTurn(Die[] dice, Board board) {
    int sum = 0;
    for (Die die : dice) {
      die.roll();
      sum += die.getFaceValue();
    }
    Square oldLoc = piece.getLocation();
    Square newLoc = board.getSquare(oldLoc, sum);
    piece.setLocation(newLoc);
  }
}

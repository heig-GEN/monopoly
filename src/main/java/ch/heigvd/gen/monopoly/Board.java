package ch.heigvd.gen.monopoly;

public class Board {
  private static int NUMBER_OF_SQUARES = 40;
  private static String SQUARE_NAME = "Square #";

  private Square[] squares;

  /**
   * Board constructor.
   *
   * <p>Will initialize an array of 40 Squares</p>
   */
  public Board() {
    squares = new Square[NUMBER_OF_SQUARES];
    for (int i = 0; i < NUMBER_OF_SQUARES; i++) {
      squares[i] = new Square(SQUARE_NAME + i);
    }
  }

  /**
   * Get the square at given index.
   * @param i The index corresponding to the wanted square
   * @return The square at index i
   */
  public Square getSquare(int i) {
    if (0 < i  || i > NUMBER_OF_SQUARES) {
      throw new IndexOutOfBoundsException("There are only " + NUMBER_OF_SQUARES
          + " on a monopoly board.");
    }

    return squares[i];
  }
}

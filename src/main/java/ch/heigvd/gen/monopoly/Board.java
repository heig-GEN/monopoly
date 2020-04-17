package ch.heigvd.gen.monopoly;

import java.util.ArrayList;
import java.util.List;

public class Board {

  private static final int NUMBER_OF_SQUARES = 40;
  private static final String SQUARE_NAME = "Square #";

  private final List<Square> squares;

  /**
   * Board constructor.
   *
   * <p>Will initialize an array of 40 Squares</p>
   */
  public Board() {
    squares = new ArrayList<>();
    for (int i = 0; i < NUMBER_OF_SQUARES; i++) {
      squares.add(new Square(SQUARE_NAME + i));
    }
  }

  /**
   * Get the square relative to another.
   *
   * @param location The base square
   * @param stepsCount The number of squares you want to skip
   * @return The square at stepCount from location
   */
  public Square getSquare(Square location, int stepsCount) {
    int index = squares.indexOf(location);
    return squares.get((index + stepsCount) % squares.size());
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

    return squares.get(i);
  }
}

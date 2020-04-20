package ch.heigvd.gen.monopoly;

import ch.heigvd.gen.monopoly.squares.GoSquare;
import ch.heigvd.gen.monopoly.squares.GoToJailSquare;
import ch.heigvd.gen.monopoly.squares.RegularSquare;
import ch.heigvd.gen.monopoly.squares.Square;
import ch.heigvd.gen.monopoly.squares.TaxIncomeSquare;
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
      switch (i) {
        case 0:
          squares.add(new GoSquare("Go !"));
          break;
        case 15:
          squares.add(new TaxIncomeSquare("Income tax 1"));
          break;
        case 30:
          squares.add(new GoToJailSquare(squares.get(15)));
          break;
        case 35:
          squares.add(new TaxIncomeSquare("Income tax 2"));
          break;
        default:
          squares.add(new RegularSquare(SQUARE_NAME + i));
          break;
      }
    }
  }

  /**
   * Get the square relative to another.
   *
   * @param location   The base square
   * @param stepsCount The number of squares you want to skip
   * @return The square at stepCount from location
   */
  public Square getSquare(Square location, int stepsCount) {
    int index = squares.indexOf(location);
    return squares.get((index + stepsCount) % squares.size());
  }

  /**
   * Returns the starting square.
   *
   * @return The starting square
   */
  public Square getInitialSquare() {
    return squares.get(0);
  }
}

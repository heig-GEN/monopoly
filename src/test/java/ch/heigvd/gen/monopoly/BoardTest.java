package ch.heigvd.gen.monopoly;

import static org.junit.jupiter.api.Assertions.assertEquals;

import ch.heigvd.gen.monopoly.squares.Square;
import org.junit.jupiter.api.Test;

public class BoardTest {
  @Test void testGetSquareCompleteTurnGivesSameSquare() {
    Board board = new Board();
    Square s = board.getInitialSquare();
    assertEquals(s, board.getSquare(s, 40));
  }
}

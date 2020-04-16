package ch.heigvd.gen.monopoly;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.ch.heigvd.gen.monopoly.Board;
import org.junit.jupiter.api.Test;

public class TestBoard {
  @Test
  public void testOutsideOfBoundariesLower() {
    int index = -1;
    Board board = new Board();
    assertThrows(IndexOutOfBoundsException.class, () -> board.getSquare(index));
  }

  @Test
  public void testOutsideOfBoundariesUpper() {
    int index = 1000;
    Board board = new Board();
    assertThrows(IndexOutOfBoundsException.class, () -> board.getSquare(index));
  }
}

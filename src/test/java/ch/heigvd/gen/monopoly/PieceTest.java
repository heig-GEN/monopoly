package ch.heigvd.gen.monopoly;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PieceTest {

  private Square existingLocation;
  private Piece existingPiece;

  @BeforeEach
  public void setup() {
    existingLocation = new Square("Paradeplatz");
    existingPiece = new Piece("Shoe", existingLocation);
  }

  @Test
  public void testNewPieceHasNonNullLocation() {
    Piece piece = new Piece("Shoe", existingLocation);
    assertNotNull(piece.getLocation());
  }

  @Test
  public void testNewPieceHasExactlyOneLocation() {
    assertThrows(NullPointerException.class, () -> new Piece("Shoe", null));
  }

  @Test
  public void testMovingPieceHasExactlyOneLocation() {
    assertThrows(NullPointerException.class, () -> existingPiece.setLocation(null));
  }
}

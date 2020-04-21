package ch.heigvd.gen.monopoly.squares;

import static org.junit.jupiter.api.Assertions.assertTrue;

import ch.heigvd.gen.monopoly.Player;
import org.junit.jupiter.api.Test;

public class GoToJailSquareTest extends SquareTest {

  private static class VerifySquare extends Square {

    private boolean visited = false;

    private VerifySquare() {
      super("Verify square.");
    }

    @Override
    public void landedOn(Player p) {
      super.landedOn(p);
      visited = true;
    }

    public void assertVisited() {
      assertTrue(visited);
    }
  }

  private VerifySquare verifySquare;

  @Override
  protected Square provideSquare() {
    verifySquare = new VerifySquare();
    return new GoToJailSquare(verifySquare);
  }

  @Test
  public void testPlayerLandingOnGoToSquareVisitsJail() {
    player.setLocation(square);
    square.landedOn(player);

    verifySquare.assertVisited();
  }
}

package ch.heigvd.gen.monopoly.squares;

import ch.heigvd.gen.monopoly.Player;
import org.junit.jupiter.api.BeforeEach;

public abstract class SquareTest {

  protected Player player;
  protected Square square;

  protected abstract Square provideSquare();

  @BeforeEach
  public void provide() {
    this.player = new Player("Alice", new RegularSquare("HEIG-VD"));
    this.square = provideSquare();
  }
}

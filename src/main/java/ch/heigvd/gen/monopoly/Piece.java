package ch.heigvd.gen.monopoly;

import ch.heigvd.gen.monopoly.squares.Square;
import java.util.Objects;

public class Piece {

  private Square location;
  private String name;

  public Piece(String name, Square location) {
    this.name = name;
    this.location = Objects.requireNonNull(location);
  }

  public String getName() {
    return name;
  }

  public Square getLocation() {
    return location;
  }

  public void setLocation(Square newLocation) {
    this.location = Objects.requireNonNull(newLocation);
  }
}

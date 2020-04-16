package ch.heigvd.gen.monopoly;

public class Die {

  private static final int MIN = 1;
  private static final int RANGE = 6;

  private int faceValue = MIN;

  public void roll() {
    faceValue = (int) Math.floor(Math.random() * RANGE) + MIN;
  }

  public int getFaceValue() {
    return faceValue;
  }
}

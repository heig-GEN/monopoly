package ch.heigvd.gen.monopoly.random;

public class Cup {

  private final Die[] dice = {new Die(), new Die()};

  /**
   * Rolls all the dice in this {@link Cup}.
   */
  public void roll() {
    for (Die die : dice) {
      die.roll();
    }
  }

  /**
   * Returns the total of all the dice face value in this {@link Cup}.
   *
   * @return The current total of the {@link Cup}.
   */
  public int getTotal() {
    int sum = 0;
    for (Die die : dice) {
      sum += die.getFaceValue();
    }
    return sum;
  }
}

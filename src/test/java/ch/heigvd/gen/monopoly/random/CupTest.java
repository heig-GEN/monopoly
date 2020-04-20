package ch.heigvd.gen.monopoly.random;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class CupTest {

  private static final int FACE_VALUE_EXPECTED_MIN = 2;
  private static final int FACE_VALUE_EXPECTED_MAX = 2 * 6;

  @Test
  public void testCupValueIsInitiallyBounded() {
    Cup cup = new Cup();
    assertFalse(cup.getTotal() < FACE_VALUE_EXPECTED_MIN);
    assertFalse(cup.getTotal() > FACE_VALUE_EXPECTED_MAX);
  }

  @RepeatedTest(50)
  public void testCupValuesAreAlwaysBounded() {
    Cup cup = new Cup();
    cup.roll();
    assertTrue(cup.getTotal() >= FACE_VALUE_EXPECTED_MIN);
    assertTrue(cup.getTotal() <= FACE_VALUE_EXPECTED_MAX);
  }

}

package ch.heigvd.gen.monopoly.random;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class DieTest {

  private static final int FACE_VALUE_EXPECTED_MIN = 1;
  private static final int FACE_VALUE_EXPECTED_MAX = 6;

  @Test
  public void testDieValueIsInitiallyBounded() {
    Die die = new Die();
    assertFalse(die.getFaceValue() < FACE_VALUE_EXPECTED_MIN);
    assertFalse(die.getFaceValue() > FACE_VALUE_EXPECTED_MAX);
  }

  @RepeatedTest(50)
  public void testDieValuesAreAlwaysBounded() {
    Die die = new Die();
    die.roll();
    assertTrue(die.getFaceValue() >= FACE_VALUE_EXPECTED_MIN);
    assertTrue(die.getFaceValue() <= FACE_VALUE_EXPECTED_MAX);
  }
}

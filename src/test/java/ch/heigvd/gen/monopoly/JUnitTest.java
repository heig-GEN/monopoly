package ch.heigvd.gen.monopoly;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class JUnitTest {

  /*
   * A unit test that simply makes sure that JUnit is properly set up and available. If the library
   * can not be found by Maven, this unit test will then fail.
   */
  @Test
  public void testJUnitIsProperlySetUp() {
    assertEquals(4, 2 + 2);
  }
}

package com.tutorialspoint.examples.codeWars;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class strayNumberTests {

  @Test
  public void simpleArray1() {
    assertEquals(2, getActualFor(1, 1, 2));
  }

  private int getActualFor(int... numbers) {
    return strayNumber.stray(numbers);
  }
}
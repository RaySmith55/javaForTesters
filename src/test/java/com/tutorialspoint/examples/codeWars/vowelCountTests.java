package com.tutorialspoint.examples.codeWars;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class vowelCountTests {

  @Test
  public void testCase1() {
    assertEquals("Nope!", 5, vowelCount.getCount("abracadabra"));

    assertEquals("Nope!", 0, vowelCount.getCount("null"));
  }
}

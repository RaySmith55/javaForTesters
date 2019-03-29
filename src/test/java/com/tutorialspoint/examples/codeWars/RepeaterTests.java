package com.tutorialspoint.examples.codeWars;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class RepeaterTests {

  @Test
  public void testSomething() {
    assertEquals("aaaaa",Repeater.repeat("a",5));
    assertEquals("NaNaNaNaNaNaNaNaNaNaNaNaNaNaNaNa",Repeater.repeat("Na", 16));
    assertEquals("Wub Wub Wub Wub Wub Wub ",Repeater.repeat("Wub ", 6));
  }
}

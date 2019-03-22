package com.tutorialspoint.examples.codeWars;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class regexPinValidationTests {

  @Test
  public void validPins() {
    assertEquals(true, regexPinValidation.validatePin("1234"));
    assertEquals(true, regexPinValidation.validatePin("0000"));
    assertEquals(true, regexPinValidation.validatePin("1111"));
    assertEquals(true, regexPinValidation.validatePin("123456"));
    assertEquals(true, regexPinValidation.validatePin("098765"));
    assertEquals(true, regexPinValidation.validatePin("000000"));
    assertEquals(true, regexPinValidation.validatePin("090909"));
  }

  @Test
  public void nonDigitCharacters() {
    assertEquals(false, regexPinValidation.validatePin("a234"));
    assertEquals(false, regexPinValidation.validatePin(".234"));
  }

  @Test
  public void invalidLengths() {
    assertEquals(false, regexPinValidation.validatePin("1"));
    assertEquals(false, regexPinValidation.validatePin("12"));
    assertEquals(false, regexPinValidation.validatePin("123"));
    assertEquals(false, regexPinValidation.validatePin("12345"));
    assertEquals(false, regexPinValidation.validatePin("1234567"));
    assertEquals(false, regexPinValidation.validatePin("-1234"));
    assertEquals(false, regexPinValidation.validatePin("1.234"));
    assertEquals(false, regexPinValidation.validatePin("00000000"));
  }
}
package com.tutorialspoint.examples.codeWars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexPinValidation {

    public static boolean validatePin(String pin) {

      if(pin.length() != 4 && pin.length() != 6) {
        return false;
      }

      String regex = "([\\d])+";

      Pattern pattern = Pattern.compile(regex);

      Matcher matcher = pattern.matcher(pin);

      boolean valid = matcher.matches();

      return valid;
    }
}

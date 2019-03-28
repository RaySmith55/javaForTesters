package com.tutorialspoint.examples.codeWars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class vowelCount {

  public static int getCount(String str) {
    int vowelsCount = 0;

    String regex = "(a|e|i|o||u)";

    Pattern pattern = Pattern.compile(regex);

    String[] letters;
    try {
      letters = str.split("");
    } catch (NullPointerException e) {
      return 0;
    }

    for (int i = 0; i < letters.length; i++) {
      Matcher matcher = pattern.matcher(letters[i]);
      boolean valid = matcher.matches();
      if (valid == true) {
        vowelsCount++;
      }
    }
    return vowelsCount;
  }
}
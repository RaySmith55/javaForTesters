package com.tutorialspoint.examples.codeWars;

public class Repeater {

  public static String repeat(String string, long n) {

    String result = "";

    for(int i = 0; i < n; i++) {
      result += string;
    }
    return result;
  }
}

package com.itutry.v2;

public class FizzBuzz {

  public static String handle(int i) {
    if (i % 3 == 0) {
      return "Fizz";
    }

    return String.valueOf(i);
  }
}

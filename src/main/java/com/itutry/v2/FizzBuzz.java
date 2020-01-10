package com.itutry.v2;

public class FizzBuzz {

  public static String handle(int i) {
    if (i % 3 == 0) {
      return "Fizz";
    }
    if (i % 5 == 0) {
      return "Buzz";
    }

    return String.valueOf(i);
  }
}

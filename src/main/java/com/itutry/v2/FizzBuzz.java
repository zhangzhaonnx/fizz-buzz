package com.itutry.v2;

public class FizzBuzz {

  public static String handle(int num) {
    String result = "";
    if (isVisible(num, 3)) {
      result = "Fizz";
    }
    if (isVisible(num, 5)) {
      result = "Buzz";
    }
    if (isVisible(num, 7)) {
      result = "Whizz";
    }

    if (isVisible(num, 5) && isVisible(num, 7)) {
      result = "BuzzWhizz";
    }
    if (isVisible(num, 3) && isVisible(num, 7)) {
      result = "FizzWhizz";
    }
    if (isVisible(num, 3) && isVisible(num, 5)) {
      result = "FizzBuzz";
    }

    if (isVisible(num, 3) && isVisible(num, 5) && isVisible(num,7)) {
      result = "FizzBuzzWhizz";
    }

    return result.isEmpty() ? String.valueOf(num) : result;
  }

  public static boolean isVisible(int num, int divisor) {
    return num % divisor == 0;
  }
}

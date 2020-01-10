package com.itutry.v2;

public class FizzBuzz {

  public static String handle(int num) {
    if (isVisible(num, 5) && isVisible(num, 7)) {
      return "BuzzWhizz";
    }
    if (isVisible(num, 3) && isVisible(num, 7)) {
      return "FizzWhizz";
    }
    if (isVisible(num, 3) && isVisible(num, 5)) {
      return "FizzBuzz";
    }
    if (isVisible(num, 3)) {
      return "Fizz";
    }
    if (isVisible(num, 5)) {
      return "Buzz";
    }
    if (isVisible(num, 7)) {
      return "Whizz";
    }

    return String.valueOf(num);
  }

  public static boolean isVisible(int num, int divisor) {
    return num % divisor == 0;
  }
}

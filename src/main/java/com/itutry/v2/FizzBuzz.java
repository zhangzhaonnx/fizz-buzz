package com.itutry.v2;

public class FizzBuzz {

  public static String handle(int num) {
    String result = getFizzBuzzString(num);

    return result.isEmpty() ? String.valueOf(num) : result;
  }

  private static String getFizzBuzzString(int num) {
    String result = "";
    if (isVisible(num, 3)) {
      result += "Fizz";
    }
    if (isVisible(num, 5)) {
      result += "Buzz";
    }
    if (isVisible(num, 7)) {
      result += "Whizz";
    }
   return result;
  }

  public static boolean isVisible(int num, int divisor) {
    return num % divisor == 0;
  }
}

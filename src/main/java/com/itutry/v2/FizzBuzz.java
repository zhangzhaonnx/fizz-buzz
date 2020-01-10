package com.itutry.v2;

public class FizzBuzz {

  public static String handle(int num) {
    String result = getFizzBuzzString(num);

    return result.isEmpty() ? String.valueOf(num) : result;
  }

  private static String getFizzBuzzString(int num) {
    String result = "";

    boolean isContains5 = isContains(num, 5) && !isContains(num, 7);
    if (isVisible(num, 3) && !isContains5) {
      result += "Fizz";
    }
    if (isVisible(num, 5) && !isContains(num, 7)) {
      result += "Buzz";
    }
    if (isVisible(num, 7)) {
      result += "Whizz";
    }

    if (isContains(num, 3) && !isContains5) {
      result = "Fizz";
    }

   return result;
  }

  public static boolean isVisible(int num, int divisor) {
    return num % divisor == 0;
  }

  public static boolean isContains(int num, int aNum) {
    return String.valueOf(num).contains(String.valueOf(aNum));
  }
}

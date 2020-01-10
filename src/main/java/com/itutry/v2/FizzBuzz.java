package com.itutry.v2;

public class FizzBuzz {

  public static String handle(int num) {
    String result = getFizzBuzzString(num);

    return result.isEmpty() ? String.valueOf(num) : result;
  }

  private static String getFizzBuzzString(int num) {
    String result = "";

    boolean contains7 = contains(num, 7);
    boolean contains5 = contains(num, 5) && !contains7;
    if (divisible(num, 3) && !contains5) {
      result += "Fizz";
    }
    if (divisible(num, 5) && !contains7) {
      result += "Buzz";
    }
    if (divisible(num, 7)) {
      result += "Whizz";
    }

    boolean contains3 = contains(num, 3) && !contains5;
    if (contains3) {
      result = "Fizz";
    }

   return result;
  }

  public static boolean divisible(int num, int divisor) {
    return num % divisor == 0;
  }

  public static boolean contains(int num, int aNum) {
    return String.valueOf(num).contains(String.valueOf(aNum));
  }
}

package com.itutry.v3;

public class FizzBuzz {

  public static Object handle(int num) {
    boolean contains7 = contains(num, 7);
    boolean contains5 = contains(num, 5) && !contains7;
    boolean contains3 = contains(num, 3) && !contains5;
    if (contains3) {
      return  "Fizz";
    }

    String result = "";
    if (divisible(num, 3) && !contains5) {
      result += "Fizz";
    }
    if (divisible(num, 5) && !contains7) {
      result += "Buzz";
    }
    if (divisible(num, 7)) {
      result += "Whizz";
    }

    return result.isEmpty() ? String.valueOf(num) : result;
  }

  private static boolean divisible(int num, int aNum) {
    return num % aNum == 0;
  }

  private static boolean contains(int num, int aNum) {
    return String.valueOf(num).contains(String.valueOf(aNum));
  }
}

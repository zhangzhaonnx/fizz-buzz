package com.itutry.v3;

public class FizzBuzz {

  public static Object handle(int num) {
    String result = "";
    boolean contains5 = contains(num, 5) && !contains(num, 7);
    if (divisible(num, 3) && !contains5) {
      result += "Fizz";
    }
    boolean contains3 = contains(num, 3) && !contains5;
    if (divisible(num, 5) && !contains3 && !contains(num, 7)) {
      result += "Buzz";
    }
    if (divisible(num, 7)) {
      result += "Whizz";
    }
    if (contains3) {
      result = "Fizz";
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

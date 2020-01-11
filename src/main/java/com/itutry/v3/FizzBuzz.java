package com.itutry.v3;

public class FizzBuzz {

  public static Object handle(int num) {
    String result = "";
    if (divisible(num, 3)) {
      result += "Fizz";
    }
    if (divisible(num, 5) && !String.valueOf(num).contains("3")) {
      result += "Buzz";
    }
    if (divisible(num, 7)) {
      result += "Whizz";
    }
    if (String.valueOf(num).contains("3")) {
      result = "Fizz";
    }

    return result.isEmpty() ? String.valueOf(num) : result;
  }

  private static boolean divisible(int num, int aNum) {
    return num % aNum == 0;
  }
}

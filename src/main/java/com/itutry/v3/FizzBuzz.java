package com.itutry.v3;

public class FizzBuzz {

  public static Object handle(int num) {
    String result = "";
    if (num % 3 == 0) {
      result += "Fizz";
    }
    if (num % 5 == 0) {
      result += "Buzz";
    }
    if (num % 7 == 0) {
      result += "Whizz";
    }
    if (!result.isEmpty()) {
      return result;
    }

    return String.valueOf(num);
  }
}

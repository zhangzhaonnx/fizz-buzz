package com.itutry.v3;

public class FizzBuzz {

  public static Object handle(int num) {
    if (num % 3 == 0) {
      return "Fizz";
    }
    if (num % 5 == 0) {
      return "Buzz";
    }
    if (num % 7 == 0) {
      return "Whizz";
    }
    return String.valueOf(num);
  }
}

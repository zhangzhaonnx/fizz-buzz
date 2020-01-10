package com.itutry;

public class FizzBuzz {

  public String fizzBuzz(int num) {
    if (num % 3 == 0) {
      return "Fizz";
    }
    if (num % 5 == 0) {
      return "Buzz";
    }
    return String.valueOf(num);
  }
}

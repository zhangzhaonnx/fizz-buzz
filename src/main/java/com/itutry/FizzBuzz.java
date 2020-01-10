package com.itutry;

public class FizzBuzz {

  public String fizzBuzz(int num) {
    if (num % 3 == 0) {
      return "Fizz";
    }
    return String.valueOf(num);
  }
}

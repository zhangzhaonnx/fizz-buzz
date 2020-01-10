package com.itutry;

public class FizzBuzz {

  public static final String FIZZ = "Fizz";
  public static final String BUZZ = "Buzz";
  public static final String WHIZZ = "Whizz";

  public String fizzBuzz(int num) {
    boolean isDivisible3 = num % 3 == 0;
    boolean isDivisible5 = num % 5 == 0;
    boolean isDivisible7 = num % 7 == 0;

    String numStr = String.valueOf(num);
    if (numStr.contains("5")) {
      isDivisible3 = false;
    } else if (numStr.contains("3")) {
      return FIZZ;
    }

    String result = "";
    if (isDivisible3) {
      result += FIZZ;
    }
    if (isDivisible5) {
      result += BUZZ;
    }
    if (isDivisible7) {
      result += WHIZZ;
    }

    return result.isEmpty() ? numStr : result;
  }
}

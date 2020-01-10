package com.itutry;

import java.util.HashMap;
import java.util.Map;

public class FizzBuzz {

  private static Map<Integer, String> TRANSFER_MAP = new HashMap<>();

  static {
    TRANSFER_MAP.put(3, "Fizz");
    TRANSFER_MAP.put(5, "Buzz");
  }

  public String fizzBuzz(int num) {
    for (int i: TRANSFER_MAP.keySet()) {
      if (num % i == 0) {
        return TRANSFER_MAP.get(i);
      }
    }

    return String.valueOf(num);
  }
}

package com.itutry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FizzBuzz {

  private static Map<Integer, String> TRANSFER_MAP = new HashMap<>();

  static {
    TRANSFER_MAP.put(3, "Fizz");
    TRANSFER_MAP.put(5, "Buzz");
    TRANSFER_MAP.put(7, "Whizz");
  }

  public String fizzBuzz(int num) {
    List<Integer> divisibleNum = new ArrayList<>();
    for (int i : TRANSFER_MAP.keySet()) {
      if (num % i == 0) {
        divisibleNum.add(i);
      }
    }

    if (!divisibleNum.isEmpty()) {
      return divisibleNum.stream().map(i -> TRANSFER_MAP.get(i)).collect(Collectors.joining());
    }

    return String.valueOf(num);
  }
}

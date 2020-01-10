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
    List<Integer> divisibleNum = TRANSFER_MAP.keySet().stream()
        .sorted()
        .filter(i -> num % i == 0)
        .collect(Collectors.toList());

    if (!divisibleNum.isEmpty()) {
      return divisibleNum.stream().map(i -> TRANSFER_MAP.get(i)).collect(Collectors.joining());
    }

    if (String.valueOf(num).contains("3")) {
      return "Fizz";
    }

    return String.valueOf(num);
  }
}

package com.itutry;

import java.util.ArrayList;
import java.util.Comparator;
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
    String numStr = String.valueOf(num);
    Integer includeNum = TRANSFER_MAP.keySet().stream()
        .sorted(Comparator.reverseOrder())
        .filter(i -> numStr.contains(String.valueOf(i)))
        .findFirst()
        .orElse(-1);

    if (includeNum == 3) {
      return TRANSFER_MAP.get(includeNum);
    }

    List<Integer> divisibleNum = TRANSFER_MAP.keySet().stream()
        .sorted()
        .filter(i -> num % i == 0)
        .filter(i -> i != 3 || includeNum != 5)
        .collect(Collectors.toList());

    if (!divisibleNum.isEmpty()) {
      return divisibleNum.stream().map(i -> TRANSFER_MAP.get(i)).collect(Collectors.joining());
    }

    return numStr;
  }
}

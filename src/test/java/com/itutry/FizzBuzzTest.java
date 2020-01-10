package com.itutry;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

  @Test
  public void fizzBuzz_should_return_2_for_2() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    String value = fizzBuzz.fizzBuzz(2);

    Assert.assertThat(value, is("2"));
  }

  @Test
  public void fizzBuzz_should_return_Fizz_for_3() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    String value = fizzBuzz.fizzBuzz(3);

    Assert.assertThat(value, is("Fizz"));
  }
}

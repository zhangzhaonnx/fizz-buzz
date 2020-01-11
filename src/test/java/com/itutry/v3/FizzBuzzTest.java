package com.itutry.v3;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

  @Test
  public void handle_should_return_original_for_ordinary_number() {
    Assert.assertThat(FizzBuzz.handle(2), is("2"));
  }

  @Test
  public void handle_should_return_Fizz_for_number_divisible_3() {
    Assert.assertThat(FizzBuzz.handle(6), is("Fizz"));
  }

  @Test
  public void handle_should_return_Buzz_for_number_divisible_5() {
    Assert.assertThat(FizzBuzz.handle(5), is("Buzz"));
  }

  @Test
  public void handle_should_return_Whizz_for_number_divisible_7() {
    Assert.assertThat(FizzBuzz.handle(7), is("Whizz"));
  }
}

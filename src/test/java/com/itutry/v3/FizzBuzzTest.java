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

  @Test
  public void handle_should_return_FizzBuzz_for_number_divisible_3_and_5() {
    Assert.assertThat(FizzBuzz.handle(60), is("FizzBuzz"));
  }

  @Test
  public void handle_should_return_FizzWhizz_for_number_divisible_3_and_7() {
    Assert.assertThat(FizzBuzz.handle(21), is("FizzWhizz"));
  }

  @Test
  public void handle_should_return_BuzzWhizz_for_number_divisible_5_and_7() {
    Assert.assertThat(FizzBuzz.handle(140), is("BuzzWhizz"));
  }

  @Test
  public void handle_should_return_FizzBuzzWhizz_for_number_divisible_3_and_5_and_7() {
    Assert.assertThat(FizzBuzz.handle(210), is("FizzBuzzWhizz"));
  }

  @Test
  public void handle_should_return_Fizz_for_number_include_3() {
    Assert.assertThat(FizzBuzz.handle(13), is("Fizz"));
  }

  @Test
  public void handle_should_return_Fizz_for_number_include_3_and_divisible_5() {
    Assert.assertThat(FizzBuzz.handle(30), is("Fizz"));
  }

  @Test
  public void handle_should_return_Buzz_for_number_include_5_divisible_3_and_5() {
    Assert.assertThat(FizzBuzz.handle(15), is("Buzz"));
  }

  @Test
  public void handle_should_return_Buzz_for_number_include_5_and_3_divisible_5_and_7() {
    Assert.assertThat(FizzBuzz.handle(35), is("BuzzWhizz"));
  }

  @Test
  public void handle_should_return_Whizz_for_number_include_7_divisible_5() {
    Assert.assertThat(FizzBuzz.handle(70), is("Whizz"));
  }

  @Test
  public void handle_should_return_Fizz_for_number_include_7_and_5_divisible_3() {
    Assert.assertThat(FizzBuzz.handle(57), is("Fizz"));
  }

  @Test
  public void handle_should_return_Fizz_for_number_include_7_and_5_and_3_divisible_3() {
    Assert.assertThat(FizzBuzz.handle(357), is("Fizz"));
  }
}

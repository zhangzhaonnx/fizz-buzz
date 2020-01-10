package com.itutry.v2;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

  @Test
  public void handle_should_return_original_for_ordinary_number() {
    String value = FizzBuzz.handle(2);

    Assert.assertThat(value, is("2"));
  }

  @Test
  public void handle_should_return_Fizz_for_number_divisible_3() {
    String value = FizzBuzz.handle(3);

    Assert.assertThat(value, is("Fizz"));
  }

  @Test
  public void handle_should_return_Fizz_for_number_divisible_5() {
    String value = FizzBuzz.handle(5);

    Assert.assertThat(value, is("Buzz"));
  }

  @Test
  public void handle_should_return_Whizz_for_number_divisible_7() {
    String value = FizzBuzz.handle(7);

    Assert.assertThat(value, is("Whizz"));
  }

  @Test
  public void handle_should_return_FizzBuzz_for_number_divisible_3_and_5() {
    String value = FizzBuzz.handle(60);

    Assert.assertThat(value, is("FizzBuzz"));
  }

  @Test
  public void handle_should_return_FizzWhizz_for_number_divisible_3_and_7() {
    String value = FizzBuzz.handle(21);

    Assert.assertThat(value, is("FizzWhizz"));
  }

  @Test
  public void handle_should_return_BuzzWhizz_for_number_divisible_5_and_7() {
    String value = FizzBuzz.handle(35);

    Assert.assertThat(value, is("BuzzWhizz"));
  }

  @Test
  public void handle_should_return_FizzBuzzWhizz_for_number_divisible_3_and_5_and_7() {
    String value = FizzBuzz.handle(210);

    Assert.assertThat(value, is("FizzBuzzWhizz"));
  }

  @Test
  public void handle_should_return_Fizz_for_number_contains_3() {
    String value = FizzBuzz.handle(13);

    Assert.assertThat(value, is("Fizz"));
  }

  @Test
  public void handle_should_return_Fizz_for_number_contains_3_and_divisible_5() {
    String value = FizzBuzz.handle(30);

    Assert.assertThat(value, is("Fizz"));
  }

  @Test
  public void handle_should_return_BuzzWhizz_for_number_contains_5_and_3() {
    String value = FizzBuzz.handle(35);

    Assert.assertThat(value, is("BuzzWhizz"));
  }

  @Test
  public void handle_should_return_Buzz_for_number_contains_5_and_divisible_3() {
    String value = FizzBuzz.handle(15);

    Assert.assertThat(value, is("Buzz"));
  }

  @Test
  public void handle_should_return_Fizz_for_number_contains_7_and_5() {
    String value = FizzBuzz.handle(57);

    Assert.assertThat(value, is("Fizz"));
  }

  @Test
  public void handle_should_return_Whizz_for_number_contains_7_and_divisible_5() {
    String value = FizzBuzz.handle(70);

    Assert.assertThat(value, is("Whizz"));
  }
}

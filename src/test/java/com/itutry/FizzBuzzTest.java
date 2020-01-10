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
  public void fizzBuzz_should_return_Fizz_for_number_divisible_3() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    String value = fizzBuzz.fizzBuzz(3);

    Assert.assertThat(value, is("Fizz"));
  }

  @Test
  public void fizzBuzz_should_return_Buzz_for_number_divisible_5() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    String value = fizzBuzz.fizzBuzz(5);

    Assert.assertThat(value, is("Buzz"));
  }

  @Test
  public void fizzBuzz_should_return_Whizz_for_number_divisible_7() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    String value = fizzBuzz.fizzBuzz(7);

    Assert.assertThat(value, is("Whizz"));
  }

  @Test
  public void fizzBuzz_should_return_FizzBuzz_for_number_divisible_3_and_5() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    String value = fizzBuzz.fizzBuzz(15);

    Assert.assertThat(value, is("FizzBuzz"));
  }

  @Test
  public void fizzBuzz_should_return_FizzBuzzWhizz_for_number_divisible_3_and_5_and_7() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    String value = fizzBuzz.fizzBuzz(105);

    Assert.assertThat(value, is("FizzBuzzWhizz"));
  }

  @Test
  public void fizzBuzz_should_return_Fizz_for_number_include_3() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    String value = fizzBuzz.fizzBuzz(13);

    Assert.assertThat(value, is("Fizz"));
  }

  @Test
  public void fizzBuzz_should_return_Fizz_for_number_include_3_and_divisible_5() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    String value = fizzBuzz.fizzBuzz(30);

    Assert.assertThat(value, is("Fizz"));
  }

  @Test
  public void fizzBuzz_should_ignore_include_3_rule_for_number_include_5() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    String value = fizzBuzz.fizzBuzz(35);

    Assert.assertThat(value, is("BuzzWhizz"));
  }

  @Test
  public void fizzBuzz_should_ignore_divisible_3_rule_for_number_include_5() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    String value = fizzBuzz.fizzBuzz(15);

    Assert.assertThat(value, is("Buzz"));
  }
}

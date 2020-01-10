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
}

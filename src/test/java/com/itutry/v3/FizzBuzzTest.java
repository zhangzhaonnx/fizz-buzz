package com.itutry.v3;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

  @Test
  public void handle_should_return_original_for_ordinary_number() {
    Assert.assertThat(FizzBuzz.handle(2), is("2"));
  }
}

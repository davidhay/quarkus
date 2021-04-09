package org.acme.quickstart;

import org.springframework.stereotype.Component;

@Component("noopFunction")
public class NoOpSingleStringFunction implements StringFunction {

  @Override
  public String apply(String s) {
    return s;
  }
}

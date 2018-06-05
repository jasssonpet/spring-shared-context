package com.github.jasssonpet.poc.A;

public class LibA {

  private String value;

  public LibA(String value) {
    this.value = value;
  }

  public String sayHi() {
    return "Hello from A: " + value;
  }
}

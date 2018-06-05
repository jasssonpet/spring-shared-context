package com.github.jasssonpet.poc.B;

import org.springframework.stereotype.Service;

@Service
public class LibB {

  public LibB() {
    System.out.println("LibB B created.");
  }

  public String sayHi() {
    return "Hello from B!";
  }
}

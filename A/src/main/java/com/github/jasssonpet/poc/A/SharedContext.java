package com.github.jasssonpet.poc.A;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SharedContext {
  private static ClassPathXmlApplicationContext instance = new ClassPathXmlApplicationContext("shared-context.xml");

  public static ClassPathXmlApplicationContext create() {
    return instance;
  }
}

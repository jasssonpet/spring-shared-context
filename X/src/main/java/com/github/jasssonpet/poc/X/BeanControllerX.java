package com.github.jasssonpet.poc.X;

import com.github.jasssonpet.poc.A.LibA;
import com.github.jasssonpet.poc.B.LibB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/call-x")
public class BeanControllerX {

  @Autowired
  private LibA a;

  @Autowired
  private LibB b;

  @RequestMapping("/a")
  @ResponseBody
  public String callA() {
    return a.sayHi();
  }

  @RequestMapping("/b")
  @ResponseBody
  public String callB() {
    return b.sayHi();
  }
}

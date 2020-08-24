package com.customertracker.CustomerTracker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
  @GetMapping("/")
  public String index() {
    return "Hello there! I'm running. Really I am, this isn't joke I am up and running correctly, yay!";
  }
}

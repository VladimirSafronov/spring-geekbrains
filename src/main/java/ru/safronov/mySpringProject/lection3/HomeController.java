package ru.safronov.mySpringProject.lection3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

  @RequestMapping("/")
  public String home() {
    return "index";
  }
}

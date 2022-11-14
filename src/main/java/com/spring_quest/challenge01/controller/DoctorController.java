package com.spring_quest.challenge01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {

  @GetMapping("/doctor/1")
  @ResponseBody
  public String hartnellImg() {
    return "William Hartnell";

  }

  @GetMapping("/doctor/10")
  @ResponseBody
  public String tennantImg() {
    return "David Tennant";
  }

  @GetMapping("/doctor/13")
  @ResponseBody
  public String whittakerImg() {
    return "Jodie Whittaker";
  }

}

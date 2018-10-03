package com.phonebook.dvoretskyi.phonebook.controller;

import com.phonebook.dvoretskyi.phonebook.services.UserService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  @Autowired
  UserService userService;
  @GetMapping("/")
  public String home(Map<String,Object> model){
    return "home";
  }

}

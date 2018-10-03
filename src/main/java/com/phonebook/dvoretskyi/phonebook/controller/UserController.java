package com.phonebook.dvoretskyi.phonebook.controller;

import com.phonebook.dvoretskyi.phonebook.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  @Autowired
  UserService userService;
}

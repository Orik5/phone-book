package com.phonebook.dvoretskyi.phonebook.controller;

import com.phonebook.dvoretskyi.phonebook.repository.UserRepository;
import com.phonebook.dvoretskyi.phonebook.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller    // This means that this class is a Controller
@RequestMapping(path = "/demo")
public class UserController {

  @Autowired
  private UserRepository userRepository;

  @GetMapping(path = "/add") // Map ONLY GET Requests
  public @ResponseBody
  String addNewUser(@RequestParam String name
      , @RequestParam String email, @RequestParam String address,
      @RequestParam String homePhone ,@RequestParam String mobilePhone) {
    // @ResponseBody means the returned String is the response, not a view name
    // @RequestParam means it is a parameter from the GET or POST request

    User user = new User();
    user.setFirstName(name);
    user.setEmail(email);
    user.setAddress(address);
    user.setMobilePhone(mobilePhone);
    user.setHomePhone(homePhone);
    //user.setSurname();
    //  user.setMiddleName();
    ////user.setLogin();
    // user.setPassword();
    userRepository.save(user);
    return "Saved";
  }

  @GetMapping(path = "/all")
  public @ResponseBody
  Iterable<User> getAllUsers() {
    // This returns a JSON or XML with the users
    return userRepository.findAll();
  }
}

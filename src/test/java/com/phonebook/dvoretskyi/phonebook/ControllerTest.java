package com.phonebook.dvoretskyi.phonebook;

import com.phonebook.dvoretskyi.phonebook.controller.UserController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {PhoneBookApplication.class})
public class ControllerTest {

  @Autowired
  UserController userController;

  @Test
  public void contextLoads() throws Exception {
    Assert.assertNotNull(userController);
  }
}

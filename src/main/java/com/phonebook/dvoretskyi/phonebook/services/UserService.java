package com.phonebook.dvoretskyi.phonebook.services;

import com.phonebook.dvoretskyi.phonebook.entity.User;
import java.util.List;

public interface UserService {

  User findByFirstName(String firstName);

  User findBySurname(String surname);

  User findByEmail(String email);

  void addUser(User user);

  void deleteUser(User user);

  User getUserById(Long id);

  List<User> getAll();

}

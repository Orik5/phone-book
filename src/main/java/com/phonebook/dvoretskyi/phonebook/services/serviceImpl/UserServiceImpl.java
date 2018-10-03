package com.phonebook.dvoretskyi.phonebook.services.serviceImpl;

import com.phonebook.dvoretskyi.phonebook.dao.UserDao;
import com.phonebook.dvoretskyi.phonebook.entity.User;
import com.phonebook.dvoretskyi.phonebook.services.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  UserDao userDao;

  @Override
  public User findByFirstName(String firstName) {
    return userDao.findByFirstName(firstName);
  }

  @Override
  public User findBySurname(String surname) {
    return userDao.findBySurname(surname);
  }

  @Override
  public User findByEmail(String email) {
    return userDao.findByEmail(email);
  }

  @Override
  public void addUser(User user) {
    userDao.save(user);
  }


  @Override
  public void deleteUser(User user) {
    userDao.delete(user);

  }

  @Override
  public User getUserById(Long id) {
    return userDao.getOne(id);
  }

  @Override
  public List<User> getAll() {
    return userDao.findAll();
  }


}

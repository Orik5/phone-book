package com.phonebook.dvoretskyi.phonebook.dao;

import com.phonebook.dvoretskyi.phonebook.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Long> {

  User findById(long id);

  User findByFirstName(String firstName);

  User findBySurname(String surname);

  User findByEmail(String email);

  User findByPhone(String homePhone);
}

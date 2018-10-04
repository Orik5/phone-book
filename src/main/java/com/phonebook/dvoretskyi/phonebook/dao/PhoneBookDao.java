package com.phonebook.dvoretskyi.phonebook.dao;

import com.phonebook.dvoretskyi.phonebook.entity.PhoneBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneBookDao extends JpaRepository<PhoneBook, Long> {

}
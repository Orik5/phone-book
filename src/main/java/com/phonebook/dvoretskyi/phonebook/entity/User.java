package com.phonebook.dvoretskyi.phonebook.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "user")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String login;
  private String password;
  private String firstName;
  private String surname;
  private String middleName;
  private String email;
  private String mobilePhone;
  private String homePhone;
  private String address;

  public User(String login, String password, String firstName, String surname,
      String middleName, String email, String mobilePhone, String homePhone, String address) {
    this.login = login;
    this.password = password;
    this.firstName = firstName;
    this.surname = surname;
    this.middleName = middleName;
    this.email = email;
    this.mobilePhone = mobilePhone;
    this.homePhone = homePhone;
    this.address = address;
  }

  public User() {
  }
}

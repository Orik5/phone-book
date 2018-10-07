package com.phonebook.dvoretskyi.phonebook.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity

@Table(name = "user")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "user_id", nullable = false)
  private long id;
  @Column(name = "login", nullable = false)
  private String login;
  @Column(name = "password", nullable = false)
  private String password;
  @Column(name = "first_name", nullable = false)
  private String firstName;
  @Column(name = "surname", nullable = false)
  private String surname;
  @Column(name = "middle_name", nullable = false)
  private String middleName;
  @Column(name = "email", nullable = true)
  private String email;
  @Column(name = "mobile_phone", nullable = false)
  private String mobilePhone;
  @Column(name = "home_phone", nullable = true)
  private String homePhone;
  @Column(name = "address",nullable = false)
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

package com.prestashop.beans;
// beans  --> used to represent a certain type of object
// pojo  --> plain old java object,  used to represent a certain type of object
// model   --> used to represent a certain type of object

public class User {
  String fistName;
  String lastName;
  String address;
  String company;
  String city;
  
  public User(String fistName, String lastName, String address, String company, String city) {
    this.fistName = fistName;
    this.lastName = lastName;
    this.address = address;
    this.company = company;
    this.city = city;
  }
  public String getFistName() {
    return fistName;
  }
  public void setFistName(String fistName) {
    this.fistName = fistName;
  }
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }
  public String getCompany() {
    return company;
  }  
  public void setCompany(String company) {
    this.company = company;
  }
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }
}
package com.gestion_usuarios.gestion_usuarios.entities;

public class UserEntitie {

  /*   Integer id; */
  Long id;
  String name;
  Integer age;
  String user;
  String pass;


  
  public UserEntitie() { }
  public UserEntitie(
    Long id, String name, Integer age,
    String user, String pass
  ) {
    
    this.id = id;
    this.name = name;
    this.age = age;
    this.user = user;
    this.pass = pass;
   
  }
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Integer getage() {
    return age;
  }
  public void setage(Integer age) {
    this.age = age;
  }

  public String getUser() {
    return user;
  }
  public void setUser(String user) {
    this.user = user;
  }

  public String getPass() {
    return pass;
  }
  public void setPass(String pass) {
    this.pass = pass;
  }
  
}


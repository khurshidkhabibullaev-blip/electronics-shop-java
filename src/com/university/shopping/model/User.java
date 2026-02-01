package com.university.shopping.model;

public class User {
  public int id;
    public String username;
    public String password;
    public String email;


    public User(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }
    public String toString(){
        return "User: " + username + ", Password: " + password + ", Email: " + email;
    }
}

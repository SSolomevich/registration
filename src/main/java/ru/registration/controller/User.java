package ru.registration.controller;

/**
 * Created by 15 on 01.04.2017.
 */
public class User  {
    public String getUser(){return user;}
    public void setUser(String user){this.user = user;}
    public String getPassword(){return password;}
    public void setPassword(String password){this.password = password;}
    public String getEmail(){return email;}
    public void setEmail(String email){this.email = email;}
    public String getAddress(){return address;}
    public void setAddress(String address){this.address = address;}
    public String getPhone(){return phone;}
    public void setPhone(String phone){this.phone = phone;}
    private String user;
    private String password;
    private String email;
    private String address;
    private String phone;
}

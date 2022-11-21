package com.diki.javalanjut.gui;

public class User {
    private String Username;
    private String Password;
    private int Pin;

    public User() {
    }

    public User(String username, String password) {
        Username = username;
        Password = password;
    }

    public int getPin() {
        return Pin;
    }

    public void setPin(int pin) {
        Pin = pin;
    }


    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "Username='" + Username + '\'' +
                ", Password='" + Password + '\'' +
                ", Pin='" + Pin + '\'' +
                '}';
    }
}
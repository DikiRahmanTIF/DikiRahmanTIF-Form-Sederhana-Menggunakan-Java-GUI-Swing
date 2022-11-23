package com.diki.javalanjut.gui;

public class User {
    private int Username;
    private int Password;
    private int Pin;

    public User() {
    }

    public User(int username, int password) {
        Username = username;
        Password = password;
    }

    public int getPin() {
        return Pin;
    }

    public void setPin(int pin) {
        Pin = pin;
    }


    public int getUsername() {
        return Username;
    }

    public void setUsername(int username) {
        Username = username;
    }

    public int getPassword() {
        return Password;
    }

    public void setPassword(int password) {
        Password = password;
    }

    @Override
    public String toString() {
        return String.valueOf(Username*Password*Pin);
    }
}
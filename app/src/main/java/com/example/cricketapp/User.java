package com.example.cricketapp;

public class User {

    public String getfName() {
        return fName;
    }

    public String getEmail() {
        return email;
    }

    public String getClub() {
        return club;
    }

    public String getLevel() {
        return level;
    }

    String fName;
    String email;
    String club;
    String level;

    public String getPhone() {
        return phone;
    }

    String phone;

    public User(String fName, String email, String club, String level) {
        this.fName = fName;
        this.email = email;
        this.club = club;
        this.level = level;
        this.phone = phone;
    }
    public User() {
    }
}

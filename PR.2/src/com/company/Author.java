package com.company;

public class Author {
    private String name;
    private String email;
    private char gender;

    Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    String getName(){
        return name;
    }
    String getEmail(){
        return email;
    }
    void setEmail(String email){
        this.email = email;
    }
    char getGender() {
        return gender;
    }
}

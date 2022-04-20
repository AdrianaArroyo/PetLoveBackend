package com.demo.petlove.domain;

import lombok.Data;


@Data
public class User {

    private int userID;
    private String name;
    private String lastName;
    private String email;
    private String password;
    private String dateOfBirth;
    private String gender;

    public User(User user) {
        if(user == null) {
            throw new NullPointerException("¡El usuario se encuentra nulo!");
        }
        this.userID = user.userID;
        this.name = user.name;
        this.lastName = user.lastName;
        this.email = user.email;
        this.password = user.password;
        this.dateOfBirth = user.dateOfBirth;
        this.gender = user.gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID: " + userID +
                ", name: '" + name + '\'' +
                ", lastName: '" + lastName + '\'' +
                ", email: '" + email + '\'' +
                ", password: '" + password + '\'' +
                ", dateOfBirth: '" + dateOfBirth + '\'' +
                ", gender: '" + gender + '\'' +
                '}';
    }
}

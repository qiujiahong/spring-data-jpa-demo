package com.nick.datajpa.domain;

import lombok.Data;


@Data
public class User1 {

    private Integer id;

    private String name;
    private String email;
    private String userType;

    public User1(Integer id, String name, String email, String userType) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "User1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", userType='" + userType + '\'' +
                '}';
    }
}

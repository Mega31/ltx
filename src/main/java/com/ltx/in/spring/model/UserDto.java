package com.ltx.in.spring.model;

import javax.persistence.*;

@Entity
@Table(schema = "userdata",name = "user_details")
public class UserDto {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "email")
    private String email;
    @Column(name = "username")
    private String usernName;
    @Column(name = "password")
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsernName() {
        return usernName;
    }

    public void setUsernName(String usernName) {
        this.usernName = usernName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}

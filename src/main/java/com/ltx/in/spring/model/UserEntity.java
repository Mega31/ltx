package com.ltx.in.spring.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(schema = "userdata",name = "user_details")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "email")
    private String email;
    @NotNull
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Transient
    private String passwordConfirm;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }






    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}

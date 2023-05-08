package com.example.User.entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name= "users")
@Data
public class User {
    @Id
    @GeneratedValue
    long id;
    @Column(name="firstname")
    String firstname;

    @Column(name = "lastname")
    String lastname;

    @Column(name = "email")
    String email;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

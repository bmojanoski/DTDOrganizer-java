package com.example.dtdorganizer.model;

import javax.persistence.*;

@Entity
@Table(name = "user_table")
public class User {

    @javax.persistence.Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long Id;
    private String firstName;
    private String lastName;
    private String email;

    public User() {
        super();
    }
    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

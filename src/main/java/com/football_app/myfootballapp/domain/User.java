package com.football_app.myfootballapp.domain;

import lombok.Data;

import jakarta.persistence.*;
import java.util.Date;

@Entity(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "date_registration")
    private Date registrationDate;


}

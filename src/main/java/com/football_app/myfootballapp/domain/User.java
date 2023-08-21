package com.football_app.myfootballapp.domain;

import lombok.Data;

import jakarta.persistence.*;
import java.util.Date;

@Entity(name = "users")
@Data
public class User {

    @Id
    @SequenceGenerator(name = "user_seq", sequenceName = "users_id_seq", allocationSize = 1)//для нерандомных id а по sequence
    @GeneratedValue(generator = "user_seq")
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

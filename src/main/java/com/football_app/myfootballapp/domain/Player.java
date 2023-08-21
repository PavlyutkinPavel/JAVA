package com.football_app.myfootballapp.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity(name = "players")
@Data
public class Player {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "player_name")
    private String name;

    @Column(name = "player_age")
    private int age;

    @Column(name = "position")
    private String position;

    @Column(name = "player_number")
    private int jerseyNumber;

    @Column(name = "statistics")
    private String statistics;

    @Column(name = "status")
    private String status;

//    @Column(name = "image_url")
//    private String imageUrl;


}

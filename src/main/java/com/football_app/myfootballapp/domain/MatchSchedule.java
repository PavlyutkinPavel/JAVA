package com.football_app.myfootballapp.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity(name = "schedule_of_matches")
@Data
public class MatchSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date_time")
    private Date matchDate;

    @Column(name = "home_team")
    private String homeTeam;

    @Column(name = "away_team")
    private String awayTeam;

    @Column(name = "stadium")
    private String stadium;

}

package com.football_app.myfootballapp.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "result_of_matches")
@Data
public class MatchResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @ManyToOne
//    @JoinColumn(name = "match_id")
//    private MatchSchedule match;

    @Column(name = "home_team")
    private String homeTeam;

    @Column(name = "away_team")
    private String awayTeam;

    @Column(name = "final_result")
    private String score;

}

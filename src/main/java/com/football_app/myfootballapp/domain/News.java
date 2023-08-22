package com.football_app.myfootballapp.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity(name = "news")
@Data
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @Column(name = "time_publication")
    private Date publicationDate;

}

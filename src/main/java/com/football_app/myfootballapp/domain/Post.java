package com.football_app.myfootballapp.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity(name = "forum_posts")
@Data
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User author;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @Column(name = "post_date")
    private Date postDate;

}

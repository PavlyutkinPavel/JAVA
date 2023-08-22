package com.football_app.myfootballapp.controller;

import com.football_app.myfootballapp.domain.News;
import com.football_app.myfootballapp.service.NewsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/news")
public class NewsController {
    private final NewsService newsService;

    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @GetMapping
    public ResponseEntity<List<News>> getAllNews() {
        List<News> users = newsService.getAllNews();
        if (users.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(users, HttpStatus.OK);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<News> getNews(@PathVariable Long id){
        News news = newsService.getNews(id);
        if (news != null) {
            return new ResponseEntity<>(news, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<HttpStatus> createNews(@RequestBody News news) {
        News newsSaved = newsService.createNews(news);
        News newsResult = newsService.getNews(newsSaved.getId());
        if (newsResult != null) {
            return new ResponseEntity<>(HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
    }

    @PutMapping
    public ResponseEntity<HttpStatus> updateNews(@RequestBody News news) {
        newsService.updateNews(news);
        News newsUpdated = newsService.getNews(news.getId());
        if (news.equals(newsUpdated)) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteNews(@PathVariable Long id) {
        News newsUpdated = newsService.getNews(id);
        newsService.deleteNewsById(newsUpdated);
        News news = newsService.getNews(id);
        if (news == null && newsUpdated != null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
    }
}

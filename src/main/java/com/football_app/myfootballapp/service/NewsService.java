package com.football_app.myfootballapp.service;

import com.football_app.myfootballapp.domain.News;
import com.football_app.myfootballapp.repository.NewsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {
    private final NewsRepository newsRepository;

    public NewsService(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }
    public List<News> getAllNews() {
        return newsRepository.findAll();
    }

    public News getNews(Long id) {
        return newsRepository.findById(id);
    }

    public News createNews(News news) {
        newsRepository.save(news);
        return news;
    }

    public void updateNews(News news) {
        newsRepository.update(news);
    }

    public void deleteNewsById(News news){
        newsRepository.delete(news);
    }
}
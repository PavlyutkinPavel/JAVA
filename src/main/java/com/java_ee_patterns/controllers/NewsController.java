package com.java_ee_patterns.controllers;

import com.java_ee_patterns.services.NewsService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class NewsController {
    NewsService newsService = new NewsService();
    public  void getAllNews(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        ArrayList<String> allNews = newsService.getAllNews(req);
        Writer writer = resp.getWriter();
        writer.write("We found all news!");
    }
    public  void getOneNews(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Writer writer = resp.getWriter();
        writer.write("We found news!");
    }
}

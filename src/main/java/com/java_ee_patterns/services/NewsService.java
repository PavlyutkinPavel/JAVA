package com.java_ee_patterns.services;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class NewsService {
    public ArrayList<String> getAllNews(HttpServletRequest req) throws IOException {
        return new ArrayList<>();
    }
    public  String getOneNews(HttpServletRequest req) throws IOException {
        return new String();
    }
}

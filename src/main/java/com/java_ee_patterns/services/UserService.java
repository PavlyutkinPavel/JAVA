package com.java_ee_patterns.services;

import com.classes.User;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.io.Writer;

public class UserService {
    public User getUser(HttpServletRequest req) throws IOException {
        //logic to find User
        //get id from path
        //connect to db and load user
        return new User(16, "Dima");
    }
    public boolean deleteUser(HttpServletRequest req) throws IOException {
        //logic...
        return false;
    }
    public User createUser(HttpServletRequest req) throws IOException {
        //logic...
        return  new User(2,"asd");
    }
}

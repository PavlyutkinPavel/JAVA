package com.java_ee_patterns.controllers;

import com.classes.User;
import com.java_ee_patterns.services.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.Writer;

public class UserController {
    UserService userService = new UserService();
    public  void getUser(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        User user = userService.getUser(req);
        Writer writer = resp.getWriter();
        if(user!=null){
            writer.write("We found user!");
        }else{
            writer.write("We didnt find user!");
        }
    }
    public  void deleteUser(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        boolean result = userService.deleteUser(req);
        Writer writer = resp.getWriter();
        writer.write(result ? "We deleted user!" : "We didnt delete user!");
    }
    public  void createUser(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        User user = userService.createUser(req);
        Writer writer = resp.getWriter();
        if(user!=null){
            writer.write("We created user!");
        }else{
            writer.write("We didnt create user!");
        }
    }

}

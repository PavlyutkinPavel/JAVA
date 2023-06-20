package com.servlets;

import com.classes.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/jstl")
public class JSTLServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String[] names = {"Pasha", "Dasha"};
        req.setAttribute("arrayUsers", names);
        User user = new User(10,"vlad");
        req.setAttribute("vlad",user);
        req.getRequestDispatcher("/WEB-INF/pages/JSTLpage.jsp").forward(req, resp);
    }
}

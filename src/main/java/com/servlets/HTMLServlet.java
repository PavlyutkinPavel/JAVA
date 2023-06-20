package com.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/stix")
public class HTMLServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //своя логика
        //request - запрос, response - ответ
        resp.setContentType("text/html");
        //create request attribute
        req.setAttribute("name","Bill Gates");
        req.getRequestDispatcher("WEB-INF/pages/Stix.html").forward(req,resp);//path from web app
        //printWriter.close();
    }
}

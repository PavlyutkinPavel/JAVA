package com.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/jsp")
public class JSP_Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //достали из пути name
        String servletName = req.getParameter("name");

        //положим переменную в контекст

        req.setAttribute("name", servletName);
        req.getRequestDispatcher("/WEB-INF/pages/JavaServerPage.jsp").forward(req, resp);
    }
}

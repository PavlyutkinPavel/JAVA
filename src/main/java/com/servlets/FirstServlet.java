package com.servlets;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/c65")
public class FirstServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //своя логика
        //request - запрос, response - ответ
        resp.setContentType("text/html");

        HttpSession httpSession = req.getSession();//Cookie(маленький файл который прикреплен к запросу)
        PrintWriter printWriter = resp.getWriter();
        String name = (String) httpSession.getAttribute("name");
       if(name == null){
           httpSession.setAttribute("name","Anna");
           printWriter.println("Hello i dont know who u are...)))");
       }else{
          printWriter.println("Hello "+httpSession.getAttribute("name"));

       }
        //create request attribute
//        req.setAttribute("name","Bill Gates");
//        req.getRequestDispatcher("WEB-INF/pages/main.jsp").forward(req,resp);//path from web app
//        //printWriter.close();
    }

    @Override
    public void init(ServletConfig config) throws ServletException {//при первом обращении
        System.out.println("INIT METHOD!!!");
    }

    @Override//вызывает конкретный метод GET POST PUT DELETE и т.д.
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {//при каждом вызове
        super.service(req, resp);
        System.out.println("Service method");
    }

    @Override
    public void destroy() {//когда умирает(закрывается и т.д.)
        System.out.println("Init DESTROY");
    }
}

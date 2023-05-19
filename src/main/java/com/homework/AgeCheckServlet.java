package com.homework;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/check-age")//url localhost:8080/check-age?age=18
public class AgeCheckServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String ageParameter = request.getParameter("age");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Age Check Result</title></head><body>");
        out.println("<h2>Age Check Result</h2>");

        if (ageParameter == null || ageParameter.isEmpty()) {
            out.println("<p>Age parameter not provided to the url.</p>");
        } else {
            try {
                int age = Integer.parseInt(ageParameter);
                boolean isAdult = age >= 18;
                out.println("<p>Age: " + age + "</p>");
                out.println("<p>Is Adult: " + isAdult + "</p>");
            } catch (NumberFormatException e) {
                out.println("<p>Wrong age parameter.</p>");
            }
        }

        out.println("</body></html>");
    }
}
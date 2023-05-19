package com.homework;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//Task 1(url = localhost:8080/minsk/washington/beijing)
@WebServlet(urlPatterns = { "/minsk", "/washington", "/beijing" })
public class Servlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String path = request.getServletPath();
        String city;
        String timeZoneId;

        if (path.equals("/minsk")) {
            city = "Minsk";
            timeZoneId = "Europe/Minsk";
        } else if (path.equals("/washington")) {
            city = "Washington";
            timeZoneId = "America/New_York";
        } else if (path.equals("/beijing")) {
            city = "Beijing";
            timeZoneId = "Asia/Shanghai";
        } else {
            response.sendError(HttpServletResponse.SC_NOT_FOUND);
            return;
        }

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Current Time</title></head><body>");
        out.println("<h2>Current Time in " + city + "</h2>");
        Date currentTime = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.setTimeZone(TimeZone.getTimeZone(timeZoneId));
        String time = dateFormat.format(currentTime);

        out.println("<p>" + time + "</p>");
        out.println("</body></html>");
    }
}


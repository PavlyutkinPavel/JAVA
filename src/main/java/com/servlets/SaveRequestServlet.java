package com.servlets;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/saveRequest")
public class SaveRequestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String message = request.getParameter("message");

        if (name.isEmpty() || email.isEmpty() || message.isEmpty()) {
            response.sendRedirect("save-request.jsp");
        } else {
            String confirmationMessage = "Your application is confirmed<br><br>" +
                    "Name: " + name + "<br>" +
                    "Email: " + email + "<br>" +
                    "Message: " + message;

            request.setAttribute("confirmationMessage", confirmationMessage);
            request.getRequestDispatcher("confirmation.jsp").forward(request, response);
        }
    }
}

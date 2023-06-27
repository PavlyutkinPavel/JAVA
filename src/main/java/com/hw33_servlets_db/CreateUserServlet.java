package com.hw33_servlets_db;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;


@WebServlet("/create")
public class CreateUserServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/pages/hw33.html").forward(req, resp);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String login = request.getParameter("login");

        Connection connection = null;
        PreparedStatement selectStatement = null;
        PreparedStatement insertStatement = null;

        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/group_65_db", "postgres", "4864");

            // Проверка на существование пользователя с таким же email или login
            String selectQuery = "SELECT * FROM users33 WHERE email = ? OR login = ?";
            selectStatement = connection.prepareStatement(selectQuery);
            selectStatement.setString(1, email);
            selectStatement.setString(2, login);
            ResultSet resultSet = selectStatement.executeQuery();

            if (resultSet.next()) {
                response.setContentType("text/plain");
                response.getWriter().println("ERROR user exists");
            } else {
                String insertQuery = "INSERT INTO users33 (name, email, login) VALUES (?, ?, ?)";
                insertStatement = connection.prepareStatement(insertQuery);
                insertStatement.setString(1, name);
                insertStatement.setString(2, email);
                insertStatement.setString(3, login);
                insertStatement.executeUpdate();

                response.setContentType("text/plain");
                response.getWriter().println("User created");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            response.setContentType("text/plain");
            response.getWriter().println("SQL error");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            // Закрытие ресурсов
            if (selectStatement != null) {
                try {
                    selectStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (insertStatement != null) {
                try {
                    insertStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}

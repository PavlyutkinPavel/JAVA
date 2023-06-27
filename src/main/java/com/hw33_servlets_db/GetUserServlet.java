package com.hw33_servlets_db;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

@WebServlet("/get")
public class GetUserServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userId = request.getParameter("id");

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/group_65_db", "postgres", "4864");
            String str = "SELECT * FROM users33 WHERE id = ?";
            statement = connection.prepareStatement(str);
            statement.setInt(1, Integer.parseInt(userId));
            resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String login = resultSet.getString("login");

                // Отправка информации о пользователе в формате JSON
                response.setContentType("application/json");
                response.getWriter().println("{ \"id\": \"" + userId + "\", \"name\": \"" + name + "\", \"email\": \"" + email + "\", \"login\": \"" + login + "\" }");
            } else {
                String message = "not found error";
                response.getWriter().println(message);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            String message = "SQL error";
            response.getWriter().println(message);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            // Закрытие ресурсов
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (statement != null) {
                try {
                    statement.close();
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


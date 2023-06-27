package com.hw33_servlets_db;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

@WebServlet("/change-login")
public class ChangeLoginServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/pages/hw33_2.html").forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userId = request.getParameter("id");
        String newLogin = request.getParameter("login");

        Connection connection = null;
        PreparedStatement selectStatement = null;
        PreparedStatement updateStatement = null;

        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/group_65_db", "postgres", "4864");

            // Проверка наличия пользователя с указанным ID
            String selectQuery = "SELECT * FROM users33 WHERE id = ?";
            selectStatement = connection.prepareStatement(selectQuery);
            selectStatement.setInt(1, Integer.parseInt(userId));
            ResultSet resultSet = selectStatement.executeQuery();

            if (resultSet.next()) {
                // Пользователь существует, обновление логина
                String updateQuery = "UPDATE users33 SET login = ? WHERE id = ?";
                updateStatement = connection.prepareStatement(updateQuery);
                updateStatement.setString(1, newLogin);
                updateStatement.setInt(2, Integer.parseInt(userId));
                updateStatement.executeUpdate();

                response.setContentType("text/plain");
                response.getWriter().println("Login saved");
            } else {
                response.getWriter().println("User not found");
            }
        } catch (SQLException e) {
            e.printStackTrace();
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
            if (updateStatement != null) {
                try {
                    updateStatement.close();
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

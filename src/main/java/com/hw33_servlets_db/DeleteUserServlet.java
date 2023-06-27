package com.hw33_servlets_db;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


@WebServlet("/delete")
public class DeleteUserServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userId = request.getParameter("id");

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/group_65_db", "postgres", "4864");
            String query = "DELETE FROM users33 WHERE id = ?";
            statement = connection.prepareStatement(query);
            statement.setInt(1, Integer.parseInt(userId));
            int rowsDeleted = statement.executeUpdate();

            if (rowsDeleted > 0) {
                // Отправка ответа о успешном удалении пользователя
                response.setContentType("text/plain");
                response.getWriter().println("User deleted successfully");
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

package com.homework.servlets;

import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/book")
public class BookServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Logic for handling the book download request
        System.out.println("Request received for /book");

        // Set the content type and headers for the file download, main hard part!!!
        response.setContentType("application/octet-stream");
        response.setHeader("Content-Disposition", "attachment; filename=\"book.txt\"");

        // Provide the book content as the response body
        ServletOutputStream outputStream = response.getOutputStream();
        outputStream.close();
    }
}
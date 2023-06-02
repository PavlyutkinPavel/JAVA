<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Confirmation JSP</title>
</head>
<body>
<h1>Confirmation of application</h1>
<p><%= request.getAttribute("confirmationMessage") %></p>
</body>
</html>

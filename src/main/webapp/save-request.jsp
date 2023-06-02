<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Save Request JSP</title>
</head>
<body>
<h1>Save Request</h1>
<form action="saveRequest" method="post">
  <label for="name">Name:</label>
  <input type="text" name="name" id="name" required><br><br>
  <label for="email">Email:</label>
  <input type="email" name="email" id="email" required><br><br>
  <label for="message">Message:</label><br>
  <textarea name="message" id="message" rows="5" cols="30" required></textarea><br><br>
  <input type="submit" value="Send application">
</form>
</body>
</html>

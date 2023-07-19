<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 17.07.2023
  Time: 21:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title>Add Player</title>
</head>
<body bgcolor="#5f9ea0">
<h1 align="center">Add Player</h1>
<hr>
<hr>
<form align="center" action="${pageContext.request.contextPath}/players/add" method="post">
  <label for="name">Name:</label>
  <input type="text" id="name" name="name" required><br>

  <label for="age">Age:</label>
  <input type="number" id="age" name="age" required><br>

  <label for="position">Position:</label>
  <input type="text" id="position" name="position"><br>

  <label for="jerseyNumber">Jersey Number:</label>
  <input type="number" id="jerseyNumber" name="jerseyNumber" required><br>

  <label for="status">Status:</label>
  <input type="text" id="status" name="status"><br>

  <label for="statistics">Statistics:</label>
  <input type="text" id="statistics" name="statistics"><br>
  <hr>
  <hr>

  <input type="submit" value="Add">
</form>
</body>
</html>

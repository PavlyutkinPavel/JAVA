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
  <title>Edit Player</title>
</head>
<body bgcolor="#5f9ea0">
<h1>Edit Player</h1>
<form action="${pageContext.request.contextPath}/players/${player.playerId}/edit" method="post">
  <input type="hidden" name="_method" value="post">
  <label for="name">Name:</label>
  <input type="text" id="name" name="name" value="${player.name}" required><br>

  <label for="age">Age:</label>
  <input type="number" id="age" name="age" value="${player.age}" required><br>

  <label for="position">Position:</label>
  <input type="text" id="position" name="position" value="${player.position}"><br>

  <label for="jerseyNumber">Jersey Number:</label>
  <input type="number" id="jerseyNumber" name="jerseyNumber" value="${player.jerseyNumber}" required><br>

  <label for="status">Status:</label>
  <input type="text" id="status" name="status" value="${player.status}"><br>

  <label for="statistics">Statistics:</label>
  <input type="text" id="statistics" name="statistics" value="${player.statistics}"><br>

  <input type="submit" value="Update">
</form>
</body>
</html>

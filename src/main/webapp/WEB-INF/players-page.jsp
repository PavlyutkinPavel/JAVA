<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 17.07.2023
  Time: 21:58
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Players</title>
</head>
<body bgcolor="#5f9ea0">
<h1 align="center">Players List:</h1>
<hr>
<hr>
<form align="center">
    <c:choose>
        <c:when test="${empty playerList}">
            <p>No player data available.</p>
        </c:when>
        <c:otherwise>
            <table align="center">
                <tr>
                    <th>Player ID</th>
                    <th>Name</th>
                    <th>Age</th>
                    <th>Position</th>
                    <th>Jersey Number</th>
                    <th>Status</th>
                    <th>Statistics</th>
                </tr>
                <c:forEach var="player" items="${playerList}">
                    <tr>
                        <td>${player.playerId}</td>
                        <td>${player.name}</td>
                        <td>${player.age}</td>
                        <td>${player.position}</td>
                        <td>${player.jerseyNumber}</td>
                        <td>${player.status}</td>
                        <td>${player.statistics}</td>
                    </tr>
                </c:forEach>
            </table>
        </c:otherwise>
    </c:choose>
    <hr>
    <hr>
    <a href="${pageContext.request.contextPath}/players/add">Add Player</a>
</form>
</body>
</html>


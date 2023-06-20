<%@ page import="com.classes.User" %><%--
  Created by IntelliJ IDEA.
  User: User
  Date: 30.05.2023
  Time: 21:20
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%User u = (User) request.getAttribute("vlad");%>
<%=u.getName()%>
<c:forEach var="user" items="${arrayUsers}">
  <c:out value="${user}"/>
</c:forEach>

<c:if test="${arrayUsers != null}">
  <c:out value="arrayUsers is not null"></c:out>
</c:if>


</body>
</html>

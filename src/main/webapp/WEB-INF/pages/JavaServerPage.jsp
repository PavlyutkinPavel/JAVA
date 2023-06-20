<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: User
  Date: 26.05.2023
  Time: 21:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>My JSP</title>
</head>
<body>
<h1>Hello ${name}</h1>
<%=request.getParameter("name")%>
<%=new Date()%>
<%new Date();%>

<h1>Сумма 5 + 2 = <%=5+2%></h1>

</body>
</html>

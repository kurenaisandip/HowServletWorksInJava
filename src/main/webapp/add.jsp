<%--
  Created by IntelliJ IDEA.
  User: Jiwan
  Date: 1/27/2023
  Time: 2:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Adding two values</title>

    <%
    int i = Integer.parseInt(request.getParameter("num1"));
    int j = Integer.parseInt(request.getParameter("num2"));

    int k = i + j;

    out.println("output is " +k);


    %>

</head>
<body>

</body>
</html>

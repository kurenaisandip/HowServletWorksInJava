<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" errorPage="error.jsp"  %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>

<form action="add.jsp" method="get">
    Enter 1st number: <input type="text" name="num1"><br>
    Enter 2nd number: <input type="text" name="num2"><br>
    <input type="submit">
<%
    int k = 9/0;  // error page in Directive tage is used to display the error
    %>
</form>

<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>
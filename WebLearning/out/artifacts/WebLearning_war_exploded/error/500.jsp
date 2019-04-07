<%@ page contentType="text/html;charset=utf-8" isErrorPage="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>500</title>
</head>
<body>
<h1>休息一下吧</h1>
<%
    String msg = exception.getMessage();
    out.println("<br/>"+" "+ exception.getClass().getSimpleName()+ " " + " "+msg);
%>
</body>
</html>
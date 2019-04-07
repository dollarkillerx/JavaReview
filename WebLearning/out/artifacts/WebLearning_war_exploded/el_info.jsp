<%--
  Created by IntelliJ IDEA.
  User: dollarkiller
  Date: 19-4-7
  Time: 下午9:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
<head>
    <meta charset="utf-8">
    <title>EL表达式</title>
</head>
<body>
    <h1>姓名: ${requestScope.student.name}</h1>
    <h2>手机: ${requestScope.student.mobile}</h2>
    <h2>评级: ${requestScope.grade}</h2>
</body>
</html>

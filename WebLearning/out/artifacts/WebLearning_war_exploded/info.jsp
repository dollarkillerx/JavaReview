<%@ page import="com.dollar.el.Student" %>
<%--
  Created by IntelliJ IDEA.
  User: dollarkiller
  Date: 19-4-7
  Time: 下午9:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Insert title here</title>
</head>
<body>
    <%
        Student student = (Student) request.getAttribute("student");
        String grade = (String) request.getAttribute("grade");

        out.println("<h1>姓名: " + student.getName() + "</h1>");
        out.println("<h2>手机: " + student.getMobile() + "</h2>");
        out.println("<h2>教师评级: " + grade + "</h2>");


    %>
</body>
</html>

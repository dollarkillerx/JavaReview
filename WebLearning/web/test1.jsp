<%--
  Created by IntelliJ IDEA.
  User: dollarkiller
  Date: 19-4-7
  Time: 下午8:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<%
    String url = request.getRequestURI().toString();//HttpServletRequest
    response.getWriter().println(url);//HttpServletResponse
%>
<%
out.println("Hello Java Web");
session.setAttribute("user","张三");
out.println((String)session.getAttribute("user"));
%>
<%
    String cp = application.getInitParameter("username");
    out.println("<hr/>");
    out.println(cp);
%>
</body>
</html>

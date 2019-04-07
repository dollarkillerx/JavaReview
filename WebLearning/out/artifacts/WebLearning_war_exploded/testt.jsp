<%--
  Created by IntelliJ IDEA.
  User: dollarkiller
  Date: 19-4-7
  Time: 下午1:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Testss</title>
</head>
<body>
<%@ page import="java.util.*,java.util.ArrayList" %>
<%
    List<String> list = new ArrayList<>();
    list.add("JSP基础入门");
    list.add("Servlet视频详解");
    list.add("EL表达式初识");
    list.add("JSTL标签库初识");
%>

<%
    int b = 1;
    for (String a:list){
    out.println("第"+(b)+"条： "+a);
    b+=1;
%>

<%}%>
</body>
</html>

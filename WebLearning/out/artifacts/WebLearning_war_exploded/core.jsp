<%--
  Created by IntelliJ IDEA.
  User: dollarkiller
  Date: 19-4-8
  Time: 下午9:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Title</title>
</head>
<body>
<h1>${requestScope.score}</h1>
<c:if test="${score>=60}">
<h1 style="color:green">恭喜你，已通过测试</h1>
</c:if>
<c:if test="${score<60}">
    <h1 style="color:red">再接再厉</h1>
</c:if>

<c:choose>
    <c:when test="${grade == 'A'}">
        <h2>你很优秀</h2>
    </c:when>
    <c:when test="${grade == 'B'}">
        <h2>不错欧</h2>
    </c:when>
    <c:when test="${grade == 'C'}">
        <h2>加油欧</h2>
    </c:when>
    <c:otherwise>
        <h3>错误</h3>
    </c:otherwise>
</c:choose>

<%
    request.setAttribute("x",5);
%>
<c:choose>
    <c:when test="${x>0 && x<=10}">
        <h1>1-10之间的整数</h1>
    </c:when>
    <c:when test="${x>10 && x<20}">
        <h1>11-20之间的整数</h1>
    </c:when>
    <c:otherwise>
        <h2>HO(∩_∩)O哈哈~</h2>
    </c:otherwise>
</c:choose>

<c:forEach items="${requestScope.companies}" var="c" varStatus="idx">
    <h2>${idx.index}  ${c.cname} === ${c.url}</h2>
</c:forEach>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: dollarkiller
  Date: 19-4-8
  Time: 下午10:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Title</title>
</head>
<body>
<%
    request.setAttribute("amt",19287654.263);
    request.setAttribute("now",new java.util.Date());
    request.setAttribute("html","<a href='index.html'>index</a>");
    request.setAttribute("nothing",null);
%>
<%--
formatData pattern
yyyy 四位年
MM 两位月
dd 两位日
HH 24小时
hh 12小时
mm 分钟
ss - 秒数
SSS 毫秒
--%>
<fmt:formatDate value="${requestScope.now}" pattern="yyyy年MM月dd日 HH:mm:ss:SSS"/>
</body>
</html>

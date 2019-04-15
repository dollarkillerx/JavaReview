<%--
  Created by IntelliJ IDEA.
  User: dollarkiller
  Date: 19-4-15
  Time: 下午8:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ page import="com.dollarkiller.code.Captcah" %>
<%
    // 清空浏览器缓存
    //1.清空浏览器缓存
    response.setHeader("pragma","no-cache");
    response.setHeader("cache-control","no-cache");
    response.setHeader("expires","0");

    //2.调用编写的生成验证码的工具
    String code = Captcah.drawImage(response);
    session.setAttribute("code",code);

    //3.解决getOutputStream异常
    out.clear();
    out = pageContext.pushBody();
%>
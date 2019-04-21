<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="renderer" content="webkit">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.4.0/dist/jquery.min.js"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/normalize.css@8.0.1/normalize.css">
    <title>DollarKiller用户管理中心</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
    <div class="container">
        <div>
            <div class="page-header">
                <h1>用户管理中心 <small>用户管理中心</small></h1>
            </div>
        </div>
        <div>
            <div class="jumbotron">
                <h1>MyBatis基础入门</h1>
                <p>通过一个项目来完成基础部分的学习</p>
                <p><a class="btn btn-primary btn-lg">Learn more</a> </p>
            </div>
        </div>
        <div>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th scope="col">#用户标号</th>
                        <th scope="col">登录账户</th>
                        <th scope="col">用户昵称</th>
                        <th scope="col">用户年龄</th>
                        <th scope="col">邮箱</th>
                        <th scope="col">联系方式</th>
                        <th scope="col">账户创建时间</th>
                        <th scope="col">用户状态</th>
                        <th scope="col">操作</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="user" items="${requestScope.get('usersList')}">
                        <tr>
                            <th scope="row">${user.id}</th>
                            <td>${user.username}</td>
                            <td>${user.nickname}</td>
                            <td>${user.age}</td>
                            <td>${user.email}</td>
                            <td>${user.phone}</td>
                            <td>${user.createTime}</td>
                            <c:if test="${user.userStatus == 0}">
                                <td>正常</td>
                            </c:if>
                            <c:if test="${user.userStatus == 1}">
                                <td>停用</td>
                            </c:if>
                            <c:if test="${user.userStatus == 2}">
                                <td>删除</td>
                            </c:if>

                            <td>
                                <a href="">查看</a>
                                <a href="">修改</a>
                                <a href="">删除</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	String user = (String)session.getAttribute("loginUser");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Message</title>
<link href="https://cdn.bootcss.com/twitter-bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.bootcss.com/twitter-bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<form action="messageSub.jsp" method="post">
		  <div class="form-group">
		    <label for="formGroupExampleInput">留言人</label>
		    <input type="text" class="form-control" id="formGroupExampleInput" placeholder="Example input">
		  </div>
		  <div class="form-group">
		    <label for="formGroupExampleInput2">标题</label>
		    <input type="text" class="form-control" id="formGroupExampleInput2" placeholder="Another input">
		  </div>
		  <div class="form-group">
		    <label for="formGroupExampleInput2">内容</label>
		    <input type="text" class="form-control" id="formGroupExampleInput2" placeholder="Another input">
		  </div>
		  <button>留言</button>
		</form>
	</div>
</body>
</html>
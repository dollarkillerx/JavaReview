<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*,model.*" %>
<% 
	String user = (String)session.getAttribute("loginUser");
	String subFlage = request.getParameter("subFlage");
	
	List<Message> messages = (List<Message>)session.getAttribute("messages");
	
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
		    <input type="text" class="form-control" id="formGroupExampleInput2" placeholder="Another input" name="title">
		  </div>
		  <div class="form-group">
		    <label for="formGroupExampleInput2">内容</label>
		    <input type="text" class="form-control" id="formGroupExampleInput2" placeholder="Another input" name="content">
		  </div>
		  <button>留言</button>
		</form>
	</div>
	
	<div class='container'>
		<table class="table table-striped">
		  <thead>
		    <tr>
		      <th scope="col" width="5%">#</th>
		      <th scope="col" width="8%">留言人</th>
		      <th scope="col" width="12%">标题</th>
		      <th scope="col" width="75%">内容</th>
		    </tr>
		  </thead>
		  <tbody>
		  	<% 
		  		if(messages!=null) {
		  			for(Message message:messages) {
		  				%>
		  				<tr>
					      <th scope="row">1</th>
					      <td><%=user%></td>
					      <td><%=message.getTitle()%></td>
					      <td><%=message.getContent()%></td>
					    </tr>
		  				<%
		  			}
		  		}
		  	%>
		  </tbody>
		</table>
	</div>
	
	<script>
		var subFlag = "<%=subFlage%>";
		if(subFlag=='1') {
			alert("留言成功")
		}
	</script>
</body>
</html>
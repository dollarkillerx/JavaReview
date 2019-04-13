<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String flage = request.getParameter("flag");
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>Login</title>
	<link href="https://cdn.bootcss.com/twitter-bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
	<script src="https://cdn.bootcss.com/twitter-bootstrap/4.3.1/js/bootstrap.min.js"></script>
	<script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://getbootstrap.com/docs/4.3/examples/sign-in/signin.css"></script>
</head>
<body class="text-center">
	<form class="form-signin" method="post" action="login.jsp">
	  <img class="mb-4" src="https://getbootstrap.com/docs/4.3/assets/brand/bootstrap-solid.svg" alt="" width="72" height="72">
	  <h1 class="h3 mb-3 font-weight-normal">Please sign in</h1>
	  <label for="inputEmail" class="sr-only">UserName</label>
	  <input type="text" id="inputEmail" class="form-control" placeholder="Email address" required autofocus name="username">
	  <label for="inputPassword" class="sr-only">Password</label>
	  <input type="password" id="inputPassword" class="form-control" placeholder="Password" required name="password">
	  <div class="checkbox mb-3">
	    <label>
	      <input type="checkbox" value="remember-me"> Remember me
	    </label>
	  </div>
	  <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
	  <p class="mt-5 mb-3 text-muted">&copy; 2017-2019</p>
	</form>
	
	<script>
		var flage ='<%=flage%>';
		if("1"==flage) {
			alert("请登录")
		}
	</script>
</body>
</html>
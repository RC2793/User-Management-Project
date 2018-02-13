<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="bootstrap/css/custom.css">
</head>
<body>
	<h2 style="color: red">${err}</h2>
	<div class="container jumbotron">
		<form action="login.do" method="post" class="col-md-5">
			<h1>Login Page</h1>
			<span> 
			<input class="form-control" type="text" name="name" placeholder="User Name"><br>
			<input class="form-control" type="password" name="password" placeholder="Password"><br>
			</span> <br> 
			<input  class="btn btn-success btn-lg log-btn" type="submit" value="Login">
		</form> 
		

		

		New User??? <a href="Register.jsp">click here</a> To Register. <br>
		Forgot Password??? <a href="Forgot.jsp">click here</a>
	</div>
	<h4 style="color: red">${change}</h4>
</body>
</html>
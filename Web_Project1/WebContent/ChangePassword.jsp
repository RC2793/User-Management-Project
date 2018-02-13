<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css" >
<link rel="stylesheet" href="bootstrap/css/custom.css">
</head>
<body><div class=" jumbotron container">
	<h1>Change Password</h1>

	<form action="change_password.do" method="post" class="col-md-5">
		<input type="hidden" name="email" value="${pass_dto}"><br>
		<h4>Enter new Password</h4>
		<input type="password" name="password" class="form-control"> <br>
		<h4>Confirm Password</h4>
		<input type="password" name="confirm" class="form-control"> <br> <input
			type="submit" value="Submit" class="btn btn-success btn-lg log-btn">
	</form>
	</div>
	
<br><h4 style="color: red">${mis}</h4>
</body>
</html>
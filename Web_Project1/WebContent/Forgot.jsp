<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Forgot Password Page</title>
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css" >
<link rel="stylesheet" href="bootstrap/css/custom.css">
</head>
<body><div class=" jumbotron container">
<form action="forget.do" method="Post" class="col-md-7">
	<h1>Forgot Password??</h1>
	Enter your Email-ID
	<br>
	<input type="email"  class="form-control" name="email" placeholder="Email"><br>
	<input type="submit" class="btn btn-success btn-lg log-btn" value="Submit">
	
	</form>
	</div>
	<br>
	<h3 style="color: red">${err}</h3>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css" >
<link rel="stylesheet" href="bootstrap/css/custom.css">

</head>
<body>
<div class="jumbotron container">
			<h1>Registration Page</h1>
	<form action="register.do" method="post" class="col-md-7">
		
			<label>User Name</label>
			 <input class="form-control" type="text" name="name" class="input"><br> 
			<label>Email</label> 
			<input class="form-control" type="email" name="email" class="input"><br>
			<label>Address</label> 
			<input class="form-control" type="text" name="address" class="input"><br>
			 <label>Phone No</label>
			  <input type="number" class="form-control" name="phNo"class="input"><br>
			  <label>Password</label>
			   <input type="password" class="form-control" name="password" class="input"><br>
			<input class="btn btn-success btn-lg log-btn" type="submit" value="Register"><br>
		
	</form>
	</div>

</body>
</html>
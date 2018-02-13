<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Page</title>
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css" >
<link rel="stylesheet" href="bootstrap/css/custom.css">
</head>
<body><div class=" jumbotron container">
	<h1>Update Page</h1>
	<br>
	<form action="update.do" method="post" class="col-md-7">
		User Name:<input class="form-control" type="text" name="name" value="${dto.name }"><br>
		Email:<input class="form-control" type="email" name="email" value="${dto.email }" disabled="disabled"><br>
		Address:<input class="form-control"  type="text" name="address" value="${dto.address}"><br>
		Phone No:<input class="form-control" type="number" name="phNo" value="${dto.phNo }"><br>
		Password:<input class="form-control" type="text" name="password"
			value="${dto.password }"><br> <br> 
			<input type="submit"  class="btn btn-success btn-lg log-btn" value="Update">
	</form>
</div>
</body>
</html>
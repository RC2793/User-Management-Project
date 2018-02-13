<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Page</title>
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css" >
<link rel="stylesheet" href="bootstrap/css/custom.css">
</head>
<body>
<div class="  container col-md-6">
	<h1>View Page</h1>
	<br>
		User Name:<input class="form-control" type="text" name="name" value="${dto.name }" readonly="readonly"><br>
		Email:<input class="form-control" type="email" name="email" value="${dto.email }" readonly="readonly"><br>
		Address:<input class="form-control"  type="text" name="address" value="${dto.address}" readonly="readonly"><br>
		Phone No:<input class="form-control" type="number" name="phNo" value="${dto.phNo }" readonly="readonly"><br>
		Password:<input class="form-control" type="text" name="password" value="${dto.password }" readonly="readonly"><br> <br> 
			
</div>

</body>
</html>
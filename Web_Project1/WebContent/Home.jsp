<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
</head>
<body>
	<h1>Home Page</h1>
	<h2>
		<div style="color: red">${update}</div>
		Welcome <span style="color: red">${name}</span>
	</h2>
	<br>
	<br>
	<a href="View.jsp"><button class="btn btn-success btn-lg log-btn" >View Details</button></a>
	<a href="Update.jsp"><button class="btn btn-success btn-lg log-btn">Update Details</button></a>
	

</body>
</html>
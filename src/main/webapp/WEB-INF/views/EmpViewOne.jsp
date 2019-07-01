<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
<marquee bgcolor="yellow" height="45">
		<h3>DEAR "${emp.emname}"  PLZ CHECK YOU DATA....</h3>
	</marquee>
	<table border="1">
		<tr>
			<th>EMPLOYEE ID</th>
			<td>${emp.empid}</td>
		</tr>
		<tr>
			<th>EMPLOYEE NAME</th>
			<td>${emp.emname}</td>
		</tr>
		<tr>
			<th>EMPLOYEE SALARY</th>
			<td>${emp.empsal}</td>
		</tr>
		<tr>
			<th>EMPLOYEE GENDER</th>
			<td>${emp.empgen}</td>
		</tr>
		<tr>
			<th>EMPLOYEE DEPT</th>
			<td>${emp.empept}</td>
		</tr>
		<tr>
			<th>EMPLOYEE LOCATION</th>
			<td>${emp.emploc}</td>
		</tr>
		<tr>
			<th>EMPLOYEE ADDRESS</th>
			<td>${emp.empaddr}</td>
		</tr>

	</table><br><br>
	<a href="show">HOME PAGE</a><BR><br>
	<a href="all">DATA PAGE</a>
</body>
</html>
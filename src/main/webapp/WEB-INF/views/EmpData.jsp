<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
	<body bgcolor="pink" text="black">
		<marquee bgcolor="yellow" height="45">
			<h3>WELCOME TO EMPLOYEES DATA PAGE....</h3>
		</marquee>
		<c:if test="${empty list}">
			<h1>NO DATA FOUND</h1>
			<h1>
				<a href="show">plz register here...</a>
			</h1>
		</c:if>
		<c:if test="${!empty list}">
			<table border="1">
				<tr>
					<th>EMPLOYEE ID</th>
					<th>EMPLOYEE NAME</th>
					<th>EMPLOYEE SALARY</th>
					<th>EMPLOYEE GENDER</th>
					<th>EMPLOYEE DEPT</th>
					<th>EMPLOYEE LOCATION</th>
					<th>EMPLOYEE ADDRESS</th>
					<th colspan="2">OPERATIONS</th>
				</tr>
				<c:forEach items="${list}" var="e">
					<tr>
						<td>${e.empid}</td>
						<td>${e.emname}</td>
						<td>${e.empsal}</td>
						<td>${e.empgen}</td>
						<td>${e.empept}</td>
						<td>${e.emploc}</td>
						<td>${e.empaddr}</td>
						<td><a href="delete?empid=${e.empid}">DELETE</a></td>
						<td><a href="view?empid=${e.empid}">VIEW</a></td>
					</tr>
				</c:forEach>
			</table>
		</c:if>
		<br> ${emp}
		<br>
		<br>
		<a href="show">HOME PAGE</a>
		<br>
		<br>
		${emp}<br>
<form action="search" method="post">
ENTER EMPLOYEE ID:	<input type="text" name="empid" size="2">
		<input type="submit" value="SEARCH">
		</form>
	</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.errors{
		color:red;
}
</style>
</head>
<body bgcolor="PINK" text="BLACK">
	<marquee bgcolor="YELLOW" height="40">WELCOME TO REGISTER PAGE..</marquee>
	<form:form action="save" method="post" modelAttribute="employee">
		<pre>
		
EMPLOYEE_NAME:     <form:input path="emname" ></form:input><br>
					<form:errors path="emname" cssClass="errors"/>
EMPLOYEE_SALARY:   <form:input path="empsal" ></form:input><br>
					<form:errors path="empsal" cssClass="errors"/>
EMPLOYEE_GENDER:   <form:radiobutton path="empgen" value="MALE" />MALE
		   <form:radiobutton path="empgen" value="FEMALE" />FEMALE<br>
				<form:errors path="empgen" cssClass="errors"/>
EMPLOYEE_ROLE:     <form:select path="empept">
		<form:option value=" ">--select--</form:option>
		<form:option value="DEV">DEV</form:option>
		<form:option value="QA">QA</form:option>
		<form:option value="MANAGER">MANAGER</form:option>
	    <form:option value="BA">BA</form:option>
	     <form:option value="UI-DEV">UI-DEV</form:option>
	 	</form:select><br>
	 	<form:errors path="empept" cssClass="errors"/>
EMPLOYEE_LOCATION:<form:input path="emploc" /><br>
					<form:errors path="emploc" cssClass="errors"/>
EMPLOYEE_ADDRESS: <form:textarea path="empaddr" /><br>
					<form:errors path="empaddr" cssClass="errors"/>
	 	<input type="submit" value="REGISTER" /><br>
	 	
</pre>
	</form:form>
	${emp}
	<br><br>
	<a href="all">[ALL-DATA]</a>
</body>
</html>
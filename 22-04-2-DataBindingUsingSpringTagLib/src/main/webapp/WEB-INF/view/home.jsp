<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form modelAttribute="emp" method="post">
	<center>
		<h1>Welcome to the Spring MVC APP</h1>
		<table>
			<tr>
					<th>Emp Name</th>
					<td><form:input path="name"/></td>
			</tr>
			<tr>
					<th>Emp Designation</th>
					<td><form:input path="designation"/></td>
			</tr>
			<tr>
					<th>Emp salary</th>
					<td><form:input path="saslary"/></td>
			</tr>
			<tr>
					<th></th>
					<td><input type="submit" name="register"></td>
			</tr>
		</table>
	</center>
	</form:form>
</body>
</html>
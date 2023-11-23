<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Save Customer</title>
<link href="" rel="stylesheet"><link>
</head>
<body>


	<!-- Using 2 way binding the data from the jsp is sent to the controller to save using springtag lib -->
	<div>
		<p>
			<a href="/list">Back to list</a>
		</p>
	</div>

	<form:form action="/save" modelAttribute="customer" method="post">
		<center>
			<h1 style="color:red">Welcome to the Spring MVC APP</h1>
			<div>
				<p>
					<a href="/list">Back to list</a>
				</p>
			</div>
			<!-- the id is sent hiddenly so that during the update operation it will fetch the id and
			 update the current record else without id it treats the data as new object and saves a new record -->
			<form:hidden path="id"/>
			<table>
				<tr>
					<th>First Name</th>
					<td><form:input path="firstName" /></td>
				</tr>
				<tr>
					<th>Last Name</th>
					<td><form:input path="lastName" /></td>
				</tr>
				<tr>
					<th>Email</th>
					<td><form:input path="email" /></td>
				</tr>
				<tr>
					<th></th>
					<td><input type="submit" name="Save"></td>
				</tr>
			</table>
		</center>
	</form:form>


</body>
</html>
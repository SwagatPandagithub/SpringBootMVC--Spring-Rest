<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Displaying list of DTO Employee Object Data from controller to JSP</h1>
		<table border="1">
		<tr>
			<th>Emp No</th>
			<th>Emp Name</th>
			<th>Emp Designation</th>
			<th>Emp Salary</th>
		</tr>
		<c:forEach var="emp" items="${employeeList}">
			<tr>
				<td>${emp}</td>
				<td>abcd</td>
				<td>abcd</td>
				<td>abcd</td>
			</tr>
		</c:forEach>			
		
		</table>

		<h1>Displaying list of DTO Employee Data from controller to JSP</h1>
		
			<h>Emp No :: ${employee.eNo}</h>
			<h>Emp Name:: ${employee.eName}</h>
			<h>Emp Designation:: ${employee.eDesig}</h>
			<h>Emp Salary:: ${employee.salary}</h>



</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Output page</title>
</head>
<body>
	<h1 style='color: blue; text-align: center'>Displaying Simple
		Values data Rendering from controller to JSP</h1>
	<center>
		<h1>Name is :: ${name}</h1>
		<h1>Age is :: ${age}</h1>
		<h1>Team is :: ${address}</h1>

		<hr />
		<h1 style='color: blue; text-align: center'>Displaying Simple
			Values data Rendering from controller to JSP</h1>
		<b>Country Names</b> <br />
		<c:forEach var="country" items="${countryNames}">
		${country }<br />
		</c:forEach>

		<hr />

		<h1>Displaying The List Objects from the controller to jSp</h1>
		<b>Subjects Lists</b> <br />
		<c:forEach var="subject" items="${subjectsKey}">
		${subject}<br />
		</c:forEach>

		<hr />

		<h1>Displaying the Set Objects from the controller to the Jsp
			page</h1>
		<b>Mobile numbers</b> <br />
		<c:forEach var="mobile" items="${mobileNumbers}">
			${mobile}<br />
		</c:forEach>

		<hr />
		
		<h1>Displaying the Map Values in the jsp page took from
			controller</h1>
		<b>Cards and ids</b><br />

		<c:forEach var="ids" items="${idMap}">
		${ids}<br />
		</c:forEach>
		
	
		

	</center>

</body>
</html>
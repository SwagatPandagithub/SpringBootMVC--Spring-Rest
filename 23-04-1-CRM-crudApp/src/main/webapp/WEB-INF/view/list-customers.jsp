<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Customers</title>
</head>
<body>
	<center>
		<h1>The Customer Data Table</h1>
		<table>
			<tr>
				<th>First Name</th>
				<th>Second Name</th>
				<th>E-Mail</th>
				<th>ACTION</th>

			</tr>
			<!-- A new url is created for redirecting to a form to update core:param will extract the id 
						understand the flow and remember the code-->
			<core:forEach var="cust" items="${customers}">

				<core:url var="updateLink" value="/showFormForUpdate">
					<core:param name="customerid" value="${cust.id}"></core:param>
				</core:url>

				<core:url var="deleteLink" value="/deleteCustomer">
					<core:param name="customerid" value="${cust.id}"></core:param>
				</core:url>

				<tr>
					<td>${cust.firstName}</td>
					<td>${cust.lastName}</td>
					<td>${cust.email}</td>
					<td><a href="${updateLink}">UPDATE</a> |
					<a href="${deleteLink}"
						onclick="if(!(confirm('Are you Sure, You want to delete the record?')))return false;">DELETE</a></td>
			</core:forEach>
			</tr>
		</table>

		<!-- Putting a button to add a customer -->
		<input type="button" value="Add Customer"
			onclick="window.location.href='./showform';return false;"
			class="add-button" />

	</center>



</body>
</html>
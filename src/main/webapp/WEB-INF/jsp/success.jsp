<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<link rel="stylesheet"
	href="https://cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css" />
<script
	src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
	<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="js/javascript.js"></script>
<link rel="stylesheet" type="text/css" href="css/employeeCss.css">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success Page</title>
</head>
<body>
	<c:if test="${not empty addedEmployee}">
		<h3 align="center">${employee.name}hasbeen added with Id
			${employee.id}</h3>
	</c:if>
	<div class='table-div'>
		<table id='employeeTable'>
			<thead>
				<tr align="center">
					<th>Employee-ID</th>
					<th>Employee-Name</th>
					<th>Organization</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${employeeList}" var="employee">
					<tr align="center">
						<td>${employee.id}</td>
						<td>${employee.name}</td>
						<td>${employee.organization}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<button class="back-button btn btn-primary" type='button'>Back</button>
	</div>
	<form:form class='back-button-form' action='employee' method='GET' />
</body>
</html>
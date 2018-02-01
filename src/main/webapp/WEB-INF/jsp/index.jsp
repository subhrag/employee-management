<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<link rel="stylesheet"
	href="https://cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css" />
<script
	src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/employeeCss.css">
<script src="js/javascript.js"></script>

<title>Employee Management</title>
</head>
<body style='background-color: lavender;'>
	<h3 align="center">Welcome to Employee Management</h3>

	<div class='container index-div'>

		<div class='row' align="center">

			<div class='col-sm-6' align="right">
				<a class='addition' href="#">Insert Employee</a>
			</div>

			<div class='col-sm-6' align="left">
				<a class='view' href="#">View Employee</a>
			</div>
		</div>
	</div>

	<form:form class='index-form' method='GET' action='employee-entry' />


</body>
</html>
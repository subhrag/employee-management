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
	<script src="js/javascript.js"></script>
<title>Error Page</title>
</head>
<body>
<div class="alert alert-danger">
	<strong>Error!    </strong>${errorMessage}
	
</div>
<button class="back-button btn btn-primary" type='button'>Back</button>
<form:form class='back-button-form' action='employee-entry' method='GET' />
</body>
</html>
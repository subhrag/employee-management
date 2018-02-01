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
<!-- Latest compiled JavaScript -->
<!--<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> -->
<script src="js/javascript.js"></script>
<link rel="stylesheet" type="text/css" href="css/employeeCss.css">

<title>Insert Employee</title>
</head>
<body class="employee-body">



	<div class="container main-div">
		<h3 class='h3-title'>Employee Details</h3>
		<form:form class="main-form" modelAttribute="employee" method="POST"
			action="add-employee">
			<div class="row">
				<div class="col-sm-3"></div>
				<div class="form-group col-sm-6">
					<label>Employee Name :</label> <input name='name' type='text' />
				</div>
				<div class="col-sm-3"></div>
			</div>
			<div class="row">
				<div class="col-sm-3"></div>
				<div class="form-group col-sm-6">
					<label>Organization Name : </label> <input class="float-right" name='organization'
						type='text' />
				</div>
				<div class="col-sm-3"></div>
			</div>

			<div class="row" align="center">
				<div class="col-sm-3"></div>
				<div class="form-group col-sm-6">
					<input class="btn btn-primary" type="submit" value="Submit">
					<button class="back-button btn btn-primary" type='button'>Back</button>
				</div>
				<div class="col-sm-3"></div>
			</div>

		</form:form>

		<form:form class='back-button-form' action='employee' method='GET' />


	</div>


</body>
</body>
</html>
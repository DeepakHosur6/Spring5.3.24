<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- This above is for each link-- https://www.tutorialspoint.com/jsp/jstl_core_foreach_tag.htm -->

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>

</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"><img
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" height="48" width="80"> </a> <a href="index.jsp">Home_Page</a>
			<a href="index.jsp"><button type="button"
					class="btn btn-warning btn-lg">
					Home_Page <span class="glyphicon glyphicon-ok"></span>
				</button></a>

		</div>
	</nav>

	<h1>Page to Bekery Details.....</h1>

	<form action="bekery" method="post">
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label"></label> <input
				type="text" class="form-control" id="exampleFormControlInput1"
				placeholder="Enter the bekeryName" name="name">
		</div>

		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label"></label> <input
				type="text" class="form-control" id="exampleFormControlInput1"
				placeholder="Enter the ownerName" name="owner">
		</div>

		<div class="mb-3">
			<label>married</label>
			<button type="button" class="btn btn-primary btn-sm" value="true"
				name="married">Yes</button>
			<button type="button" class="btn btn-secondary btn-sm" value="false"
				name="married">No</button>
		</div>

		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label"></label> <input
				type="text" class="form-control" id="exampleFormControlInput1"
				placeholder="Enter the ownerWifeName" name="wife">
		</div>

		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label"></label> <input
				type="text" class="form-control" id="exampleFormControlInput1"
				placeholder="Enter the famous" name="famous">
		</div>

		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label"></label> <input
				type="text" class="form-control" id="exampleFormControlInput1"
				placeholder="Enter the since" name="since">
		</div>

		<input type="submit" value="DisplaySuccess" />
</body>
</html>
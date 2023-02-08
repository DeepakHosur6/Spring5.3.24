<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>

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

	<h1>Wel Come to Information Page</h1>

	<form method="get" action="userName">
		<h5>Display String : ${deepak}</h5>
		<input type="submit"  value="Send"/>
	</form>

	<form action="email">
		<h5>Display Gmail : ${Gmail}</h5>
		<input type="submit"  value="Send"/>

	</form>


	<form action="number">
		<h6>Display Mobile number : ${number}</h6>
		<input type="submit" value="Send" />
	</form>

	<form action="adhar">
		<h6>Display Adhaar number : ${adharNo}</h6>
		<input type="submit" value="Send" />
	</form>

	<form action="age">
		<h6>Display Age : ${age}</h6>
		<input type="submit" value="Send" />
	</form>

	<form action="dob">
		<h6>Display Date of birth : ${dateAndTime}</h6>
		<input type="submit" value="Send" />
	</form>

	<form action="amount">
		<h6>display desired salary : ${salary}</h6>
		<input type="submit" value="Send" />
	</form>

	<form action="friends">
		<h6>Display best friends names :</h6>
		<input type="submit" value="Send" />
		<ul>
			<c:forEach items="${friend}" var="value">
				<li>${value}</li>
			</c:forEach>
		</ul>
	</form>

	<form action="places">
		<h6>Display visited places</h6>
		<input type="submit" value="Send" />
		<ul>
			<c:forEach items="${place}" var="value">
				<li>${value}</li>
			</c:forEach>
		</ul>
	</form>

	<form action="skills">
		<h6>Display skill sets</h6>
		<input type="submit" value="Send" />
		<ul>
			<c:forEach items="${skill}" var="value">
				<li>${value}</li>
			</c:forEach>
		</ul>
	</form>



</body>
</html>
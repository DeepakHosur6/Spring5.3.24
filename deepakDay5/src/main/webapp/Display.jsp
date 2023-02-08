<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
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
				<a href="index.jsp"><button type="button" class="btn btn-warning btn-lg">Home_Page <span class="glyphicon glyphicon-ok"></span></button></a>
	 
		</div>
	</nav>

<form  action="user">
		<h5>Display Details : ${KeyData}</h5>
		<input type="submit"  value="Send"/>
	</form>

	<form action="email">
		<h5>Display Gmail : ${Gmail}</h5>
		<input type="submit"  value="Send"/>
	</form>


	<form action="number">
		<h6>Display Mobile Number : ${number}</h6>
		<input type="submit" value="Send" />
	</form>

	<form action="aadhar">
		<h6>Display Aadhaar Number : ${aadharNo}</h6>
		<input type="submit" value="Send" />
	</form>

	<form action="age">
		<h6>Display Age : ${age}</h6>
		<input type="submit" value="Send" />
	</form>

	<form action="dob">
		<h6>Display Date Of Birth : ${dateAndTime}</h6>
		<input type="submit" value="Send" />
	</form>

	<form action="amount">
		<h6>Display Desired Salary : ${salary}</h6>
		<input type="submit" value="Send" />
	</form>

<!-- This is for each link-- https://www.tutorialspoint.com/jsp/jstl_core_foreach_tag.htm -->

	<form action="friends">
		<h6>Display Best Friends Names list  :</h6>
		<input type="submit" value="Send" />
		<ul>
			<c:forEach items="${friend}" var="names"> 
				<li>${names}</li>
			</c:forEach>
		</ul>
	</form>

	<form action="places">
		<h6>Display Visited Places</h6>
		<input type="submit" value="Send" />
		<ul>
			<c:forEach items="${place}" var="value">
				<li>${value}</li>
			</c:forEach>
		</ul>
	</form>

	<form action="skills">
		<h6>Display Skill Sets</h6>
		<input type="submit" value="Send" />
		<ul>
			<c:forEach items="${skill}" var="value">
				<li>${value}</li>
			</c:forEach>
		</ul>
	</form>
	
	<form action = "beverage">
    <h6> Display Beverage details </h6>
    <input type = "submit" value = "Send"/> </br>
    <label> BeverageName : ${coffee.name} </label> </br>
    <label> BeveragePrice : ${coffee.price} </label> </br>
    <label> BeverageFlavour : ${coffee.flavour} </label> </br>
    <label> BuyerName : ${coffee.buyer} </label> </br>
    <label> ShopName : ${coffee.shopName} </label> </br>
    <label> Brand : ${coffee.brand} </label> </br>
    <label> BeverageTypes : ${coffee.types} </label> </br>
    <label> SugarContent : ${coffee.sugarContent} </label> </br>
    <label> BeverageQuantity : ${coffee.quantity} </label> </br>
    <label> BeverageColor : ${coffee.color} </label>
    </form>
	
	<form action = "charts">
    <h6> Display Chat details </h6>
    <input type = "submit" value = "Send"/> </br>
    <label> ChatId : ${chart.id} </label> </br>
    <label> ChatName : ${chart.name} </label> </br>
    <label> ChatPrice : ${chart.price} </label> </br>
    <label> ShopName : ${chart.centerName} </label> </br>
    <label> MadeBy : ${chart.madeBy} </label> </br>
    <label> Location : ${chart.location} </label> </br>
    <label> CoolDrink : ${chart.coolDrinkName} </label> </br>
    <label> Location : ${chart.location} </label> </br>
    <label> Quantity : ${chart.quantity} </label> </br>
    <label> TasteOrNot : ${chart.taste} </label> </br>
    <label> Type : ${chart.type} </label>
    </form>

	<form action = "edu">
    <h6> Display education details.</h6>
    <input type = "submit" value = "Send"/></br>
    <label> StudentName : ${education.name} </label> </br>
    <label> Location : ${education.location} </label> </br>
    <label> CollageName : ${education.collageName} </label> </br>
    <label> Qualification : ${education.qualification} </label> </br>
    <label> Semesters : ${education.semesters} </label> </br>
    <label> Percentage : ${education.percentage} </label> </br>
    <label> TotalMarks : ${education.totalMarks} </label> </br>
    <label> EducationType : ${education.type} </label> </br>
    <label> Address : ${education.address} </label> </br>
    <label> PrincipleName : ${education.principleName}</label>
    </form>
    
    <form action = "fam">
    <h6> Display family details </h6>
    <input type = "submit" value = "Send"/></br>
    <label> FatherName : ${family.fatherName} </label> </br>
    <label> MotherName : ${family.motherName} </label> </br>
    <label> ElderSisterName : ${family.elderBrotherName} </label> </br>
    <label> SisterName : ${family.sisterName} </label> </br>
    <label> MyName : ${family.myName} </label> </br>
    <label> SirName : ${family.sirName} </label> </br>
    <label> BrotherName : ${family.brotherName} </label> </br>
    <label> CousinName : ${family.cousinName} </label> </br>
    <label> NoOfMembers : ${family.noOfMembers} </label> </br>
    <label> FathersWork : ${family.fathersWork} </label>
    </form>
    
    <form action = "mobile">
    <h6> Display Mobile details </h6>
    <input type = "submit" value = "Send"/> </br>
    <label> MobileName : ${mob.color} </label> </br>
    <label> MobilePrice : ${mob.price} </label> </br>
    <label> MobileBrand : ${mob.brand} </label> </br>
    <label> MobileVersion : ${mob.version} </label> </br>
    <label> Storage : ${mob.storage} </label> </br>
    </form>

</body>
</html>
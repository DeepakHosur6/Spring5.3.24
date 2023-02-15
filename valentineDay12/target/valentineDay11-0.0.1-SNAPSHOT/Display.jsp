<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</head>
<body>

<nav class="navbar navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">
    <img alt="" src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" width="80" height="50" class="d-inline-block align-text-top">
    </a>
    <!-- <a href="index.jsp">Home</a>	 -->
    
			<ul>
				<li style="display: inline-block;padding: 20px;">
				<!-- 	<a href="Display.jsp" class="col-lg-2 col-sm-2">Display</a>  -->
					<a href="index.jsp"><button type="button"
					class="btn btn-warning btn-lg">
					Home <span class="glyphicon glyphicon-ok"></span>
				</button></a>
					<li style="display: inline-block;">
				</ul>
  </div>
</nav>
<h1>Welcome to Valentine Special</h1>

	<form action="valentine" method="post">
	<pre>
	<div  class="mb-3"> 
    Name : <input type="text"  placeholder=" Name" name="name"> 
    Valentine Name : <input type="text"  placeholder=" Valentine Name" name="valentine Name"> 
	Places : <select name="place">
	<option value="">SELECT</option>
	<c:forEach> 
	<option></option> </select>
	
	
	Egg Type : <select name="type">
	
	<option>Nati</option>
	<
	</select>
	
	Price : <input  type="text" name="price" />
	
	Quantity : <select name="quantity">
	<option>1</option>
	<option>2</option>
	<option>3</option>
	<option>4</option>
	<option>5</option>
	<option>10</option>
	</select>
	
	Take Away :: Yes : <input  type="radio"  value="true" name="takeAway"/>  No : <input  type="radio"  value="false" name="takeAway"/>

	<input type="submit"  value="Order" class="btn btn-success"/>
		
</div>
	</pre>
	</form>

</body>
</html>
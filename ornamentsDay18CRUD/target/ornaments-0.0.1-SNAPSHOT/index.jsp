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

	<nav class="navbar navbar-light bg-light">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <img alt=""
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				width="80" height="50" class="d-inline-block align-text-top">
			</a>
			<ul>
				<li style="display: inline-block; padding: 20px;">
					<!-- 	<a href="Display.jsp" class="col-lg-2 col-sm-2">Display</a>  -->
					<a href="Ornaments.jsp"><button type="button"
							class="btn btn-warning btn-lg">
							Register Ornaments<span class="glyphicon glyphicon-ok"></span>
						</button></a>
				
				<a href="OrnamentsSearch.jsp"><button type="button"
							class="btn btn-warning btn-lg">
							 Search Ornaments <span class="glyphicon glyphicon-ok"></span>
						</button></a>
						
						<a href="NameSearch.jsp"><button type="button"
							class="btn btn-warning btn-lg">
							 Search By Name <span class="glyphicon glyphicon-ok"></span>
						</button></a>
			</ul>
			<!-- <a href="">Display</a>  -->
		</div>
	</nav>
	<marquee width="60%" direction="left" height="100px">
		<h1>Welcome to Ornaments Special</h1>
		
		<h4>This Project contains only the Save and Search Operations .
		With Query.
		
		</h4>
	</marquee>
	<div>
	<span> <a href="Ornaments"><button type="button"
					class="btn btn-info">
					Register Ornaments <span class="glyphicon glyphicon-ok"></span>
				</button></a>
		</span>
		 </div>
		<br>
		<div>
		<span> <a href="OrnamentsSearch.jsp"><button type="button"
					class="btn btn-info">
					Search Ornaments <span class="glyphicon glyphicon-ok"></span>
				</button></a>
		</span>
	</div>
</body>
</html>
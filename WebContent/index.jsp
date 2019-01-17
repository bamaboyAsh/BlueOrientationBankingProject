<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index Page</title>
</head>
<body>
<h1>Welcome to Blue Orientation Online-Banking </h1>

<h3>Existing Users Login here</h3>
	<div class="container">
		<form name="Login" action="LoginServlet.java" method="post">
			<div class="row">
				<div class="col-25">
					<label for="username">UserName:</label>
				</div>
				<div class="col-75">
					<input type="text" id="userName" name="userName"
						placeholder="Your Username..">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="Password">Password:</label>
				</div>
				<div class="col-75">
					<input type="text" id="password" name="password"
						placeholder="Enter your Password..">
				</div>
			</div>
			<div class="row">
				<input type="submit" value="Submit">
			</div>
		</form>
	</div>

</body>
</html>
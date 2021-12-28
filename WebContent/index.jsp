<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Front Door</title>
		<link rel="stylesheet" type="text/css" href="PizzaStyle.css">
	</head>
	<body>
		<form action="FrontDoorServlet" class="frontDoor" method="post">
			<div id="header"><h1>Welcome, please provide some information</h1></div>
			<div id="frontDoor">
				<label>First Name: <input type="text" name="first"></label>
				<label>Last Name: <input type="text" name="last"></label><br>
				<label>Email: <input type="email" name="email"></label>
				<label>Phone Number: <input type="tel" name="phone"></label><br>
				<label>Address: <input type="text" name="address"></label><br><br>
				<label>Pick up<input type="radio" name="trans" value="pick"></label>
				<label>Delivery<input type="radio" name="trans" value="delivery" checked></label>
				<input type="submit" value="Submit">
			</div>
			<div id="footer"></div>
		</form>
	</body>
</html>
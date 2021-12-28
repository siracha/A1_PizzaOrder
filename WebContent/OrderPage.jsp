<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
		<title>Order Page</title>
		<link rel="stylesheet" type="text/css" href="PizzaStyle.css">
	</head>
	<body>
		<form action="OrderServlet" method="post">
			<div id="header">
				<p>Welcome ${customer.fname} ${customer.lname }! Please place your order below</p>
				cart: ${cart }
			</div>
			
			<div id="body">
				<h2>Pizza</h2>
				<select>
					<option value="S">S</option>
					<option value="M">M</option>
					<option value="L">L</option>
					<option value="XL">XL</option>
				</select>
	
				<h2>Toppings</h2>
				pepperoni<input type="checkbox" name="toppings" value="pepperoni" checked>
				cheese<input type="checkbox" name="toppings" value="cheese" checked><br>
				mushrooms<input type="checkbox" name="toppings" value="mushrooms">
				olives<input type="checkbox" name="toppings" value="olives"><br>
				chicken<input type="checkbox" name="toppings" value="chicken">
				pineapples<input type="checkbox" name="toppings" value="pineapples">
				feta<input type="checkbox" name="toppings" value="feta"><br>
				onions<input type="checkbox" name="toppings" value="onions">
				green peppers<input type="checkbox" name="toppings" value="green">
				red peppers<input type="checkbox" name="toppings" value="red">
				yellow peppers<input type="checkbox" name="toppings" value="yellow">
				bacon<input type="checkbox" name="toppings" value="bacon"><br><br>
				
				<input type="submit" name="add" value="Add Pizza">
				<input type="submit" name="checkout" value="Checkout">
			</div>
		</form>
	</body>
</html>
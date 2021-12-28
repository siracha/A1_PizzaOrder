<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Receipt</title>
		<link rel="stylesheet" type="text/css" href="PizzaStyle.css">
	</head>
	<body>
		<div id="header"> <h1>Thank you for your purchase</h1></div>
		Customer name ${customer.fname } ${customer.lname }
		customer info ${customer.email } ${customer.phone } ${customer.address }
		transmission method ${customer.trans }
		cart ${cart }
	</body>
</html>
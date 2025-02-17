<%@page import="javax.naming.Context"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login to page</title>
<link rel="stylesheet" type="text/css" href="styles.css">
<style>
		body {
    font-family: Arial, sans-serif;
    background: url('images/securitylogin.jpg') no-repeat center center fixed;
    background-size: cover;
    text-align: center;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
    margin: 0;
}
	</style>
</head>
<body><h1><center>
<h3 style="color:red;">
<%
	String req=(String)request.getAttribute("msg");
	out.println(req);
%>
</h3>
			<u><i>Online Electronic Store</i></u><br><br>
			<a href="AdminLogin.html">Admin Login</a><br>
			<a href="CustomerLogin.html">Customer Login</a>
</h1>
</body>
</html>
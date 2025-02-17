<%@page import="javax.naming.Context"%>
<%@page import="com.nt.pack1.AdminBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AdminHome page</title>
<link rel="stylesheet" type="text/css" href="styles.css">
<style>
		body {
    font-family: Arial, sans-serif;
    background: url('images/loginhomepage.jpg') no-repeat center center fixed;
    background-size: cover;
    text-align: center;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
    margin: 0;
    color:blue;
}
	</style>
</head>
<body style="text-align:center">
<h1>
<%
	AdminBean ab=(AdminBean)session.getAttribute("abean");
	String name=ab.getaUserName();
	out.println("Welcome Mr. "+name+" !!!");
%>
<br><br>
<a href="AddProduct.html">Add product</a><br>
<a href="view1">ViewProduct</a><br>
<a href="Logout.jsp">Logout</a><br>
</h1>
</body>
</html>
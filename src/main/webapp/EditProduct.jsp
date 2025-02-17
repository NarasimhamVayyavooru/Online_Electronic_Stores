<%@page import="com.nt.pack1.ProductBean"%>
<%@page import="com.nt.pack1.AdminBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>edit the product</title>
<link rel="stylesheet" type="text/css" href="style2.css">
<style>
		body {
    font-family: Arial, sans-serif;
    background: url('images/viewelectronicspage.jpeg') no-repeat center center fixed;
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
<body style="text-align:center;"><h1>
<%
	AdminBean abean=(AdminBean)session.getAttribute("abean");
	ProductBean pbean=(ProductBean)request.getAttribute("pbean");
	out.println("Hello "+abean.getaFname()+" "+pbean.getpName()+" product details available for edit<br>");
	
%>
	<form action="update" method="post">
    Product Price: <input type="text" name="pPrice" value="<%= pbean.getpPrice() %>"><br><br>
    Product Quantity: <input type="text" name="pQty" value="<%= pbean.getpQuantity()%>"><br><br>
    <input type="hidden" name="pCode" value="<%= pbean.getpCode() %>"><br>
    <input type="submit" value="Update">
</form>
</h1>
</body>
</html>
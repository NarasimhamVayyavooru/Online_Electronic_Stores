<%@page import="com.nt.customer.BuyProductBean"%>
<%@page import="com.nt.customer.CustomerBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CustomerBuyProduct page</title>
<link rel="stylesheet" type="text/css" href="styles.css">
<style>
		body {
    font-family: Arial, sans-serif;
    background: url('images/buyproductpage.jpg') no-repeat center center fixed;
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
<body style="text-align:center">
<h1>
	<%
		BuyProductBean pb=(BuyProductBean)request.getAttribute("pbean");
	CustomerBean cb=(CustomerBean)session.getAttribute("cbean");
		out.println("Hello "+cb.getcFname()+"<br>Select the Required Number you wish<br>");
		
	%>
		<form action="updateproduct" method="post">
		<input type="hidden" name="pcode" value="<%= pb.getPcode() %>"><br>
		ProductName : <input type="text" name="pname" value="<%= pb.getPname() %>" readonly><br>
		ProductCompany : <input type="text" name="pcompany" value="<%= pb.getPcompany() %>" readonly><br>
		ProductPrice : <input type="text" name="pprice" value="<%= pb.getPprice() %>" readonly><br>
		ProductQuantity : <input type="text" name="pqty" value="<%= pb.getPqty() %>" readonly><br>
		Product Req No : <input type="text" name="preqno" required> <br>
		<input type="submit" value="Buy">
		</form>
</h1>

</body>
</html>
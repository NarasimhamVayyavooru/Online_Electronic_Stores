<%@ page import="com.nt.customer.CustomerBean" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
<body>
<%
	CustomerBean cb=(CustomerBean)request.getAttribute("cbean");
%>
<h1><center>
Change Your Password Here : 
<form action="fpwd1" method="post">
	UserName:<input type="text" value="<%=cb.getcName()%>" name="uname" readonly><br>
	Enter NewPassword :<input type="password" name="pwd" required><br>
	<input type="submit" value="Submit"></h1>
</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>error page</title>
<link rel="stylesheet" type="text/css" href="style2.css">
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
}
	</style>
</head>
<body><center><h1><%
String s=(String)request.getAttribute("msg");
response.sendError(HttpServletResponse.SC_BAD_REQUEST,s);
 %>
 <%=s %>
 <br><a href="AddProduct.html">AddProduct</a><br>
	<a href="view1">ViewProduct</a><br>
	<a href="Logout.jsp">Logout</a><br>

</body>
</html>
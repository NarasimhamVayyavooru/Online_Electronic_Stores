<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>customerlogin.jsp</title>
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
<body>
<center><h1>

<%out.println(request.getAttribute("msg")); %><br>
<jsp:include page="CustomerLogin.html"></jsp:include><br>


</body>
</html>
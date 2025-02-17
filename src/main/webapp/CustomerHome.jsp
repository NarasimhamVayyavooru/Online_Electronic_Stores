<%@page import="com.nt.customer.CustomerBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>After Login Customer</title>
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
}
	</style>
</head>
<body>
    <div>
        <%
            CustomerBean cb = (CustomerBean) session.getAttribute("cbean");
            String msg = (String) request.getAttribute("msg");
            if (msg != null) {
        %><h2 style="color:red">
            <div class="login-message">
                <%= msg %>
            </div>
        <%
            }
        %></h2>
        <h1 style="color:green">
            Welcome <%= cb.getcFname() %>
        </h1>
        <div class="form-container">
            <a href="view2">View Electronics</a><br>
            <a href="Logout.jsp">Logout</a>
        </div>
    </div>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>After Logout</title>
<link rel="stylesheet" type="text/css" href="style5.css">
</head>
<body>

<div class="overlay"></div>

<div class="logout-container">
    <%
        session.invalidate();
    %>
    <h1>Logged Out Successfully</h1>
    <a href="index.html" class="btn">Go to HomePage</a>
</div>

</body>
</html>

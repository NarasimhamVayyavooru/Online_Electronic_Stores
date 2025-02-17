<%@page import="com.nt.pack1.ProductBean"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.nt.customer.CustomerBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer view Product page</title>
<link rel="stylesheet" type="text/css" href="styles.css">
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
<body style="text-align:center;">
<h1 style="color:orange">
<marquee behavior="alternate" direction="left" scrollamount="5" style="width: 98%;">
    <%
    CustomerBean cb = (CustomerBean) session.getAttribute("cbean");
    out.println(request.getAttribute("msg") + cb.getcFname() + " Buy Your Wish<br><br>");
    ArrayList<ProductBean> al = (ArrayList<ProductBean>) request.getAttribute("list");
    %>
    </marquee>
</h1>
<table>
    <thead>
        <tr>
            <th>Product Code</th>
            <th>Product Company</th>
            <th>Product Name</th>
            <th>Product Price</th>
            <th>Product Quantity</th>
            <th>Action</th>
        </tr>
    </thead>
    <tbody>
        <%
        for (ProductBean pb : al) {
        %>
        <tr>
            <td><%= pb.getpCode() %></td>
            <td><%= pb.getpCompany() %></td>
            <td><%= pb.getpName() %></td>
            <td><%= pb.getpPrice() %></td>
            <td><%= pb.getpQuantity() %></td>
            <td><a href='buy?pcode=<%= pb.getpCode() %>'>Buy</a></td>
        </tr>
        <%
        }
        %>
    </tbody>
</table>
</body>

</html>
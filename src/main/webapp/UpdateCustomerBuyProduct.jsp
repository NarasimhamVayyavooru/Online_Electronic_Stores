<%@ page import="com.nt.customer.BuyProductBean" %>
<%@ page import="com.nt.customer.CustomerBean" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <title>Order Confirmation</title>
    <link rel="stylesheet" type="text/css" href="style.css">
    
</head>
<body>
    <h1>Order Confirmed</h1>
    <div class="order-details">
        <%
            BuyProductBean productBean = (BuyProductBean) session.getAttribute("pb1");
            CustomerBean customerBean = (CustomerBean) session.getAttribute("cbean");
            
            if (customerBean != null) {
                out.println("<p>Hello, " + customerBean.getcFname() + "!</p>");
                out.println("<p>You have ordered: <strong>" + productBean.getPname() + "</strong></p>");
                out.println("<p>Order Quantity: <strong>" + request.getAttribute("reqno") + "</strong></p>");
                out.println("<p>Product Price: <strong>Rs " + productBean.getPprice() + "</strong></p>");
                out.println("<p>Total Charged: <strong>Rs " + request.getAttribute("total") + "</strong></p>");
                out.println("<p>Your order has been successfully placed!</p>");
                out.println("<p>Shop again soon for exclusive deals and unforgettable experiences!</p>");
            }
        %>
    </div>

    <div>
        <a href="view2">View More Products</a><br>
        <a href="Logout.jsp" class="logout-link">Logout</a>
    </div>
</body>
</html>

<%@page import="java.util.Iterator"%>
<%@page import="com.nt.pack1.AdminBean"%>
<%@page import="com.nt.pack1.ProductBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin view product page</title>
<link rel="stylesheet" type="text/css" href="styles.css">

</head>
<body style="background-image: url('viewelectronicspage.jpeg'); background-size: cover; background-position: center; background-repeat: no-repeat;">

<marquee behavior="alternate" direction="left" scrollamount="5" style="width: 100%;">
        <h1>
            <%
                AdminBean abean = (AdminBean) session.getAttribute("abean");
                out.println("<i>Hello " + abean.getaFname() + ", here are the details of your listed products!:<i>");
            %>
        </h1>
    </marquee>

    <%
        ArrayList<ProductBean> al = (ArrayList<ProductBean>) session.getAttribute("ProductsList");
        if (al != null && al.size() != 0) {
    %>
    
        <table>
            <thead>
                <tr>
                    <th>Product Code</th>
                    <th>Product Name</th>
                    <th>Product Company</th>
                    <th>Product Price</th>
                    <th>Product Quantity</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <%
                    Iterator<ProductBean> i = al.iterator();
                    while (i.hasNext()) {
                        ProductBean pb = i.next();
                %>
                <tr>
                    <td><%= pb.getpCode() %></td>
                    <td><%= pb.getpName() %></td>
                    <td><%= pb.getpCompany() %></td>
                    <td><%= pb.getpPrice() %></td>
                    <td><%= pb.getpQuantity() %></td>
                    <td>
                        <a href='Edit?pcode=<%= pb.getpCode() %>'>Edit</a> &nbsp;&nbsp;
                        <a href='delete?pcode=<%= pb.getpCode() %>'>Delete</a>
                    </td>
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>
        <%
            } 
            else {
                out.println("Products are NOT available!!!<br><br>");
            }
        %>
    
</body>

</html>
package com.nt.customer;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nt.pack1.ProductBean;

@WebServlet("/view2")
public class CustomerViewProductsServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		HttpSession session=req.getSession(false);
		if(session==null) 
		{
			req.setAttribute("msg", "session Expired!!");
			RequestDispatcher rd=req.getRequestDispatcher("CustomerLogin.html");
			rd.forward(req, res);
		}
		else {
		CustomerBean cb=(CustomerBean)session.getAttribute("cbean");
			System.out.println(cb.getcFname());
			ArrayList<ProductBean> al=new CustomerViewProductsDAO().viewProduct();
			if(al!=null) {
				//CustomerBean cb=(CustomerBean)session.getAttribute("cbean");
				req.setAttribute("msg", "Hello ");
				req.setAttribute("list", al);
				RequestDispatcher rd=req.getRequestDispatcher("CustomerViewProducts.jsp");
				rd.forward(req, res);
			}
		}
	}
	

}

package com.nt.customer;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/cls")
public class CustomerLoginServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException
	{
		CustomerBean cb=new CustomerLoginDAO().checkLogin(req.getParameter("cname"), req.getParameter("cpwd"));
		if(cb== null) 
		{
			req.setAttribute("msg", "Login Failed Give Correct Credentials");
			RequestDispatcher rd=req.getRequestDispatcher("CustomerLogin.jsp");
			rd.forward(req, res);
		
		}
		else 
		{
		HttpSession session=req.getSession();
		session.setAttribute("cbean", cb);
		req.setAttribute("msg", "Login Successful");
		req.setAttribute("cbean", cb);
		RequestDispatcher rd=req.getRequestDispatcher("CustomerHome.jsp");
		rd.forward(req, res);
		}
	}
	
}

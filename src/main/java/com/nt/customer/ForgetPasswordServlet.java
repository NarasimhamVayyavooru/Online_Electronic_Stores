package com.nt.customer;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/fpwd")
public class ForgetPasswordServlet extends HttpServlet{
	protected void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException
	{
		 CustomerBean cb=new ForgetPasswordDAO().findAccount(req.getParameter("mail"),req.getParameter("number"));
		if(cb==null) {
			req.setAttribute("msg","Enter Correct Email and Password");
			req.getRequestDispatcher("forgetPasswordInvalid.jsp").forward(req, res);
		}
		else
		{
			req.setAttribute("cbean", cb);
			req.setAttribute("msg", "Change your UserName and Password");
			req.getRequestDispatcher("forgetPasswordHome.jsp").forward(req, res);
		}
	}

}

package com.nt.customer;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/fpwd1")
public class ForgetPasswordHome extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException
	{
		int rowCount=new ForgetPasswordHomeDAO().changePwd(req.getParameter("uname"),req.getParameter("pwd"));
		if(rowCount>0) {
			req.setAttribute("msg", "Password Changed Successfully");
			req.getRequestDispatcher("CustomerLogin.jsp").forward(req, res);
		}
		else
		{
			req.setAttribute("msg", "Password Not Changed ");
			req.getRequestDispatcher("CustomerLogin.jsp").forward(req, res);
		}
	}

}

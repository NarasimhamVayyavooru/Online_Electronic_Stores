package com.nt.customer;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/crs")
public class CustomerRegisterServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException {
		CustomerBean cb=new CustomerBean();
		cb.setcName(req.getParameter("cname"));
		cb.setcPassword(req.getParameter("cpwd"));
		cb.setcFname(req.getParameter("cfname"));
		cb.setcLname(req.getParameter("clname"));
		cb.setcAddress(req.getParameter("caddr"));
		cb.setcMail(req.getParameter("cmail"));
		cb.setcPhone(req.getParameter("cpnbr"));
		int rowCount=new CustomerRegisterDAO().uploadDetails(cb);
		if(rowCount>0) {
			req.setAttribute("msg", "Registration Successful");
			RequestDispatcher rd=req.getRequestDispatcher("CustomerRegister.jsp");
			rd.forward(req, res);
			
		}
		else
			req.setAttribute("msg","Registration Failed ");
			RequestDispatcher rd=req.getRequestDispatcher("CustomerRegister.html");
			rd.forward(req, res);
		
	}

}

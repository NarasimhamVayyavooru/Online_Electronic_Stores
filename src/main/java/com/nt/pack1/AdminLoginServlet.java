package com.nt.pack1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/alog")
public class AdminLoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		AdminLoginDAO adao=new AdminLoginDAO();
		AdminBean abean=adao.reteriveData(req.getParameter("aname"),req.getParameter("apwd"));
		
		if(abean!=null) {
			//ServletContext context=req.getServletContext();
			//context.setAttribute("abean", abean );
			HttpSession session=req.getSession();
			session.setAttribute("abean", abean);
			RequestDispatcher rd=req.getRequestDispatcher("AdminHome.jsp");
			rd.forward(req, res);
		}
		else {
			req.setAttribute("msg","Invalid Credentials!!!");
			RequestDispatcher rd=req.getRequestDispatcher("AdminLogin.jsp");
			rd.forward(req, res);
		}
		
	}
	
}

package com.nt.customer;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nt.pack1.ProductBean;
@WebServlet("/buy")
public class CustomerBuyProductServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException ,ServletException
	{
		HttpSession session=req.getSession(false);
		if(session==null) {
			RequestDispatcher rd=req.getRequestDispatcher("CustomerLogin.html");
			rd.forward(req, res);
		}
		else {
			String pcode=req.getParameter("pcode");
			BuyProductBean pb=new CustomerBuyProductDAO().getProductDetails(pcode);
			if(pb !=null) {
				req.setAttribute("pbean", pb);
				session.setAttribute("pb1", pb);
			RequestDispatcher rd=req.getRequestDispatcher("CustomerBuyProduct.jsp");
			rd.forward(req, res);
			}
			else {
				throw new ServletException("BuyProductBean is Null");
			}
			
		}
	}
}

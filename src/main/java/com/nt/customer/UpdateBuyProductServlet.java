package com.nt.customer;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/updateproduct")
public class UpdateBuyProductServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		HttpSession session=req.getSession(false);
		if(session==null) 
		{
			req.setAttribute("msg", "session Expired!!");
			RequestDispatcher rd=req.getRequestDispatcher("CustomerLogin.html");
			rd.forward(req, res);
			return;
		}
		else 
		{
			int rowCount=0; 
			BuyProductBean pb=new BuyProductBean();
			int pqty=Integer.parseInt(req.getParameter("pqty")) ;
			int reqno=Integer.parseInt(req.getParameter("preqno"));
			if(pqty==0) {
				req.getRequestDispatcher("lessQuantity.jsp").forward(req, res);
			}
			if(pqty<reqno) {
				req.setAttribute("msg", "the Product Quantity is Less Please Choose Less quantity");
				RequestDispatcher rd=req.getRequestDispatcher("CustomerHome.jsp");
				rd.forward(req, res);
				return;
			}
			else 
			{
				pqty=pqty-reqno;
			rowCount=new UpdateBuyProductDAO().updateProduct(req.getParameter("pcode"),pqty);
			if(rowCount>0) {
				int price=Integer.parseInt(req.getParameter("pprice")) ;
				int total=price*reqno;
				session.setAttribute("pb", pb);
				req.setAttribute("total",total);
				req.setAttribute("reqno", reqno);
					RequestDispatcher rd=req.getRequestDispatcher("UpdateCustomerBuyProduct.jsp");
			rd.forward(req, res);
			}
			else
			{
				System.out.println("Data Not Updated");
			}
		
			}	
		}
	}
	
}

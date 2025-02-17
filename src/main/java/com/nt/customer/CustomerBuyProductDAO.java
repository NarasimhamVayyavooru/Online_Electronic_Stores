package com.nt.customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.nt.pack1.DBConnect;

public class CustomerBuyProductDAO 
{
	public BuyProductBean getProductDetails(String pcode) {
	BuyProductBean bpb=null;
	try {
		Connection con=DBConnect.getCon();
		PreparedStatement pstmt=con.prepareStatement("select * from product where pcode=?");
		pstmt.setString(1, pcode);
		ResultSet rs=pstmt.executeQuery();
		bpb=new BuyProductBean();
		if(rs.next()) {
			bpb.setPcode(rs.getString(1));
			bpb.setPname(rs.getString(2));
			bpb.setPcompany(rs.getString(3));
			bpb.setPprice(rs.getString(4));
			bpb.setPqty(rs.getString(5));
		}
		
		
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return bpb;
}
}

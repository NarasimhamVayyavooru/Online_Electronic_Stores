package com.nt.customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.nt.pack1.DBConnect;
import com.nt.pack1.ProductBean;

public class CustomerViewProductsDAO {
	public ArrayList<ProductBean> viewProduct() {
		ArrayList<ProductBean> al=null;
		try {
			Connection con=DBConnect.getCon();
			PreparedStatement pstmt=con.prepareStatement("select * from product");
			ResultSet rs=pstmt.executeQuery();
			 al=new ArrayList<ProductBean>();
			while(rs.next()) {
				ProductBean pbean=new ProductBean();
				
				pbean.setpCode(rs.getString(1));
				pbean.setpName(rs.getString(2));
				pbean.setpCompany(rs.getString(3));
				pbean.setpPrice(rs.getString(4));
				pbean.setpQuantity(rs.getString(5));
				al.add(pbean);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return al;
	}

}

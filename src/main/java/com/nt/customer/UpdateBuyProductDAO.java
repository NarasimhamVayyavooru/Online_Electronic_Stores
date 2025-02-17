package com.nt.customer;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.nt.pack1.DBConnect;

public class UpdateBuyProductDAO {
	public int updateProduct(String pcode,int pqty) {
		int rowCount=0;
		try {
			Connection con=DBConnect.getCon();
		PreparedStatement pstmt=con.prepareStatement("UPDATE product SET pqty = ? WHERE pcode = ?");
			
			pstmt.setString(1, String.valueOf(pqty));
			pstmt.setString(2,pcode);
			rowCount= pstmt.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return rowCount;
		
	}

}

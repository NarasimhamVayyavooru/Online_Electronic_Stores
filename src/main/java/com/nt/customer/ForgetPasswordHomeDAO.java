package com.nt.customer;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.nt.pack1.DBConnect;

public class ForgetPasswordHomeDAO {
	public int changePwd(String name,String pwd) {
		int rowCount=0;
		try {
			Connection con=DBConnect.getCon();
			PreparedStatement pstmt=con.prepareStatement("update customer set pword=? where uname=?");
			pstmt.setString(1, pwd);
			pstmt.setString(2,name);
		    rowCount=pstmt.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return rowCount;
		
	}

}

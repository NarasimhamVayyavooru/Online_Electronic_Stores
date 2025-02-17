package com.nt.customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.nt.pack1.DBConnect;

public class ForgetPasswordDAO {
	public CustomerBean findAccount(String email,String phno) {
		 CustomerBean cb=null;
		 try {
			 Connection con=DBConnect.getCon();
			 PreparedStatement pstmt=con.prepareStatement("select * from customer where mid=? and phno=?");
			 pstmt.setString(1, email);
			 pstmt.setString(2, phno);
			 ResultSet rs=pstmt.executeQuery();
			 if(rs.next()) {
				 cb=new CustomerBean();
				 cb.setcName(rs.getString(1));
				 cb.setcPassword(rs.getString(2));
				 cb.setcFname(rs.getString(3));
				 cb.setcLname(rs.getString(4));
				 cb.setcAddress(rs.getString(5));
				 cb.setcMail(rs.getString(6));
				 cb.setcPhone(rs.getString(7));
				 return cb;
			 }
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
		 return cb;
	}

}

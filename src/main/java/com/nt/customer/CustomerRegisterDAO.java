package com.nt.customer;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.nt.pack1.DBConnect;

public class CustomerRegisterDAO {
	
	public int uploadDetails(CustomerBean cb) {
		int rowCount=0;
		try {
			Connection con=DBConnect.getCon();
			PreparedStatement pstmt=con.prepareStatement("insert into customer values(?,?,?,?,?,?,?)");
			pstmt.setString(1, cb.getcName());
			pstmt.setString(2, cb.getcPassword());
			pstmt.setString(3, cb.getcFname() );
			pstmt.setString(4, cb.getcLname());
			pstmt.setString(5, cb.getcAddress());
			pstmt.setString(6, cb.getcMail() );
			pstmt.setString(7, cb.getcPhone());
			rowCount=pstmt.executeUpdate();
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return rowCount;
	}

}

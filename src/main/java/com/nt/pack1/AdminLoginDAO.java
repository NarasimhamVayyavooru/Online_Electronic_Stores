package com.nt.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminLoginDAO {
	public AdminBean reteriveData(String aUserName,String aPassword) {
		AdminBean ab=null;
		try {
			Connection con=DBConnect.getCon();
			PreparedStatement pstmt=con.prepareStatement("select * from admin where uname=? and pword=?");
			pstmt.setString(1,aUserName);
			pstmt.setString(2, aPassword);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				ab=new AdminBean();
				ab.setaUserName(rs.getString(1));
				ab.setaPassword(rs.getString(2));
				ab.setaFname(rs.getString(3));
				ab.setaLname(rs.getString(4));
				ab.setaAddress(rs.getString(5));
				ab.setaMailId(rs.getString(6));
				ab.setaPhoneNo(rs.getString(7));
				
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return ab;
	}
	

}

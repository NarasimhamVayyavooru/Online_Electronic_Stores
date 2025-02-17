package com.nt.customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpSession;
import javax.sql.RowSet;

import com.nt.pack1.DBConnect;

public class CustomerLoginDAO {
	public CustomerBean checkLogin(String cname,String cpwd) {
		CustomerBean cb=null;
		try {
			Connection con=DBConnect.getCon();
			PreparedStatement pstmt=con.prepareStatement("Select * from customer where uname=? and pword=?");
			pstmt.setString(1, cname);
			pstmt.setString(2, cpwd);
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
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return cb;
	}

}

package com.nt.customer;

import java.io.Serializable;

public class CustomerBean implements Serializable{
	private String cName,cPassword,cFname,cLname,cAddress,cMail,cPhone;

	public CustomerBean() {}
	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcPassword() {
		return cPassword;
	}

	public void setcPassword(String cPassword) {
		this.cPassword = cPassword;
	}

	public String getcFname() {
		return cFname;
	}

	public void setcFname(String cFname) {
		this.cFname = cFname;
	}

	public String getcLname() {
		return cLname;
	}

	public void setcLname(String cLname) {
		this.cLname = cLname;
	}

	public String getcAddress() {
		return cAddress;
	}

	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}

	public String getcMail() {
		return cMail;
	}

	public void setcMail(String cMail) {
		this.cMail = cMail;
	}

	public String getcPhone() {
		return cPhone;
	}

	public void setcPhone(String cPhone) {
		this.cPhone = cPhone;
	}
	

}

package com.nt.customer;

import java.io.Serializable;

public class BuyProductBean implements Serializable
{
	private String pcode,pname,pcompany,pprice,pqty, preqno;
	public BuyProductBean() {}
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPcompany() {
		return pcompany;
	}
	public void setPcompany(String pcompany) {
		this.pcompany = pcompany;
	}
	public String getPprice() {
		return pprice;
	}
	public void setPprice(String pprice) {
		this.pprice = pprice;
	}
	public String getPqty() {
		return pqty;
	}
	public void setPqty(String pqty) {
		this.pqty = pqty;
	}
	public String getPreqno() {
		return preqno;
	}
	public void setPreqno(String preqno) {
		this.preqno = preqno;
	}

	
}

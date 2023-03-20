package com.tns.constructor;

public class Customer {
	private String customername;
	private int customerid;
	private String customercity;
	//parameterized constructor
	public Customer(String customername, int customerid, String customercity) {
		this.customername = customername;
		this.customerid = customerid;
		this.customercity = customercity;
	}
	//Default constructor
	public Customer() {
		
	}
	//getters and setters 
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomercity() {
		return customercity;
	}
	public void setCustomercity(String customercity) {
		this.customercity = customercity;
	}
	

}

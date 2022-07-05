package com.training.model;

import java.util.Date;

public class Customer {
private String customername;
private int customeramount;
private String paymentdate;
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
public Customer(String customername, int customeramount, String date) {
	super();
	this.customername = customername;
	this.customeramount = customeramount;
	this.paymentdate = date;
}
public String getCustomername() {
	return customername;
}
public void setCustomername(String customername) {
	this.customername = customername;
}
public int getCustomeramount() {
	return customeramount;
}
public void setCustomeramount(int customeramount) {
	this.customeramount = customeramount;
}
public String getPaymentdate() {
	return paymentdate;
}
public void setPaymentdate(String paymentdate) {
	this.paymentdate = paymentdate;
}
@Override
public String toString() {
	return "Customer [customername=" + customername + ", customeramount=" + customeramount + ", paymentdate="
			+ paymentdate + "]";
}
}

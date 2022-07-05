package com.bank.server.request;

public class BankClass {
	
	double balance ;
	double withdraw;
	
	public double whithdraw(double withdraw) {
		this.balance-=withdraw;
		return balance;
	}
	
	public BankClass( ) {
		this.balance = 100000;
		toString();
	}

	@Override
	public  String toString() {
		return "Bankbalance [Your balance=" + balance+"]";
	}
	
}

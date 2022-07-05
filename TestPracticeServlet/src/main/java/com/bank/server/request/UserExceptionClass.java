package com.bank.server.request;

public class UserExceptionClass extends Exception{
	
	String cardException() {
		
		return "UnkownCardException";
	}
	
	String pinException() {
		
		return "InvalidPin";
	}

}

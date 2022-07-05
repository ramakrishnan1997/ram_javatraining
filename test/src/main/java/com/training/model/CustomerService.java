package com.training.model;

import java.util.List;

import com.training.intface.CustomerRepository;

public class CustomerService {
private CustomerRepository<Customer> payment;

public CustomerService() {
	super();
	// TODO Auto-generated constructor stub
}
public Customer add(Customer t) {
	return this.payment.add(t);
	
}
public List<Customer> duetime()
{
	return this.payment.duetime();
	
}
public List<Customer> customername(String customername)
{
	return this.payment.customername(customername);
	
}
public List<Customer> findbyamount(int amount) {
	
	return this.payment.findbyamount(amount);
}
public List<Customer> findAll() {
	// TODO Auto-generated method stub
	return this.payment.findAll();
}
}

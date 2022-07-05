package com.training.model;

import java.util.ArrayList;
import java.util.List;

import com.training.intface.CustomerRepository;

public class CustomRepository implements CustomerRepository<Customer>{
 private List<Customer> customerlist;
	public CustomRepository() {
		super();
		this.customerlist=new ArrayList<Customer>();
	}

	@Override
	public Customer add(Customer t) {
		boolean added=this.customerlist.add(t);
	
		if(added)
		{
			return t;
		}
		return null;
	}

	@Override
	public List<Customer> duetime() {
		
		return this.customerlist;
	}

	@Override
	public List<Customer> customername(String customername) {
		
		return null;
	}

	@Override
	public List<Customer> findbyamount(int amount) {
		
		return this.customerlist;
	}

	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return this.customerlist;
	}

}

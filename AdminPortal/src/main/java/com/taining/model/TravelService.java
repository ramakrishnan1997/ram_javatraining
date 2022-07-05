package com.taining.model;

import java.sql.Connection;

import com.taining.intface.TravelRepository;

public class TravelService {

	private TravelRepository<Travel> repo;
	 private Connection con;
	public TravelService(Connection con) 
	{
		super();
		this.con=con;
		this.repo= new TravelDB(con);
	}
	public Travel add(Travel t)
	{
		return this.repo.add(t);
		
	}
	
}

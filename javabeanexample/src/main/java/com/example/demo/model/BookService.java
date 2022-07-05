package com.example.demo.model;

import java.sql.*;
import java.util.Arrays;
import java.util.List;

public class BookService {

	
	
	private CrudRepository<Book> repo;
 private Connection con;
	public BookService(Connection con) {
		super();
		// TODO Auto-generated constructor stub
//		this.booklist=Arrays.asList(new Book(1010,"Head First Java","Kathy Sieera",45.0),
//		new Book(1011,"Head First Java","Kathy Sieera",45.9));
		this.con=con;
		this.repo=new DBBookRepository(con);
	}
	public List<Book> findAll()
	{
	//	this.repo.add(new Book(1011,"Head First Java","Kathy Sieera",45.9));
		return this.repo.findAll();
	}
	public Book add(Book entity)
	{
		return this.repo.add(entity);
	}
	public Book remove(int id)
	{
		return this.repo.removebyId(id);
	}
	public Book findById(int id)
	{
		return this.repo.findById(id);
	}
	public Book update(Book t)
	{
		return this.repo.update(t);
	}
}

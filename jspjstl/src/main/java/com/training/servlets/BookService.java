package com.training.servlets;

import java.util.Arrays;
import java.util.List;

public class BookService {

	
	
	private CrudRepository<Book> repo;

	public BookService() {
		super();
		// TODO Auto-generated constructor stub
//		this.booklist=Arrays.asList(new Book(1010,"Head First Java","Kathy Sieera",45.0),
//		new Book(1011,"Head First Java","Kathy Sieera",45.9));
		this.repo=new BookRepository();
	}
	public List<Book> findAll()
	{
		return this.repo.findAll();
	}
	public Book add(Book entity)
	{
		return this.repo.add(entity);
	}
	
}

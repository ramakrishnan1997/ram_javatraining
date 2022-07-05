package com.training.servlets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookRepository implements CrudRepository<Book>{

	private List<Book> booklist;
	
	public BookRepository() {
		super();
		// TODO Auto-generated constructor stub
//		this.booklist=Arrays.asList(new Book(1010,"Head First Java","Kathy Sieera",45.0),
//				new Book(1011,"Head First Java","Kathy Sieera",45.9));
		this.booklist=new ArrayList<Book>();
	}

	@Override
	public Book add(Book t) {
		// TODO Auto-generated method stub
		
		boolean isAdded=this.booklist.add(t);
		if(isAdded)
		{
			return t;
		}
		else
		{
			return null;
		}
		
		
		
	}

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return this.booklist;
	}

}

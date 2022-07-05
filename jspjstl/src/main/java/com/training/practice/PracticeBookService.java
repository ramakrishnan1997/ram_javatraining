package com.training.practice;

import java.util.List;

public class PracticeBookService {
private PracticeCrud<PracticeBook> repo;

public PracticeBookService() {
	super();
	
	this.repo=new PracticeBookCrud();
}
public List<PracticeBook> findAll()
{
	return this.repo.findAll();
	
}
public PracticeBook add(PracticeBook entity)
{
	return this.repo.add(entity);
	
}
public List<PracticeBook>findname(String bookname)
{
	return this.repo.findname(bookname);
	
}
}

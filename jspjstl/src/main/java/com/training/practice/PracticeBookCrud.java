package com.training.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PracticeBookCrud implements PracticeCrud<PracticeBook>{
private List<PracticeBook> booklist;
	public PracticeBookCrud() {
	super();

	this.booklist=new ArrayList<PracticeBook>();
}

	@Override
	public PracticeBook add(PracticeBook t) {
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
	public List<PracticeBook> findAll() {
		
		return this.booklist;
	}

	@Override
	public List<PracticeBook> findname(String bookname) {
		Optional<PracticeBook> found=this.booklist.stream().filter(e -> e.getBookname().equals(bookname)).findFirst();
		return (List<PracticeBook>) found.get();
	}

	

}

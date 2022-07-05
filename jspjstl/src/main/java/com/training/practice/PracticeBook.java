package com.training.practice;

public class PracticeBook {
private String authorname;
private String bookname;
private int booknumber;
private int cost;
public PracticeBook(String authorname, String bookname, int booknumber, int cost) {
	super();
	this.authorname = authorname;
	this.bookname = bookname;
	this.booknumber = booknumber;
	this.cost = cost;
}
public PracticeBook() {
	super();
	// TODO Auto-generated constructor stub
}

public String getAuthorname() {
	return authorname;
}
public void setAuthorname(String authorname) {
	this.authorname = authorname;
}
public String getBookname() {
	return bookname;
}
public void setBookname(String bookname) {
	this.bookname = bookname;
}
public int getBooknumber() {
	return booknumber;
}
public void setBooknumber(int booknumber) {
	this.booknumber = booknumber;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
@Override
public String toString() {
	return "PracticeBook [authorname=" + authorname + ", bookname=" + bookname + ", booknumber=" + booknumber
			+ ", cost=" + cost + "]";
}

}

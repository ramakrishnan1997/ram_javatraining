package com.training.servlets;

public class Book {
private int booknumber;
private String bookName;
private String authorName;
private double price;
public Book() {
	super();
	// TODO Auto-generated constructor stub
}
public Book(int bookumber, String bookName, String authorName, double price) {
	super();
	this.booknumber = bookumber;
	this.bookName = bookName;
	this.authorName = authorName;
	this.price = price;
}

public int getBookumber() {
	return booknumber;
}
public void setBookumber(int bookumber) {
	this.booknumber = bookumber;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public String getAuthorName() {
	return authorName;
}
public void setAuthorName(String authorName) {
	this.authorName = authorName;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Book [bookumber=" + booknumber + ", bookName=" + bookName + ", authorName=" + authorName + ", price=" + price
			+ "]";
}
}

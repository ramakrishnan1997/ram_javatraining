package com.example.demo.model;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

public class DBBookRepository implements CrudRepository<Book>{
	
	private Connection con;
int rowAdded=0;
int rowUpdate=0;
	public DBBookRepository(Connection con) {
		super();
		this.con = con;
	}

	@Override
	public Book add(Book t) {
		String sql="insert into book(booknumber,bookname,authorname,price) values(?,?,?,?)";
		try(PreparedStatement pstmt=con.prepareStatement(sql);)
		{
			
			pstmt.setInt(1,t.getBookNumber());
			pstmt.setString(2, t.getBookName());
			pstmt.setString(3,t.getAuthorName());
			pstmt.setDouble(4,t.getPrice());
			 rowAdded =pstmt.executeUpdate();
		}
		catch (Exception e)
		{
		e.printStackTrace();	
		}
		return rowAdded==1?t:null;
	}

	@Override
	public List<Book> findAll() {
		String sql="select * from book";
		List<Book> booklist =new ArrayList<>();
		try(PreparedStatement pstmt=con.prepareStatement(sql);)
		{
			
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
			{
				int booknumber=rs.getInt("booknumber");
				String bookname=rs.getString("bookname");
				String authorname=rs.getString("authorname");
				double price=rs.getDouble("price");
				Book eachBook= new Book(booknumber,bookname,authorname,price);
				booklist.add(eachBook);
			}
		}
		catch (Exception e) {
			
		}
		return booklist;
	}
	@Override
	public Book removebyId(int id) {
		int rowDelete=0;
		String sql="delete from book where booknumber=?";
		try {
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, id);
			rowDelete = pstmt.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return rowDelete==1? findById(id):null;
	}
	public  Book findById(int id)
	{
		String sql="select * from book where booknumber=?";
		Book foundbook=null;
		try(PreparedStatement pstmt=con.prepareStatement(sql);)
		{
			pstmt.setInt(1, id);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
			{
				int booknumber=rs.getInt("booknumber");
				String bookname=rs.getString("bookname");
				String authorname=rs.getString("authorname");
				double price=rs.getDouble("price");

				foundbook=new Book(booknumber,bookname,authorname,price);
			}
		}
		catch (Exception e) {
			
		}
		return foundbook;
	}

	@Override
	public Book update(Book t) {
		String sql="update book set bookname=?,authorname=?,price=? where booknumber=?";
		try(PreparedStatement pstmt=con.prepareStatement(sql);)
		{
			
			pstmt.setInt(4,t.getBookNumber());
			pstmt.setString(1, t.getBookName());
			pstmt.setString(2,t.getAuthorName());
			pstmt.setDouble(3,t.getPrice());
			rowUpdate =pstmt.executeUpdate();
		}
		catch (Exception e)
		{
		e.printStackTrace();	
		}
		return rowUpdate==1?t:null;	}

	@Override
	public Book remove(Book t) {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.taining.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.jasper.tagplugins.jstl.core.Catch;

import com.taining.intface.TravelRepository;

public class TravelDB implements TravelRepository<Travel>{
	private Connection con;
	int rowAdded=0;
	Travel travel=null;
	public TravelDB(Connection con) {
		super();
		this.con=con;
	}

	public Travel add(Travel t) {
		String sql="insert into travel values(?,?,?,?,?,?,?)";
		try(PreparedStatement pstmt=con.prepareStatement(sql);)
		{
			
			pstmt.setString(1,t.getUsername());
			pstmt.setString(2, t.getName());
			pstmt.setString(3,t.getPhoneno());
			pstmt.setString(4,t.getPassword());
			pstmt.setString(5,t.getEmail());
			pstmt.setInt(6,t.getAge());
			pstmt.setString(7,t.getGender());
			 rowAdded =pstmt.executeUpdate();
		}
		catch (Exception e)
		{
		e.printStackTrace();	
		}
		return rowAdded==1?t:null;
		
	}

	@Override
	public Travel findbyname(String username) {
		
		String sql="select * from travel where username=?";
		try(PreparedStatement pstmt=con.prepareStatement(sql);)
		{
			pstmt.setString(1, username);
			ResultSet rs=pstmt.executeQuery();
		while(rs.next())
		{
			String username1=rs.getString("username");
			String name=rs.getString("name");
			String phoneno=rs.getString("phoneno");
			String email=rs.getString("email");
			String password=rs.getString("password");
			int age=rs.getInt("age");
			String gender=rs.getString("gender");
			travel =new Travel(username1,name,phoneno,email,password,age,gender);
		}
		}
		catch (Exception e)
		{
		e.printStackTrace();	
		}
		return travel;
	

}
}

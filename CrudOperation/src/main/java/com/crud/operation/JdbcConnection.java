package com.crud.operation;

import java.sql.*;

public class JdbcConnection {

	public static int save(Employee e) throws ClassNotFoundException {
		int flag = 0;

		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/vastpro", "postgres",
					"postgres");
			PreparedStatement st = con.prepareStatement("insert into employee values (?,?) ");
			st.setString(1, e.getId());
			st.setString(2, e.getName());
			flag = st.executeUpdate();
			con.close();
		} catch (SQLException ea) {
			System.out.println("prepared error");
		}

		return flag;
	}
	
	public static int delete(Employee e)throws ClassNotFoundException{
		int flag = 0;
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/vastpro", "postgres",
					"postgres");
			PreparedStatement st = con.prepareStatement("delete from employee where id=? ");
			st.setString(1, e.getId());
			
			flag = st.executeUpdate();
			con.close();
		} catch (SQLException ea) {
			System.out.println("prepared error");
		}
		return flag;
	}
	public static int Update(Employee e)throws ClassNotFoundException{
		int flag = 0;
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/vastpro", "postgres",
					"postgres");
			PreparedStatement st = con.prepareStatement("update employee set name=? where id=? ");
			
			st.setString(1, e.getName());
			st.setString(2, e.getId());
			flag = st.executeUpdate();
			con.close();
		} catch (SQLException ea) {
			System.out.println("prepared error");
		}
		return flag;
	}
	public static void read(Employee e)throws ClassNotFoundException{
		
		
	}

}

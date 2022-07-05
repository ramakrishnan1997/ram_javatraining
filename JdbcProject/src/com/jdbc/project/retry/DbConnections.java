package com.jdbc.project.retry;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbConnections {
	
	public final static String DB_DRIVER_CLASS="org.postgresql.Driver";
	private static String DB_URL ="jdbc:postgresql://localhost:5432/vastpro";
	private static String USER ="postgres";
	private static String PASS="postgres";
	private static String INSERT="insert into employee values(?,?)";
	
	public static Connection getConection() throws SQLException, ClassNotFoundException {
		Class.forName(DB_DRIVER_CLASS);
		Connection con =DriverManager.getConnection(DB_URL, USER, PASS);
		return con;
	}
	
	public static void insert(Connection con,int id,String name) throws SQLException {
		PreparedStatement st=null;
		st = con.prepareStatement(INSERT);
		st.setInt(1, id);
		st.setString(2, name);
		st.execute();
		con.close();
		System.out.println("inserted");
	}

}

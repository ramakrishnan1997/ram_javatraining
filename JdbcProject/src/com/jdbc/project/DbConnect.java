package com.jdbc.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbConnect {

	public final static String DB_DRIVER_CLASS = "org.postgresql.Driver";
	private static String DB_URL = "jdbc:postgresql://localhost:5432/vastpro";
	private static String DB_USER = "postgres";
	private static String DB_PASSWORD = "postgres";
	private static String INSERT = "Select * from employee where id=?";

	public static Connection getConnnection() {
		Connection con = null;
		try {
			Class.forName(DB_DRIVER_CLASS);
		} catch (ClassNotFoundException e) {
			System.out.println("Class NOt Loaded");
		}

		try {
			con = (Connection) DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
		} catch (SQLException e) {
			System.out.println("Get connection not connected");
		}
		return con;
	}
	
	public static void insert(Connection con, int id) throws SQLException {
		PreparedStatement st=null;
		st = con.prepareStatement(INSERT);
		st.setInt(1, id);
		ResultSet rs =st.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" - "+rs.getString(2));
		}
		
	}
}

package com.servlet.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CrudDbCnnection {
	
	

	public static Connection getConnnection() {
		Connection con = null;
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Class NOt Loaded");
		}

		try {
			con = (Connection) DriverManager.getConnection("jdbc:postgresql://localhost:5432/vastpro", "postgres", "postgres");
		} catch (SQLException e) {
			System.out.println("Get connection not connected");
		}
		return con;
	}
	
	

}

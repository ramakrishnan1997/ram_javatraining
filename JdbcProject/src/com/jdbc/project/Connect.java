package com.jdbc.project;

import java.sql.*;

public class Connect {
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("org.postgresql.Driver");
		Connection con =DriverManager.getConnection("jdbc:postgresql://localhost:5432/vastpro", "postgres", "postgres");
		return con;
	}

}

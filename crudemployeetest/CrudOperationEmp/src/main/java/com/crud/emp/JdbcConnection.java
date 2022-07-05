package com.crud.emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection con=null;
		Class.forName("org.postgresql.Driver");
		con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/vastpro","postgres","postgres");
		return con;
	}

}

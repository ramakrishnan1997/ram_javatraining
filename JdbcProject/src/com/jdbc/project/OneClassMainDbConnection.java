package com.jdbc.project;


import java.sql.*;

public class OneClassMainDbConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = Connect.getConnection();
		PreparedStatement st=con.prepareStatement("select * from employee");
 		ResultSet rs =st.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString(2));
		}
		
		
	}
	
	
	
	 

}

package com.jdbc.project.retry;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class MainConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection con = DbConnections.getConection();
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the id");
		int id=s.nextInt();
		System.out.println("Enter the name");
		String name =s.next();
		DbConnections.insert(con, id, name);
	}

}

package com.jdbc.project;

import java.sql.Connection;
import java.util.Scanner;

public class JdbcConnection {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		try {
			Connection con = DbConnect.getConnnection();
			System.out.println("Enter the Id ");
			int id =s.nextInt();
			DbConnect.insert(con, id);
		
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}

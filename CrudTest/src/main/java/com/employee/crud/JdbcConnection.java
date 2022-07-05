package com.employee.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcConnection {

	public static int  insert(Employee e) throws ClassNotFoundException, SQLException {
		int flag=0;
		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/vastpro", "postgres",
				"postgres");
		PreparedStatement st =con.prepareStatement("insert into employee(empid,name,age,designation,phone,salary) values (?,?,?,?,?,?)");
		st.setString(1, e.getEmpId());
		st.setString(2, e.getName());
		st.setString(3, e.getAge());
		st.setString(4, e.getDesignation());
		st.setString(5, e.getPhone());
		st.setString(6, e.getSalary());
		flag =st.executeUpdate();
		return flag;
	}

}

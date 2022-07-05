package com.crud.emp;

import java.sql.*;
import java.util.ArrayList;

public class CrudOperation {
	public static int insert(Employee e) throws ClassNotFoundException, SQLException {
		int flag =0;
		Connection con =JdbcConnection.getConnection();
		PreparedStatement st =con.prepareStatement("insert into employee(empid,name,age,designation,phone,salary) values (?,?,?,?,?,?)");
		st.setString(1, e.getEmpId());
		st.setString(2, e.getName());
		st.setString(3, e.getAge());
		st.setString(4, e.getDesignation());
		st.setString(5, e.getPhone());
		st.setString(6, e.getSalary());
		flag = st.executeUpdate();
		return flag;
	}
	
	public static int delete(Employee e) throws ClassNotFoundException, SQLException {
		int flag =0;
		Connection con =JdbcConnection.getConnection();
		PreparedStatement st =con.prepareStatement("delete from employee  where empid=?");
		st.setString(1, e.getEmpId());
		flag = st.executeUpdate();
		return flag;
	}
	
	public static int update(Employee e) throws ClassNotFoundException, SQLException {
		int flag =0;
		Connection con =JdbcConnection.getConnection();
		PreparedStatement st =con.prepareStatement("update employee set salary=?,designation=? where empid=?");
		
		st.setString(1, e.getSalary());
		st.setString(2, e.getDesignation());
		st.setString(3, e.getEmpId());
		
		
		flag = st.executeUpdate();
		return flag;
	}
//	public static ArrayList<Employee> list(Employee e) throws ClassNotFoundException, SQLException {
//		int flag =0;
//		ArrayList<Employee> list =new ArrayList<Employee>();
//		Connection con =JdbcConnection.getConnection();
//		PreparedStatement st =con.prepareStatement("select * from employee");
//		ResultSet rs=st.executeQuery();
//		while(rs.next()) {
//			String id=rs.getString(1);
//			String name=rs.getString(2);
//			String age=rs.getString(3);
//			String designation=rs.getString(4);
//			String phone=rs.getString(5);
//			String salary=rs.getString(6);
//			Employee a=new Employee(id,name,age,designation,phone,salary);
//			
//			list.add(a);
//			
//			
//		}
//		return list;
		
		
		
	

}

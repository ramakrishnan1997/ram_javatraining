package com.crud.emp;

public class Employee {
	
	String empId;
	String name;
	String age;
	String designation;
	String phone;
	String salary;
	public Employee() {
		
	}
	
	public Employee(String empId, String name, String age, String designation, String phone, String salary) {
		this.empId = empId;
		this.name = name;
		this.age = age;
		this.designation = designation;
		this.phone = phone;
		this.salary = salary;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", age=" + age + ", designation=" + designation
				+ ", phone=" + phone + ", salary=" + salary + "]";
	}


}

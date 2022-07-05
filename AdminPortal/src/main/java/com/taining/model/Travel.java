package com.taining.model;

public class Travel {
private String username;
private String name;
private String phoneno;
private String email;
private String password;
private int age;
private String gender;
public Travel() {
	super();
	// TODO Auto-generated constructor stub
}
public Travel(String username, String name, String phoneno, String email, String password, int age, String gender) {
	super();
	this.username = username;
	this.name = name;
	this.phoneno = phoneno;
	this.email = email;
	this.password = password;
	this.age = age;
	this.gender = gender;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPhoneno() {
	return phoneno;
}
public void setPhoneno(String phoneno) {
	this.phoneno = phoneno;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
@Override
public String toString() {
	return "Travel [username=" + username + ", name=" + name + ", phoneno=" + phoneno + ", email=" + email
			+ ", password=" + password + ", age=" + age + ", gender=" + gender + "]";
}

}

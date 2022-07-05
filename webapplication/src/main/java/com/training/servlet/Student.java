package com.training.servlet;

public class Student {
	private int rollnumber;
	private String studentName;
	private String strMark;
public Student(int rollnumber,String studentName,String strMark)
{
	this.rollnumber=rollnumber;
	this.studentName=studentName;
	this.strMark=strMark;
}
public int getRollnumber() {
	return rollnumber;
}
public void setRollnumber(int rollnumber) {
	this.rollnumber = rollnumber;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getStrMark() {
	return strMark;
}
public void setStrMark(String strMark) {
	this.strMark = strMark;
}

}

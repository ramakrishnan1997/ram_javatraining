package com.assessment.hr;

public class Circle {
	int radius;
	Double sum ;
	
	
	public Circle(int radius) {
		this.radius=radius;
	}
	public void getArea() {
		sum = 3.14*radius*radius;
	}
	 public void printinfo() {
		 System.out.println("Area Circlr "+sum);
		 System.out.println("radius"+radius);
	 }
	
	

}

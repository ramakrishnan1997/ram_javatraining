package com.assessment.hr.two;

import java.util.Date;
import java.util.Objects;

public class Car {
	static int count=0;  
	
	private int reg;
	private String model;
	private Date date;
	
	public Car(int reg, String model, Date date) {	
		this.reg = reg;
		this.model = model;
		this.date = date;
		
	}

	@Override
	public String toString() {
		return "Car [reg=" + reg + ", model=" + model + ", date=" + date + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, model, reg);
		
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(date, other.date) && Objects.equals(model, other.model) && reg == other.reg;
	}

	public int getReg() {
		return reg;
	}

	public void setReg(int reg) {
		this.reg = reg;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void count() {
		count++;
		
	}

	public static void counts() {
		System.out.println("Number of Objects created = "+count);
	}

}

package com.assessment.hr.two;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

public class MainMethode {
	
	public static void main(String[] args) throws IOException {
		Date a = new Date();

		Car ab = new Car(1244, "hatchback", a);
		ab.count(); 
		Car ab1 = new Car(12444, "SUV", a);
		Car ab2 = new Car(124434, "SUV", a);
		Car ab3 = new Car(124434, "Sedan", a);
		 
		ab1.count();  
		ab2.count();  
		ab3.count();  
		
		Car.counts();

		System.out.println(ab.equals(ab));

		System.out.println(ab.toString());

		System.out.println(ab.hashCode());
		
		System.out.println(ab1.equals(ab1));

		System.out.println(ab1.toString());

		System.out.println(ab1.hashCode());
		System.out.println(ab2.equals(ab2));

		System.out.println(ab2.toString());

		System.out.println(ab2.hashCode());
		System.out.println(ab3.equals(ab3));

		System.out.println(ab3.toString());

		System.out.println(ab3.hashCode());
//		Properties p= new Properties();
//		FileWriter fw =new FileWriter("obj.properties");
//		p.setProperty(null, null)

	}

}

package com.jdbc.project.retry;

import java.io.*;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class ArrayList {

	public static void main(String[] args) throws IOException {
		
//		Properties a =new Properties();
//		FileReader fw =new FileReader("demo/text.properties");
//		a.load(fw);
//		String anme =(String)a.get("user");
//		System.out.println(anme);
		
		Properties a =new Properties();
		FileWriter fw =new FileWriter("demo/text.properties");
		a.setProperty("user", "Aju4");
		a.store(fw, "Saved");
		fw.close();
		System.out.println("Saved Successfull");
		
		

	}

}

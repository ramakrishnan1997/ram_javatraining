package com.assessment.hr.two;

import java.io.*;

public class FirstProgram {

	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader("demo/input.txt");
			BufferedReader br = new BufferedReader(fr);
			
			
			//FileWriter fw = new FileWriter("demo/output.txt", true);
			String s;

			
			while ((s = br.readLine()) != null) { 
				
				if(s.contains("Error")) {
					FileWriter fw = new FileWriter("demo/contains.txt", true);
					fw.write(s); 
					fw.flush();
					fw.close();
				}else {
					FileWriter fw = new FileWriter("demo/notcontains.txt", true);
					fw.write(s); 
					fw.flush();
					fw.close();
				}
			}
			br.close();
			
                        System.out.println("file copied");
                        
                        
                        
                        
		}catch (FileNotFoundException e) {
			
			System.out.println("File not found exception");
		} catch (IOException e) {
			
			System.out.println("io exception");
		}
		
	     
     

	}

}

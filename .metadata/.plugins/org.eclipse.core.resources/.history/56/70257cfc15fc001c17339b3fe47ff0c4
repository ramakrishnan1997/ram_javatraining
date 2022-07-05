package com.assessment.hr.two;

import java.io.*;


public class Stream {

	public static void main(String[] args) throws IOException {
		
		InputStream is = null;
        OutputStream os = null;
        try {
        	String imagae="/home/vastpro/newdir/logo.png";
        	is = new FileInputStream(imagae);
        	if(imagae.contains(".png") || imagae.contains(".jpg")|| imagae.contains(".gif")) {
        		
                
                os = new FileOutputStream("demo/arulogo.png");
                
               

                byte[] buf = new byte[1024];

                int bytesRead;
                while ((bytesRead = is.read(buf)) > 0) {
                    os.write(buf, 0, bytesRead);
                }
                is.close();
                os.close();
            } 
                
                else {
            		System.out.println("it is not a image file");
            	}
    		
        	}finally {
        		
        	}
            
		
		
		
		
				
		

	}

}

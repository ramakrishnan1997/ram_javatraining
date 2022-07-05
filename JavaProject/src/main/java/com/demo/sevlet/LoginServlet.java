package com.demo.sevlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter obj =response.getWriter();
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		
//		if((name == "") || (pass == "")) {
//			response.sendRedirect("http://localhost:8080/JavaProject/index.html");
//		}else {
//			obj.println("User Name "+name);
//			obj.println("Password "+pass);
//			obj.println("User Address "+address);
//			obj.println("User Phone Number "+phone);
//		}
		
//		HttpSession mySession = request.getSession();
//		 mySession.setAttribute("user", name);
		 
		
		 
		
	     
	    
		if(pass.length()<7){
			obj.print("Password lenth should be more than 7");
		}	
		else if(! pass.matches(".*[0-9]{1,}.*")) {
			obj.print("Password should Contain atleast one digit");
		}else{
			obj.println("User Name "+name);
			obj.println("Password "+pass);
			obj.println("User Address "+address);
			obj.println("User Phone Number "+phone);
		}
		
		
//		Enumeration oj= request.getParameterNames();
//		while(oj.hasMoreElements()) {
//			String a=(String) oj.nextElement();
//			obj.print(a);
//			String[] re = request.getParameterValues(a);
//			
//			for(int i=0;i<re.length;i++) {
//				obj.println(re[i]);
//			}
//			
//		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

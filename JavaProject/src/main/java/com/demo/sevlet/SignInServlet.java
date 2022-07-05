package com.demo.sevlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignInServlet
 */
@WebServlet("/SignInServlet")
public class SignInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}

	/**
     * @see HttpServlet#HttpServlet()
     */
    public SignInServlet() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter obj = response.getWriter();
//		response.sendRedirect("https://www.w3schools.com/tags/ref_attributes.asp");
		obj.print("Signin Servlet");
//		RequestDispatcher rd = request.getRequestDispatcher("/HomeServlet");
//		rd.forward(request, response);
//		ServletContext sc = getServletContext();
//		String a=sc.getInitParameter("Name");
//		obj.println(a);
//		ServletConfig sc= getServletConfig();
//		String a=sc.getInitParameter("config");
//		obj.println(a);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

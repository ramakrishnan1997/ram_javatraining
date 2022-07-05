package com.training.servlet;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/one")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String action=request.getServletPath();
	//	System.out.println("Action :"+action);
		switch (action) {
		case "/one": 
			welcomePage(request,response);
			break;
		case "/add":
			addPage(request,response);
			break;
		case "/show":
			showPage(request,response);
			break;
			default:
				break;
		}
		}
		
	private void addPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("heading","Gandhi School");
			RequestDispatcher rd =request.getRequestDispatcher("/addStudent.jsp");
			rd.forward(request, response);
		
	}

	
	private void showPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("heading","Gandhi School");
		String strRollnumber=request.getParameter("rollnumber");
		int rollnumber=Integer.parseInt(strRollnumber);
		String studentName=request.getParameter("studentName");
		String strMark=request.getParameter("mark");
		Student obj=new Student(rollnumber,studentName,strMark);
		request.setAttribute("student", obj);
			RequestDispatcher rd =request.getRequestDispatcher("/showStudent.jsp");
			rd.forward(request, response);
		
	}

	private void welcomePage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("heading","Gandhi School");
			RequestDispatcher rd =request.getRequestDispatcher("/home.jsp");
			rd.forward(request, response);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

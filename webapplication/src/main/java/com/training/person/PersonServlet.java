package com.training.person;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class Person
 */
@WebServlet("/")
public class PersonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PersonServlet() {
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
		switch (action) {
		
		case "/": 
			Homepage(request,response);
			break;
		case "/addone"	:
			Addpage(request,response);
		break;
		case "/showone":
			Showpage(request,response);
			break;
		default:
			break;
		}
		

	

	}

	private void Addpage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("person", "Person Details");
		RequestDispatcher rd=request.getRequestDispatcher("/AddPerson.jsp");
		rd.forward(request, response);
		
	}

	private void Showpage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setAttribute("person", "Person Details");
		String name=request.getParameter("name");
		String lname=request.getParameter("lname");
		String[] hobbies=request.getParameterValues("checkbox");
		String qulification=request.getParameter("radio");
		Person obj=new Person(name,lname,hobbies,qulification);
		request.setAttribute("person", obj);
		RequestDispatcher rd=request.getRequestDispatcher("/ShowPerson.jsp");
		rd.forward(request, response);
		
	}

	private void Homepage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("person", "Person Details");
		
		RequestDispatcher rd=request.getRequestDispatcher("/Person.jsp");
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

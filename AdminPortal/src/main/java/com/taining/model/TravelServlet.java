package com.taining.model;

import java.io.IOException;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.taining.connection.ConnectionFactory;


/**
 * Servlet implementation class TravelServlet
 */
@WebServlet("/")
public class TravelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con = null;
	private TravelService service = null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TravelServlet() {
        super();
        
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		con = ConnectionFactory.getPostgresConnection();
		service = new TravelService(con);
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String key=request.getServletPath();
		switch (key) {
	case "/": 
		welcome(request,response);
		break;
	case "/add":
		addpage(request,response);
		break;
	case "/welcomelogin":
		welcomepage(request,response);
	default:
		break;
	}
		
	}

	private void welcomepage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String username=request.getParameter("username");
//		request.setAttribute("message", username);
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("/validation.jsp");
		dispatcher.forward(request, response);
	}

	private void addpage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String name = request.getParameter("name");
		String phonenumber=request.getParameter("phonenumber");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		int age=Integer.parseInt(request.getParameter("age"));
		String gender=request.getParameter("gender");
		Travel entity=new Travel(username,name,phonenumber,email,password,age,gender);
		Travel added=service.add(entity);
		RequestDispatcher dispatcher=request.getRequestDispatcher("/Register.jsp");
		dispatcher.forward(request, response);
		
	}

	private void welcome(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("/index.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
	}

}

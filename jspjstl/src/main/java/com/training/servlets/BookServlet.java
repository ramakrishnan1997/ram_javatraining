package com.training.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BookServlet
 */
@WebServlet("/books")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	 BookService service;
    public BookServlet() {
        super();
        // TODO Auto-generated constructor stub
     
    }
    @Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		   service =new BookService();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	//	Book java=new Book(1010,"Head First Java","Kathy Sieera",45.0);
		List<Book> booklist=service.findAll();
		request.setAttribute("books", booklist);
	RequestDispatcher dispatcher=request.getRequestDispatcher("/showBook.jsp");
	dispatcher.forward(request, response);
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		
		int booknumber=Integer.parseInt(request.getParameter("bookNumber"));
		String bookName=request.getParameter("bookName");
		String authorName=request.getParameter("authorName");
		double price=Double.parseDouble(request.getParameter("price"));

		Book entity=new Book(booknumber,bookName,authorName,price);	
		Book bookAdded=service.add(entity);
		request.setAttribute("added",bookAdded);
		RequestDispatcher dispatcher=request.getRequestDispatcher("/success.jsp");
		dispatcher.forward(request, response);
		
	}

}

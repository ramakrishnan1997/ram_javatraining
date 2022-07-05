package com.example.demo.model;

import java.sql.*;

import java.util.List;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.utils.ConnectionFactory;

/**
 * Servlet implementation class BookServlet
 */
@WebServlet("/")
public class BookServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	Connection con = null;
	private BookService service = null;

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public BookServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void init() throws ServletException {
		con = ConnectionFactory.getPostgresConnection();
		service = new BookService(con);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String key = request.getServletPath();
		switch (key) {
		case "/books":
			handleFindAll(request, response);
			break;
		case "/delete":
			handleRemove(request, response);
			break;
		case "/edit":
			handleEdit(request, response);
			break;
		case "/update":
			handleUpdate(request, response);
			break;
		case "/view":
			viewpage(request, response);
			break;
		case "/findbyname":
			findbyid(request, response);
			break;
		default:
			break;
		}

	}

	

	private void findbyid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Book> books = service.findAll();
		request.setAttribute("books", books);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/findbyname.jsp");
		dispatcher.forward(request, response);
	}

	private void viewpage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Book> books = service.findAll();
		request.setAttribute("books", books);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/showBook.jsp");
		dispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		int booknumber = Integer.parseInt(request.getParameter("bookNumber"));
		String bookName = request.getParameter("bookName");
		String authorName = request.getParameter("authorName");
		double price = Double.parseDouble(request.getParameter("price"));

		Book entity = new Book(booknumber, bookName, authorName, price);
		Book bookAdded = service.add(entity);
		request.setAttribute("added", bookAdded);
		request.setAttribute("message", "one book added");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/addBook.jsp");
		dispatcher.forward(request, response);
	}

	public void handleRemove(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String strid = request.getParameter("id");
		int id = Integer.parseInt(strid);
		Book book = service.remove(id);

		List<Book> books = service.findAll();
		request.setAttribute("books", books);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/showBook.jsp");
		dispatcher.forward(request, response);
	}

	public void handleFindAll(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Book> books = service.findAll();
		//System.out.println(books);
		request.setAttribute("books", books);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/showBook.jsp");
		dispatcher.forward(request, response);

	}

	private void handleUpdate(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int booknumber = Integer.parseInt(request.getParameter("bookNumber"));
		String bookName = request.getParameter("bookName");
		String authorName = request.getParameter("authorName");
		double price = Double.parseDouble(request.getParameter("price"));
		
		Book entity = new Book(booknumber, bookName, authorName, price);
		Book bookAdded = service.update(entity);

		request.setAttribute("bookToEdit", bookAdded);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/showBook.jsp");
		dispatcher.forward(request, response);

	}
	private void handleEdit(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String strId = request.getParameter("id");
		int id = Integer.parseInt(strId);
		Book bookToEdit = service.findById(id);
		request.setAttribute("bookToEdit", bookToEdit);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/addBook.jsp");
		dispatcher.forward(request, response);

	}
}

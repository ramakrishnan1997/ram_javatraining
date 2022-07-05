package com.training.practice;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jdt.internal.compiler.ast.SwitchExpression;

/**
 * Servlet implementation class PracticeBookServlet
 */
@WebServlet("/PracticeBookServlet")
public class PracticeBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PracticeBookService service;
    @Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		service=new PracticeBookService();
	}

	/**
     * @see HttpServlet#HttpServlet()
     */
    public PracticeBookServlet() {
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
	switch(action)
	{
	case "/Findname":
		FindnamePage(request,response);
		break;
		default:
			break;
	}
		List<PracticeBook> booklist=service.findAll();
		request.setAttribute("Added", booklist);
		RequestDispatcher dispatcher=request.getRequestDispatcher("/practiceShowPage.jsp");
	dispatcher.forward(request, response);
	}

	private void FindnamePage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String bookname=request.getParameter("bookname");
		List<PracticeBook> book=service.findname(bookname);
		request.setAttribute("book", book);
		RequestDispatcher dispatcher=request.getRequestDispatcher("/nameshow.jsp");
		dispatcher.forward(request, response);
		
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String authorname=request.getParameter("authorname");
		String bookname=request.getParameter("bookname");
		int booknumber=Integer.parseInt(request.getParameter("booknumber"));
		int cost=Integer.parseInt(request.getParameter("booknumber"));
		
		PracticeBook entity=new PracticeBook(authorname,bookname,booknumber,cost);
		PracticeBook add=service.add(entity);
		request.setAttribute("added",add);
		RequestDispatcher dispatcher=request.getRequestDispatcher("/pageSuccess.jsp");
		dispatcher.forward(request, response);
		
		
	}

}

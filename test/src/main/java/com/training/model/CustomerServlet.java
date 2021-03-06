package com.training.model;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





/**
 * Servlet implementation class CustomerServlet
 */
@WebServlet("/CustomerServlet")
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private CustomerService service=null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String key=request.getServletPath();
		System.out.println(key);
		switch(key)
		{
		case "/viewAll":
			viewpage(request,response);
		break;
		default :
			break;
		
		}
		
		
}

	private void viewpage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
        List<Customer> customer=service.findAll();
        request.setAttribute("payment", customer);
		RequestDispatcher dispatcher=request.getRequestDispatcher("/showcustomer.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String customername=request.getParameter("customername");
		int customeramount=Integer.parseInt("customeramount");
		String paymentdate=request.getParameter("paymentdate");
		Customer t =new Customer(customername,customeramount,paymentdate);
		Customer added =service.add(t);
		request.setAttribute("add",added);
	
		RequestDispatcher dispatcher = request.getRequestDispatcher("/add.jsp");
		dispatcher.forward(request, response);
		
	}

}

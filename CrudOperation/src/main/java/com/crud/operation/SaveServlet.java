package com.crud.operation;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SaveServlet
 */
@WebServlet("/SaveServlet")
public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init(Employee e) throws ServletException, ClassNotFoundException {
		int flag = 0;

		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/vastpro", "postgres",
					"postgres");
			PreparedStatement st = con.prepareStatement("insert into employee values (?,?) ");
			st.setString(1, e.getId());
			st.setString(2, e.getName());
			flag = st.executeUpdate();
			con.close();
		} catch (SQLException ea) {
			System.out.println("prepared error");
		}
		System.out.println("not working");
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	public SaveServlet() {
		super();
		// TODO Auto-generated constructor stub
	}
//    public static int save(Employee e) throws ClassNotFoundException  {
//		int flag=0;
//		
//		try {
//Class.forName("org.postgresql.Driver");
//Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/vastpro","postgres","postgres");
//PreparedStatement st =con.prepareStatement("insert into employee values (?,?) ");
//st.setString(1, e.getId());
//st.setString(2, e.getName());
//			flag =st.executeUpdate();
//			con.close();
//		} catch (SQLException ea) {
//			System.out.println("prepared error");
//		}
//		
//		
//		
//		return flag;
//	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		String id = request.getParameter("id");
		String name = request.getParameter("name");

		Employee e = new Employee();
		e.setId(id);
		e.setName(name);

		int it = 0;
		try {
			it = JdbcConnection.save(e);
		} catch (ClassNotFoundException e1) {
			System.out.println("Conection error");
		}
		if (it == 1) {
			out.print("Saved successful");
		} else {
			out.print("not saved");
		}
		out.print("<from>");
		out.print("<input type='text' name='user'>");
		out.print("<input type='submit' value='login'>");
		out.print("</from>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

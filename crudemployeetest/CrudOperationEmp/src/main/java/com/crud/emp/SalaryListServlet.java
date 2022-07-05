package com.crud.emp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SalaryListServlet
 */
@WebServlet("/SalaryListServlet")
public class SalaryListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SalaryListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		String salary=request.getParameter("salary");
		
		Employee e=new Employee();
		e.setSalary(salary);
		Connection con=null;
		try {
			con = JdbcConnection.getConnection();
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		PreparedStatement st=null;
		try {
			st = con.prepareStatement("select * from employee where salary<?");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			
			st.setString(1, e.getSalary());
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ResultSet rs=null;
		try {
			rs = st.executeQuery();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			while(rs.next()) {
				try {
					out.print("<table  border='1px solid black' style='border-collapse:collapse';>");
					out.print("<tr >");
					out.print("<td style='padding:15px';>");
					out.print(rs.getString(1));
					out.print("</td>");
					out.print("<td style='padding:15px';>");
					out.print(rs.getString(2));
					out.print("</td>");
					out.print("<td style='padding:15px';>");
					out.print(rs.getString(3));
					out.print("</td>");
					out.print("<td style='padding:15px';>");
					out.print(rs.getString(4));
					out.print("</td>");
					out.print("<td style='padding:15px';>");
					out.print(rs.getString(5));
					out.print("</td>");
					out.print("<td style='padding:15px';>");
					out.print(rs.getString(6));
					out.print("</td>");
					out.print("</tr>");
					out.print("</table>");
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		out.print("<html>");
		out.print("<a href='http://localhost:8080/CrudOperationEmp/updatehtml.html'>Create employee</a>");
		out.print("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

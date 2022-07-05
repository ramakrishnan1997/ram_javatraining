package com.javasetlet.program;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public FirstServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
//		ServletContext con = getServletContext();
//		String txt =con.getInitParameter("Greetings"); 
//		ServletConfig con1 = getServletConfig();
//		String txt2 =con1.getInitParameter("Message"); 
//		
//		out.println(txt2);
//		
//		out.println(txt);
//		obj.print("<div><"
//				+ "h1>Hi Ish Bin Arunkumar</h1>"
//				+ "<p>Ish Leba in Chenai</p>"
//				+"<h2>Guten tag!!</h2>"
//				+ "</div>");
		String name =request.getParameter("txtName");
		String pass =request.getParameter("txtPass");
//		 if(name.equals("admin")){
			
//		    }
//		    else{
//		    	 obj.print("Invalie username and password");
//		    }

//		out.println("<html><body><table>");
//		Enumeration paramNames = request.getParameterNames();
//
//		while (paramNames.hasMoreElements()) {
//			String param = (String) paramNames.nextElement();
//			out.println("<tr><td>" + param + "</td>\n<td>");
//			String[] values = request.getParameterValues(param);
//
//			if (values.length == 1) {
//				String paramValue = values[0];
//				if (paramValue.length() == 0)
//					out.println("<i>No value</i>");
//				else
//					out.println(paramValue);
//
//			} else {
//
//				out.println("<ul>");
//				for (int i = 0; i < values.length; i++) {
//					out.println("<li>" + values[i]+"</li>");
//				}
//				out.print("</ul>");
//			}
//		}
//		out.print("</tr>\n</table>\n</body>\n</html>");
		
//		Cookie ab =new Cookie("name",name);
//		response.addCookie(ab);
		 HttpSession mySession = request.getSession();
		 mySession.setAttribute("user", name);
		 mySession.setAttribute("pass", pass);
		 out.print("Session created");



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

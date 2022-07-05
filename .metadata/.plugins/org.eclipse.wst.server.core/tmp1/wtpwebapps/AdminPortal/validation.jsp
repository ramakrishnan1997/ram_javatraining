<%@page import="javax.security.auth.message.callback.PrivateKeyCallback.Request"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.taining.connection.*"%>
    <%@ page import="java.lang.*" %>
    <%@ page import="java.sql.*" %>
    <%@ page session="true" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Validate User</title>
</head>
<body>
<%! String pass_word; %>
<%! String user; %>
<%! int flag=0;  %>
<%
Connection con = null;
//PreparedStatement stmt=null;
Statement stmt=null;
ResultSet rs=null;
try{
	user = request.getParameter("username");
    pass_word = request.getParameter("password");
    
 	//System.out.println("user_id = "+user+"\t"+"pass_word = "+pass_word);
	con=ConnectionFactory.getPostgresConnection();
	System.out.print(con);


String sql = "SELECT username,password FROM travel WHERE username='"+user+"' and password='"+pass_word+"';";
System.out.println(sql);
stmt=con.createStatement();
rs=stmt.executeQuery(sql);
String userName=null;
String password=null;
if(rs.next())
{
	
     userName=rs.getString("username");
	 password=rs.getString("password");
	System.out.println("$$$$$$$$$$"+userName);
	System.out.println("$$$$$$$$$$"+password);
	flag=1;
	
}
if(flag==1){
	if(user.equals(userName) && pass_word.equals(password))
	{
		System.out.println("valid user"+userName);
		request.setAttribute("message", "Welcome :"+userName);
		request.setAttribute("message1", "successfully loged In");
		RequestDispatcher dispatcher=request.getRequestDispatcher("welcomelogin.jsp");
		dispatcher.forward(request, response);
		
		
	}
		
}

if(flag==0){
	System.out.println("Invalid user");
	request.setAttribute("message1", "invalid username or password");
	RequestDispatcher dispatcher=request.getRequestDispatcher("Login.jsp");
	dispatcher.forward(request, response);
}


}
catch(Exception e){
	
	e.printStackTrace();
}
 
%>

</body>
</html>
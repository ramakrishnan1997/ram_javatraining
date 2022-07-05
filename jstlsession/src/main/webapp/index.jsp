<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session</title>
</head>
<body>
<%= session.getId()%>
<c:out value="${pageContext.session.id}"/>
<c:set value="Ramesh" scope="session" var="name"/>
<a href ="First.jsp">First</a>
<a href ="welcome">home</a>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="header.html"%>
<%-- <jsp:useBean id="service" class="com.example.demo.model.BookService" scope="request"/> --%>
<%-- <c:set var="books" value="${service.findAll()}"/> --%>

<table border="1">
	<tr>
		<th>Author Name</th>
		<th>Book Name</th>
		<th>Book number</th>
		<th>Price</th>
	</tr>
<%-- <c:set var="books" value="${service.findall()}"/> --%>
<c:forEach items="${books}" var="eachbook">
<tr>
<td><c:out value="${eachbook.authorName}"/></td>
<td><c:out value="${eachbook.bookName}"/></td>
<td><c:out value="${eachbook.bookNumber}"/></td>
<td><c:out value="${eachbook.price}"/></td>
<td><a href="edit?id=<c:out value='${eachbook.bookNumber}'/>">Edit</a></td>
<td><a href="delete?id=<c:out value='${eachbook.bookNumber}'/>">Delete</a></td>
</tr>
</c:forEach>
</table>

</body>
</html>
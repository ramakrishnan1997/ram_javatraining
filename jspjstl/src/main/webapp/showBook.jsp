<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Book</title>

</head>
<body>
<c:out value="${book}"/>
<table border="1">
	<tr>
		<th>Author Name</th>
		<th>Book Name</th>
		<th>Book number</th>
		<th>Price</th>
	</tr>

<c:forEach items="${books}" var="eachbook">
<tr>
<td><c:out value="${eachbook.authorName}"/></td>
<td><c:out value="${eachbook.bookName}"/></td>
<td><c:out value="${eachbook.bookumber}"/></td>
<td><c:out value="${eachbook.price}"/></td>
</tr>
</c:forEach>
</table>
</body>
</html>
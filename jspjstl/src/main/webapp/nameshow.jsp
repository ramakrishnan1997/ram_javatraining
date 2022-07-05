<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
		<tr>
			<th>authorname</th>
			<th>bookname</th>
			<th>booknumber</th>
			<th>cost</th>
		</tr>
		<c:forEach items="${book}" var="each">
			<tr>
				<td><c:out value="${each.authorname}" /></td>
				<td><c:out value="${each.bookname}" /></td>
				<td><c:out value="${each.booknumber}" /></td>
				<td><c:out value="${each.cost}" /></td>
			</tr>
		</c:forEach>
</table>
</body>
</html>
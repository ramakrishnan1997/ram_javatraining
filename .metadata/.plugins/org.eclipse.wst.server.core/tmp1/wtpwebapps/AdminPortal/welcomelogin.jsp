<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<div>
<p style="color: green;">
<c:out value="${message }"/>
</p>
</div>
<body>
<form action="Login.jsp" method="get">
<input type="submit" value="Logout">
</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="home.html"%>
<c:out value="${add}"/>
<form action="add.jsp" method="post">
<div><label>CustomerName:</label><input type="text" name="customername"></div>
<div><label>Amount:</label><input type="text" name="customeramount"></div>
<div><label>Date:</label><input type="date" name="paymentdate"></div>
<input type="submit" value="Add">

</form>
<a href="viewAll">view</a>
</body>
</html>
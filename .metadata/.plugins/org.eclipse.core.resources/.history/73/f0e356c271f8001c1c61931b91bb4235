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

<table border="1">
	<tr>
		<th>CustomerName</th>
		<th>Amount</th>
		<th>Date</th>	
	</tr>
	<c:forEach items="${payment}" var="eachcustomer">
<tr>
<td><c:out value="${eachcustomer.customername}"/></td>
<td><c:out value="${eachcustomer.customeramount}"/></td>
<td><c:out value="${eachcustomer.paymentdate}"/></td>
</tr>
</c:forEach>
</table>
</body>
</html>
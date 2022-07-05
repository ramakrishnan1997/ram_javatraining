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
<jsp:useBean id="LoginBean" scope="session" class="com.example.demo.model.User"/>
<jsp:setProperty property="*" name="LoginBean"/>
<c:set value="${LoginBean.validate()}" var="result"/>
Result:<c:out value="${result}"/>
<c:if test="${result}">
<jsp:forward page="showBook.jsp"></jsp:forward>
</c:if>
<c:if test="${!result}">
<jsp:forward page="index.jsp">
<jsp:param value="invalid username or password" name="errorMessage"/>
</jsp:forward>
</c:if>

</body>
</html>
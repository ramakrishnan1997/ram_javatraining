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
<form action="First.jsp">
<label for="">Book</label>
<select name="bookname" id="" multiple="multiple">
<option value="java">Java</option>
<option value="spring">Spring</option>
<option value="python">Python</option>
<option value="html">Html</option>

</select>
<input type="submit" value="Add"/>
</form>
</body>
</html>
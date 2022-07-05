<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 style="text-align:center">${person}</h1>
<h4>Person detail list</h4>
<table>
<tr>
<td>Firstname</td>
<td>Lastname</td>
<td>Hobbies</td>
<td>Qualification</td>
</tr>
<tr>
<td>${person.firstname}</td>
<td>${person.lastname}</td>
<td>${person.hobbies[0] }${person.hobbies[1] }${person.hobbies[2] }</td>
<td>${person.qualification}</td>
</tr>
</table>
</body>
</html>
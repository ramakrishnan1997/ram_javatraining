<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 style="text-align:center">${heading}</h1>
<h4>Student List</h4>
<table>
<tr>
<td>Roll Number</td>
<td>StudentName</td>
<td>MarkScored</td>
</tr>
<tr>
<td>${student.rollnumber}</td>
<td>${student.studentName}</td>
<td>${student.strMark}</td>
</tr>
</table>
</body>
</html>
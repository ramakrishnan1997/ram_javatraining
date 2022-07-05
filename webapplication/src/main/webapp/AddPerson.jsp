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
<form action="showone">
<label> FirstName</label>
<input type="text" name="name"/><br>
<label> LastName</label>
<input type="text" name="lname"><br>
<label>Hobbies</label>
<input type="checkbox" value="chess" name="checkbox">Chess
<input type="checkbox" value="cricket" name="checkbox">Cricket
<input type="checkbox" value="football" name="checkbox">Football<br>
<label>Qulification</label>
<input type="radio" name="radio" value="enginner"/>Engineer
<input type="radio" name="radio" value="arts"/>Arts
<input type="radio" name="radio"  value="science"/>Science<br>
<input type="submit" value="submit"/>
</form>
</body>
</html>
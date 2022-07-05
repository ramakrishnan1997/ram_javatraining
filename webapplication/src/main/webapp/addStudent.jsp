<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Student</title>
</head>
<body>
<h1 style="text-align:center">${heading }</h1>
<form action="show" mehod="post">
<label>RollNumber</label>
<input type="text" name="rollnumber"/>
<label>Student Name</label>
<input type="text" name="studentName"/>
<label>MarkScored</label>
<input type="text" name="mark"/>
<input type="submit" value="add"/>
</form>
</body>
</html>
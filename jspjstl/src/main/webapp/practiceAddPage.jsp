<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="PracticeBookServlet" method="post">
<div><label for="authorname">Authorname</label><input type="text" name="authorname"/></div>
<div><label for="bookname">Bookname</label><input type="text" name="bookname"/></div>
<div><label for="booknumber">Booknumber</label><input type="text" name="booknumber"/></div>
<div><label for="cost">Cost</label><input type="text" name="cost"/></div>
<input type="submit" value="Save"/>
</form>
</body>
</html>
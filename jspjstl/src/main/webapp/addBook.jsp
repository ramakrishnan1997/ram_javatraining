<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Book</title>
</head>
<body>
<form action="books" method="post">

<div><label for="Author Name">AuthorName</label><input type="text" name="authorName" /></div>
<div><label for="Book Name">Book Name</label><input type="text" name="bookName"/></div>
<div><label for="Book Number">Book Number</label><input type="text" name="bookNumber"/></div>
<div><label for="Price">Price</label><input type="text" name="price"/></div>


<input type="submit" value="Add"/>



</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Book</title>
</head>
<body>
<c:if test="${empty bookToEdit }">
<p style="color :green"><c:out value="${message}"/></p>
<form action="books" method="get">
<div><label for="Author Name">AuthorName</label><input type="text" name="authorName" /></div>
<div><label for="Book Name">Book Name</label><input type="text" name="bookName" /></div>
<div><label for="Book Number">Book Number</label><input type="text" name="bookNumber" /></div>
<div><label for="Price">Price</label><input type="text" name="price" /></div>
<input type="submit" value="Add"/>
</c:if>
</form>
<c:if test="${!empty bookToEdit}">
<h1>Edit</h1>
<form action="update" method="get">
<div><label for="Author Name">AuthorName</label><input type="text" name="authorName" value="${bookToEdit.authorName}"/></div>
<div><label for="Book Name">Book Name</label><input type="text" name="bookName" value="${bookToEdit.bookName}"/></div>
<div><label for="Book Number">Book Number</label><input type="text" name="bookNumber" value="${bookToEdit.bookNumber}" readonly="readonly"/></div>
<div><label for="Price">Price</label><input type="text" name="price" value="${bookToEdit.price}"/></div>
<input type="submit" value="Update"/>
</form>
</c:if>
</body>
</html>

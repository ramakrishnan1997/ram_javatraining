<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
	<style type="text/css">
	.image{
	background-image: url("image/login.jpg");
	background-size:cover;
	background-repeat: no-repeat;
	}</style>
</head>

<body class="image">
<h1 style="text-align: center">Login</h1>
<div class="container-fluid">
<div class="row">
<div class="col-md-4"> </div>
<div class="col-md-4" align="center"><form action="welcomelogin">
		<div>
			<label>User Name</label> <input type="text" name="username">
		</div>
		<div>
			<label>Password</label> <input type="password" name="password" style="margin-left: 10px">
		</div >
		<div>
		<p style="color: red">
        <c:out value="${message1 }"/>
        </p>
        </div>
		<input type="submit" value="Login"><input type="reset"
			value="Clear">
		
	</form>
	<a href="Register.jsp"><button>Register</button></a></div>

</div>
	
	<div class="col-md-4"> </div>
	
	</div>
</body>
</html>
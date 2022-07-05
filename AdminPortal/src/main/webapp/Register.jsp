<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
	<style type="text/css">
	.image{
	background-image:url("image/register.jpg");
	background-size: cover;
	background-repeat: no-repeat;
	
	}
	label:before {
	content: "*";
}
	</style>
	
</head>
<body class="image">
<div class="container-fluid">
<div class="row">
<div class="col-md-4"></div>
<div class="col-md-4" align="center">
<h1 style="text-align:center">Register</h1> 
<form action="add" method="get">
<div><label>User Name</label><input type="text" name="username" ></div>
<div><label>Name</label><input type="text" name="name" style="margin-left: 36px" ></div>
<div><label>Phone No</label><input type="text" name="phonenumber"  style="margin-left: 4px" ></div>
<div><label>Email</label><input type="email" name="email" style="margin-left: 36px" ></div>
<div><label>Password</label><input type="password" name="password" style="margin-left: 7px"></div>
<div><label>Age</label><input type="text" name="age" style="margin-left: 47px" ></div>
<div>
<label for="gender">Gender</label>
<div>
<input type="radio" value="Male" name="gender" >
<label>Male</label>
</div>
<div>
<input type="radio" value="Female" name="gender" style="margin-left: 20px" >
<label>Female</label>
</div>
<div>
<input type="radio" value="Other" name="gender" style="margin-left: 7px" >
<label>Other</label>
</div>
</div>
<input type="submit" value="Register">
<input type="reset" value="Clear">
</form>

</div>
</div>
<div class="col-md-4"></div>
</div>
</body>
</html>
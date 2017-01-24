<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<html>
<head>


<style>
div
{color:white;}
body {


    background-image: url("resources/images/8.jpg");
 background-size: 1400px 800px;
}
</style>





<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">TREND SETTER</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="/Shoppingcentre">Home</a></li>
      <li><a href="About us">About us</a></li>
    <li><a href="Services">Services</a></li>
    <li><a href="Product">Product</a></li>
    
    
      <li><a href="Register"><span class="glyphicon glyphicon-user"></span> Register</a></li>
    
    
      <li><a href="login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      <li><a href="Contact us">Contact us</a></li>
        <div class="input-group input-group-lg">
      <input type="text" class="form-control" placeholder="Search">
      <div class="input-group-btn">
        <button class="btn btn-default" type="submit"><i class="glyphicon glyphicon-search"></i></button>
      </div>
    </div>
  
      </ul>
  </div>
</nav>

</head>




<body>

<form name='f' action="<c:url value='j_spring_security_check'/>" method='POST' >
      
<center>

   
<div class="container-fluid">
<h1 align="center">LOGIN HERE</h1>

<hr>
<br><br>
  <div class="form-group">
    <label for="username">Username:
    <input type="text"  name='j_username' class="form-control" id="username"></label>
  </div>
  <div class="form-group">
    <label for="pwd">Password:
    <input type="password" name='j_password' class="form-control" id="pwd">
  </label></div>
  <div class="checkbox">
    <label><input type="checkbox"> Remember me</label>
  </div>
  <button type="submit" class="btn btn-default">Submit</button>
</form>

</center>

</body>

</html>
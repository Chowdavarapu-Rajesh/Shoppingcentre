<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

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
      <a class="navbar-brand" href="#">SUNDER BOOKS AND GENERAL STORES</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="/Shoppingcentre">Home</a></li>
      <li><a href="About us">About us</a></li>
      <li><a href="Carrers">Carrers</a></li>
    <li><a href="Services">Services</a></li>
    
    
      <li><a href="Register">Register</a></li>
    
      <li><a href="login">Login</a></li>
      <li><a href="Contact us">Contact us</a></li>
      </ul>
  </div>
</nav>

</head>
<body>
<center>
<form>




 <div class="form-group">
    <label for="FIRSTNAME">FIRST NAME:
    <input type="text" class="form-control" id="name"></label>
  </div>
  <div class="form-group">
    <label for="LASTNAME">LAST NAME:
    <input type="text" class="form-control" id="name"></label>
  </div>
    <div class="form-group">
    <label for="create pwd">CREATE PASSWORD:
    <input type="password" class="form-control" id="create pwd"></label>
  </div>
    <div class="form-group">
    <label for="confirm pwd">CONFIRM PASSWORD:
    <input type="password" class="form-control" id="confirm pwd"></label>
  </div>
    <div class="form-group">
    <label for="email">EMAIL ID:
    <input type="email" class="form-control" id="email</label>">
  </div>
  
  <div class="checkbox">
    <label><input type="checkbox"> Remember me</label>
  </div>
  <button type="submit" class="btn btn-default">Submit</button>

 
</form></center>
</body>
</html>
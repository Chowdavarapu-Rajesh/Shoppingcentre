<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
<style>
div
{color:blue;}
body {


    background-color:green;
 background-size: 1400px 800px;
  background-repeat: no-repeat;
}

.form_bg {
    background-color: lightgrey;
    width: 400px;

    border: 0px solid green;
    padding:10px;
    margin: 10px;
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
      </ul>
  </div>
</nav> 

</head>
<body>
<center>

<form:form commandName="category" action="categories" method="post">


<br>
<h1 align="center"><b>CATEGORY DETAILS<b></h1><br>
<div class="container">
<div class="form_bg">
<div class="row">
  
  <br>

<table style="width:"35%">
   <tr>
  <td>CATEGORYNAME:</td>
    <td><form:input path="categoryName"/><br><br></td>

  </tr>

    
  <tr>
  
  <td>    </td>
    <td><input type="submit" value="submit"></td>
  </tr>
  </table>
  </div>
  
  
  
  
  
  </div></div>
</form:form>
</center>
</body>
</html>
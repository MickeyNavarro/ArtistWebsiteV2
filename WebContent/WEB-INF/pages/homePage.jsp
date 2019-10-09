<%--//Almicke Navarro and Emily Quevedo
	//CST-341
	//September 17, 2019 
	//This is our own work. 
	
	//VIEW
	//this is the home page of the website; it will greet the user--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Home</title>
	
<style>
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}
li a{
  float: right;
}
li b {
  float: left;
  display: block;
  color: white;
  text-align: center;
  text-decoration: none;
}
li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}
li a:hover {
  background-color: #111;
}
h2 {
text-align: center;
}
</style>
</head>
<body>

<ul>
  <li><b><a href="home">RGO Crew</a></b></li>
  <li><a href="register">Register</a></li>
  <li><a href="login">Login</a></li>
</ul>

	<c:if test ="${user.username != ''}"> 	
		<h2>Welcome to the crew, ${user.username}!</h2>
	</c:if>
	<c:if test ="${user.username == ''}"> 	
		<h2>Welcome to the site!</h2>
	</c:if>
</body>
</html>
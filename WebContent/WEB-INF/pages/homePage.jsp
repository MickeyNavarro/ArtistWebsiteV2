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
</head>
<body>
	<h2>RGO Crew</h2>
	<c:if test ="${user.username != ''}"> 	
		<p>Welcome to the crew, ${user.username}!</p>
	</c:if>
	<a href="register">Register</a>
	<a href="login">Login</a>
	
</body>
</html>
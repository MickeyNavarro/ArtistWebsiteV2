<%--//Almicke Navarro and Emily Quevedo
	//CST-341
	//September 17, 2019 
	//This is our own work. 
	
	//VIEW 
	//this is the login page for the website; it will simply ask for the credentials of a returning user, send the credentials to the database for validation, & then lead to the home page once return validated--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Login</title>
	
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
</style>
</head>
<body>
<ul>
  <li><b><a href="home">RGO Crew</a></b></li>
  <li><a href="register">Register</a></li>
  <li><a href="login">Login</a></li>
</ul>

	<h2>Login</h2>
	<form:form method= "POST" modelAttribute="user" action="loginSuccess">
		<table> 
			<tr>
				<td><form:label path="username">Username:</form:label></td>
				<td><form:input path="username"/><form:errors path="username"/></td>
			</tr>
			<tr>
				<td><form:label path="password">Password:</form:label></td>
				<td><form:password path="password"/><form:errors path="password"/></td>
			</tr>
			<tr>
				<td colspan="2"> 
					<input type = "submit" value = "Submit"/>
				</td>
			</table>
		<form:errors path="*"/>
	</form:form>
</body>
</html>
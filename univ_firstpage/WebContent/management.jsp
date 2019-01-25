<!DOCTYPE HTML><%@page language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>login</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
.a{
font-size: 20px;
position: relative;
	top:20px;
	left:50px;
background-color: grey;
border: 10px solid red;
}
</style>
</head>
<body>
<form class="a" action="one" method="post"> 
<table>
<tr>
    <td>Username</td>
    <td><input type="text" name="uname"></td>
</tr>
<tr>
    <td>Password</td>
    <td><input type="password" name="password"></td>
</tr>
<tr>
    <td><input type="submit" name="login" value="Login"></td>
</tr>

</table>
</form>

</body>
</html>
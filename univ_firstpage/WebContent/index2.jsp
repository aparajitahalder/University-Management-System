<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Registration</title>
</head>
<body style="background:black;">
<div class="r">
<center>
<form action="data" method="post">
<p style="border:5px; background:orange; color:yellow; font-family:arial rounded mt bold;"><br>Online Registration<br><br></p>
<div style="color:yellow; text-align:center; font-family:arial rounded mt bold; font-size:50%;">
Reg ID   &nbsp; &nbsp;<input type="text" name="id"><br>
First Name   &nbsp; &nbsp;<input type="text" name="fname"><br>
<br>Second Name&nbsp;<input type="text" name="lname"><br><br>
Father's Name  &nbsp;<input type="text" name="ftname"><br><br>
Date of Birth  &nbsp;<input type="text" name="dob"><br><br>
Gender  &nbsp;<input type="radio" name="gender" value="Male">Male&nbsp;
<input type="radio" name="gender" value="Female">Female<br><br>
Course &nbsp;&nbsp; <select name="course" >
<option value="CSE">Computer Science and Engineering</option>
<option value="ECE">Electronics and Communication Engineering</option>
<option value="Mechanical">Mechanical Engineering</option>
<option value="EE">Electrical Engineering</option>
<option value="BSc">Bachelor of Science</option>
<option value="BA">Bachelor of Arts</option>
<option value="MBA">Masters of Business Administration</option>
<option value="CFDM">Fashion Designing</option>

</select>
<br><br>
E-mail&nbsp;&nbsp;  <input type="text" name="mail">
<br><br>
Phone No.&nbsp;&nbsp; <input type="text" name="phno">
<br><br>




<p style="text-align:right; border:5px; background:orange; font-family:arial rounded mt bold; color:yellow;">

<br><br>
<input type="Reset" value="Reset">
<input type="Submit" value="Submit">
</p>
</div>
</form>
</center>
</div>
</body>
</html>
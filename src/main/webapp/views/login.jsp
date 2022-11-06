<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EPICURE</title>
<link rel="stylesheet" href="../CSS/login.css">

</head>
<body>
<main>
	<div class="login-box">
		<!--  <form method="get" action="login.servlet">
			<label for=ëmail>Email</label>
			<input type="email" class="input" required name="email"/>
			<label for= "password">Password</label>
			<input type="password" class="input" required name="password"/>
			<button type="submit">Submit</button>
		</form>-->
		<div class="login-header" style="width:30%;"><p class="login-header-title">LOGIN</p></div>
		<form action="../LoginController" method="post">
    <div class="user-box">
      <input type="email" name="emaiL" required>
      <label>Email</label>
    </div>
    <div class="user-box">
      <input type="password" name="password" required>
      <label>Password</label>
    </div>
    <a href="#">
      <span></span>
      <span></span>
      <span></span>
      <span></span>
     Submit
    </a>
    <a href="register.jsp">Create Account</a>
  </form>
	</div>
</main>
</body>
</html>
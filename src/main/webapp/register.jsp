<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EPICURE</title>
<link rel="stylesheet" href="./CSS/login.css">

</head>
<body>
<div class="login-box">
		<!--  <form method="get" action="login.servlet">
			<label for=�mail>Email</label>
			<input type="email" class="input" required name="email"/>
			<label for= "password">Password</label>
			<input type="password" class="input" required name="password"/>
			<button type="submit">Submit</button>
		</form>-->
		<div class="login-header"><p class="login-header-title">REGISTER</p></div>
		<form method="post" action="RegisterServelet">
    <div class="user-box">
      <input type="text" name="firstName" required>
      <label>First Name</label>
    </div>
    <div class="user-box">
      <input type="text" name="lastName" required>
      <label>Last Name</label>
    </div>
    <div class="user-box">
      <input type="email" name="email" required>
      <label>Email</label>
    </div>
    <div class="user-box">
      <input type="text" name="phone" required>
      <label>Phone</label>
    </div>
    <div class="user-box">
      <input type="text" name="default_shipping_address" required>
      <label>Address</label>
    </div>
    
    <div class="user-box">
      <input type="password" name="password" required>
      <label>Password</label>
    </div>
     
    <div class="user-box">
      <input type="password" name="Cpassword" required>
      <label>Confirm Password</label>
    </div>
  <input type="submit" value="Register" /> 
        <a href="login.jsp">LOGIN</a>
    
  </form>
	</div>
</main>
</body>
</html>
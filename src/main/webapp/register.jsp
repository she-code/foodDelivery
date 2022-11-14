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
<div class="login-box">
		<!--  <form method="get" action="login.servlet">
			<label for=ëmail>Email</label>
			<input type="email" class="input" required name="email"/>
			<label for= "password">Password</label>
			<input type="password" class="input" required name="password"/>
			<button type="submit">Submit</button>
		</form>-->
		<div class="login-header"><p class="login-header-title">REGISTER</p></div>
		<form>
    <div class="user-box">
      <input type="text" name="fname;" required>
      <label>First Name</label>
    </div>
    <div class="user-box">
      <input type="text" name="lname" required>
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
      <input type="text" name="address" required>
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
    <a href="#">
      <span></span>
      <span></span>
      <span></span>
      <span></span>
      Submit
    </a>
        <a href="login.jsp">LOGIN</a>
    
  </form>
	</div>
</main>
</body>
</html>
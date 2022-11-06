<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EPICURE</title>
<link rel="stylesheet" href="../CSS/login.css">
<link rel="stylesheet" href="../CSS/main.css">
</head>
<body>
<header>
	<jsp:include page="navigation.jsp" />
</header>
<main>
<div class="login-box">
		<form method="get" action="ContactController">
	
		<div class="login-header"><p class="login-header-title">CONTACT US</p></div>
		
    <div class="user-box">
      <input type="text" name="fname;" required>
      <label>Full Name</label>
    </div>
    <div class="user-box">
      <input type="text" name="lname" required>
      <label>Message</label>
    </div>
   
    <a href="#">
      <span></span>
      <span></span>
      <span></span>
      <span></span>
      Submit
    </a>
    
  </form>
	</div>
</main>
</body>
</html>
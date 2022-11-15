<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
.menu-form{
    display: block;
    color: black;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
    font-weight: bold;
    font-size: 18px;
}
.menu-btn{
    border: none;
    background-color: transparent;
    font-size: 16px;
    font-weight: bold;
}
</style>
</head>
<body>
<nav class="nav-main">
<div class="logo">
<a href="home.jsp" class="logo">EPICURE</a>
</div>
<ul>

<li>
<a href="home.jsp">Home</a>
</li>
<li>
<form action="MenuServelet" method="get" class="menu-form">
<input type="submit" value="Menu" class="menu-btn"/>
</form>
</li>
<li>
<a href="contactUs.jsp">Contact us</a>
</li>

</ul>
<div>
<ul>
<li><input class="search-input"/>
</li>
<li><a href="log.jsp"><i class="fa-duotone fa-user fa"></i></a></li>

<li >
<a><i class="fa fa-shopping-cart food-add-icon"></i></a>
</li>
</ul></div>
</nav>
</body>
</html>
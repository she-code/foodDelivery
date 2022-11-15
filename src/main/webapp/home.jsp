


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="./CSS/main.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<title>EPICURE</title>
</head>
<style>
.card-img-container{

	position:relative;
	background-color: white;
    height: 110px;
    width: 250;
    margin: 10px;
    margin-bottom: auto;
    border-radius: 10px;
}

.card-content1{

        padding: 0px 15px;
    display: flex;
    justify-content: space-between;
    color: orange;
    font-size: 20px;
    font-weight: bold;
}
.cart-container{
background-color:orange;
    padding: 5px 10px;
    border-radius: 5px;}
</style>
<body>
<header>
<jsp:include page="navigation.jsp" />

<section class='hero'>
<div class="hero-content">
<div class="hero-left">
<%out.print(request.getAttribute("loggedIn"));
Cookie ck[]=request.getCookies();
%>
<h2 class="hero-left-header">Fastest Delivery &</h2>
<span class="hero-left-header1">Easy Pickup</span>
<!-- <a class="hero-btn" href="menu.jsp">
ORDER NOW
</a>-->
<form action="MenuServelet" method="get">
<input type="submit" value="Order now" class="hero-btn"/>
</form>
</div>
<div class="hero-right">
<div class="hero-img-bg">
 <img src="./assets/images/womanChopstick1.png" class="hero-img"/>

</div>

</div>
</div>
<div class="samples">
<div class="card">
<div class="card-img-container">  <img src="./assets/images/pizza1.jpg" class="card-img"/></div>
<div class="card-content">
 <p style="font-weight:bold;">Moterella pizza</p>
 <div class="cart-container ">
 <i class="fa fa-shopping-cart" style="color: white; margin:auto;"></i>
 
 </div>
 
 <!-- <i class="fa fa-plus food-add-icon" style="position:absolute; color:white;"></i>-->
 
 </div>
  <div class="card-content1"><p>20$</p></div>
 
</div>
<div class="card">
<div class="card-img-container">  <img src="./assets/images/noodles3.jpg" class="card-img"/></div>
<div class="card-content">
 <p style="font-weight:bold;">Chineese Noodles</p>
<div class="cart-container ">
 <i class="fa fa-shopping-cart" style="color: white; margin:auto;"></i>
 
 </div> 
 
 </div>
  <div class="card-content1"><p>60$</p></div>
 
</div>
<div class="card">
<div class="card-img-container">  <img src="./assets/images/kitaw.jpg" class="card-img"/></div>
<div class="card-content">
 <p style="font-weight:bold;">Veg Briyani</p>
<div class="cart-container ">
 <i class="fa fa-shopping-cart" style="color: white; margin:auto;"></i>
 
 </div> 
 
 </div>
  <div class="card-content1"><p>80$</p></div>
 
</div>
</div>
</section>
<section class="food-category">
<div class="food-catgory-container">
</div>


</section>
</header>
<main>

</main>
<footer>
</footer>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="./CSS/menu.css">
</head>
<style>
body{
	margin:0;
	overflow:hidden;
		background-color:#fff0ed;
	
}
.order-summary{
padding:5rem;
}
.container{
margin:auto;
display:flex;
width:100%;
height:100%;
background-color:white;
   padding: 1rem 1.5rem;
    width: 45rem;
    border-radius: 0.5rem;
        justify-content: space-between
}
.food-img{
width: 200px;
    height: 200px;
    background-position: center;
    background-size: cover;
}
.left{
width:100%;
margin: 10px;
    padding: 15px 0}
.right{

    width: 100%;
    padding: 15px;
    margin: 10px;
    display: flex;
}
.food-card{
display: flex;
    justify-content: space-around;
    width: 100%;
    flex-direction:row;
    padding:10px 0;
    }
  .food-card-content{
  flex-direction: column;}
.food-name{
    font-size: 18px;
    font-weight: bold;}
    .price{
font-weight: bold;
 
    font-size: 19px;
    color: #fb9400;}
.ratings{
width: 45px;
    background-color: green;
    color: white;
    padding: 5px;
    font-size: 14px;
    display: flex;
    justify-content: space-between;}
    .description{
    }
    .hero-btn{
	idth: 100px;
    padding: 5px;
    border: none;
    border-radius: 5px;
    background-image: linear-gradient(to right, var(--lightOrange) , var(--pink));
    box-shadow: 0 0.75rem 0.5rem -0.5rem hsl(0deg 50% 80%);
    color: white;
    text-align: center;
    font-size: 14px;
    margin: auto;
	
}
</style>
<body>
<section class="order-summary">
<div class="container">
<div class="right">
<div class="food-card ">
<div class="food-img food-img1 " style="background-image:url(./assets/images/noodles3.jpg);">
<i class="fa fa-solid fa-heart fav-icon"></i>
<div class="veg-indi"></div>
</div>
<div class="food-card-content">
	<p class="food-name">name</p>
	<div class="ratings"><p>4</p><span><i class="fa fa-star"></i></span></div>
	<p class="price">23$</p>

	<div class="description">
		<p>fffdddddddgrszzzzzzzzzzzzzzzzzzz</p>
	</div>
	<div class="quantity">
	<p style="font-weight: bold;">Quantity</p>
	<button class="quant-option">4</button>
	<button class="quant-option">1200g</button>
	</div>
	<div class="quantity">
	
</div>

	
	</div>
	</div>
</div>
<div class="left"><div class="food-card" style="flex-direction:column; padding:15px;">
<p style="    font-size: 16px;
    font-weight: bold;">Shipping Details</p>
<p>Frehiwot Haile</p>
<p>Rajkot</p>
<p>900202002002</p>

<p style="    font-size: 13px;
    font-weight: bold; ">CASH ON DELIVERY</p> 
<form >
<input type="submit" value="DONE" class="hero-btn"/>
</form>
</div></div>

</div>
</section>
</body>
</html>
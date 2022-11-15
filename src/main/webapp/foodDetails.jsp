<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@page import="java.util.*"%>
    <%@page import="foodDelivery.models.Food"%>
 <%ArrayList foodDetails = (ArrayList)request.getAttribute("foodDetails");%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="./CSS/menu.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>Insert title here</title>
<style type="text/css">
.food-card-content {
    padding: 0.5rem 1rem;
    display: flex;
    justify-content: space-between;
}


.modal-content {
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    background-color: white;
    padding: 1rem 1.5rem;
    width: 45rem;
    border-radius: 0.5rem;
}
.price{
font-weight: bold;
    padding-left: 1rem;
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
.close-button {
    float: right;
    width: 1.5rem;
    line-height: 1.5rem;
    text-align: center;
    cursor: pointer;
    border-radius: 0.25rem;
    background-color: lightgray;
    border:none;
}

.close-button:hover {
    background-color: darkgray;
}
.description{
padding:0 1rem 1rem 1rem;

}
.food-name{
font-weight:bold;
}
.price-cart-holder{
display:flex;
justify-content:space-between;
padding-right:1rem;
}
.cart-container{
background-color:orange;
    padding: 5px 10px;
    border-radius: 5px;
    margin-bottom:10px;}
.order-btn{
    width: 200px;
    padding: 10px;
    border: none;
    border-radius: 15px;
    background-image: linear-gradient(to right, var(--lightOrange) , var(--pink));
    box-shadow: 0 0.75rem 0.5rem -0.5rem hsl(0deg 50% 80%);
    color: white;
 
    text-align: center;
    text-decoration: none;
}
.cart-btn{
width: 200px;
    padding: 10px;
    border:2px solid #fb9400;
    background-color:#e27d7d;
    opacity:0.5;
    color:white;
}
.order-action{
display: flex;
    justify-content: space-around;
    padding: 0 1rem 2rem}
.veg-indi{
position: absolute;
    width: 15px;
    height: 15px;
    background-color: #1bd41b;
    bottom: 5px;
    right: 5px;
}
.quantity{
padding: 0 1rem 1rem;
    display: flex;
    justify-content: space-between;
    width: 40%;
}
.quant-option{
padding: 3px;
    background-color: white;

}
.modal {
    position: fixed;
    left: 0;
    top: 0;
    width: 100%;
    height: 100%;
    background-color: rgba(0, 0, 0, 0.5);
    opacity: 0;
    /*visibility: hidden;*/
    transform: scale(1.1);
    transition:  0.25s 0s, transform 0.25s;
}

</style>
</head>
<body>
<main>
<div><%for(int i=0;i<foodDetails.size();i++){%>
	<%Food food = (Food)foodDetails.get(0); %>
	<div>
<div class="modal-content">
  <form action="MenuServelet" method="get">
<input type="submit" value="×" class="close-button"/>
</form>
<div class="food-card " style="margin-top:30px;">
<div class="food-img food-img1 " style="height:400px; background-image:url(./assets/images/noodles3.jpg)">
<i class="fa fa-solid fa-heart fav-icon"></i>
<div class="veg-indi"></div>
</div>
<div class="food-card-content">
	<p class="food-name"><%=food.getName()%></p>
	<div class="ratings"><p><%=food.getRatings()%></p><span><i class="fa fa-star"></i></span></div>
</div>
<p class="price"><%=food.getPrice()%>$</p>

	<div class="description">
		<p><%=food.getDescriptions()%></p>
	</div>
	<div class="quantity">
	<p style="font-weight: bold;">Quantity</p>
	<button class="quant-option"><%=food.getQuanrity()%></button>
	<button class="quant-option">1200g</button>
	</div>
	<div class="quantity">
	<p style="font-weight: bold;">Highlights</p>
	<ul style="flex-direction:column;">
	<li> <%=food.getHighlights()%></li>
				
	</ul>
	
	</div>
	<div class="order-action">
	<button class="order-btn">ORDER NOW</button>
	<button class="cart-btn">ADD TO CART</button>
	</div>
</div>
</div>    </div>
	<%} %>
	</div>
</main>


</body>
</html>
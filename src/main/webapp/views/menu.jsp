<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu</title>
<link rel="stylesheet" href="../CSS/main.css">

<link rel="stylesheet" href="../CSS/menu.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style type="text/css">
.food-card-content {
    padding: 0.5rem 1rem;
    display: flex;
    justify-content: space-between;
}

.modal {
    position: fixed;
    left: 0;
    top: 0;
    width: 100%;
    height: 100%;
    background-color: rgba(0, 0, 0, 0.5);
    opacity: 0;
    visibility: hidden;
    transform: scale(1.1);
    transition: visibility 0s linear 0.25s, opacity 0.25s 0s, transform 0.25s;
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
}

.close-button:hover {
    background-color: darkgray;
}
.description{
padding:0 1rem 1rem 1rem;

}
.show-modal {
    opacity: 1;
    visibility: visible;
    transform: scale(1.0);
    transition: visibility 0s linear 0s, opacity 0.25s 0s, transform 0.25s;
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
</style>
</head>
<body>
<header>
	<jsp:include page="navigation.jsp" />
	

</header>
<main>
<section class="menu-categories">
<div class="menu-categories-container">

<div class="category-card">
	<div class="category-card-content">
		<img src="../assets/images/pizzaIcon.jpg" class="category-icon"/>
	</div>
	<p>Pizza</p>
</div>

<div class="category-card">
	<div class="category-card-content">
		<img src="../assets/images/ramen.png" class="category-icon"/>
	</div>
	<p>Noodles</p>
</div>
<div class="category-card">
	<div class="category-card-content">
		<img src="../assets/images/hamburger.png" class="category-icon"/>
	</div>
	<p>Burger</p>
</div>
<div class="category-card">
	<div class="category-card-content">
		<img src="../assets/images/masala-dosa.png" class="category-icon"/>
	</div>
	<p>Dosa</p>
</div>
<div class="category-card">
	<div class="category-card-content">
		<img src="../assets/images/rice.png" class="category-icon"/>
	</div>
	<p>Rice</p>
</div>
</div>
</section>
<section class="">
<div class="grid-container">

<!--  <form action="../java/categoryServlet" method="get">-->
<div class="food-card trigger"  style="width:100%; " >
	<div class="food-img food-img2" style="background-image:url(../assets/images/noodles3.jpg;)">
	<i class="fa fa-solid fa-heart fav-icon"></i>
	</div>
	<div class="food-card-content">
		<p style="font-weight:bold;">Massala Noodles</p>
				<div class="ratings"><p>4.5</p><span><i class="fa fa-star"></i></span></div>
		
	</div>
	<div>	
				<p class="price" style="padding: 0 1rem 1rem 1rem;">25$</p>
		
	</div>
</div>
<div class="food-card trigger"  style="width:100%; " >
	<div class="food-img food-img2" >
	<i class="fa fa-solid fa-heart fav-icon"></i>
	</div>
	<div class="food-card-content">
		<p style="font-weight:bold;">Chinese Pizza</p>
				<div class="ratings"><p>4.5</p><span><i class="fa fa-star"></i></span></div>
		
	</div>
	<div>	
				<p class="price" style="padding: 0 1rem 1rem 1rem;">55$</p>
		
	</div>
</div>
<div class="food-card trigger"  style="width:100%; " >
	<div class="food-img food-img2" style="background-image:url(../assets/images/noodlesEgg.jpg;)">
	<i class="fa fa-solid fa-heart fav-icon"></i>
	</div>
	<div class="food-card-content">
		<p style="font-weight:bold;">Egg Noodles</p>
				<div class="ratings"><p>4</p><span><i class="fa fa-star"></i></span></div>
		
	</div>
	<div class="price-cart-holder">	
				<p class="price" style="padding: 0 1rem 1rem 1rem;">20$</p>
				 <div class="cart-container ">
 <i class="fa fa-shopping-cart" style="color: white; margin:auto;"></i>
 
 </div>
		
	</div>
</div>
<div class="food-card trigger"  style="width:100%; " >
	<div class="food-img food-img2" style="background-image:url(../assets/images/noodles2.jpg;)">
	<i class="fa fa-solid fa-heart fav-icon"></i>
	</div>
	<div class="food-card-content">
		<p style="font-weight:bold;">Chesse Pizza</p>
				<div class="ratings"><p>3.9</p><span><i class="fa fa-star"></i></span></div>
		
	</div>
	<div>	
				<p class="price" style="padding: 0 1rem 1rem 1rem;">25$</p>
		
	</div>
</div>
<!--</form>-->

</div>
</section>
<div class="modal">
    <div class="modal-content">
        <span class="close-button">×</span>
<div class="food-card " style="margin-top:30px;">
	<div class="food-img food-img1 " style="height:400px; background-image:url(../assets/images/noodles3.jpg)">
	<i class="fa fa-solid fa-heart fav-icon"></i>
	<div class="veg-indi"></div>
	</div>
	<div class="food-card-content">
		<p class="food-name">Massala Noodles</p>
		<div class="ratings"><p>4.5</p><span><i class="fa fa-star"></i></span></div>
	</div>
	<p class="price">25$</p>
	
		<div class="description">
			<p>Lorem Ipsum is simply dummy text of the printing and typesetting industry.
			 Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, </p>
		</div>
		<div class="quantity">
		<p style="font-weight: bold;">Quantity</p>
		<button class="quant-option">500g</button>
		<button class="quant-option">1200g</button>
		</div>
		<div class="quantity">
		<p style="font-weight: bold;">Highlights</p>
		<ul style="flex-direction:column;">
		<li> Glutten free</li>
				<li> Lactose free</li>
				<li>Vitamin E</li>
		
		</ul>
		
		</div>
		<div class="order-action">
		<button class="order-btn">ORDER NOW</button>
		<button class="cart-btn">ADD TO CART</button>
		</div>
	</div>
</div>    </div>
</main>
</body>
<script>
const modal = document.querySelector(".modal");
const trigger = document.querySelector(".trigger");
const closeButton = document.querySelector(".close-button");

function toggleModal() {
    modal.classList.toggle("show-modal");
}

function windowOnClick(event) {
    if (event.target === modal) {
        toggleModal();
    }
}

trigger.addEventListener("click", toggleModal);
closeButton.addEventListener("click", toggleModal);
window.addEventListener("click", windowOnClick);
</script>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.*"%>
    <%@page import="foodDelivery.models.Food"%>
 <%ArrayList foodItems = (ArrayList)request.getAttribute("foodItems");%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu</title>
<link rel="stylesheet" href="./CSS/main.css">

<link rel="stylesheet" href="./CSS/menu.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style type="text/css">
.food-card-content {
    padding: 0.5rem 1rem;
    display: flex;
    justify-content: space-between;
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

.details-btn{
width: 100px;
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
.form-category{
margin: 0 auto 10px;
    width: 50%;}
</style>
<!--  <script src="https://code.jquery.com/jquery-3.6.1.min.js"integrity="sha256-o88AwQnZB+VDvE9tvIXrMQaPlFFSUTR+nldQm1LuPXQ=" crossorigin="anonymous"></script>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.6.4/jquery.min.js"></script>
-->

<script src=
"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js">
    </script>
</head>
<body>
<header>
	<jsp:include page="navigation.jsp" />
	

</header>
<main>
<section class="menu-categories">
<div class="menu-categories-container">

<form action="FoodMenuServelet" method="get" >
<input type="image" class="category-card" src="./assets/images/pizzaIcon.jpg"/>
    <input type="hidden" value="pizza" name="menuType" />  
</form>

<form action="FoodMenuServelet" method="get">
<input type="image" class="category-card" src="./assets/images/ramen.png"/>
    <input type="hidden" value="noodles" name="menuType" />  
</form>
<form action="FoodMenuServelet" method="get">
<input type="image" class="category-card" src="./assets/images/hamburger.png"/>
    <input type="hidden" value="burger" name="menuType" />  
</form>
<form action="FoodMenuServelet" method="get">
<input type="image" class="category-card" src="./assets/images/masala-dosa.png"/>
    <input type="hidden" value="dosa" name="menuType" />  
</form>
<form action="FoodMenuServelet" method="get">
<input type="image" class="category-card" src="./assets/images/rice.png"/>
    <input type="hidden" value="rice" name="menuType" />  
</form>

</div>
</section>
<section class="">
<div class="grid-container">
<%for(int i=0;i<foodItems.size();i++){%>
	<%Food food = (Food)foodItems.get(i); %>
	
	<div class="food-card trigger"  style="width:100%; id=<%=food.getId()%> " >
<div class="food-img " style="  background-image:url('./assets/images/pizza1.jpg');
">
<i class="fa fa-solid fa-heart fav-icon"></i>
</div>
<div class="food-card-content">
	<p style="font-weight:bold;"><%=food.getName()%></p>
			<div class="ratings"><p><%=food.getRatings()%></p><span><i class="fa fa-star"></i></span></div>
	
</div>
<div>	
			<p class="price" style="padding: 0 1rem 1rem 1rem;"><%=food.getPrice()%>$</p>
	<form action="FoodDetailsServelet" method="get" class="form-category">
	<input type="hidden" name="id" value=<%=food.getId()%>/>
	<input type="submit" value="VIEW" class="details-btn"/>
	</form>
</div>
</div>

<%}%>
<!--  <form action="../java/categoryServlet" method="get">-->
</div>
</section>

</main>
</body>

</html>
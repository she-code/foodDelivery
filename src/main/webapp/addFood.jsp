<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="AddFoodServlet" method="post" enctype="multipart/form-data">
<label for="name">Name</label>
<input type="text" name="name"/>
<label for="price">price</label>
<input type="text" name="price"/>
<label for="descriptions">descriptions</label>
<input type="text" name="descriptions"/>
<label for="quantity">quantity</label>
<input type="text" name="quantity"/>
<label for="weight">weight</label>
<input type="text" name="weight"/>
<label for="highlights">highlights</label>
<input type="text" name="highlights"/>
<label for="ratings">ratings</label>
<input type="text" name="ratings"/>
<label for="category">category</label>
<input type="text" name="category"/>
<label for="image">image</label>
<input type="file" name="image" size="50"/>
<label for="isVeg">isVeg</label>
<input type="text" name="isVeg"/>

<input type="submit" value="submit"/>
</form>
</body>
</html>

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import foodDelivery.UserConnector;
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		
		
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		
		
		UserConnector dao=new UserConnector();
		boolean result=dao.validate(email,password);
		request.setAttribute("loggedIn",result);
		String res = new Boolean(result).toString();
		log(res);

		  if(result){
			  request.setAttribute("loggedIn", result);
			  Cookie cookie=new Cookie("loggedIn",res);
			//adding cookie in the response
			response.addCookie(cookie);
			  
			RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
			rd.include(request, response);
		}
		else{
			RequestDispatcher rd=request.getRequestDispatcher("log.jsp");
			
			rd.include(request, response);
		}
		
		
	}

}
//<table>
//<tbody>
//<%ArrayList<Food> foods =(ArrayList<Food>) request.getAttribute("foodItems");
//
//for(Food food:foods){%><tr><td><%=food.getName()%></td></tr><%}%>
//
//</tbody>
//
//</table>
//
//<div class="food-card trigger"  style="width:100%; " >
//<div class="food-img food-img2" style="background-image:url(./assets/images/noodles3.jpg;)">
//<i class="fa fa-solid fa-heart fav-icon"></i>
//</div>
//<div class="food-card-content">
//	<p style="font-weight:bold;" >Massala Noodles</p>
//			<div class="ratings"><p>4.5</p><span><i class="fa fa-star"></i></span></div>
//	
//</div>
//<div id="food_list">	
//			<p class="price" style="padding: 0 1rem 1rem 1rem;">25$</p>
//	
//</div>
//</div>
//<div class="food-card trigger"  style="width:100%; " >
//<div class="food-img food-img2" >
//<i class="fa fa-solid fa-heart fav-icon"></i>
//</div>
//<div class="food-card-content">
//	<p style="font-weight:bold;">Chinese Pizza</p>
//			<div class="ratings"><p>4.5</p><span><i class="fa fa-star"></i></span></div>
//	
//</div>
//<div>	
//			<p class="price" style="padding: 0 1rem 1rem 1rem;">55$</p>
//	
//</div>
//</div>
//<div class="food-card trigger"  style="width:100%; " >
//<div class="food-img food-img2" style="background-image:url(./assets/images/noodlesEgg.jpg;)">
//<i class="fa fa-solid fa-heart fav-icon"></i>
//</div>
//<div class="food-card-content">
//<%= foodItems.size() %>
//
//			<div class="ratings"><p>4</p><span><i class="fa fa-star"></i></span></div>
//	
//</div>
//<div class="price-cart-holder">	
//			<p class="price" style="padding: 0 1rem 1rem 1rem;">20$</p>
//			 <div class="cart-container ">
//<i class="fa fa-shopping-cart" style="color: white; margin:auto;"></i>
//
//</div>
//	
//</div>
//</div>
//<div class="food-card trigger"  style="width:100%; " >
//<div class="food-img food-img2" style="background-image:url(./assets/images/noodles2.jpg;)">
//<i class="fa fa-solid fa-heart fav-icon"></i>
//</div>
//<div class="food-card-content">
//	<p style="font-weight:bold;">Chesse Pizza</p>
//			<div class="ratings"><p>3.9</p><span><i class="fa fa-star"></i></span></div>
//	
//</div>
//<div>	
//			<p class="price" style="padding: 0 1rem 1rem 1rem;">25$</p>
//	
//</div>
//</div>
//<!--</form>-->
//
//</div>
//</section>

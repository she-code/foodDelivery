

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import com.google.gson.Gson;

import foodDelivery.FoodController;
import foodDelivery.models.Food;
@WebServlet("/MenuServelet")
/**
 * Servlet implementation class MenuServelet
 */
public class MenuServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		
		PrintWriter out = response.getWriter();
		String menuType=request.getParameter("menuType");
		FoodController foodController=new FoodController();
		ArrayList<Food> foods=foodController.displayMenu(menuType);
		out.print(foods);
		request.setAttribute("foodItems",foods);
		RequestDispatcher rs=request.getRequestDispatcher("menu.jsp");
		rs.forward(request, response);
//		
	

}
}

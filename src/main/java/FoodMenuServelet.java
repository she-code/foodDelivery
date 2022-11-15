

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import foodDelivery.FoodController;
import foodDelivery.models.Food;
@WebServlet("/FoodMenuServelet")


public class FoodMenuServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();		
		String menuType=request.getParameter("menuType").trim();
		FoodController foodController=new FoodController();
		ArrayList<Food> foods=foodController.displayCategoryMenu(menuType.trim());
		out.print(foods);
		request.setAttribute("foodItems",foods);
		RequestDispatcher rs=request.getRequestDispatcher("menu.jsp");
		rs.forward(request, response);
	}
}

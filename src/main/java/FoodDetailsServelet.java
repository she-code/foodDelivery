

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import foodDelivery.FoodController;
import foodDelivery.models.Food;

/**
 * Servlet implementation class FoodDetailsServelet
 */
public class FoodDetailsServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FoodDetailsServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	response.setContentType("text/html");
		
		
		PrintWriter out = response.getWriter();
		String food_id= request.getParameter("id").substring(0, request.getParameter("id").length()-1);
		int id=Integer.parseInt(food_id.trim());
		FoodController foodController=new FoodController();
		ArrayList<Food> foods=foodController.displayFoodDetails(id);
		out.print(foods);
		request.setAttribute("foodDetails",foods);
		RequestDispatcher rs=request.getRequestDispatcher("foodDetails.jsp");
		rs.forward(request, response);	}

	
}

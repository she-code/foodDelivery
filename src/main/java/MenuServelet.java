

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
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
		
		
		
		String menuType=request.getParameter("menuType");
		FoodController foodController=new FoodController();
		List<Food> foods=foodController.displayMenu(menuType);
		Gson json = new Gson();
		String foodList=json.toJson(foods);
		response.setContentType("text/html");
		response.getWriter().write(foodList);
	
		
	}
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		List<Food> foods=new ArrayList<Food>();
//		//JSONObject obj= new JsonObject();
//		String menuType = request.getParameter("menuType");
//		PrintWriter out = response.getWriter();
//
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/foodDeliverys","root","");
//			String query ="select * from foods where category=?";
//			PreparedStatement st = con.prepareStatement(query);
//			st.setString(1, "pizza");
//			ResultSet result = st.executeQuery();
//			if(result.next()) {
//				//log(result.toString());
//				while(result.next()) {
//					out.print(result);
//
////					Food food = new Food();
////					food.setId(result.getInt(1));
////					food.setCategory(result.getString("category"));
////					food.setCreated_At(result.getDate("creatd_at"));
////					food.setDescriptions(result.getString("description"));
////					food.setHighlights(result.getString("highlights"));
////					food.setName(result.getString("name"));
////					food.setWeight(Double.parseDouble(result.getString("weight")));
////					food.setPrice(Double.parseDouble(result.getString("price")));
////					food.setQuanrity(Double.parseDouble(result.getString("quantity")));
////					food.setImage(result.getBlob("image"));
////					food.setVeg(result.getBoolean("isVeg"));
////					food.setRatings(result.getDouble("ratings"));
////					foods.add(food);
//				}
//				//log(foods.toString());
//				request.setAttribute("result", foods);
//				//out.print(foods);
//				}
//			else {
//				log("ërror");
//			}
//			con.close();
//
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}  
//		
////				.trim();
////		if(menuType == null || "".equals(menuType)){
////			menuType = "Guest";
////		}
////		
////		String greetings = "Hello " + menuType;
////		
////		response.setContentType("text/plain");
////		response.getWriter().write(greetings);
//	}

	

}

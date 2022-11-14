
import java.text.ParseException;
import java.text.SimpleDateFormat;  
import java.util.Date;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import foodDelivery.FoodController;

@MultipartConfig(maxFileSize = 16177215)

public class AddFoodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			//String food_id=request.getParameter("food_id");
		 String name=request.getParameter("name");
		 String price=request.getParameter( "price");
		 String weight=request.getParameter("weight");
		 String descriptions=request.getParameter("descriptions");
		 String category=request.getParameter( "category");
		 String ratings=request.getParameter("ratings");
		 String isVeg=request.getParameter( "isVeg");
		 String highlights=request.getParameter( "highlights");
		// String createdAt=request.getParameter("created_At");
		 String quantity=request.getParameter("quantity");
		// Date created_At;
		 
		 InputStream image = null; // input stream of the upload file
         
	        // obtains the upload file part in this multipart request
	        Part filePart = request.getPart("image");
	        if (filePart != null) {
	            // prints out some information for debugging
	            System.out.println(filePart.getName());
	            System.out.println(filePart.getSize());
	            System.out.println(filePart.getContentType());
	             
	            // obtains input stream of the upload file
	            image = filePart.getInputStream();
	        }
			//created_At = new SimpleDateFormat("dd/MM/yyyy").parse(createdAt);
			 FoodController food = new FoodController();
			 boolean created = food.addFood(
					//Integer.parseInt(food_id),
					  name,
					 Double.parseDouble(price),
					 Double.parseDouble(weight),
					  descriptions,
					  image,
					  category,
					  Double.parseDouble(ratings),
					  Boolean.parseBoolean(isVeg),
					  highlights,
					//  created_At,				
					  Double.parseDouble(quantity)
						 );
			 String res = new Boolean(created).toString();
				log(res);
			 if(created) {
				 
				  
					RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
					rd.include(request, response);
				}
				else{
					RequestDispatcher rd=request.getRequestDispatcher("log.jsp");
					
					rd.include(request, response);
				}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

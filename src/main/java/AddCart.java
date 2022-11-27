

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import foodDelivery.cartController;

/**
 * Servlet implementation class AddCart
 */
public class AddCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
//			int product_id = Integer.parseInt(request.getParameter("product_id"));
//			double total_amount = Double.parseDouble(request.getParameter("total_amount"));
//			int customer_id = Integer.parseInt(request.getParameter("customer_id"));
//			int quantity= Integer.parseInt(request.getParameter("quantity"));
//			
			cartController cart = new cartController();
			boolean cartCreated = cart.addToCart( 4, 200,  1, 3);
			request.setAttribute("cartCreated", cartCreated);
			String res = new Boolean(cartCreated).toString();
			log(res);
			if(cartCreated) {
				 
				  
				RequestDispatcher rd=request.getRequestDispatcher("OrderSummary.jsp");
				rd.include(request, response);
			}
			else{
				RequestDispatcher rd=request.getRequestDispatcher("menu.jsp");
				
				rd.include(request, response);
			}
		}catch(Exception e) {
		}
		}
	}



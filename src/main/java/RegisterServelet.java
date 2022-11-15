

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import com.google.gson.Gson;

import foodDelivery.UserConnector;
import foodDelivery.models.Users;

/**
 * Servlet implementation class RegisterServelet
 */
public class RegisterServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		
		String firstName=request.getParameter("firstName");
	 String lastName =request.getParameter("lastName");
	 int phone=Integer.parseInt(request.getParameter("phone"));
	 String default_shipping_address=request.getParameter("default_shipping_address");
	 
		UserConnector dao=new UserConnector();
		boolean result=dao.register(firstName,password,email,lastName,phone,default_shipping_address);	
		
		Gson gson = new Gson();
		Cookie userCookie = new Cookie("userCookie",URLEncoder.encode(gson.toJson(result),"UTF-8"));
		userCookie.setMaxAge(720000);
		response.addCookie(userCookie);
		if(result){
			  request.setAttribute("registered", result);
			//adding cookie in the response
			  
			RequestDispatcher rd=request.getRequestDispatcher("log.jsp");
			rd.include(request, response);
		}
		else{
			RequestDispatcher rd=request.getRequestDispatcher("register.jsp");
			
			rd.include(request, response);
		}
		
		
	
	}

}


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

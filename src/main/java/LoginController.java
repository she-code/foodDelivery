

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import foodDelivery.UserConnector;
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html");
		
		
		
		
		String password=request.getParameter("pass");
		String eid=request.getParameter("eid");
		
		
		UserConnector dao=new UserConnector();
	boolean bean=dao.validate(eid,password);
		request.setAttribute("bean",bean);
		
		
		
		if(bean){
			RequestDispatcher rd=request.getRequestDispatcher("../views/home.jsp");
			rd.forward(request, response);
		}
		else{
			RequestDispatcher rd=request.getRequestDispatcher("../views/login.jsp");
			rd.forward(request, response);
		}
		
		
	}

}

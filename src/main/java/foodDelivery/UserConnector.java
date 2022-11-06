package foodDelivery;

import java.sql.*;



public class UserConnector {
	
	public boolean validate(String email, String password) {
	try {
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/foodDelivery","root","");  
		Statement st = con.createStatement();
		ResultSet user= st.executeQuery("select * from employee where email='"
				+email + "' and password = '" + password +"'");
		if(user.next()) {
			return true;
		}
		con.close();

	}
	catch(Exception e) {
		System.out.println(e);
	}
	return false;

}
}
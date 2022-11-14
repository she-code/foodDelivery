package foodDelivery;

import java.sql.*;



public class UserConnector {
	
	public void register() {
		
	}
	
	public boolean validate(String email, String password) {
	try {
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/foodDeliverys","root","");  
		Statement st = con.createStatement();
		System.out.printf(email,password);
		ResultSet user= st.executeQuery("select * from users where email='"
				+email + "' and password = '" + password +"'");
		System.out.println(user);

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
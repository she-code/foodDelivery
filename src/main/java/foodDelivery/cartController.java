package foodDelivery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class cartController {
public boolean addToCart(int product_id,double total_amount, int customer_id,int quantity) {
	try {
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/foodDeliverys","root","");  
		PreparedStatement  st = con.prepareStatement("INSERT INTO cart(customer_id,product_id,total_amount"
				+ ",quantity) "
				+ "VALUES(?,?,?,?)");
		//st.setInt(1, food_id);
		st.setInt(1, customer_id);
		st.setInt(2, product_id);
	st.setDouble(3, total_amount);
	//	st.setDate(9, (java.sql.Date) created_At);
		st.setInt(4,quantity);

		int created = st.executeUpdate();
		if(created == 0) {
			return false;
		}

	}
	catch(Exception e) {
		System.out.println(e);
	}
		return true;
	}
}

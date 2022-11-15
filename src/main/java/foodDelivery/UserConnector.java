package foodDelivery;

import java.sql.*;

import foodDelivery.models.Users;



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
	public Users login(String email,String password) {
		Users user = new Users();
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/foodDeliverys","root","");  
			Statement st = con.createStatement();
			System.out.printf(email,password);
			ResultSet rs= st.executeQuery("select * from users where email='"
					+email + "' and password = '" + password +"'");
			System.out.println(user);

			if(rs.next()) {
				user.setEmail(rs.getString("email"));
				user.setUser_id(rs.getInt("user_id"));
				user.setFirstName(rs.getString("firstName"));
				user.setLastName(rs.getString("lastName"));
				user.setPhone(rs.getInt("phone"));
				user.setRole(rs.getString("role"));
				user.setDefault_shipping_address(rs.getString("default_shipping_address"));
			}
			con.close();

		}
		catch(Exception e) {
			System.out.println(e);
		}
		return user;
	}
	public boolean register(String firstName,String password,String email,String lastName,int phone,String default_shipping_address
			){
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/foodDeliverys","root","");  
		PreparedStatement st = con.prepareStatement("insert into users(firstName,password,email,lastName,phone,default_shipping_address) values(?,?,?,?,?,?)");
		st.setString(1,firstName);
		 st.setString(2,password);
		 st.setString(3,email);
		 st.setString(4, lastName);
		 st.setInt(5,phone);
		 st.setString(6,default_shipping_address);
		 
		 
		 int val = st.executeUpdate(); 
		 
		if(val!=0)  
		    return true;
		con.close();  
		}catch(Exception e){ System.out.println(e);}      
		return false;
	}
}
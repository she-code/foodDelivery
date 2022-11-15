package foodDelivery;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import foodDelivery.models.Food;
import jakarta.servlet.annotation.MultipartConfig;


public class FoodController {

	public boolean addFood (
			//int food_id,
	 String name,
	 double price,
	 double weight,
	 String descriptions,
	 InputStream image,
	 String category,
	 double ratings,
	 boolean isVeg,
	 String highlights,
	// Date created_At,
	 double quanrity) {
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/foodDeliverys","root","");  
			PreparedStatement  st = con.prepareStatement("INSERT INTO foods(price,category,description"
					+ ",highlights,isVeg,name,quantity,ratings,weight,image) "
					+ "VALUES(?,?,?,?,?,?,?,?,?,?)");
			//st.setInt(1, food_id);
			st.setDouble(1, price);
			st.setString(2, category);
			st.setString(3,descriptions);
			st.setString(4, highlights);
			st.setBoolean(5, isVeg);
			st.setString(6,name);
			st.setDouble(7, quanrity);
		//	st.setDate(9, (java.sql.Date) created_At);
			st.setDouble(8,ratings);
			st.setDouble(9, weight);
			if (image != null) {
                // fetches input stream of the upload file for the blob column
               // st.setBlob(10, image);
				st.setBinaryStream(10, image,1000000);            }
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
	public ArrayList<Food> displayFoodDetails(int id) {
		ArrayList <Food> foodList = new ArrayList<Food>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/foodDeliverys","root","");
			String query ="select * from foods where food_id=?";
			//Statement st = con.createStatement();
			PreparedStatement st = con.prepareStatement(query);
			st.setInt(1, id);
			//st.setString(1,"pizza");
			ResultSet result = st.executeQuery();
			//if(result.next()) {
				//System.out.println(result);
				//log(result.toString());
				while(result.next()) {
					Food food = new Food();
					food.setId(result.getInt(1));
					food.setCategory(result.getString("category"));
					food.setCreated_At(result.getDate("created_at"));
					food.setDescriptions(result.getString("description"));
					food.setHighlights(result.getString("highlights"));
					food.setName(result.getString("name"));
					food.setWeight(Double.parseDouble(result.getString("weight")));
					food.setPrice(Double.parseDouble(result.getString("price")));
					food.setQuanrity(Double.parseDouble(result.getString("quantity")));
					food.setImage(result.getBlob("image"));
					food.setVeg(result.getBoolean("isVeg"));
					food.setRatings(result.getDouble("ratings"));
					foodList.add(food);
				}
				//log(foods.toString());
				//request.setAttribute("result", food);
				//out.print(foods);
				//}
			con.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return foodList;
	}
	public ArrayList<Food> displayMenu(String menuType) {
		ArrayList <Food> foodList = new ArrayList<Food>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/foodDeliverys","root","");
			String query ="select * from foods ";
			Statement st = con.createStatement();
			//PreparedStatement st = con.prepareStatement(query);
			//st.setString(1,"pizza");
			ResultSet result = st.executeQuery(query);
			//if(result.next()) {
				//System.out.println(result);
				//log(result.toString());
				while(result.next()) {
					Food food = new Food();
					food.setId(result.getInt(1));
					food.setCategory(result.getString("category"));
					food.setCreated_At(result.getDate("created_at"));
					food.setDescriptions(result.getString("description"));
					food.setHighlights(result.getString("highlights"));
					food.setName(result.getString("name"));
					food.setWeight(Double.parseDouble(result.getString("weight")));
					food.setPrice(Double.parseDouble(result.getString("price")));
					food.setQuanrity(Double.parseDouble(result.getString("quantity")));
					food.setImage(result.getBlob("image"));
					food.setVeg(result.getBoolean("isVeg"));
					food.setRatings(result.getDouble("ratings"));
					foodList.add(food);
				}
				//log(foods.toString());
				//request.setAttribute("result", food);
				//out.print(foods);
				//}
			con.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return foodList;
	}
	public ArrayList<Food> displayCategoryMenu(String menuType) {
		ArrayList <Food> foodList = new ArrayList<Food>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/foodDeliverys","root","");
			String query ="select * from foods where category=?";
			//Statement st = con.createStatement();
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1,menuType);
			ResultSet result = st.executeQuery();
			//if(result.next()) {
				//System.out.println(result);
				//log(result.toString());
				while(result.next()) {
					Food food = new Food();
					food.setId(result.getInt(1));
					food.setCategory(result.getString("category"));
					food.setCreated_At(result.getDate("created_at"));
					food.setDescriptions(result.getString("description"));
					food.setHighlights(result.getString("highlights"));
					food.setName(result.getString("name"));
					food.setWeight(Double.parseDouble(result.getString("weight")));
					food.setPrice(Double.parseDouble(result.getString("price")));
					food.setQuanrity(Double.parseDouble(result.getString("quantity")));
					food.setImage(result.getBlob("image"));
					food.setVeg(result.getBoolean("isVeg"));
					food.setRatings(result.getDouble("ratings"));
					foodList.add(food);
				}
				//log(foods.toString());
				//request.setAttribute("result", food);
				//out.print(foods);
				//}
			con.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return foodList;
	}
	}


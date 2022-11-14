package foodDelivery.models;
import java.io.InputStream;
import java.sql.Blob;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Food {
private	int food_id;
private String name;
private double price;
private double weight;
private String descriptions;
private Blob  image;
private String category;
private double ratings;
private boolean isVeg;
private String highlights;
private Date created_At;
private double quanrity;
public int getId() {
	return food_id;
}
public void setId(int id) {
	this.food_id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public double getWeight() {
	return weight;
}
public void setWeight(double weight) {
	this.weight = weight;
}
public String getDescriptions() {
	return descriptions;
}
public void setDescriptions(String descriptions) {
	this.descriptions = descriptions;
}
public Blob  getImage() {
	return image;
}
public void setImage(Blob  blob) {
	this.image = blob;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public double getRatings() {
	return ratings;
}
public void setRatings(double ratings) {
	this.ratings = ratings;
}
public boolean isVeg() {
	return isVeg;
}
public void setVeg(boolean isVeg) {
	this.isVeg = isVeg;
}
public String getHighlights() {
	return highlights;
}
public void setHighlights(String highlights) {
	this.highlights = highlights;
}
public Date getCreated_At() {
	return created_At;
}
public void setCreated_At(java.sql.Date date) {
	
		this.created_At = date;
	
	
	
}
public double getQuanrity() {
	return quanrity;
}
public void setQuanrity(double quanrity) {
	this.quanrity = quanrity;
}


}

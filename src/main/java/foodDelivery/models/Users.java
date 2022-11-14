package foodDelivery.models;

public class Users {
 private int user_id;
 private String firstName;
 private String lastName;
 private String email;
 private String password;
 private int phone;
 private String role;
 private String default_shipping_address;
public int getUser_id() {
	return user_id;
}
public void setUser_id(int user_id) {
	this.user_id = user_id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getPhone() {
	return phone;
}
public void setPhone(int phone) {
	this.phone = phone;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public String getDefault_shipping_address() {
	return default_shipping_address;
}
public void setDefault_shipping_address(String default_shipping_address) {
	this.default_shipping_address = default_shipping_address;
}
}

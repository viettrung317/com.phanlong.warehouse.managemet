package com.phanlong.warehouse.management.models;

public class User {
	private String userName;
	private String numberPhone;
	private String email;
	private String password;
	
	
	public User(String userName, String numberPhone, String email) {
		super();
		this.userName = userName;
		this.numberPhone = numberPhone;
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getNumberPhone() {
		return numberPhone;
	}
	public void setNumberPhone(String numberPhone) {
		this.numberPhone = numberPhone;
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
	
}

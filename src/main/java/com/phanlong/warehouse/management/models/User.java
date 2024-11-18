package com.phanlong.warehouse.management.models;

import java.util.Set;

public class User {
	private int id;
	private String userName;
	private String numberPhone;
	private String passWord;
	private String email;
	private Set<Role> roles;
	public User(int id, String userName, String numberPhone, String passWord, String email, Set<Role> roles) {
		super();
		this.id = id;
		this.userName = userName;
		this.numberPhone = numberPhone;
		this.passWord = passWord;
		this.email = email;
		this.roles = roles;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
}
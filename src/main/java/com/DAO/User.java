package com.DAO;

import java.sql.Date;

import javax.xml.bind.DataBindingException;

public class User {
	private String username;
	private String password;
	private String fullName;
	private Date birthday;
	
	public User(String username, String password, String fullName, Date birthday) {
		super();
		this.username = username;
		this.password = password;
		this.fullName = fullName;
		this.birthday = birthday;
	}
	public User() {
		super();
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	
	
}

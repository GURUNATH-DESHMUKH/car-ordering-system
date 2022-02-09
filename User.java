package com.example.PracticeOfSpringBoot;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="UserDetails")
public class User {
	
	@Id
	private String username;
	private String email;
	private String phno;
	private String password;
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhno() {
		return phno;
	}
	
	public void setPhno(String phno) {
		this.phno = phno;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public User(String username, String email, String phno, String password) {
		super();
		this.username = username;
		this.email = email;
		this.phno = phno;
		this.password = password;
	}
	
	public User() {
		super();
	}
}
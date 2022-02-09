package com.example.PracticeOfSpringBoot;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DealerDetails")
public class Dealer {
	
	@Id
	private String username;
	private String email;
	private String dealershipName;
	private String dealershipAddress;
	private String phno;
	private String password;
	public Dealer() {
		super();
	}
	public Dealer(String username, String email, String dealershipName, String dealershipAddress, String phno,
			String password) {
		super();
		this.username = username;
		this.email = email;
		this.dealershipName = dealershipName;
		this.dealershipAddress = dealershipAddress;
		this.phno = phno;
		this.password = password;
	}
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
	public String getDealershipName() {
		return dealershipName;
	}
	public void setDealershipName(String dealershipName) {
		this.dealershipName = dealershipName;
	}
	public String getDealershipAddress() {
		return dealershipAddress;
	}
	public void setDealershipAddress(String dealershipAddress) {
		this.dealershipAddress = dealershipAddress;
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
	
	
}
package com.app.core;

import java.time.LocalDate;

public class Customers{
	private String email;
	private String password;
	private double regAmt;
	private LocalDate regDate;
	
	public Customers(String email, String password, double regAmt, LocalDate regDate) {
		this.email = email;
		this.password = password;
		this.regAmt = regAmt;
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "Customers [email=" + email + ", password=" + password + ", regAmt=" + regAmt + ", regDate=" + regDate
				+ "]";
	}
	

	public LocalDate getRegDate() {
		return regDate;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public double getRegAmt() {
		return regAmt;
	}

	public String getEmail() {
		return email;
	}


}
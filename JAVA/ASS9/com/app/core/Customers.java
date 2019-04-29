package com.app.core;

import java.time.LocalDate;

public class Customers implements Comparable<Customers>{
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
	
	public Customers(String email) {
		this.email = email;
	}
	
	public Customers(String email, String password) {
		this.email=email;
		this.password=password;
	}

	@Override
	public String toString() {
		return "Customers [email=" + email + ", password=" + password + ", regAmt=" + regAmt + ", regDate=" + regDate
				+ "]";
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Customers)
			return email.equals(((Customers) o).email);
		return false;
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
	
	@Override
	public int compareTo(Customers o) 
    {
			//int cp=(email.compareTo(((Customers) o).email));
			int cp = ((String)email).compareTo(((Customers) o).getEmail());
					return cp;
    }

	public double getRegAmt() {
		return regAmt;
	}

	public String getEmail() {
		return email;
	}

}

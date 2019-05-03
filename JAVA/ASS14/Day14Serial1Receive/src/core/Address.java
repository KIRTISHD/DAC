package core;

import java.io.Serializable;

public class Address implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;

	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}

	private String city;

	public String getCity() {
		return city;
	}

	public Address(String city) {
		super();
		this.city = city;
	}
}

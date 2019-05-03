package core;


public class Address{
	

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

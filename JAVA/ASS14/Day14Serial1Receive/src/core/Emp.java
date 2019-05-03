package core;

import java.io.Serializable;

public class Emp implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private int age;
	transient private Address a1;
	
	@Override
	public String toString() {
		return "Emp [name=" + name + ", age=" + age + ", a1=" + a1 + "]";
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}


	public Emp(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void fillAddress(String city) {
		a1 = new Address(city);
	}
	
	

}

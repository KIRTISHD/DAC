package core;

import java.io.Serializable;
import java.time.LocalDate;

public class Emp extends Dept implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private String city;
	private int salary;
	private LocalDate hireDate;
	
	/*public Emp(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}*/

	public Emp(String name, int age, String city,int salary,LocalDate hireDate, String deptname) {
		super(deptname);
		this.name = name;
		this.age = age;
		this.city = city;
		this.salary = salary;
		this.hireDate = hireDate;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", age=" + age + ", city=" + city + ", salary=" + salary + ", hireDate=" + hireDate
				+ ", toString()=" + super.toString() + "]";
	}

	public int getSalary() {
		return salary;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	


	
}

package business;

public abstract class Emp {
	private int id;
	private String email;
	private String name;
	private String dept;
	private double basic;
	
	public double getBasic() {
		return basic;
	}

	private static int int_gen;
	
	static {
		int_gen =100;
	}
	public Emp(String name,String email,String dept,double basic){
		this.id=int_gen++;
		this.name=name;
		this.email=email;
		this.dept=dept;
		this.basic=basic;
	}

	public String toString() {
		return "Id-"+id+" | Name-"+name+" | Email-"+ email+ " | dept-"+dept+" | Basic-"+ basic;
	}
	
	public void setBasic(double basic) {
		this.basic = basic;
	}

	public abstract double computeNetSalary();
}

package business;

public abstract class Emp {
	private int id;
	private String email;
	private String name;
	private int deptId;
	private double basic;
	
	public double getBasic() {
		return basic;
	}

	private static int int_gen;
	
	static {
		int_gen =100;
	}
	public Emp(String name,String email,int deptId,double basic){
		this.id=int_gen++;
		this.name=name;
		this.email=email;
		this.deptId=deptId;
		this.basic=basic;
	}

	public String toString() {
		return "Id-"+id+" | Name-"+name+" | Email-"+ email+ " | deptId-"+deptId+" | Basic-"+ basic;
	}
	
	public void setBasic(double basic) {
		this.basic = basic;
	}

	public abstract double computeNetSalary();
}

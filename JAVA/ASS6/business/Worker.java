package business;

public class Worker extends Emp{
	
	private int hrsWorked;
	private double hrsRate;

	public Worker(String name, String email, int deptId, double basic, int hrsWorked, double hrsRate) {
		super(name, email, deptId, basic);
		this.hrsWorked=hrsWorked;
		this.hrsRate=hrsRate;
	}
	
	@Override
	public double computeNetSalary() {
		return getBasic()+(hrsRate*hrsWorked);
	}
	
	@Override
	public String toString() {
		return "Worker--\n"+ super.toString()+" | HrsWorked-"+hrsWorked+" | HrsRate-"+hrsRate;
	}

	public double getHrsRate() {
		return hrsRate;
	}

}

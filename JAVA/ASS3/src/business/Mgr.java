package business;

public class Mgr extends Emp{

	public Mgr(String name, String email, int deptId, double basic, double perfBonus) {
		super(name, email, deptId, basic);
		this.perfBonus=perfBonus;
		// TODO Auto-generated constructor stub
	}

	private double perfBonus;
	
	@Override
	public double computeNetSalary() {
		return perfBonus+getBasic();
	}

	public double getPerfBonus() {
		return perfBonus;
	}
	
	@Override
	public String toString() {
		
		return "Manager--\n"+ super.toString()+" | perfBonus-"+perfBonus;
	}


}

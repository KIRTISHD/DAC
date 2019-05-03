package core;

public class Dept{
	
	private String deptname;

	public Dept(String deptname) {
		this.deptname = deptname;
	}

	@Override
	public String toString() {
		return "Dept [deptname=" + deptname + "]";
	}

	public String getDeptname() {
		return deptname;
	}
	
	

}

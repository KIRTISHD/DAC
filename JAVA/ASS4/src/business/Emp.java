package business;

public class Emp {
	private int id;
	private String name;
	

	private static int int_gen;
	
	static {
		int_gen =100;
	}
	
	public Emp(String name){
		this.id=int_gen++;
		this.name=name;
	}

	public String toString() {
		return "Id-"+id+" | Name-"+name;
	}
	
	
}

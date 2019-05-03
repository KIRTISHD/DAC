package threadClasses;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Comparator;
import java.util.List;

import core.Emp;

public class SortSal implements Runnable{

	private List<Emp> empList;
	private String dept;
	
	public SortSal(List<Emp> empList,String dept) {
		this.empList = empList;
		this.dept=dept;
	}



	@Override
	public void run() {
		String filName="sortsal.dat";
		System.out.println("Sorted by Salary");
		Comparator<Emp> comp = ((h1,h2)-> ((Integer)h1.getSalary()).compareTo(h2.getSalary()));
		empList.stream().filter(e1-> e1.getDeptname().equals(dept)).sorted(comp).forEach(e->System.out.println(e));
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filName))){
			oos.writeObject(empList);
		}catch (Exception e) {
			System.out.println("SorSal error-"+e.getMessage());
		}
	}
	
	

}

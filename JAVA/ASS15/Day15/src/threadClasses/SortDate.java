package threadClasses;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

import core.Emp;

public class SortDate implements Runnable{
	
	private List<Emp> empList;
	String dept;
	
	public SortDate(List<Emp> empList, String dept) {
		this.empList = empList;
		this.dept=dept;
	}

	@Override
	public void run() {
		System.out.println("Sorted by Date");
		Comparator<Emp> comp =((e1,e2) ->  ((LocalDate) e1.getHireDate()).compareTo(e2.getHireDate())); 
		empList.stream().filter(e1-> e1.getDeptname().equals(dept)).sorted(comp).forEach(e1-> System.out.println(e1));
		
	}

}

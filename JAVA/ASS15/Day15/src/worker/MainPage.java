package worker;

import core.Emp;
import threadClasses.SortDate;
import threadClasses.SortSal;

import static collection.CollectionUtils.*;

import java.util.List;
import java.util.Scanner;

public class MainPage {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		List<Emp> empList= populateData();
		
		System.out.println("Enter dept name for 1st thread to sort by salary");
		String dept1 = sc.next();
		System.out.println("Enter dept name for 2st thread to sort by date");
		String dept2 = sc.next();
		Thread t1 = new Thread(new SortSal(empList,dept1),"sort_by_sal");
		Thread t2 = new Thread(new SortDate(empList,dept2),"sort_by_date");
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		// TODO Auto-generated method stub

	}

}

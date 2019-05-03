package main;

import java.util.Scanner;

public class UI {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int begin = sc.nextInt();
		System.out.println("Enter the last number");
		int end = sc.nextInt();
		Thread t1 = null;
		Thread t2 = null;
		if (begin %2 ==0) {
			t1 = new EvenPrinter(begin, end,"EVEN");
			t2 = new OddPrinter(begin, end,"Odd");
			//t2 = new OddPrinter(begin, end,"ODD");s
		}
		else {
			t2 = new OddPrinter(begin, end,"Odd");
			t1 = new EvenPrinter(begin, end,"EVEN");
			/*t2.start();
			t1.start();*/
		}
		
		if (sc!=null) {
			sc.close();
		}
		
		//Thread.sleep(5000);
		t1.join();
		t2.join();
		//t2.join(10000);

	}

}

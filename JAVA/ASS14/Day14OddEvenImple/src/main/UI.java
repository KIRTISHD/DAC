package main;

import java.util.Scanner;

public class UI {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int begin = sc.nextInt();
		System.out.println("Enter the last number");
		int end = sc.nextInt();
		Thread t1,t2;
		if (begin %2 ==0) {
			t1 = new Thread(new EvenPrinter(begin, end),"EVEN");
			t2 = new Thread(new OddPrinter(begin, end),"ODD");
			t1.start();
			t2.start();
		}
		else {
			t2 = new Thread(new OddPrinter(begin, end),"ODD");
			t1 = new Thread(new EvenPrinter(begin, end),"EVEN");
			t2.start();
			t1.start();
		}
		
		
		if (sc!=null) {
			sc.close();
		}
		
		t1.join(10000);
		t2.join(10000);

	}

}

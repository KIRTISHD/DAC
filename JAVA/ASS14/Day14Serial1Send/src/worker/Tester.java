package worker;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import core.Emp;

public class Tester {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		String name,city;
		int age;
		System.out.println("Enter Name");
		name = sc.next();
		System.out.println("Enter Age");
		age = sc.nextInt();
		System.out.println("Enter City");
		city = sc.next();
		System.out.println("Name,Age,City-"+name+" "+age+" "+city);
		try {
			
			ObjectOutputStream ooo = new ObjectOutputStream(new FileOutputStream("hahaha.ser"));
			Emp e1 = new Emp(name,age);
			e1.fillAddress(city);
			ooo.writeObject(e1);
			System.out.println("Jhala");
			ooo.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			
		}
		
		if(sc!=null) {
			sc.close();
		}

	}

}

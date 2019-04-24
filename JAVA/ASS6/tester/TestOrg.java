package tester;

import business.*;
import static utils.ValidationUtils.checkEmail;
import static utils.ValidationUtils.checkBasic;
import static utils.ValidationUtils.checkDept;
import java.util.Scanner;

public class TestOrg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name,email,dept;
		double basic,hrsRate,perfBonus,netSalary;
		int hrsWorked;
		
		int choice,count,counter=0;
		
		System.out.println("Are oo samba----");
		System.out.println("Kitne aadmi hai?");
		count=sc.nextInt();
		System.out.println(count+" sarkar");
		Emp[] emp = new Emp[count];
		//AcptDtls act;
		boolean loop = true;
		while(loop) {
			System.out.println("Kya karna hai Sarkar-");
			System.out.println("1. Hire Manager");
			System.out.println("2. Hire Worker");
			System.out.println("3. Display all");
			System.out.println("4. Display Specific Details of emp");
			System.out.println("5. Delete Emp");
			System.out.println("6. Update emp sal");
			choice=sc.nextInt();
			switch(choice) {
				case 1:
					if (counter<count) {
						try {
							System.out.println("Enter name-");
							name=sc.next();
							System.out.println("Enter email-");
							email=sc.next();
							checkEmail(email);
							System.out.println("Enter dept-");
							dept=sc.next();
							checkDept(dept);
							System.out.println("Enter basic-");
							basic=sc.nextDouble();
							checkBasic(basic);
							System.out.println("Enter Performance Bonus-");
							perfBonus=sc.nextDouble();
							emp[counter++] = new Mgr(name,email,dept,basic,perfBonus);
							break;
						}catch(Exception e) {
							System.out.println(e.getMessage());
							System.out.println("Enter details again");
						}
					}
					else {
						System.out.println("Gang Full");
					}
					break;
				case 2:
					if (counter<count) {
						System.out.println("Enter name-");
						name=sc.next();
						System.out.println("Enter email-");
						email=sc.next();
						System.out.println("Enter deptId-");
						dept=sc.next();
						System.out.println("Enter basic-");
						basic=sc.nextDouble();
						System.out.println("Enter Hour Rate-");
						hrsRate=sc.nextDouble();
						System.out.println("Enter Hour Worked-");
						hrsWorked=sc.nextInt();
						emp[counter++] = new Worker(name,email,dept,basic,hrsWorked,hrsRate);
					}
					else {
						System.out.println("Gang Full");
					}
					break;
				case 3:
					//This will give nullpointer exception in e.computeSalary. DON'T USE IT
					/*for(Emp e: emp) {
						System.out.println(e);
						netSalary = e.computeNetSalary();
						System.out.println("Net Salary-" + netSalary);
					}*/
					System.out.println("---------------------------------------------------------------------");
					for (int i=0; i< counter;i++) {
						System.out.println(emp[i]);
						netSalary = emp[i].computeNetSalary();
						System.out.println("Net Salary-" + netSalary);
						System.out.println("---------------------------------------------------------------------");
					}
					break;
				case 4:
					System.out.println("Enter the emp no whose details you want");
					choice = sc.nextInt();
					choice--;
					if (choice > -1 && choice < counter) {
						System.out.println(emp[choice]);
					}else {
						System.out.println("Still recruiting that number of employees");
						//System.out.println("Invalid emp id");
					}
					break;
				case 5:
					System.out.println("Enter the emp no who you want to convert to probable customer");
					choice = sc.nextInt();
					choice--;
					if (choice > -1 && choice < counter) {
						emp[choice]=null;
					}else {
						System.out.println("Still recruiting that number of employees");
						//System.out.println("Invalid emp id");
					}
					break;
				case 6:
					System.out.println("Enter the emp no who you want to surprise");
					choice = sc.nextInt();
					choice--;
					if (choice > -1 && choice < counter) {
						System.out.println("Current emp details-");
						System.out.println(emp[choice]);
						System.out.println("Enter updated salary");
						basic=sc.nextInt();
						emp[choice].setBasic(basic);
						System.out.println("New emp details-");
						System.out.println(emp[choice]);
					}else {
						System.out.println("Still recruiting that number of employees");
						//System.out.println("Invalid emp id");
					}
					break;
				default:
					System.out.println("Majha chasma ghe aata disat nasel tar");
					loop=false;
			}
			
		}
		
		if (sc!=null) {
			sc.close();
		}
	}

}

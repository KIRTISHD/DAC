package tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import com.app.core.*;

import utils.AmountSorter;
import utils.DateSorter;

import static utils.ValidationRules.*;


public class TestCustomer {
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String email,password,date;
		int index;
		double regamt;
		LocalDate  regd;
		int choice;
		try {
			boolean exit = true;
			List<Customers> cust = new ArrayList<Customers>();
			Customers cs ;
			while(exit) {
				System.out.println("1. Accept new customer");
				System.out.println("2. Display all customers");
				System.out.println("3. Exit");
				System.out.println("4. Login");
				System.out.println("5. Password Badlu");
				System.out.println("6. Customer Udva");
				System.out.println("7. Date dya, Nantar che entries milva");
				System.out.println("8. Sort Email(natural sorting)");
				System.out.println("9. Sort Date(custom sorting)");
				System.out.println("10. Sort Amount(custom sorting)");
				System.out.println("11. Sort Date then Amount(custom sorting)");
				System.out.println("Kya karna hai sarkar");
				choice=sc.nextInt();
				try {
					switch(choice) {
					case 1:
						System.out.println("Enter email");
						email=sc.next();
						checkEmail(email);
						checkIfDuplicate(email,cust);
						System.out.println("Enter password (FORMAT(letters,special symbol(only 1),numbers))");
						password=sc.next();
						checkPassword(password);
						System.out.println("Enter Registration Amount");
						regamt=sc.nextDouble();
						checkRegAmount(regamt);
						System.out.println("Enter Registration Date (Format=DD/M/YYYY)");
						date=sc.next();
						regd=checkRegDate(date);
						cs = new Customers(email,password,regamt,regd);
						cust.add(cs);
						break;
					case 2:
						System.out.println("All customers are-");
						for(Customers cc : cust) {
							System.out.println(cc);
						}
						break;
					case 3:
						exit= false;
						break;
						
					case 4:
						System.out.println("Enter email");
						email=sc.next();
						checkEmail(email);
						System.out.println("Enter password");
						password= sc.next();
						checkPassword(password);
						if (login(email,password,cust)!=-1)
							System.out.println("Login Successful");
						break;
						
					case 5:
						System.out.println("Enter email");
						email=sc.next();
						checkEmail(email);
						System.out.println("Enter password");
						password= sc.next();
						checkPassword(password);
						index=login(email,password,cust);
						if (index!=-1)
							System.out.println("Login Successful");
						System.out.println("Enter new password");
						String newPassword = sc.next();
						checkPassword(newPassword);
						cust.get(index).setPassword(newPassword);
						System.out.println("Password Badalla");
						break;
						
					case 6:
						System.out.println("Enter email");
						email=sc.next();
						checkEmail(email);
						System.out.println("Enter password");
						password= sc.next();
						checkPassword(password);
						index=login(email,password,cust);
						if (index!=-1)
							System.out.println("Login Successful");
						cust.remove(index);
						break;
					
					case 7:
						System.out.println("Enter date (Format=DD/M/YYYY)");
						date = sc.next();
						regd=checkRegDate(date);
						for(Customers cc : cust) {
							if (cc.getRegDate().isAfter(regd)) {
								System.out.println(cc);
							}
						}
						break;
						
					case 8:
						System.out.println("Sorting in ascending order on Email");
						Collections.sort(cust);
						break;
						
					case 9:
						System.out.println("Sorting in ascending order on Date");
						Collections.sort(cust, new DateSorter());
						break;
						
					case 10:
						System.out.println("Sorting in ascending order on Amount");
						Collections.sort(cust, new AmountSorter());
						break;

					case 11:
						System.out.println("Sorting in ascending order on Date then Amount");
						Collections.sort(cust,new Comparator<Customers>() {

							@Override
							public int compare(Customers o1, Customers o2) {
								int p = o1.getRegDate().compareTo(o2.getRegDate());
								if (p ==0) {
									return ((Double)o1.getRegAmt()).compareTo(o2.getRegAmt());
								}
								return p;
							}
							
						});
						break;
						
					default:
						System.out.println("Chashma lava");
						break;
					}
					
				}catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		if(sc!=null)
			sc.close();
	}


	

}

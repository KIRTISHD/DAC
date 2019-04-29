package tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.app.core.*;
import static utils.ValidationRules.*;

public class TestCustomer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String email,password,date;
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
						System.out.println("Enter username");
						email=sc.next();
						checkEmail(email);
						System.out.println("Enter password");
						password= sc.next();
						checkPassword(password);
						if (login(email,password,cust)) {
							
						}
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

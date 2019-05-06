package tester;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import dao.BankDaoImpl;
import pojos.BankAccount;

public class TestBanking {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int choice;
			String username,name,type,password,output;
			double balance;
			BankAccount ac = new BankAccount();
			BankDaoImpl bkDao = new BankDaoImpl();
			List<BankAccount> acList = new ArrayList<BankAccount>();
			boolean loop = true;
			while(loop) {
				System.out.println("1. Login Customer");
				System.out.println("2. Add New Customer");
				System.out.println("3. Sort Customers by Type");
				System.out.println("10. Exit");
				System.out.println("Enter choice now-");
				try {
					choice = sc.nextInt();
					switch(choice) {
						case 1:
							System.out.println("Enter username");
							username= sc.next();
							System.out.println("Enter password");
							password = sc.next();
							ac = new BankAccount(username,password);
							acList = bkDao.loginCustomers(ac);
							if (acList== null) {
								System.out.println("No such Customer found");
								break;
							}
							acList.stream().forEach( e-> System.out.println(e));
							//System.out.println(output);
							break;
							
						case 2:
							System.out.println("Enter username");
							username= sc.next();
							System.out.println("Enter password");
							password = sc.next();
							System.out.println("Enter Ac/Type");
							type = sc.next();
							System.out.println("Opening Balance");
							balance = sc.nextDouble();
							ac = new BankAccount(username,password,type,balance);
							output = bkDao.createCustomer(ac);
							break;
						/*case 3:
							System.out.println("Enter accout type whose sorted list(as per balance) you want to see");
							type = sc.next();
							acList = bkDao.displayPraticularTypeCustomers(type);
							if (ac == null) {
								System.out.println("No such type found");
								break;
							}
							Comparator<Accounts> comparator = ((a1,a2) -> (((Double)a1.getBal()).compareTo(a2.getBal())));
							acList.stream().sorted(comparator).forEach(a->System.out.println(a));
							break;*/
						case 10:
							bkDao.cleanup();
							loop = false;
							break;
							
					}
				}catch(Exception e) {
					System.out.println("error-"+e);
					e.printStackTrace();
				}
				sc.nextLine();
			}
		}catch (Exception e) {
			System.out.println("Exception in Scanner"+ e);
			e.printStackTrace();
		}

	}

}

package utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import com.app.core.Customers;

import cust_excs.CustomerHandlingException;

public class ValidationRules {
	public static DateTimeFormatter dtf;
	public static LocalDate beginFinancialYear;
	public static LocalDate endFinancialYear;
	
	static {
		dtf = DateTimeFormatter.ofPattern("d/M/yyyy");
	}
	
	public static void checkEmail(String email) throws CustomerHandlingException {
		if (email.length() < 5 || email.length()>10) {
			throw new CustomerHandlingException("Email Length not within limits");
		}
	}
	
	public static void checkPassword(String password) throws CustomerHandlingException {
		if(!password.matches("[a-z]+[@,%,#,&,*][0-9]+")) {
			throw new CustomerHandlingException("Password error");
		}
	}
	
	public static void checkRegAmount(double regAmt) throws CustomerHandlingException {
		if(regAmt%500 != 0) {
			throw new CustomerHandlingException("Wrong Amount");
		}
	}
	
	public static LocalDate checkRegDate(String dates) throws CustomerHandlingException {
		LocalDate dt = LocalDate.parse(dates,dtf);
		//if date given is before 1 April 20xx then financial year end will be in same year
		if (LocalDate.now().getMonthValue() >= 4) {
			beginFinancialYear = LocalDate.of(LocalDate.now().getYear(), 04, 01);
			endFinancialYear = LocalDate.of(LocalDate.now().getYear()+1, 03, 31);
		}
		// if date given is after 1 April 20xx then financial year end for him will come next year
		else {
			beginFinancialYear = LocalDate.of(LocalDate.now().getYear()-1, 04, 01);
			endFinancialYear = LocalDate.of(LocalDate.now().getYear(), 03, 31);
		}
		
		if (dt.isAfter(endFinancialYear) || dt.isBefore(beginFinancialYear)) {
			throw new CustomerHandlingException("Account Expired, Parat banva");
		}
		return dt;
	}
	
	public static boolean checkIfDuplicate(String email, List<Customers> cs) throws CustomerHandlingException{
		Customers cc = new Customers(email);
		if (cs.contains(cc))
			throw new CustomerHandlingException("Parat email disla");
		return true;
	}
	
	public static int login(String email, String password, List<Customers> cust) throws CustomerHandlingException {
		Customers cs = new Customers(email,password);
		int index = cust.indexOf(cs);
		if (index == -1) {
			throw new CustomerHandlingException("Register kar ki adhi");
		}
		if (password.equals(cust.get(index).getPassword())) {
			return index;
		}
		else
			throw new CustomerHandlingException("Email barobar, passsword chukla");
		
	}
	
}

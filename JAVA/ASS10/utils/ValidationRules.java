package utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;

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
	
	public static boolean checkIfDuplicate(String email, Map<String,Customers> cs) throws CustomerHandlingException{
		if (cs.containsKey(email))
			throw new CustomerHandlingException("Parat email disla");
		return true;
	}
	
	public static int login(String email, String password, Map<String,Customers> cs) throws CustomerHandlingException {
		Customers cst = cs.get(email);
		if (cst == null) {
			throw new CustomerHandlingException("Register kar ki adhi");
		}
		if (password.equals(cst.getPassword())) {
			return 0;
		}
		else
			throw new CustomerHandlingException("Email barobar, passsword chukla");
		
	}
	
}
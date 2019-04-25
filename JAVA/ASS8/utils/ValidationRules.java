package utils;

import cust_excs.CustomerHandlingException;

public class ValidationRules {
	
	public static void checkEmail(String email) throws CustomerHandlingException {
		if (email.length() < 5 || email.length()>10) {
			throw new CustomerHandlingException("Email Length not within limits");
		}
	}
	
	public static void checkPassword(String password) throws CustomerHandlingException {
		if(!password.matches("[a-z]+[@,%,#,&,*][0-9]+")) {
			throw new CustomerHandlingException("");
		}
	}
	
	public static void checkRegAmount(double regAmt) throws CustomerHandlingException {
		if(regAmt%500 != 0) {
			throw new CustomerHandlingException("");
		}
	}
	
	
}

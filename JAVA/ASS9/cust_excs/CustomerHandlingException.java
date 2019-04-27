package cust_excs;

@SupressWarnings("serial")
public class CustomerHandlingException extends Exception {
	public CustomerHandlingException(String msg) {
		super(msg);
	}
}

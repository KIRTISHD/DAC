package dao;

import java.util.List;

import pojos.BankAccount;

public interface IBankDao {
	
	List<BankAccount> loginCustomers(BankAccount ba) throws Exception;
	String createCustomer(BankAccount ba) throws Exception;
}

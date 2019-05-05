package dao;

import java.util.List;

import pojos.Accounts;

public interface IBankDao {
	
	String acceptCustomers(Accounts ac) throws Exception;
	List<Accounts> displayCustomers(int id) throws Exception;
	List<Accounts> displayPraticularTypeCustomers(String type) throws Exception;
	

}

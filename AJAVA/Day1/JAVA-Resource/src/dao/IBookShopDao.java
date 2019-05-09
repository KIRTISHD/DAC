package dao;

import pojos.Customer;

public interface IBookShopDao {
	Customer validateCustomer(String email, String pass) throws Exception;
	
	String registerCustomer(Double depositAmount, String email, String name, String password, String role) throws Exception;
}

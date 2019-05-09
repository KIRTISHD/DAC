package dao;

import pojos.Customer;
import java.sql.*;
import static utils.DBUtils.*;

public class BookShopDaoImpl implements IBookShopDao {
	private Connection cn;
	private PreparedStatement pst1,pstmt2;

	public BookShopDaoImpl() throws Exception {
		// get cn
		cn = fetchConnection();
		pst1 = cn.prepareStatement("select * from my_customers where email=? and password=?");
		pstmt2 = cn.prepareStatement("INSERT INTO my_customers values (DEFAULT,?,?,?,?,CURDATE(),?)");
		System.out.println("dao created...");
	}

	public void cleanUp() throws Exception {
		if (pst1 != null)
			pst1.close();
		if (cn != null)
			cn.close();
	}

	@Override
	public Customer validateCustomer(String email, String pass) throws Exception {
		// set IN params
		pst1.setString(1, email);
		pst1.setString(2, pass);
		// exec query
		try (ResultSet rst = pst1.executeQuery()) {
			if (rst.next())
				return new Customer(rst.getInt(1), rst.getDouble(2), email, rst.getString(4), pass, rst.getDate(6),
						rst.getString(7));
		}
		return null;
	}

	@Override
	public String registerCustomer(Double depositAmount, String email, String name, String password, String role)
			throws Exception {
		System.out.println("ddd");
		pstmt2.setDouble(1, depositAmount);
		pstmt2.setString(2, email);
		pstmt2.setString(3, name);
		pstmt2.setString(4, password);
		pstmt2.setString(5, role);

		System.out.println("ddee");
		int c = pstmt2.executeUpdate();

		System.out.println("ff");
		if (c == 1)
			return "Successful entry";
		return "Entry cannot be made";
	}

}

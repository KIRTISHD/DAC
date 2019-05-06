package dao;

import pojos.BankAccount;
import static utils.DBUtils.getConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BankDaoImpl implements IBankDao{
	Connection conn;
	Statement stmt;
	PreparedStatement pstmt,pstmt1,pstmt2;
	ResultSet rs;
	
	public BankDaoImpl() throws ClassNotFoundException, SQLException {
		conn = getConnection();
		/*String acceptCust1 = "insert into bank_users values(default,?,?)";
		String acceptCust2 = "insert into bank_accounts values(default,?,?,?)";*/
		String loginCust = "select bu.name,ba.ac_no,ba.type,ba.bal \r\n" + 
				"from bank_users bu inner join bank_accounts ba\r\n" + 
				"on bu.id = ba.id\r\n" + 
				"where bu.name = ? and bu.password = ?";
		pstmt = conn.prepareStatement(loginCust);
		//String loginCust2 = "select * from bank_accounts where id = ?";
		//pstmt1 = conn.prepareStatement(loginCust2);
	}
	
	public void cleanup() throws SQLException {
		if(rs!=null) 
			rs.close();
		if (pstmt1!=null)
			pstmt1.close();
		if (pstmt!=null)
			pstmt.close();
		if (conn!=null) 
			conn.close();
		System.out.println("Cleanup done");
		
	}

	@Override
	public List<BankAccount> loginCustomers(BankAccount ba) throws Exception {
		List<BankAccount> ls = new ArrayList<BankAccount>();
		pstmt.setString(1, ba.getName());
		pstmt.setString(2, ba.getPassword());
		try(ResultSet rs = pstmt.executeQuery()){
			if (rs.next() == false)
				return null;
			while(rs.next()) {
				ls.add(new BankAccount(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getDouble(4)));
			}
			return ls;
		}catch (Exception e) {
			System.out.println("Error in loginCustomers-"+e);
			e.printStackTrace();
		}
		
		//pstmt1.setString(1, x);
		return null;
	}

	@Override
	public String createCustomer(BankAccount ba) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}

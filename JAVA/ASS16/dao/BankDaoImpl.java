package dao;

import pojos.Accounts;
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
		String acceptCust = "insert into accounts values(default,?,?,?)";
		String displayCust = "select * from accounts where id=?";
		String displayTypeCust = "select * from accounts where type=?";
		pstmt = conn.prepareStatement(acceptCust);
		pstmt1 = conn.prepareStatement(displayCust);
		pstmt2 = conn.prepareStatement(displayTypeCust);
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
	public String acceptCustomers(Accounts ac) throws Exception {
		pstmt.setString(1, ac.getName());
		pstmt.setString(2, ac.getType());
		pstmt.setDouble(3, ac.getBal());
		int in = pstmt.executeUpdate();
		if (in == 1)
			return "Added Successfully";
		return "Could not Add";
	}

	@Override
	public List<Accounts> displayCustomers(int cust_id) throws Exception {
		List<Accounts> ac = new ArrayList<Accounts>();
		pstmt1.setInt(1, cust_id);
		rs=pstmt1.executeQuery();
		while(rs.next()) {
			ac.add(new Accounts(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4)));
		}
		return ac;
	}

	@Override
	public List<Accounts> displayPraticularTypeCustomers(String type) throws Exception {
		List<Accounts> ac = new ArrayList<Accounts>();
		pstmt2.setString(1, type);
		try(ResultSet rs=pstmt2.executeQuery()){
			while(rs.next()) {
				ac.add(new Accounts(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4)));
			}
		}
		return ac;
	}

}

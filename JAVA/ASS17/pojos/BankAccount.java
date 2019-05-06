package pojos;


public class BankAccount extends BankUsers{
	private int ac_no;
	private int id;
	private String type;
	private double bal;
	
	public BankAccount() {
	}

	public BankAccount(String customerName,String customerPassword, String type, double bal) {
		super(customerName,customerPassword);
		this.type = type;
		this.bal = bal;
	}
	
	public BankAccount(String username, int ac_no, String type, double bal) {
		super(username);
		this.ac_no = ac_no;
		this.type = type;
		this.bal = bal;
	}
	
	public BankAccount(String type, double bal) {
		super();
		this.type = type;
		this.bal = bal;
	}

	public BankAccount(int ac_no, String type, double bal) {
		super();
		this.ac_no = ac_no;
		this.type = type;
		this.bal = bal;
	}

	public BankAccount(int ac_no, int id, String type, double bal) {
		this.ac_no = ac_no;
		this.id = id;
		this.type = type;
		this.bal = bal;
	}

	public BankAccount(String username, String password) {
		super(username,password);
	}

	public int getAc_no() {
		return ac_no;
	}

	public int getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public double getBal() {
		return bal;
	}

	public void setAc_no(int ac_no) {
		this.ac_no = ac_no;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	@Override
	public String toString() {
		return "BankAccount [ac_no=" + ac_no + ", id=" + id + ", type=" + type + ", bal=" + bal + ", getName()="
				+ getName() + ", getPassword()=" + getPassword() + "]";
	}

	

}

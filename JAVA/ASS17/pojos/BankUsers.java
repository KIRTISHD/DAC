package pojos;

public class BankUsers {

	private int id;
	private String name;
	private String password;
	public BankUsers() {
		super();
	}
	
	
	
	public BankUsers(String name) {
		super();
		this.name = name;
	}



	public BankUsers(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	public BankUsers(int id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "BankUsers [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
	
	
}

package account;

public class Account {
	private int no;
	private String owner;
	private String password;
	private int balance;
	
	Account(int no, String owner, String password, int balance){
		this.no = no;
		this.owner = owner;
		this.password = password;
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Account [no=" + no + ", owner=" + owner + ", password=" + password + ", balance=" + balance + "]";
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getNo() {
		return no;
	}
	public String getOwner() {
		return owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}

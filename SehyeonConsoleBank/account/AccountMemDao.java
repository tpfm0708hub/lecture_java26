package account;

public class AccountMemDao {
	public static int noSeq = 111111;	
	private static Account[] accountDB = new Account[100];
	private int numAccount;
	
	//	계좌등록
	public boolean insertAccount(String owner, String password, int balance) {
		int no = noSeq++;
		accountDB[numAccount++] = new Account(no, owner, password, balance);
		return true;
	}
	
	//	계좌조회	(계좌 리스트를 return)
	public Account[] selectAll() {
		Account[] accountList = new Account[numAccount];
		for(int i = 0; i < numAccount; i++) {
			accountList[i] = accountDB[i];
		}
		return accountList;
	}
	
	//	입금
	public boolean deposit(int accountNo, int amount) {
		for(int i = 0; i < numAccount; i++) {
			if(accountNo == accountDB[i].getNo()) {
				//	입금처리
				accountDB[i].setBalance(accountDB[i].getBalance() + amount);
				return true;
			}
		}
		return false;
	}
	//	출금
	public boolean withdraw(int accountNo, int amount) {
		for(int i = 0; i < numAccount; i++) {
			if(accountNo == accountDB[i].getNo()) {
				//	출금처리
				if(amount <= accountDB[i].getBalance()) {
					accountDB[i].setBalance(accountDB[i].getBalance() - amount);
					return true;
				} else {
					return false;	//	잔액 부족
				}
			}
		}
		return false;	//	계좌 없음
	}
}

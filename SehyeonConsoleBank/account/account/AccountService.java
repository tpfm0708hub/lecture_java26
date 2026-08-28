package account;

import java.util.List;

public class AccountService {
	
	public static int noSeq = 111111;
	private AccountDao accountDao;
	
	public AccountService(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	public boolean createAccount(String owner, String password, int amount) {
		Account ac = new Account(noSeq++, owner, password, amount);
		return accountDao.insertAccount(ac);
	}
	
	public Account getAccount(int accountNo) {
		return accountDao.selectByNo(accountNo);
	}
	
	public List<Account> getOwnerAccount(String owner){
		return accountDao.selectByOwner(owner);
	}
	
	public List<Account> getAllAccounts(){
		return accountDao.selectAll();
	}
	
	public List<Account> getMembersAccounts(){
		return null;
	}
	
	public boolean deposit(int accountNo, int amount) throws NoAccountException{
		Account ac = accountDao.selectByNo(accountNo);
		
		if(ac != null) {
			ac.setBalance(ac.getBalance() + amount);
			accountDao.updateAccount(ac);
			return true;
		}
		
		//	없는 계좌번호임 -> 예외 객체 생성하여 던짐
		throw new NoAccountException();	
	}
	
	public boolean withdraw(int accountNo, int amount, String password) throws NoAccountException {
		//	계좌 찾기
		Account ac = accountDao.selectByNo(accountNo);
		if(ac != null) {
			//	비밀번호 확인
			if(password.equals(ac.getPassword())) {
				//	잔액 확인
				if(amount >= ac.getBalance()) {
					//	출금 처리
					ac.setBalance(ac.getBalance() - amount);
					accountDao.updateAccount(ac);
					return true;
				}
				return false;
			}
			return false;
		}
		throw new NoAccountException();	 
	}
	
	public boolean deleteAccount(int accountNo, String password) {
		return true;
	}
}

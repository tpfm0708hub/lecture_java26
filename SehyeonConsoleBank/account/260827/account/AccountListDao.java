package account;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AccountListDao implements AccountDao{
	public static int noSeq = 111111;	
	private static List<Account> accountDB = new ArrayList<Account>();
	
	@Override
	public boolean insertAccount(String owner, String password, int balance) {
		int no = noSeq++;
		accountDB.add(new Account(no, owner, password, balance));
		return true;
	}

	@Override
	public List<Account> selectAll() {
		List<Account> accountList = new ArrayList<Account>();
//		for(int i = 0; i < accountDB.size(); i++)
//			accountList.add(accountDB.get(i));
		
//		Iterator<Account> iter = accountDB.iterator();
//		while(iter.hasNext()) {
//			accountList.add(iter.next());
//		}
		
		for(Account ac : accountDB) {
			accountList.add(ac);
		}
		
		return accountList;
	}

	@Override
	public Account selectByNo(int accountNo) {
		for(Account ac : accountDB) {
			if(ac.getNo() == accountNo) {
				return ac;
			}
		}
		return null;
	}

	@Override
	public List<Account> selectByOwner(String owner) {
		List<Account> accountList = new ArrayList<Account>();
		
		for(Account ac : accountDB) {
			if(ac.getOwner().equals(owner)) {
				accountList.add(ac);
			}
		}
		return accountList;
	}

	@Override
	public boolean deposit(int accountNo, int amount) throws NoAccountException {
		Account ac = selectByNo(accountNo);
		if(ac != null) {
			ac.setBalance(ac.getBalance() + amount);
			return true;
		}
		
		//	없는 계좌번호임 -> 예외 객체 생성하여 던짐
		throw new NoAccountException();		
	}

	@Override
	public boolean withdraw(int accountNo, int amount) throws NoAccountException {
		Account ac = selectByNo(accountNo);
		if(ac != null) {
			ac.setBalance(ac.getBalance() - amount);
			return true;
		}
		throw new NoAccountException(accountNo);
	}
	
	
}

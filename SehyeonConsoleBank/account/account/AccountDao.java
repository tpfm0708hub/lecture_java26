package account;

import java.util.List;

public interface AccountDao {
	boolean insertAccount(Account ac );
	List<Account> selectAll();
	Account selectByNo(int accountNo);
	List<Account> selectByOwner(String owner);
	boolean updateAccount(Account ac);	
	boolean deleteAccount(int accountNo);
}

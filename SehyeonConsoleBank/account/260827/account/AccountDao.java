package account;

import java.util.List;

public interface AccountDao {
	//	C : 계좌 추가
	boolean insertAccount(String owner, String password, int balance);
	//	R : 계좌 읽기 - 계좌번호, 일괄조회, 계좌주
	List<Account> selectAll();
	Account selectByNo(int accountNo);
	List<Account> selectByOwner(String owner);
	//	U : 입금, 출금
	boolean deposit(int accountNo, int amount) throws NoAccountException;
	boolean withdraw(int accountNo, int amount) throws NoAccountException;
}

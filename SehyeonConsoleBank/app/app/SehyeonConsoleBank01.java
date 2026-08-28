package app;

import java.util.List;
import java.util.Scanner;

import account.Account;
import account.AccountDao;
import account.AccountListDao;
import account.AccountService;
import account.NoAccountException;

public class SehyeonConsoleBank01 {
	
	static String[] startMenu = {"0.종료", "1.계좌등록", "2.계좌조회", "3.입금", "4.출금"};
	static String[] listMenu = {"0.종료", "1.일괄조회", "2.번호조회", "3.소유주조회"};
	static Scanner sc = new Scanner(System.in);
	static AccountService aservice= new AccountService(new AccountListDao());
	
	public static void main(String[] args) {
		welcomeMessage();
		startBankMenu();
		sayGoodbye();
	}
	
	private static void startBankMenu() {
		
		while(true) {
			int menu;
			try {
				menu = getMenu(startMenu);
			} catch (Exception e) {
				menu = -1;
			}
			switch (menu) {
			case 1: //	계좌등록
				createAccount();
				break;
			case 2: //	계좌조회
				menuAccountList();
				break;
			case 3: //	입금
				menuDeposit();
				break;
			case 4: //	출금
				menuWithDraw();
				break;
			case 0:	//	종료
				return;
			default://	없는 메뉴
				System.out.println("없는 메뉴입니다.");
			}
		}		
	}
	
	private static void createAccount() {
		//	계좌 등록: 계좌주 이름, 계좌 비밀번호, 초기 입금액
		System.out.println("[계좌 등록]");
		System.out.print("계좌주 : ");
		String owner = sc.nextLine();
		System.out.print("비밀번호 : ");
		String passwoed = sc.nextLine();
		System.out.print("초기입금액 : ");
		int amount = Integer.parseInt(sc.nextLine());		
		
		if(aservice.createAccount(owner, passwoed, amount)) {
			System.out.println("계좌를 등록했습니다.");
		} else {
			System.out.println("계좌를 등록할 수 없습니다.");
		}
		
	}

	private static void menuAccountList() {
		System.out.println("[계좌 조회]");
		while(true) {
			int menu;
			try {
				menu = getMenu(listMenu);
			} catch(Exception e) {
				menu = -1;
			}
			
			switch(menu) {
			case 1:	//	일괄 조회
				showAccountList(aservice.getAllAccounts());
				return;
				
			case 2: //	번호 조회
				System.out.print("계좌번호 : ");
				int accountNo = sc.nextInt();
				sc.nextLine();
				
				Account account = aservice.getAccount(accountNo);
				if(account != null) {
					System.out.println(account);
				}else {
					System.out.println("없는 계좌입니다.");
				}
				return;
				
			case 3:	//	소유주 조회
				System.out.print("소유주 : ");
				String owner = sc.nextLine();
				
				List<Account> accountList = aservice.getOwnerAccount(owner);
				
				System.out.println(accountList);
				
				return;
				
			case 0:
				return;
				
			default:
				System.out.println("없는 메뉴입니다.");
			}
		}
	}

	private static void showAccountList(List<Account> accountList) {
		for (Account ac :accountList) {
			System.out.println(ac);
		}
	}
	
	private static void menuDeposit() {
		System.out.println("[입금]");
		showAccountList(aservice.getAllAccounts());
		//	계좌번호, 입금액 입력
		System.out.print("계좌번호 : ");
		int accountNo = sc.nextInt();
		System.out.print("입금액 : ");
		int amount = sc.nextInt();
		sc.nextLine();
		
		//	service에게 입금 요청
		try {
			aservice.deposit(accountNo, amount);
			System.out.println("입금하였습니다.");
		} catch(Exception e){
			System.out.println("입금할 수 없습니다 : " + e.getMessage());
		}
	}

	private static void menuWithDraw() {
		System.out.println("[출금]");
		showAccountList(aservice.getAllAccounts());
		System.out.print("계좌번호 : ");
		int accountNo = Integer.parseInt(sc.nextLine());
		System.out.print("출금액 : ");
		int amount = Integer.parseInt(sc.nextLine());
		System.out.println("계좌 비밀번호 : ");
		String password = sc.nextLine();
		
		try {
			aservice.withdraw(accountNo, amount, password);
			System.out.println("출금하였습니다.");
		} catch (NoAccountException e) {
			System.out.println("출금할 수 없습니다. : " + e.getMessage());;
		}
		
	}

	private static int getMenu(String[] menuList) throws Exception{
		//	메뉴 출력
		System.out.println("========================");
		for(int i = 1; i < menuList.length; i++) {
			System.out.println(menuList[i]);
		}
		System.out.println(menuList[0]);
		System.out.println("========================");
		//	메뉴 선택
		System.out.print(">> 메뉴 선택 : ");
		int menu = Integer.parseInt(sc.nextLine());
		return menu;
//		try {
//			int menu = Integer.parseInt(sc.nextLine());
//			return menu;
//		} catch(Exception e) {
//			return -1;
//		}
	}
	
	private static void welcomeMessage() {
		System.out.println("Sehyeon Console Bank에 오신 것을 환영합니다.");
	}
	

	private static void sayGoodbye() {
		System.out.println("Sehyeon Console Bank를 이용해 주셔서 감사합니다.");
		
	}
}

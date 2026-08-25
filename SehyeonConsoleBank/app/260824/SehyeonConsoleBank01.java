package app;

import java.util.Scanner;

import account.Account;
import account.AccountMemDao;

public class SehyeonConsoleBank01 {
	
	static String[] startMenu = {"0.종료", "1.계좌등록", "2.계좌조회", "3.입금", "4.출금"};
	static Scanner sc = new Scanner(System.in);
	static AccountMemDao accountDao = new AccountMemDao();
	
	public static void main(String[] args) {
		welcomeMessage();
		startBankMenu();
		sayGoodbye();
	}
	
	private static void startBankMenu() {
		
		while(true) {
			int menu = getMenu(startMenu);
			switch (menu) {
			case 1: //	계좌등록
				menuAccountRegist();
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
	
	private static void menuAccountRegist() {
		//	계좌 등록: 계좌주 이름, 계좌 비밀번호, 초기 입금액
		System.out.println("[계좌 등록]");
		System.out.print("계좌주 : ");
		String owner = sc.nextLine();
		System.out.print("비밀번호 : ");
		String passwoed = sc.nextLine();
		System.out.print("초기입금액 : ");
		int amount = Integer.parseInt(sc.nextLine());		
		
		if(accountDao.insertAccount(owner, passwoed, amount)) {
			System.out.println("계좌를 등록했습니다.");
		} else {
			System.out.println("계좌를 등록할 수 없습니다.");
		}
		
	}

	private static void menuAccountList() {
		System.out.println("[계좌 조회]");
		Account[] accountList = accountDao.selectAll();
		showAccountList();
	}

	private static void showAccountList() {
		Account[] accountList = accountDao.selectAll();
		for (int i = 0; i < accountList.length; i++) {
			System.out.println(accountList[i]);
		}
	}
	
	private static void menuDeposit() {
		System.out.println("[입금]");
		showAccountList();
		//	계좌번호, 입금액 입력
		System.out.print("계좌번호 : ");
		int accountNo = sc.nextInt();
		System.out.print("입금액 : ");
		int amount = sc.nextInt();
		sc.nextLine();
		
		//	dao에게 입금 요청
		if (accountDao.deposit(accountNo, amount)) {
			System.out.println("입금하였습니다.");
		}else {
			System.out.println("입금할 수 없습니다.");
		}
	}

	private static void menuWithDraw() {
		System.out.println("[출금]");
		showAccountList();
		System.out.print("계좌번호 : ");
		int accountNo = sc.nextInt();
		System.out.print("출금액 : ");
		int amount = sc.nextInt();
		sc.nextLine();
		
		if(accountDao.withdraw(accountNo, amount)) {
			System.out.println("출금하였습니다.");
		}else {
			System.out.println("출금할 수 없습니다.");
		}
		
	}

	private static int getMenu(String[] menuList) {
		//	메뉴 출력
		System.out.println("========================");
		for(int i = 1; i < menuList.length; i++) {
			System.out.println(menuList[i]);
		}
		System.out.println(menuList[0]);
		System.out.println("========================");
		//	메뉴 선택
		System.out.print(">> 메뉴 선택 : ");
		int menu = sc.nextInt();
		sc.nextLine();
		return menu;
	}
	
	private static void welcomeMessage() {
		System.out.println("Sehyeon Console Bank에 오신 것을 환영합니다.");
	}
	

	private static void sayGoodbye() {
		System.out.println("Sehyeon Console Bank를 이용해 주셔서 감사합니다.");
		
	}
}

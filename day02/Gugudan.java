package day02;
import java.util.Scanner;

public class Gugudan {
	Scanner sc = new Scanner(System.in);
	
	static void calculGugudan(int targetNum) {
		System.out.println("[ 구구단 "+ targetNum + "단 ]");
		for(int i = 1; i < 10; i++) {
			System.out.println(targetNum + " × " + i + " = " + (targetNum * i));
		}
	}
	static void repeatGugudan() {
		for(int j = 2; j < 10; j++) {
			calculGugudan(j);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int targetNum = sc.nextInt();
		
		calculGugudan(targetNum);
		repeatGugudan();
	}
}

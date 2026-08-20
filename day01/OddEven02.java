package start;
import java.util.Scanner;

public class OddEven02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			if(num % 2 == 0) {
				System.out.println("짝수입니다.");
			}else {
				System.out.println("홀수입니다.");
			}
		}else {
			System.out.println("양수가 아닙니다.");
		}
	}
}

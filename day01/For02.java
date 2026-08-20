package start;
import java.util.Scanner;

public class For02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		System.out.println("5개의 숫자를 입력하세요.");
		
		for(int i = 0; i < 5; i++) {
			int num = sc.nextInt();
			sum += num;			
		}
		System.out.println("5개 숫자의 합은 " + sum + "입니다.");
	}
}

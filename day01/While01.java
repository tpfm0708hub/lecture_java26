package start;
import java.util.Scanner;

public class While01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		while(num != 0) {
			System.out.print("숫자를 입력하세요 : ");
			sum += num;
			num = sc.nextInt();
		}
		System.out.println("지금까지 입력한 숫자의 합은 " + sum + "입니다.");
	}
}

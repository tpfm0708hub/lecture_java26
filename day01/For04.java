package start;
import java.util.Scanner;

public class For04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		int multiple = num;
		
		for(int i = num - 1; i > 0; i--) {
			multiple *= i;
		}
		System.out.println(num + "! = " + multiple);
	}
}

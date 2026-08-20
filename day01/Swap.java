package start;
import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("변수 a에 넣을 숫자 입력 : ");
		int a = sc.nextInt();
		System.out.print("변수 b에 넣을 숫자 입력 : ");
		int b = sc.nextInt();
		System.out.println();
		System.out.println("Swapping 결과 >");
		int c = a;
		a = b;
		b = c;
		System.out.println("변수 a의 값 = " + a);
		System.out.print("변수 b의 값 = " + b);
		sc.close();
	}
}

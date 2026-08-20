package start;
import java.util.Scanner;

public class InputPractice{
	/**
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("직사각형의 가로 길이 : ");
		double width = sc.nextDouble();
		System.out.print("직사각형의 세로 길이 : ");
		double length = sc.nextDouble();
		System.out.printf("직사각형의 넓이는 %.2fcm입니다.", width * length);		
		sc.close();
	}
	**/
	/**
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		double number = sc.nextDouble();
		if(number % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		sc.close();		
	}
	**/
	/**
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final double PI = 3.14;
		
		System.out.print("원의 반지름을 입력하세요(cm): ");
		double radius = sc.nextDouble();
		
		System.out.printf("원의 넓이는 %.2fcm입니다.", radius * radius * PI);
		sc.close();
	}
	**/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액 : ");
		int price = sc.nextInt();
		System.out.println();
		System.out.println("동전의 수 >");
		System.out.println("500원짜리 = " + (price / 500) + "개");
		System.out.println("100원짜리 = " + ((price % 500)/100) + "개");
		sc.close();
	}
}
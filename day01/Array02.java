package start;
import java.util.Scanner;

public class Array02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생 수 : ");
		int student = sc.nextInt();
		int sum = 0;
		
		int[] gradeArr = new int[student];
		System.out.print(student + "명의 성적 : ");
		for(int i = 0; i < gradeArr.length; i++) {
			//	배열 생성!!!!!
			//	Scanner는 공백, 탭, 엔터 기준으로 한 단위씩 저장
			//	입력 방식에 따라 상이!!!!
			gradeArr[i] = sc.nextInt();	
			sum += gradeArr[i];
		}
		System.out.println(">> 합계 : " + sum);
		System.out.println(">> 평균 : " + (sum/gradeArr.length));
	}
}

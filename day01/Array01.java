package start;

public class Array01 {
	public static void main(String[] args) {
		double[] gradeArr = {90, 70, 80, 79, 82, 50, 70, 90, 89, 89};
		int sum = 0;
		
		for(int i = 0; i < gradeArr.length; i++) {
			sum += gradeArr[i];
		}
		System.out.println(">> 합계: " + sum);
		System.out.println(">> 평균: " + (sum/gradeArr.length));
	}
}

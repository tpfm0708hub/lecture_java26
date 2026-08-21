package day02;

import java.util.Arrays;

public class Method01 {
	static int getSum(int[] arrayInt) {
		int sum = 0;
			
		for(int i = 0; i < arrayInt.length; i++) {
			sum += arrayInt[i];
		}
		return(sum);
	}
	static int getMax(int[] arrayInt) {
		int max = arrayInt[0];
		
		for(int i = 1; i < arrayInt.length; i++) {
			if(arrayInt[i] > max) {
				max = arrayInt[i];
			}else {
				continue;
			}
		}
		return(max);
	}
	static int getCount(int[] arrayInt, int setNum) {
		int count = 0;
		
		for(int i = 0; i < arrayInt.length; i++)
			if(setNum > arrayInt[i]) {
				count++;
			}else {
				continue;
			}
		return(count);
	}
	static int[] swapArray(int[] arrayInt) {//	array 출력을 위해 int[] 선언
		for(int i = 0; i < (arrayInt.length / 2); i++) {
			int temp = arrayInt[i];
			arrayInt[i] = arrayInt[(arrayInt.length - 1) - i];
			arrayInt[(arrayInt.length - 1) - i] = temp;
		}
		return arrayInt;
	}
			
	public static void main(String[] args) {
		int[] arrayInt1 = {10, 20, 30, 40, 50};
		System.out.println(getSum(arrayInt1));
		System.out.println(getMax(arrayInt1));
		System.out.println(getCount(arrayInt1, 30));
		System.out.println(Arrays.toString(swapArray(arrayInt1)));//	Arrays.toString(): 배열 내부 요소 출력
		
	}
}

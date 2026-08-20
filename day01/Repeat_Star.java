package start;

public class Repeat_Star {
	public static void main(String[] args) {
		final int num = 5;

		/**1번
		//	행 index가 0일 때(0~4)
		for(int i = 0; i < num; i++) {
			//	별 갯수는 index보다 1 크게
			for(int j = 0; j < i + 1; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		**/
		/**2번
		for(int i = 0; i < num; i++) {
			for(int j = num; j > i; j--) {
				System.out.print('*');
			}
			System.out.println();
		}
		**/
		/**3번
		for(int i = 0; i < num; i++) {
			for(int j = num - 1; j > i; j--) {
				System.out.print(" ");
			}
			for(int k = 0; k < i + 1; k++) {
				System.out.print('*');
			}
			System.out.println();
		}
		**/
		/**4번
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int k = num; k > i; k--) {
				System.out.print('*');
			}
			System.out.println();
		}
		**/
		/**5번
		for(int i = 0; i < num; i ++) {
			for(int j = num - 1; j > i; j--) {
				System.out.print(" ");
			}
			for(int k = 0; k < i + 1; k++) {
				System.out.print('*');
			}
			for(int l = 0; l < i; l++) {
				System.out.print('*');
			}
			System.out.println();
		}
		**/
		/**6번
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int k = num; k > i; k--) {
				System.out.print('*');
			}
			for(int l = num - 1; l > i; l--) {
				System.out.print('*');
			}
			System.out.println();
		}
		**/

	}
}

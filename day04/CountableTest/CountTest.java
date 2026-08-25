package CountableTest;

public class CountTest{
	public static void main(String[] args) {
		
		//	Countable: 자료형
		Countable[] list = {
				new Bird("뻐꾸기", 5), new Bird("독수리", 2),
				new Tree("사과나무", 10), new Tree("밤나무", 7)
		};
		
		for(int i = 0; i < list.length; i++) {
			list[i].count();
		}
		((Bird)list[0]).fly();
		((Bird)list[1]).fly();
		((Tree)list[2]).ripen();
		((Tree)list[3]).ripen();
	}

}

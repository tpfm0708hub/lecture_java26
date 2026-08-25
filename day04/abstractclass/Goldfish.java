package abstractclass;

public class Goldfish extends Animal {
	
	public Goldfish(String meal) {
		this.meal = meal;
	}
	
	@Override
	public void move() {
		System.out.println("헤엄친다.");		
	}

}

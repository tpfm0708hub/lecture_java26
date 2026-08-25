package abstractclass;

public abstract class Animal {
	String meal;

	public void eat() {
		System.out.println("먹이로 " + meal + "을 먹는다.");
	}
	abstract public void move();
	public void sleep() {
		System.out.println("누워서 잠을 잔다.");
	}
}

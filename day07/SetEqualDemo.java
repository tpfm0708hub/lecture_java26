package day07;

import java.util.HashSet;
import java.util.Set;

public class SetEqualDemo {
	public static void main(String[] args) {
		//	Set에 데이터를 추가할 때 중복 데이터는 추가되지 않음
		//	중복 데이터 판단에 대한 테스트
		Set<Fruit> fruits = new HashSet<>();
		fruits.add(new Fruit("사과"));
		fruits.add(new Fruit("사과"));
		
		System.out.println(fruits.size());
		System.out.println(fruits);
	}
}

class Fruit{
	 String name;
	 
	 public Fruit(String name) {
		 this.name = name; 
	 }
	 
	 @Override
	 public String toString() {
		 return "Fruit(" + name + ")";
	 }
	 
	 @Override
	 public int hashCode() {
		 return name != null ? name.hashCode() : 0;
	 }
	 
	 @Override
	 public boolean equals(Object o) {
		 if (o instanceof Fruit) {
			 return ((Fruit)o).name.equals(this.name);
		 }
		 return false;
	 }
}
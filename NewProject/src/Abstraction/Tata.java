package Abstraction;

abstract class Car{
	abstract void  fuel();
	void color() {
		System.out.println("Red");
	}
}
public class Tata extends Car{
	void fuel() {
		System.out.println("Petrol");
	}
	public static void main(String[] args) {
		Tata obj=new Tata();
		obj.fuel();
		obj.color();
	}
}


package Polymorphism;

public class MethodOverloading {
	
	public static void sum() {
		System.out.println("Method Overloading Example");
	}
	
	public int sum(int a,int b) {
		return a+b;
	}
	
	public double sum(double a,double b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		MethodOverloading obj=new MethodOverloading();
		MethodOverloading.sum();
		System.out.println(obj.sum(10,20));
		System.out.println(obj.sum(3.5, 4.7));

	}

}

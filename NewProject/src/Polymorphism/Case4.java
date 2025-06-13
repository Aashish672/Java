package Polymorphism;

public class Case4 {
	public void m1(int i) {
		System.out.println("General method");
	}
	
	public void m1(int...i) {
		System.out.println("Var arg method");
	}
	
	public static void main(String[] args) {
		Case4 obj=new Case4();
		obj.m1(0);
		obj.m1(10,20);
	}
}

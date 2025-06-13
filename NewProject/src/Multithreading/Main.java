package Multithreading;

public class Main {
	public static void main(String[] args) {
		Child obj=new Child();
		System.out.println(Child.a);
		Test.m1();
		obj.m2();
		obj.m3();
		Child.m1();
	}
}

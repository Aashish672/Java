package Multithreading;

public interface Test {
	static void m1() {
		System.out.println("Static Method");
	}
	
	default void m2() {
		System.out.println("Default Method");
	}
	void m3();
	
}
class Child implements Test{
	static int a=10;
	@Override
	public void m3() {
		System.out.println("Abstract Method");
	}
	
	static void m1() {
		System.out.println("Hello");
	}
}

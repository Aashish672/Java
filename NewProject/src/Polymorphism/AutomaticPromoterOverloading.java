package Polymorphism;

public class AutomaticPromoterOverloading {
	public void m1(int n) {
		System.out.println("int arg method");
	}
	
	public void m1(float f) {
		System.out.println("float arg method");
	}
	
	public static void main(String[] args) {
		AutomaticPromoterOverloading obj=new AutomaticPromoterOverloading();
		
		obj.m1(10);
		obj.m1(2.3f);
		obj.m1('a');
		obj.m1(10L);
		obj.m1(-32769);
	}
}

package Polymorphism;

public class Test {
	public void m1(Object n) {
		System.out.println("Object Version");
	}
	
	public void m1(StringBuffer s) {
		System.out.println("StringBuffer Version");
	}
	public void m1(String s) {
		System.out.println("String Version");
	}
	
	public static void main(String[] args) {
		Test T=new Test();
		
		T.m1(new Object());
		T.m1("String");
		//T.m1(null); 
		T.m1(new StringBuffer("Aashish"));
		
	}
}

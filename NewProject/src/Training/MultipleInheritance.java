package Training;



interface Interface1{
	static void method1() {
		System.out.println("Hii");
	}
}

interface Interface2{
	void method2();
}

public class MultipleInheritance implements Interface1,Interface2{
	public void method1() {
		System.out.println("Hello");
	}
	
	public void method2() {
		System.out.println("World");
	}
}
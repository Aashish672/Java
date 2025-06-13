package Training;

public class MultilevelInheritance {
	void method1() {
		System.out.println("My");
	}
}

class A extends MultilevelInheritance{
	void method2() {
		System.out.println("name is");
	}
}

class B extends A{
	void method3() {
		System.out.println("Aashish");
	}
}

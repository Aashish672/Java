package Training;

//Single Level Inheritance
public class ParentClass {
	public void display() {
		System.out.println("Hello");
	}
}

class ChildClass extends ParentClass {
	@Override
	public void display() {
		System.out.println("World");
	}
}
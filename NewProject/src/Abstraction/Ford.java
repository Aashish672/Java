package Abstraction;

abstract interface Car1{
	void fuel();
	default void color() {
		System.out.println("Black");
	}
	static void model() {
		System.out.println("Endeavour");
	}
}
public class Ford implements Car1{
	public void fuel() {
		System.out.println("Diesel");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ford obj=new Ford();
		obj.fuel();
		obj.color();
		Car1.model();
	}

}

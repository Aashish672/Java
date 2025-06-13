package Polymorphism;

class Animal{
	
}
class Monkey extends Animal{
	
}
public class Case5 {
	
	public void m1(Animal a) {
		System.out.println("Animal version");
	}
	
	public void m1(Monkey m) {
		System.out.println("Monkey version");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Case5 obj=new Case5();
		Animal a=new Animal();
		obj.m1(a);
		Monkey m=new Monkey();
		obj.m1(m);
		Animal a1=new Animal();
		obj.m1(a1);
	}

}

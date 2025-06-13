package Polymorphism;

class Property{
	public void property() {
		System.out.println("Cash=Gold+Land");
	}
	public void marry() {
		System.out.println("Ashwariya");
	}
}

class Remarry extends Property{
	
	public void marry() {
		System.out.println("Katrina");
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		Property p=new Property();
		p.marry();
		
		Remarry m=new Remarry();
		m.marry();
		m.property();
		
		Property p1=new Remarry();
		p1.marry();
	}
}

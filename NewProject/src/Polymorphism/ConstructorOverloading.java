package Polymorphism;

class Student{
	String name;
	int rollno;
	Student(String name,int rollno){
		this.name=name;
		this.rollno=rollno;
	}
	Student(){
		name="Aashish";
		rollno=2;
	}
	Student(String n){
		name=n;
	}
	
}
public class ConstructorOverloading {
	public static void main(String[] args) {
		Student obj1=new Student();
		Student obj2=new Student("Aashish");
		Student obj3=new Student("Aashish",13);
		
		System.out.println(obj1.name+" "+obj1.rollno);
		System.out.println(obj2.name+" "+obj2.rollno);
		System.out.println(obj3.name+" "+obj3.rollno);
	}
}

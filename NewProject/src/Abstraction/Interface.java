package Abstraction;

import java.util.*;
interface Example{
	void input();
	void output();
	
}
public class Interface implements Example {
	String name;
	int salary;
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a name");
		name=sc.nextLine();
		System.out.println("Enter a salary");
		salary=sc.nextInt();
		sc.close();
	}
	public void output() {
		System.out.println("Name "+name);
		System.out.println("Salary "+salary);
	}
	
	public static void main(String[] args) {
		Interface obj=new Interface();
		obj.input();
		obj.output();
	}
}

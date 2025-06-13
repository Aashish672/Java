package Encapsulation;

public class Student {
	private String name;
	private int roll_no;
	private int marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj=new Student();
		obj.setName("Aashish");
		obj.setRoll_no(11);
		obj.setMarks(92);
		System.out.println("Names "+obj.getName());
		System.out.println("Roll_No "+obj.getRoll_no());
		System.out.println("Marks "+obj.getMarks());
		
	}

}

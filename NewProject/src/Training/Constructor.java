package Training;

public class Constructor {
	String name;
	int roll_no;
	Constructor(String name,int roll_no){
		this.name=name;
		this.roll_no=roll_no;
	}
	
	Constructor(String n){
		roll_no=0;
		name=n;
	}
	
	public void show() {
		System.out.println(name);
		System.out.println(roll_no);
	}
}

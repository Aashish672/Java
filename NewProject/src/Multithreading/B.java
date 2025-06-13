package Multithreading;

//class A extends Thread{
//	@Override
//	public void run() {
//		for(int i=1;i<=5;i++) {
//			System.out.println("AAshish");
//		}
//	}
//}

class A implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("AAshish");
		}
	}
}
public class B {
	public static void main(String[] args) {
		A obj=new A();
		Thread T=new Thread(obj);
		T.start();
		//obj.run();
		
		for(int i=1;i<=5;i++) {
			System.out.println("AAshish");
		}
	}
}

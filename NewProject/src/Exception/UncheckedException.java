package Exception;

public class UncheckedException {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		//System.exit(0);
		}
		catch (ArithmeticException e){
			//System.out.println("Arithmetic Exception");
			throw 
		}
		finally {
			System.out.println("I am in finally block");
		}
//		System.out.println(10/0);
//		System.out.println("I am in main");
	}
}

package Programs;

import java.util.*;
public class Strong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num =sc.nextInt();
		int sum=0,copy=num;
		while(copy>0) {
			sum=sum+factorial(copy%10);
			copy=copy/10;
		}
		String res=num==sum?"Strong":"Not";
		System.out.println(res);
	}
	static int factorial(int n) {
		if(n<=1) {
			return 1;
		}
		return n*factorial(n-1);
	}
}

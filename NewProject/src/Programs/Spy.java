package Programs;

import java.util.*;
public class Spy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int sum=0,prod=1;
		while(num>0) {
			int d=num%10;
			sum=sum+d;
			prod=prod*d;
			num=num/10;
		}
//		if(sum==prod) {
//		System.out.println("Spy Number");
//		}
//		else {
//			System.out.println("Not");
//		}
		String res=sum==prod?"Spy":"Not";
		System.out.println(res);
	}

}

package Training;

import java.util.*;
public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int last=num%10;
		num/=10;
		int sum=0;
		while(num>9) {
			int rem=num%10;
			sum+=rem;
			num/=10;
		}
		System.out.println(sum==(last+num)?"xylem":"phloem");
//		if(check(num)) {
//			System.out.println("Xylem");
//		}
//		else {
//			System.out.println("Phloem");
//		}
	}
//	static boolean check(int num) {
//		String s=Integer.toString(num);
//		int l=s.length();
//		int extreme=Character.getNumericValue(s.charAt(0))+
//				Character.getNumericValue(s.charAt(l-1));
//		int mean=0;
//		for(int i=1;i<=l-2;i++) {
//			mean=mean+Character.getNumericValue(s.charAt(i));
//		}
//		return extreme==mean;
//	}
//	static boolean check(int num) {
//		
//		int K=num;
//		K=K/10;
//		if(K==num%10) {return true;}
//		int mean=0;
//		while(K>=10) {
//			mean=mean+K%10;
//			K=K/10;
//		}
//		int extreme=num%10+K;
//		return mean==extreme;
//	}
}

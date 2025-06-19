package Programs;

import java.util.Scanner;
public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
//		String binary="";
//		while(num>0) {
//			int rem=num%2;
//			binary=rem+binary;
//			num=num/2;
//		}
//		System.out.println(binary);
		if (num == 0) {
            System.out.print("0");
        } else {
            calculate(num);
        }

	}
static void calculate(int num) {
	if(num==0) {
		return;
	}
	calculate(num/2);
	System.out.print(num%2);
}
}

package Training;

import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int temp=num;
		int c=0;
		while(temp!=0) {
			c++;
			temp=temp/10;
		}
		temp=num;
		int sum=0;
		while (temp != 0) {
            int d = temp % 10;
            sum += Math.pow(d, c);
            temp /= 10;
        }
		if(sum==num) {
			System.out.println("Armstrong");
		}else {
			System.out.println("Not");
		}
	}
}

package Training;

import java.util.Scanner;
public class Vowels {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string");
		String s=sc.nextLine();
		s=s.toLowerCase();
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				count++;
			}
		}
		System.out.println("No. of vowels in "+ s+" is "+count);
		sc.close();
	}
}

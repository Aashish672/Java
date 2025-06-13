package Training;

import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string");
		String s=sc.nextLine();
		
		boolean result=isPalin(s.toLowerCase());
		if(result==true) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a palindrome");
		}
		sc.close();
		
	}
	public static boolean isPalin(String s) {
		String s1="";
		for(int i=s.length()-1;i>=0;i--) {
			char ch=s.charAt(i);
			s1=s1+ch;
		}
		
		return s1.equals(s);
	}
}

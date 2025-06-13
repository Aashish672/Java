package Training;

import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two strings");
		
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		
		boolean result=anagram(s1.toLowerCase(),s2.toLowerCase());
		if(result==true) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not an Anagram");
		}
		sc.close();
	}
	
	public static boolean anagram(String s1,String s2 ) {
		if(s1.length()!=s2.length()) {
			return false;
		}
		char ch1[]=new char[s1.length()];
		char ch2[]=new char[s2.length()];
		
		for(int i=0;i<s1.length();i++) {
			ch1[i]=s1.charAt(i);
			ch2[i]=s2.charAt(i);
		}
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		return Arrays.equals(ch1,ch2);
	}
}

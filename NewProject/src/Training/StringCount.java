package Training;

import java.util.Scanner;
public class StringCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		count(s);
		ascii(s);
		sc.close();
	}
	static void count(String s) {
		int upper=0;
		int lower=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(Character.isUpperCase(ch)) {
				upper++;
			}else if(Character.isLowerCase(ch)) {
				lower++;
			}
		}
		System.out.println("Count of Upper case letters "+upper);
		System.out.println("Count of Lower Case letters"+lower);
	}
	static void ascii(String s) {
		int upper=0;
		int lower=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			int ascii=(int)ch;
			if(ascii>=65 && ascii<=90) {
				upper++;
			}else if(ascii>=97 && ascii<=122) {
				lower++;
			}
		}
		System.out.println("Count of Upper case letters "+upper);
		System.out.println("Count of Lower Case letters"+lower);
	}
}

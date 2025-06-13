package Training;

import java.util.*;
public class Occurences {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		count(s);
	}
	static void count(String s) {
		HashMap<Character,Integer> count=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			count.put(ch,count.getOrDefault(ch, 0)+1);
		}
		
		for (Map.Entry<Character, Integer> entry : count.entrySet()) {
			if(entry.getValue()>1)
		       System.out.println(entry.getKey() + " : " + entry.getValue());
		   }
	}
}

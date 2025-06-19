// Leetcode 345
package Leetcode;

import java.util.*;
public class ReverseVowel {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        System.out.println(reverseVowels(s));
    }
    public static String reverseVowels(String s) {
        int left=0,right=s.length()-1;
        while(left<right){
            char ch1=s.charAt(left);
            char ch2=s.charAt(right);


        }
        return s;
    }
    public static String swap(char ch1,char ch2){
        
    }
}

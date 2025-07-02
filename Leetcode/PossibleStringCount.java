//3330
package Leetcode;
import java.util.*;
class PossibleStringCount {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String word=sc.nextLine();
        System.out.println(possibleStringCount(word));
    }
    static int possibleStringCount(String word){
        int result=1;
        int[] arr=new int[26];
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            arr[ch-'a']++;
        }
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(arr[ch-'a']>1){
                result+=arr[ch-'a']-1;
            }
        }
        return result;
    }
}

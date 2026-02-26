import java.util.*;
class Palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a palindrome number");
        int num=sc.nextInt();
        previous(num);
        next(num);
    }
    static int previous(int num){
        int copy=num;
        int count=0;
        while(copy>0){
            int d=num%10;
            count++;
            copy=copy/10;
        }
        
    }
}

import java.util.*;
public class Count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();

        int copy=num;
        int count=0;
        while(copy>0){
            int d=copy%10;
            if(d!=0 && num%d==0){
                count++;
            }
            copy=copy/10;
        }
        System.out.println(count);
    }
}

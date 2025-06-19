import java.util.*;
public class Positive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int[] num=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        System.out.println(find(num));
    }
    static int find(int[] arr){
        Arrays.sort(arr);
        if(arr[arr.length-1]<0){
            return 1;
        }
        for(int i=0;i<arr.length-1;i++){
             if(arr[i]>=0 && arr[i+1]-arr[i]>1){
                return arr[i]+1;
            }
        }
        return arr[arr.length-1]+1;
    }
}

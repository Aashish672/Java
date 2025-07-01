 import java.util.*;
 class Prefix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] arr=new String[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextLine();
        }
        System.out.println(prefix(arr));
    }
    static String prefix(String[] arr){
        String prefix=arr[0];
        for(int i=1;i<arr.length;i++){
            String str=arr[i];
            while(!str.startsWith(prefix)){
                prefix=prefix.substring(0,prefix.length()-1);
            }
            if(prefix.length()==0){
                return prefix;
            }
        }
        return prefix;
    }
}

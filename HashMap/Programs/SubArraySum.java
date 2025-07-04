package HashMap.Programs;

// return number of subarray whose sum is equal to k
import java.util.*;
public class SubArraySum {
    public static void main(String[] args) {
        int arr[]={10,2,-2,-20,10};
        HashMap<Integer,Integer> map=new HashMap<>();

        int k=-10;
        map.put(0,1);
        int ans=0;
        int sum=0;
        for(int j=0;j<arr.length;j++){
            sum+=arr[j];

            if(map.containsKey(sum-k)){
                ans+=map.get(sum-k);
            }
            if(map.containsKey(sum)){
                map.put(sum,map.get(sum)+1);
            }else{
                map.put(sum,1);
            }
        }
        System.out.println(ans);
    }
}

import java.util.HashSet;
import java.util.Set;

public class CompleteArray {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        int ans=0;
        int size=set.size();
        
        return ans;
    }
}

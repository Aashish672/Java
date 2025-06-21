package Leetcode;
// Given an array of integers of size n find all the elements that appear more than n/3 times
import java.util.*;
public class MajorityElement {
    public static void main(String[] args) {
        int[] nums={1,3,2,5,1,3,1,5,1};
        System.out.println(Arrays.toString(calculate(nums)));
    }
    static Object[] calculate(int[] arr){
        HashMap<Integer,Integer> frequency=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        int n=arr.length;
        for(int num:arr){
            frequency.put(num,frequency.getOrDefault(num, 0)+1);
        }

            for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
        if(entry.getValue()>n/3){
            list.add(entry.getKey());
        }
    }
        return list.toArray();
    }
}

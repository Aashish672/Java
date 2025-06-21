package Leetcode;
// Union of two Arrays

import java.util.HashSet;
public class UnionOfArrays {
    public static void main(String[] args) {
        int[] arr1={7,3,9};
        int[] arr2={6,3,9,2,9,4};

        HashSet<Integer> set=new HashSet<>();

        for(int num:arr1){
            set.add(num);
        }
        for(int num:arr2){
            set.add(num);
        }

        System.out.println(set.size());
    }
}

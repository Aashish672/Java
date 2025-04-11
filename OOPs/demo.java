package OOPs;

import java.util.*;

class Solution {
    public int findShortestSubArray(int[] nums) {
        int[] freq = new int[50000];
        int[] first = new int[50000];
        int[] last = new int[50000];

        Arrays.fill(first, -1);
        int degree = 0;
        int minLength = nums.length;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            freq[num]++;
            if (first[num] == -1) {
                first[num] = i;
            }
            last[num] = i;
            degree = Math.max(degree, freq[num]);
        }
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (freq[num] == degree) {
                int length = last[num] - first[num] + 1;
                minLength = Math.min(minLength, length);
            }
        }
        return minLength;

    }
}

class demo {
    public static void main(String[] args) {
        // Solution obj = new Solution();
        // int[] nums = { 1, 2, 2, 3, 1, 4, 2 };
        // System.out.println(obj.findShortestSubArray(nums));
        ArrayList<Integer> list = new ArrayList<>();
        list.add(45);
        list.add(47);
        System.out.println(list.get(0));
    }
}

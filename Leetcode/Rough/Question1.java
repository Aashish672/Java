package Rough;

import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        Question1 obj = new Question1();
        int[] nums = { 2, 3, 2, 1 };
        System.out.println(obj.thirdMax(nums));

    }

    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> set = new LinkedHashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        List<Integer> list = new ArrayList<>(set);
        if (list.size() < 3) {
            return list.get(list.size() - 1);
        }
        return list.get(list.size() - 3);
    }
}

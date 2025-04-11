package Interview.Cyclic_Sort;

import java.util.ArrayList;

public class Duplicates {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        sort(arr);
        ArrayList<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                ans.add(arr[index]);
            }
        }
        System.out.println(ans);

    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int current = arr[i] - 1;
            if (arr[current] != arr[i]) {
                swap(arr, i, current);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

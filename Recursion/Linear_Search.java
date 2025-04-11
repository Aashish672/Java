package Recursion;

import java.util.ArrayList;

public class Linear_Search {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 2, 1, 8, 9 };
        // ArrayList<Integer> list = new ArrayList<>();

        System.out.println(searching1(arr, 2, 0));
    }

    static int search(int[] arr, int target, int index) {
        if (index == arr.length - 1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return search(arr, target, index + 1);
    }

    static ArrayList<Integer> searching(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length - 1) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return searching(arr, target, index + 1, list);
    }

    static ArrayList<Integer> searching1(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length - 1) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = searching1(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}

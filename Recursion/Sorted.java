package Recursion;

public class Sorted {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 4, 7, 8, 10 };
        System.out.println(sort(arr, 0));
    }

    static boolean sort(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }

        return arr[i] < arr[i + 1] && sort(arr, i + 1);
    }
}

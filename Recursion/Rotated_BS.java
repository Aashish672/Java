package Recursion;

public class Rotated_BS {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println(binary_search(arr, 3, 0, 6));
    }

    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] >= arr[s]) {
            if (target <= arr[mid] && target >= arr[s]) {
                return search(arr, target, s, mid - 1);
            } else {
                return search(arr, target, mid + 1, e);
            }
        }
        if (target >= arr[mid] && target <= arr[e]) {
            return search(arr, target, mid + 1, e);
        }
        return search(arr, target, s, mid - 1);
    }

    static int binary_search(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (target < arr[mid]) {
            return binary_search(arr, target, start, mid - 1);
        }
        return binary_search(arr, target, mid + 1, end);
    }
}

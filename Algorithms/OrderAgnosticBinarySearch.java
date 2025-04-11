package Algorithms;

import java.util.Scanner;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Determine the size of array
        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        int[] array = new int[size];

        // Enter the elements in Array
        System.out.println("Enter the elements in array");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        // Enter the element to be searched
        System.out.println("Enter the target element");
        int element = sc.nextInt();

        // If answer is -1, element not found
        System.out.println(element + " " + "found at index" + " " + orderagnosticBinarySearch(array, element));
        sc.close();

    }

    static int orderagnosticBinarySearch(int arr[], int target) {

        // Initialize the start and end pointer 0th index and last index of array
        // respectively
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is in ascending order or not
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {

            // Find the middle index of the array
            int mid = start + (end - start) / 2;

            // If element is found at the middle index, return the index
            if (arr[mid] == target) {
                return mid;
            }

            // To search in Array arranged in Ascending Order
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

            // To search in Array arranged in Descending Order
            else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        // If element not found return -1
        return -1;
    }
}

package Interview.Binar_Search;

import java.util.Scanner;

public class Floor {
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

        System.out.println(floor(array, element));
        sc.close();
    }

    static int floor(int[] arr, int target) {

        /*
         * Initialize the start and end pointer 0th index and last index of array
         * respectively
         */

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            // Find the middle index of the array
            int mid = start + (end - start) / 2;

            // If the value at middle index is equal to target return the index
            if (arr[mid] == target) {
                return mid;
            }

            // If the target element is less than the middle value, search in the left hand
            // side of the array
            else if (target < arr[mid]) {
                end = mid - 1;
            }

            // If the target elemnt is greater than the middle value, search in the right
            // hand side of the array
            else if (target > arr[mid]) {
                start = mid + 1;
            }
        }

        return end;
    }
}

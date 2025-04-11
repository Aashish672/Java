package Algorithms;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Determine the length of Array
        System.out.println("Enter the length of array");
        int len = sc.nextInt();

        // Create a array of determined length
        int[] n = new int[len];

        // Enter the elements
        System.out.print("Enter the array elemnts");
        for (int i = 0; i < len; i++) {
            n[i] = sc.nextInt();
        }

        // Enter the target element to be searched
        System.out.println("Enter the element to be found");
        int element = sc.nextInt();

        // Store the answer and print it
        int ans = linearsearch(n, element);
        System.out.println(ans);
        sc.close();
    }

    // search in the array
    // If element is found return the index
    // If the element is not found return -1
    static int linearsearch(int[] arr, int target) {

        if (arr.length == 0) {
            return -1;
        }

        // Check for the target element one by one
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
}

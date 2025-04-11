package Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Determine the size of matrix
        System.out.println("Enter the dimensions of matrix");
        int row = sc.nextInt();
        int column = sc.nextInt();

        int[][] matrix = new int[row][column];

        // Enter the elements in matrix
        System.out.println("Enter the elements in matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Enter the element to be searched in matrix
        System.out.println("Enter the target element");
        int target = sc.nextInt();

        /*
         * This statement return the position of the target element. If it return
         * [-1,-1], it means element was not found in matrix
         */
        System.out
                .println("Target element found at position" + " " + (Arrays.toString(binarysearch2D(matrix, target))));
        sc.close();
    }

    static int[] binarysearch2D(int arr[][], int element) {

        // Initialize the start and end index for the matrix
        int start = 0;
        int end = arr.length - 1;

        while (start < arr.length && end >= 0) {

            // If element is found return the index of the element
            if (arr[start][end] == element) {
                return new int[] { start, end };
            }

            // If element is greater than the element at desired index , increase the start
            // index
            if (arr[start][end] < element) {
                start++;
            }

            /*
             * If element is less than the element at desired index , decrease the end
             * index
             */
            else {
                end--;
            }
        }

        // return [-1,-1] if element not found
        return new int[] { -1, -1 };
    }
}

/*Pattern Programs tricks
 * 1.No. of lines=No. of rows=No. of times outer loop will run
 * 2.identify for every row how many columns are there
 * 3.What do you need to print
 */

package Recursion;

public class Pattern1 {
    public static void main(String[] args) {
        int n = 5;
        pattern28(n);
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = n; row >= 1; row--) {
            for (int col = row; col >= 1; col--) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 1; row <= (2 * n - 1); row++) {
            int totalCol = row > n ? 2 * n - row : row;
            for (int col = 1; col <= totalCol; col++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    static void pattern28(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int totalCol = row > n ? 2 * n - row : row;
            int noOfSpaces = n - totalCol;
            for (int s = 1; s <= noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalCol; col++) {
                System.out.print('*');
            }
            for (int col = 1; col < totalCol; col++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

}

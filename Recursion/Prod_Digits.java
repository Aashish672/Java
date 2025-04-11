package Recursion;

public class Prod_Digits {
    public static void main(String[] args) {
        System.out.println(prod(505));
    }

    static int prod(int n) {
        if (n == 0) {
            return 1;
        }
        return n % 10 * prod(n / 10);
    }
}

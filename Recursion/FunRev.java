package Recursion;

public class FunRev {
    public static void main(String[] args) {
        funrev(5);
    }

    static void funrev(int n) {
        if (n == 0) {
            return;
        }
        // System.out.println(n);
        // funrev(--n);
        // funrev(n - 1);
        // System.out.println(n);
    }
}
package Recursion;

public class Reverse {
    public static void main(String[] args) {
        func_rev(1234);
        System.out.println(sum);
    }

    static int sum = 0;

    static void func_rev(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        func_rev(n / 10);
    }
}

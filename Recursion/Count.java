package Recursion;

public class Count {
    public static void main(String[] args) {
        System.out.println(count_zeros(102503, 0));
    }

    static int count_zeros(int n, int count) {
        if (n == 0) {
            return count;
        }
        int rem = n % 10;
        if (rem == 0) {
            return count_zeros(n / 10, count + 1);
        }
        return count_zeros(n / 10, count);
    }
}

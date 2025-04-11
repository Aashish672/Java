package Recursion;

public class numberOfSteps {
    public static void main(String[] args) {
        System.out.println(steps(8, 0));
    }

    static int steps(int n, int count) {
        if (n == 0) {
            return count;
        }
        if (n % 2 == 0) {
            return steps(n / 2, count + 1);
        }
        return steps(n - 1, count + 1);
    }
}

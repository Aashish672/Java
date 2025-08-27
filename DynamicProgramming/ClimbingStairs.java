
public class ClimbingStairs {

    // Fibonacci
    public static int climbStairs(int n) { // O(2^n)
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    // Memoization
    public static int countDP(int n, int[] ways) { // O(n)
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }

        if (ways[n] != -1) {
            return ways[n];
        }

        ways[n] = countDP(n - 1, ways) + countDP(n - 2, ways);
        return ways[n];
    }

    public static int count(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        // System.out.println(climbStairs(n));
        // int[] ways=new int[n+1];
        // Arrays.fill(ways,-1);
        // System.out.println(countDP(n, ways));

        System.out.println(count(n));
    }
}

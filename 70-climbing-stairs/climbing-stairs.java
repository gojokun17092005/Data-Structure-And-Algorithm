class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        return steps(n, dp);
    }
    private int steps(int n, int[] dp) {
        if (n == 1 || n == 2) return n;
        if (dp[n] != 0) return dp[n];
        dp[n] = steps(n - 1, dp) + steps(n - 2, dp);
        return dp[n];
    }
}

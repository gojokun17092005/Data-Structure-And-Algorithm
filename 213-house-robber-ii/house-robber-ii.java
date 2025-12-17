class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 1) return nums[0];

        Integer[] dp1 = new Integer[n];
        int case1 = solve(nums, 0, n - 2, dp1);

        Integer[] dp2 = new Integer[n];
        int case2 = solve(nums, 1, n - 1, dp2);

        return Math.max(case1, case2);
    }

    private int solve(int[] nums, int index, int end, Integer[] dp) {

        if (index > end) return 0;

        if (dp[index] != null) return dp[index];
        int rob = nums[index] + solve(nums, index + 2, end, dp);
        int skip = solve(nums, index + 1, end, dp);

        dp[index] = Math.max(rob, skip);
        return dp[index];
    }
}

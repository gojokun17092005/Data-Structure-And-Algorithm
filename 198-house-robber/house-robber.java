class Solution {
    static Integer[] memo;

    public int rob(int[] nums) {
        memo = new Integer[nums.length];
        return robFrom(nums, nums.length - 1);
    }

    private int robFrom(int[] nums, int i) {
        if (i < 0) return 0;
        if (memo[i] != null) return memo[i];

        int rob = nums[i] + robFrom(nums, i - 2);
        int skip = robFrom(nums, i - 1);

        memo[i] = Math.max(rob, skip);
        return memo[i];
    }
}

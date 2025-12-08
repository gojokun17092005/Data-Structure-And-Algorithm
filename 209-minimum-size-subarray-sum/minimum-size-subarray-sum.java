class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int n = nums.length;
        int currsum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int j = 0; j < n; j++) {
            currsum += nums[j];
            while (currsum >= target && i <= j) {
                minLen = Math.min(minLen, j - i + 1); 
                currsum -= nums[i];
                i++;
            }
        }
        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }
}

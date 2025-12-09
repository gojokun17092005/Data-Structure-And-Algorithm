class Solution {
    public int specialTriplets(int[] nums) {
        final int MOD = 1_000_000_007;

        Map<Integer, Long> left = new HashMap<>();
        Map<Integer, Long> right = new HashMap<>();
        for (int x : nums) {
            right.put(x, right.getOrDefault(x, 0L) + 1);
        }
        long ans = 0;
        for (int j = 0; j < nums.length; j++) {
            int mid = nums[j];
            right.put(mid, right.get(mid) - 1);
            if (right.get(mid) == 0) right.remove(mid);
            int target = mid * 2;
            long L = left.getOrDefault(target, 0L);   
            long R = right.getOrDefault(target, 0L);  

            ans = (ans + (L * R) % MOD) % MOD;

            left.put(mid, left.getOrDefault(mid, 0L) + 1);
        }

        return (int) ans;
    }
}

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper(0, nums, new ArrayList<>(), res);
        return res;
    }
    private void helper(int idx, int[] nums, List<Integer> ds, List<List<Integer>> res) {
        if (idx == nums.length) {
            res.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[idx]);
        helper(idx + 1, nums, ds, res);

        ds.remove(ds.size() - 1);
        helper(idx + 1, nums, ds, res);
    }
}

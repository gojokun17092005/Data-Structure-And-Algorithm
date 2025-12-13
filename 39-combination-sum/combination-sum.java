import java.util.*;

class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        helper(0, candidates, target, new ArrayList<>(), res, 0);
        return res;
    }

    private void helper(int idx, int[] candidates, int target,
                        List<Integer> ds, List<List<Integer>> res, int sum) {
        if (sum > target) return;   
        if(idx==candidates.length){
            if (sum == target) {
            res.add(new ArrayList<>(ds));
            }
            return;
        }
        ds.add(candidates[idx]);
        helper(idx, candidates, target, ds, res, sum + candidates[idx]);
        ds.remove(ds.size() - 1);
        helper(idx + 1, candidates, target, ds, res, sum);
    }
}

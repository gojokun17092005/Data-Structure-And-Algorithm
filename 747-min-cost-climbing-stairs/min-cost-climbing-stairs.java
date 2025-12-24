class Solution {
    static Integer[] dp;
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        dp=new Integer[n+1];
        int m=helper(0,cost);
        int p=helper(1,cost);
        return Math.min(m,p);
    }
    private int helper(int idx,int[]cost){
        if(idx>=cost.length)return 0;
        if(dp[idx]!=null)return dp[idx];
        int a=cost[idx]+helper(idx+1,cost);
        int b=cost[idx]+helper(idx+2,cost);
        dp[idx]=Math.min(a,b);
        return dp[idx];
    }
}
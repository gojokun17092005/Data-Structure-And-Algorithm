class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int maxprod=Integer.MIN_VALUE;
        for(int si=0;si<n;si++){
            int currprod=1;
            for(int en=si;en<n;en++){
                currprod*=nums[en];
                maxprod=Math.max(currprod,maxprod);
            }
        }
        return maxprod;
    }
}
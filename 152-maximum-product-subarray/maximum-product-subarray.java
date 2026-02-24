class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int currprod=1;
            for(int j=i;j<n;j++){
                    currprod*=nums[j];
                    max=Math.max(currprod,max);
            }
        }
        return max;
    }
}
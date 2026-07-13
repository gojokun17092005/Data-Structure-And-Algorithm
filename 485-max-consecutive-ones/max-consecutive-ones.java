class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max=0;
        for(int item:nums){
            if(item==1){
                count++;
                max=Math.max(max,count);
            }else{
                count=0;
            }
        }
        return max;
    }
}
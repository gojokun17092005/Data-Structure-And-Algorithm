class Solution {
    public int singleNumber(int[] nums) {
        int x=0;
        for(int item:nums){
            x=x^item;
        }
        return x;
    }
}
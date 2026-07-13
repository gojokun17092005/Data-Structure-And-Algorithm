class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int i=0;
        for(int item:nums){
            if(item !=0){
                nums[i++]=item;
            }
        }
        while(i<n){
            nums[i++]=0;
        }
    }
}
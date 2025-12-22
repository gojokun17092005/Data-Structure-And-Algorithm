class Solution {
    public void moveZeroes(int[] nums) {
        int count=0;
        for(int item:nums){
            if(item!=0){
                nums[count++]=item;
            }
        }
        while(count<nums.length){
            nums[count++]=0;
        }
    }
}
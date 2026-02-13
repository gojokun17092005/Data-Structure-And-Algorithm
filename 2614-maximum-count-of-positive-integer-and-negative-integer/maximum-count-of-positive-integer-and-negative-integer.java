class Solution {
    public int maximumCount(int[] nums) {
        int n=nums.length;
        int a=helper(nums,0);
        int b=helper(nums,1);
        int negativeNumber=a+1;
        int positiveNumber=n-(b+1);
        return Math.max(negativeNumber,positiveNumber);

    }
    private int helper(int[] nums,int target){
        int n=nums.length;
        int low=0;
        int high=n-1;
        int index=-1;
        while(low<=high){
            int mid= low+(high-low)/2;
            if(nums[mid]>=target){
                high=mid-1;
            }else{
                index=mid;
                low=mid+1;
            }
        }
        return index;
    }
}
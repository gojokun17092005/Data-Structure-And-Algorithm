class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int i=0;
        int j=1;
        for(int item:nums){
            if(item>0){
                ans[i]=item;
                i=i+2;
            }else{
                ans[j]=item;
                j=j+2;
            }
        }
        return ans;
    }
}
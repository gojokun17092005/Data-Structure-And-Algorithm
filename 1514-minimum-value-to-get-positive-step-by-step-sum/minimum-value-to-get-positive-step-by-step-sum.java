class Solution {
    public int minStartValue(int[] nums) {
        int n=nums.length;
        int[] result=new int [n];
        result[0]=nums[0];
        for(int i=1;i<n;i++){
            result[i]=result[i-1]+nums[i];
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(result[i]<min)min=result[i];
        }
        if(min>0) return 1;
        return Math.abs(min)+1;
    }
}
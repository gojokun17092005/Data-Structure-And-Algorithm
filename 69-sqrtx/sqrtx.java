class Solution {
    public int mySqrt(int x) {
        if(x<1)return 0;
        int low=1;
        int high=x;
        int result=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid>(x/mid)){
                high=mid-1;
            }else{
                result=mid;
                low=mid+1;
            }
        }
        return result;
    }    
}

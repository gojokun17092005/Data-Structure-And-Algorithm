class Solution {
    public int arrangeCoins(int n) {
        long m=n;
        return (int)((sqrt(1 + 8*m) - 1) / 2);

    }
    private long sqrt(long n){
        long low=1;
        long high=n;
        long result=-1;
        while(low<=high){
            long mid=low+(high-low)/2;
             if(mid > n / mid){
                high=mid-1;
            }else{
                result=mid;
                low=mid+1;
            }
        }
        return result;

    }
}
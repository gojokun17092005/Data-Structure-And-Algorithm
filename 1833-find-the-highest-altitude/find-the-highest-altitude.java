class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] ans = new int[n+1];
        ans[0] = 0;

        for(int i=0;i<n;i++){
            ans[i+1] = gain[i] + ans[i];
        }

        int max = Integer.MIN_VALUE;
        for(int i=0;i<=n;i++){
            if(ans[i] > max) max = ans[i];
        }
        return max;
    }
}
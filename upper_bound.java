public class upper_bound {
    public static void main(String[] args) {
        int[] arr={1,3,6,8,19,23,31,41,56};
        int target=19;
        int low=0;
        int high=arr.length-1;
        int x=upperBound(arr, low, high, target);
        System.out.println("index is "+x);
        
    }
    public static int upperBound(int[] arr,int low, int high,int target) {
        int ans=arr.length;
         while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>target){
                high=mid-1;
                ans=mid;
            }else{
                low=mid+1;
            }
         }
         return ans;
    }
}

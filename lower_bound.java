//First index from sorted array where an element is greater than equal to target value
public class lower_bound {
    public static void main(String[] args) {
        int[] arr={1,3,6,8,19,23,31,41,56};
        int target=20;
        int low=0;
        int high=arr.length-1;
        int x=lowerBound(arr,target,low,high);
        System.out.println("lower bound : "+x);
    }
    public static int lowerBound(int[] arr,int target,int low,int high) {
        int ans=arr.length;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=target){
                high=mid-1;
                ans=mid;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}

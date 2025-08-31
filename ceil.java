// smallest number in an array >= target
public class ceil {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int target=25;
        int x= ceil(arr, target);
        System.out.println("ceil value is "+x);
    }
    public static int ceil(int[]arr, int target) {
        int ans=-1;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=target){
                ans=arr[mid];
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}

public class floor {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int target=25;
        int x=floor(arr, target);
        System.out.println("The floor value is "+x);
        
    }
    public static int floor(int[]arr, int target) {
        int ans=-1;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]<=target){
                ans=arr[mid];
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
}

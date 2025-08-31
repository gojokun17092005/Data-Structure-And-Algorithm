public class Search_insert_position {
    public static void main(String[] args) {
        int[] arr={1,2,4,7};
        int target=0;
        int low=0;
        int high=arr.length-1;
        int x=search_insert_position(arr, low, high, target);
        System.out.println("POSITION : "+x);
    }
    public static int  search_insert_position(int[] arr, int low, int high,int target) {
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

public class search_Rotated_sortedd_array {
    public static void main(String[] args) {
        int nums[]={4,5,6,7,0,1,2};
        int target=0;
        int result=search(nums, target);
        if(result!=-1){
            System.out.println("element found at "+result+" index");
        }else{
            System.out.println("element not  found");
        }
        
    }
    public static int search(int[]nums,int target){
        int n=nums.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+(high-low)/2);
            if(nums[mid]==target)return mid;
            if(nums[low]<=nums[mid]){       // left half is sorted
                if(nums[low]<=target && target<=nums[mid]){  // check in sorted right half
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else{ // right half is sorted
                if(nums[mid]<=target && target<=nums[high]){ // check in sorted  left half
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}

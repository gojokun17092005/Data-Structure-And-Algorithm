public class search_rotated_sorted_duplicated {
    public static void main(String[] args) {
        int nums[]={2,5,6,0,0,1,2};
        int target=0;
        boolean result=search(nums,target);
        if(result==true){
            System.out.println("element found");
        }else{
            System.out.println("element not found");
        }
    }
    public static boolean search(int[] nums, int target) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+(high-low)/2);
            if(nums[mid]==target)return true;
            if(nums[low]==nums[mid] && nums[mid]==nums[high]){
                low=low+1;
                high=high-1;
                continue;
            }
            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target<=nums[mid]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else{
                if(nums[mid]<=target && target<=nums[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return false;
    }
}

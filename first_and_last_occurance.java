public class first_and_last_occurance {
    public static void main(String[] args) {
        int [] arr={2,4,6,8,8,8,11,13};
        int x=8;
        int n=arr.length;
        int first=first_occurance(arr, n, x);
        if(first==-1){
            System.out.println("[-1,-1]");
            return;
        }
        int last=last_occurance(arr, n, x);
        System.out.println("["+ first+" "+last+"]");
    }
    public static int first_occurance(int[] arr,int n,int x){
        int low=0;
        int high=n-1;
        int first=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x){
                first=mid;
                high=mid-1;
            }else if(arr[mid]<x){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return first;
    }
    public static int last_occurance(int[] arr,int n,int x){
        int low=0;
        int high=n-1;
        int last=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x){
                last=mid;
                low=mid+1;
            }else if(arr[mid]<x){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return last;
    }
}
// THE TIME COMPLEXITY OF ABOVE CODE IS O(logn)

public class Subarray {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        subarray(arr);
        System.out.println("Maximum sum of a subarray: "+ maxsum(arr));
        System.out.println("Maximum sum of a subarray: "+ kadans_algorithm(arr));
        System.out.println("Maximum product of a subarray: "+maxProduct(arr) );
    }
    //Printing all the subarray of the array
    public static void subarray(int[]arr){
        int n=arr.length;
        for(int st=0;st<n;st++){
            for(int en=st;en<n;en++){
                for(int i=st;i<=en;i++){
                    System.out.print(arr[i]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    //Returning maximum sum in subarray
    //Brute Force
    public static int maxsum(int[]arr){
        int n=arr.length;
        int maxsum=Integer.MIN_VALUE;
        for(int st=0;st<n;st++){
            int currsum=0;
            for(int en=st;en<n;en++){
                currsum+=arr[en];
                maxsum=Math.max(currsum, maxsum);
            }
        }
        return maxsum;
    }
    //Kadanes Algorithm
    //intuition of kadanes algorithm
    //If the running sum is positive → keep it, because it can help increase a future subarray.
    //If the running sum becomes negative → throw it away and start fresh from the next element.
    public static int kadans_algorithm(int[] arr){
        int n=arr.length;
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0;i<n;i++){
            currsum+=arr[i];
            maxsum=Math.max(maxsum, currsum);
            if(currsum<0){
                currsum=0;
            }
        }
        return maxsum;
    }
    //maximum product subarray
    public static int maxProduct(int[] nums) {
        int n=nums.length;
        int maxprod=Integer.MIN_VALUE;
        for(int si=0;si<n;si++){
            int currprod=1;
            for(int en=si;en<n;en++){
                currprod*=nums[en];
                maxprod=Math.max(currprod,maxprod);
            }
        }
        return maxprod;
    }
}

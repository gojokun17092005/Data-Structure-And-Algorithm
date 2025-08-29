public class leftRotatingArray {
    static void rotate(int[] arr, int si,int ei){
        while(si<ei){
            int temp=arr[si];
            arr[si]=arr[ei];
            arr[ei]=temp;
            si++;
            ei--;
        }
    }
    static void leftrotate(int[] arr,int k){
        int n=arr.length;
        k=k%n; // if k>n
        rotate(arr, 0, k-1);
        rotate(arr, k, n-1);
        rotate(arr, 0, n-1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int k=2;
        leftrotate(arr, k);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}

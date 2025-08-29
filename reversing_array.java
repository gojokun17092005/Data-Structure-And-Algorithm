public class reversing_array {
    public static void print(int[] arr){
        for(int items : arr){
            System.out.print(items + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={35,64,72,14,36,74};
        int i=0;
        int j=arr.length-1;
        print(arr);
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        print(arr);
    }
    
}

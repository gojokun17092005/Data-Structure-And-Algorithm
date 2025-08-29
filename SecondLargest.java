public class SecondLargest {
    public static void main(String[] args) {
        int arr[]={10,20,40,50,30,-20,40,70,60,-30,70};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int secmax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>secmax && arr[i]!=max){
                secmax=arr[i];
            }
        }  
        System.out.println("SECOND LARGEST EMELENT "+ secmax);      
        //System.out.println("LARGEST  EMELENT "+ max); 
    }


}

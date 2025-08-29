public class secondsamllest {
    public static void main(String[] args) {
        int arr[]={10,20,40,50,30,-20,40,70,60,-30,70};
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        int secsmallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<secsmallest && arr[i]!=smallest){
                secsmallest=arr[i];
            }
        }  
        System.out.println("SECOND LARGEST EMELENT "+ secsmallest);      
        System.out.println("LARGEST  EMELENT "+ smallest); 
    }
}

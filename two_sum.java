public class two_sum {
    // public static void main(String[] args) {
    //     int [] arr={1,4,6,7,10,41,36,9};
    //     int target=16;
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=i+1;j<arr.length;j++){
    //             if(arr[i]+arr[j]==target){
    //                 System.out.print("INDEX OF ELEMENT ARE "+ i +" AND "+ j );
    //             }
    //         }
    //     }
    // }

    //this is better than the above code(optimise code )
    public static void main(String[] args) {
        int [] arr={5,10,15,20,25,30};
        int target=45;
        int i=0 ,j=arr.length-1;
        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum==target){
                System.out.println("INDEX OF ELEMENT ARE " + i +" AND "+ j);
                break;
            }else if(sum<target){
                i++;
            }else{
                j--;
            }
        }
    }
}

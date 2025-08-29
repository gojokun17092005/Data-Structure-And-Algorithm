public class counting_Element {
    public static void main(String[] args) {
        int[] arr={1,24,45,56,37,28,49,27,59,22,19};
        int target=35;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>target) count++;
        }
        System.out.println("NUMBER OF ELEMET GREATER THAN TARGET ELEMENT : " +count);

    }
}

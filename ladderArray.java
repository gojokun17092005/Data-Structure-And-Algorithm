public class ladderArray {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};

        int maxFromRight = arr[arr.length - 1];
        System.out.print(maxFromRight + " "); // Last element is always a leader

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                System.out.print(arr[i] + " ");
                maxFromRight = arr[i];
            }
        }
    }
}


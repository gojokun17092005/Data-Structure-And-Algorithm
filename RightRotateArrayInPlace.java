public class RightRotateArrayInPlace {
    // Function to reverse part of the array from start to end
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to right rotate by d positions
    static void rightRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;  // Handle cases where d > n

        // Step 1: Reverse entire array
        reverse(arr, 0, n - 1);

        // Step 2: Reverse first d elements
        reverse(arr, 0, k - 1);

        // Step 3: Reverse remaining elements
        reverse(arr, k, n - 1);
    }

    // Print array
    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        rightRotate(arr, k);
        printArray(arr);  // Output will be: 4 5 1 2 3
    }
}


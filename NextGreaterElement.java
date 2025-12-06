import java.util.Arrays;
import java.util.Stack;
public class NextGreaterElement {
    public static int[] findNextGreaterElementIndices(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }
            stack.push(i);
        }

        return result;
    }
    public static void main(String[] args) {
        int[] inputArray = {4, 5, 2, 10, 8};
        System.out.println("Original Array: " + Arrays.toString(inputArray));
        System.out.println("Array Indices:  [0, 1, 2, 3, 4]");
        int[] ngeIndices = findNextGreaterElementIndices(inputArray);
        System.out.println("NGE Indices:    " + Arrays.toString(ngeIndices));
    }
}
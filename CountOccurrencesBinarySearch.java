public class CountOccurrencesBinarySearch {
    public static int firstOccurrence(int[] arr, int n, int x) {
        int low = 0, high = n - 1, first = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                first = mid;
                high = mid - 1; 
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return first;
    }

    public static int lastOccurrence(int[] arr, int n, int x) {
        int low = 0, high = n - 1, last = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                last = mid;
                low = mid + 1; 
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return last;
    }

    public static int countOccurrences(int[] arr, int x) {
        int n = arr.length;
        int first = firstOccurrence(arr, n, x);
        if (first == -1) return 0; 
        int last = lastOccurrence(arr, n, x);
        return last - first + 1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 4, 6, 8, 8, 8, 11, 13};
        int x = 4;
        System.out.println(countOccurrences(arr, x)); 
    }
}


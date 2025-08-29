
import java.util.*;

public class ThreeSumTwoPointers {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);  // Sort the array first
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;  // Skip duplicate 'i' values
            }

            int left = i + 1, right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // // Skip duplicates for 'left'
                    // while (left < right && nums[left] == nums[left + 1]) left++;
                    // // Skip duplicates for 'right'
                    // while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;  // Need a bigger sum
                } else {
                    right--;  // Need a smaller sum
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSum(nums);
        System.out.println(result);
    }
}

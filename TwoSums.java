import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Stores seen numbers and their indices
        Map<Integer, Integer> seen = new HashMap<>();
        System.out.println(seen);
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            System.out.println(complement);
            // Check if the needed number was already seen
            if (seen.containsKey(complement)) {
                System.out.println(seen);
                return new int[]{seen.get(complement), i};
            }

            // Otherwise, track the current number
            seen.put(nums[i], i);
        }

        return new int[]{}; // Return empty array if no solution


    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.twoSum(new int[]{11, 15, 2, 7}, 9);
        System.out.println(Arrays.toString(result));
    }
}
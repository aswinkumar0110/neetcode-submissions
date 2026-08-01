public class Solution {
    public int[] twoSum(int[] nums, int t) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == t) {
                    return new int[] { i + 1, j + 1 };
                }
            }
        }
        return new int[0];
    }
}
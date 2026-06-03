// Last updated: 03/06/2026, 12:32:52
class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum = nums[0];
        int max = sum;
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                sum += nums[i];
                max = Math.max(sum, max);
            } else {
                sum = nums[i];
            }
        }
        return max;
    }
}
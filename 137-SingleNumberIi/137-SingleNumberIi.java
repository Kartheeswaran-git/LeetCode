// Last updated: 05/08/2026, 10:31:19
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n - 1; i += 3) {
            if (i + 1 >= n || nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[n - 1];
    }
}
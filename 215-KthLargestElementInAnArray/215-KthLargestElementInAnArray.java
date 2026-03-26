// Last updated: 26/03/2026, 16:21:15
class Solution {
    public int findKthLargest(int[] nums, int k) {
         Arrays.sort(nums);
        return nums[nums.length - k];
    }
}